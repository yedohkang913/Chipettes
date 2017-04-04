# Chipettes
**APCS2 pd 1**       
**Yedoh Kang, Vernita Lawren, Kristin Lin**      
**Lab #02 - All Hands on Deque! (Not Schenectady; rather, synecdoche.)**     
**2017-04-04**      

#### LIST OF DEQUE METHODS: 
    - void addFirst(e)
    - E removeFirst(e)
    - E getFirst()
    - void addLast(e)
    - E removeLast(e)
    - E getLast()
    - int size()
    - boolean contains(e)
    - boolean removeFirstOccurrence(e)
    - boolean removeLastOccurrence(e)

#### RATIONALE FOR METHOD SELECTIONS

We had to choose between add and offer methods, remove and poll methods, and get and peek methods. We chose to use add, remove, and get because they return void and throw exceptions. To stay consistent with previous assignments, our methods throw an exception when empty. In addition, we added the contains method so that the user can see if an element is contained in the deque without removing every single element to check. 

#### RATIONALE FOR DOUBLY-LINKED NODE-BASED ARCHITECTURE

Having doubly-linked nodes will allow for efficient enqueueing and dequeueing from both sides of the queue. Both methods would have a constant runtime O(1) because one is able to reference the node before and the node after the front and end nodes without traversing the entire queue. In addition, there is no set space to store all values. Unlike arrays or ArrayLists, which are designed to grow on the right only, doubly-linked nodes eliminate the need to shift each value to the right when enqueueing or to the left when dequeueing, which would have a linear runtime O(n).  
