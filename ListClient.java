public class ListClient 
{
	public static void main(String[] args) 
	{
		testList();
	}  // end main

	public static void testList() 
	{
      AList l1 = new AList<String>();
      AList l2 = new AList<String>();
      LList2 ll1 = new LList2();
      LList2 ll2 = new LList2();

//  runnerList has only methods in ListInterface

      l1.add("1"); // winner
      l1.add("2"); // second place
      l1.add("4"); // third place
      l1.add("4"); // fourth place
      l1.add("5");

      System.out.println("************ Testing Array public int getLastIndex(T item)************");
      System.out.println("************ Following are the contents of l1             ************");
      displayList(l1);
      System.out.println("l1.getLastIndex(\"4\") = "+l1.getLastIndex("4") );

      System.out.println("************ Testing Array public int removeEvery(T item)  ************");
      System.out.println("l1.removeEvery(\"4\") ="+l1.removeEvery("4"));
      System.out.println("************ Following are the contents of l1             ************");
      displayList(l1);

      l2.add("1");
      l2.add("2");
      l2.add("3");

      System.out.println("************ Testing Array public boolean equals(Object other)   ************");
      System.out.println("************ Following are the contents of l2             ************");
      displayList(l2);
      System.out.println("l1.equals(l2) = "+l1.equals(l2));

      System.out.println("l1.removeEvery(\"5\") ="+l1.removeEvery("5"));
      System.out.println("************ Following are the contents of l1             ************");
      displayList(l1);
      System.out.println("l2.removeEvery(\"3\") ="+l2.removeEvery("3"));
      System.out.println("************ Following are the contents of l2             ************");
      displayList(l2);
      System.out.println("l1.equals(l2) = "+l1.equals(l2));

      ll1.add("1"); // winner
      ll1.add("2"); // second place
      ll1.add("4"); // third place
      ll1.add("4"); // fourth place
      ll1.add("5");

      System.out.println("************ Testing List public int getLastIndex(T item)************");
      System.out.println("************ Following are the contents of ll1             ************");
      displayList(ll1);
      System.out.println("ll1.getLastIndex(\"4\") = "+ll1.getLastIndex("4") );

      System.out.println("************ Testing Array public int removeEvery(T item)  ************");
      System.out.println("ll1.removeEvery(\"4\") ="+ll1.removeEvery("4"));
      System.out.println("************ Following are the contents of ll1             ************");
      displayList(ll1);

      ll2.add("1");
      ll2.add("2");
      ll2.add("3");

      System.out.println("************ Testing Array public boolean equals(Object other)   ************");
      System.out.println("************ Following are the contents of ll2             ************");
      displayList(ll2);
      System.out.println("ll1.equals(ll2) = "+ll1.equals(ll2));

      System.out.println("ll1.removeEvery(\"5\") ="+ll1.removeEvery("5"));
      System.out.println("************ Following are the contents of ll1             ************");
      displayList(ll1);
      System.out.println("ll2.removeEvery(\"3\") ="+ll2.removeEvery("3"));
      System.out.println("************ Following are the contents of ll2             ************");
      displayList(ll2);
      System.out.println("ll1.equals(ll2) = "+ll1.equals(ll2));

      System.out.println();
   } // end testList
   
   public static void displayList(ListInterface<String> list)
   {
      int numberOfEntries = list.getLength();
      System.out.println("The list contains " + numberOfEntries +
                         " entries, as follows:");
      for (int position = 1; position <= numberOfEntries; position++)
         System.out.println(list.getEntry(position) +
                            " is entry " + position);
      System.out.println();
   } // end displayList
} // end ListClient

/*

*/