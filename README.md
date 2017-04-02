# Chipettes

##### Things to do

###### LIST OF DEQUE METHODS: 
    - void addFirst(e)
    - E removeFirst(e)
    - E getFirst()
    - void addLast(e)
    - E removeLast(e)
    - E getLast()
    - int size()
    
###### RATIONAL FOR DOUBLY-LINKED NODE-BASED ARCHITECTURE

Having doubly-linked nodes will allow for efficient enqueueing and dequeueing from both sides of the queue. Both methods would have a constant runtime O(1) because one is able to reference the node before and the node after the front and end nodes without traversing the entire queue. In addition, there is no set space to store all values, unlike arrays or ArrayLists, which are designed to grow on the right only, eliminating the need to shift each value to the right when enqueueing or to the left when dequeueing.  

