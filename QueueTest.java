public class QueueTest {
	public static void main(String[] args) {
	   ArrayQueue<String> myQ1 = new ArrayQueue<String>();
	   ArrayQueue<String> myQ2 = new ArrayQueue<String>();
	   ArrayQueue<String> myQ3 = new ArrayQueue<String>();
 
	   System.out.printf("***** %s *****%n","public static boolean check(String s)");
	   System.out.println("check(\"booboo\") = "+ArrayQueue.check("booboo"));
	   System.out.println("check(\"hello, hello\") = "+ArrayQueue.check("hello, hello"));
	   System.out.println("check(\"rattan\") = "+ArrayQueue.check("rattan"));
	   System.out.println("check(\"abcab\") = "+ArrayQueue.check("abcab"));
	   System.out.printf("***** %s *****%n%n","End public static boolean check(String s)");
 
	   System.out.printf("***** %s *****%n","public void splice(QueueInterface<T> anotherQueue)");
	   System.out.printf("myQ1.isEmpty() : %b%n",myQ1.isEmpty());
	   System.out.printf("myQ3.isEmpty() : %b%n",myQ3.isEmpty());
	   System.out.println("myQ1.enqueue(\"Jim\");");
	   System.out.println("myQ1.enqueue(\"Jess\")");
	   myQ1.enqueue("Jim");
	   myQ1.enqueue("Jess");
	   System.out.println("myQ3.enqueue(\"sam\");");
	   myQ3.enqueue("sam");
	   System.out.printf("myQ1.isEmpty() : %b%n",myQ1.isEmpty());
	   System.out.printf("myQ3.isEmpty() : %b%n",myQ3.isEmpty());
	   System.out.println("myQ1.splice(myQ3);");
	   myQ1.splice(myQ3);
	   System.out.printf("myQ1.isEmpty() : %b%n",myQ1.isEmpty());
	   System.out.printf("myQ3.isEmpty() : %b%n",myQ3.isEmpty());
	   System.out.println("myQ1.dequeue() : "+myQ1.dequeue());
	   System.out.println("myQ1.dequeue() : "+myQ1.dequeue());
	   System.out.println("myQ1.dequeue() : "+myQ1.dequeue());
	   System.out.printf("myQ1.isEmpty() : %b%n",myQ1.isEmpty());
	   System.out.printf("***** %s *****%n%n","End public void splice(QueueInterface<T> anotherQueue)");
 
	   System.out.printf("***** %s *****%n","public boolean enqueueNoDuplicate(T item)");
	   System.out.println("myQ2.enqueue(\"a\");");
	   System.out.println("myQ2.enqueue(\"b\");");
	   System.out.println("myQ2.enqueue(\"c\");");
	   System.out.println("myQ2.enqueue(\"d\");");
	   myQ2.enqueue("a");
	   myQ2.enqueue("b");
	   myQ2.enqueue("c");
	   myQ2.enqueue("d");
	   System.out.println("myQ2.enqueueNoDuplicate(\"b\") : "+myQ2.enqueueNoDuplicate("b"));
	   System.out.println("myQ2.enqueueNoDuplicate(\"e\") : "+myQ2.enqueueNoDuplicate("e"));
	   System.out.println("myQ2.dequeue() : "+myQ2.dequeue());
	   System.out.println("myQ2.dequeue() : "+myQ2.dequeue());
	   System.out.println("myQ2.dequeue() : "+myQ2.dequeue());
	   System.out.println("myQ2.dequeue() : "+myQ2.dequeue());
	   System.out.println("myQ2.dequeue() : "+myQ2.dequeue());
	   System.out.printf("myQ2.isEmpty() : %b%n",myQ2.isEmpty());
	   System.out.printf("***** %s *****%n","End public boolean enqueueNoDuplicate(T item)");
	}
 }