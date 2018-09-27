public class ArrayQueue<T> implements QueueInterface<T> {
   private T[] queue; // circular array of queue entries and one unused location
   private int frontIndex;
   private int backIndex;
   private static final int DEFAULT_INITIAL_CAPACITY = 5;

   public ArrayQueue() {
      this(DEFAULT_INITIAL_CAPACITY);
   } // end default constructor

   public ArrayQueue(int initialCapacity) {
      // the cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      T[] tempQueue = (T[]) new Object[initialCapacity + 1];
      queue = tempQueue;
      frontIndex = 0;
      backIndex = initialCapacity;
   } // end constructor

   public void enqueue(T newEntry) {
      ensureCapacity();
      backIndex = (backIndex + 1) % queue.length;
      queue[backIndex] = newEntry;
   } // end enqueue

   public T getFront() {
      T front = null;
      if (!isEmpty())
         front = queue[frontIndex];

      return front;
   } // end getFront

   public T dequeue() {
      T front = null;
      if (!isEmpty()) {
         front = queue[frontIndex];
         queue[frontIndex] = null;
         frontIndex = (frontIndex + 1) % queue.length;
      } // end if

      return front;
   } // end dequeue

   private void ensureCapacity() {
      if (frontIndex == ((backIndex + 2) % queue.length)) { // if array is full,
         T[] oldQueue = queue;
         int oldSize = oldQueue.length;
         @SuppressWarnings("unchecked")
         T[] tempQueue = (T[]) new Object[2 * oldSize];
         queue = tempQueue;
         for (int index = 0; index < oldSize - 1; index++) {
            queue[index] = oldQueue[frontIndex];
            frontIndex = (frontIndex + 1) % oldSize;
         } // end for

         frontIndex = 0;
         backIndex = oldSize - 2;
      } // end if
   } // end ensureCapacity

   public boolean isEmpty() {
      return frontIndex == ((backIndex + 1) % queue.length);
   } // end isEmpty

   public void clear() {
      if (!isEmpty()) {
         for (int index = frontIndex; index != backIndex; index = (index + 1) % queue.length)
            queue[index] = null;
         queue[backIndex] = null;
      }
      frontIndex = 0;
      backIndex = queue.length - 1;
   }


   public static boolean check(String s) {
      int halfS = s.length() / 2;
      String lowerCaseS = s.toLowerCase();
      int i = 0;
      int j = halfS;
      boolean checkReturn = false;

      QueueInterface<String> s1 = new ArrayQueue<String>(halfS - 1);
      QueueInterface<String> s2 = new ArrayQueue<String>(s.length() - halfS - 1);
      while (i < halfS) {
         if ((s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == '-' || s.charAt(i) == ':' || s.charAt(i) == ';' || s.charAt(i) == ' ' ||
            s.charAt(i) == '\"' || s.charAt(i) == '\'' || s.charAt(i) == '?' || s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '!'))
            i++;
         else {
            s1.enqueue(Character.toString(lowerCaseS.charAt(i)));
            i++;
         }
      }
      while (j < s.length()) {
         if ((s.charAt(j) == ',' || s.charAt(j) == '.' || s.charAt(j) == '-' || s.charAt(j) == ':' || s.charAt(j) == ';' || s.charAt(j) == ' ' ||
            s.charAt(j) == '\"' || s.charAt(j) == '\'' || s.charAt(j) == '?' || s.charAt(j) == '(' || s.charAt(j) == ')' || s.charAt(j) == '!'))
            j++;
         else {
            s2.enqueue(Character.toString(lowerCaseS.charAt(j)));
            j++;
         }
      }

      while (!s1.isEmpty() || !s2.isEmpty()) {
         if (s1.dequeue().equals(s2.dequeue())) {
            checkReturn = true;
         } else {
            checkReturn = false;
            break;
         }
      }
      return checkReturn;

   }

   public void splice(QueueInterface<T> anotherQueue){
      while(!anotherQueue.isEmpty())
      this.enqueue(anotherQueue.dequeue());
   }

   public boolean enqueueNoDuplicate(T item){
      Boolean flag = true;


      for(int i = 0; i < queue.length; i++){
         if(item.equals(queue[i])){
            flag = false;
            break;
         }
      }

      if(flag) this.enqueue(item);
      return flag;
   }

} // end ArrayQueue
