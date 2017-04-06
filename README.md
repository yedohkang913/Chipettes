# Chipettes
**APCS2 pd 1**       
**Yedoh Kang, Vernita Lawren, Kristin Lin**      
**Lab #02 - All Hands on Deque! (Not Schenectady; rather, synecdoche.)**          

#### LIST OF DEQUE METHODS: 

 Method | Runtime 
 --- | --- 
 void addFirst(e) | O(1) 
 E removeFirst(e) | O(1) 
 E getFirst() | O(1) 
 void addLast(e) | O(1) 
 E removeLast(e) | O(1) 
 E getLast() | O(1) 
 int size() | O(1) 
 boolean contains(e) | O(n) 
 boolean removeFirstOccurrence(e) | O(n) 
 boolean removeLastOccurrence(e) | O(n) 

#### RATIONALE FOR METHOD SELECTIONS

We had to choose between add and offer methods, remove and poll methods, and get and peek methods. We chose to use add, remove, and get because they return void and throw exceptions. To stay consistent with previous assignments, our methods throw an exception when empty. In addition, we added the contains method so that the user can see if an element is contained in the deque without removing every single element to check. We also thought removeFO and removeLO would be useful in instances where the user wants to remove the first or last element of repeats. 

#### RATIONALE FOR DOUBLY-LINKED NODE-BASED ARCHITECTURE

Having doubly-linked nodes will allow for efficient enqueueing and dequeueing from both sides of the queue. Both methods would have a constant runtime O(1) because one is able to reference the node before and the node after the front and end nodes without traversing the entire queue. In addition, there is no set space to store all values. Unlike arrays or ArrayLists, which are designed to grow on the right only, doubly-linked nodes eliminate the need to shift each value to the right when enqueueing or to the left when dequeueing, which would have a linear runtime O(n).  

#### CODE REVIEW

##### Code review input:

- Add comments to interface
- Add runtimes for each method on README (not just enqueue and dequeue)
- Needs to throw more exceptions

##### Changes made in response to code review input

- Added comments describing methods chosen in the interface
- Runtimes were added to methods and organized into a table on README
- No exceptions were added because we already had exceptions thrown for methods that needed them. Also, the driver file was successfully tested, and to run it fully, we commented out the lines where it threw an exception, and uncommented the test cases for the contains method.
