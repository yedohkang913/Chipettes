/**************************************
 * DequeTester2                       *
 * AllCAMerasOnDeck                   *
 * HW31- That We May All Relax Harder *
 **************************************/

public class DequeTester2{



    public static void main( String[] args ) 

    {
        DDeque<String> deque = new DDeque<String>();
       
	//Print out the current size, should be 0
	System.out.println("\nsize");
	System.out.println(deque.size());

	//starting to add values from the front
	System.out.println("\naddFirst..."); 
	deque.addFirst("1");
	deque.addFirst("BONUS!");
	deque.addFirst("2");
	deque.addFirst("3");

	//String should look like "3 2 BONUS! 1"
	System.out.println( deque ); //for testing toString()...

	//should return a 3
	System.out.println("\npeek first");
	System.out.println(deque.getFirst());

	//should return a 1
	System.out.println("\npeek last"); 	
	System.out.println(deque.getLast()); 

	//starting to add values from the back
	System.out.println("\naddLast..."); 
	deque.addLast("4");
	deque.addLast("BONUS!");
	deque.addLast("5");
	deque.addLast("6");

	//checks contains method
	System.out.println("\nhey, got a bonus?");
	System.out.println(deque.contains("BONUS!"));

	//checks remove occurences
	System.out.println("\n here's what we got: " + deque);
	System.out.println("get the first/last bonus?");
	//test one, then the other, then both
	System.out.println(deque.removeFirstOccurrence("BONUS!"));
	System.out.println(deque.removeLastOccurrence("BONUS!"));

	//String should look like "3 2 1 4 5 6"
	System.out.println( deque );

	//should return a 3
	System.out.println("\npeeking first");
	System.out.println(deque.getFirst());

	//should return a 6
	System.out.println("\npeeking last"); 	
	System.out.println(deque.getLast()); 

	//should have a size of 6
	System.out.println("\nsize");
	System.out.println(deque.size());

	//String should look like "3 2 1 4 5 6"
	System.out.println("\nnow testing toString()..."); 
	System.out.println( deque );

	//starting to remove values from the front
	System.out.println("\nnow removing first..."); 
	System.out.println( deque.removeFirst() ); //3
	System.out.println( deque.removeFirst() ); //2
	System.out.println( deque.removeFirst() ); //1

	//String should look like "4 5 6"
	System.out.println("\nnow testing toString()..."); 
	System.out.println( deque );

	//Starting to remove values from the back
	System.out.println("\nnow removing last..."); 
	System.out.println( deque.removeLast() ); //6
	System.out.println( deque.removeLast() ); //5
	System.out.println( deque.removeLast() ); //4
	//Removing 4 yields an error; size remains 1
	
	//should have a size of 0
	System.out.println("\nsize");
	System.out.println(deque.size());

	//should throw an error
	System.out.println("\nDeque from empty deque should yield error..."); 
	System.out.println( deque.removeFirst() );

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

	 ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
	
    }//end main

}
