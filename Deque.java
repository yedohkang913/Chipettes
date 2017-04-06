
public interface Deque<T>{

    //add elements to front and end of deque
    public void addFirst(T deqVal);
    public void addLast(T deqVal);
    
    //removes elements from front and end of deque and returns removed item; exception if empty
    public T removeFirst();
    public T removeLast();
    
    //checks if given item is present in deque and returns boolean
    public boolean contains (T deqVal);
    
    //searches for item in deque and removes the first one or the last one
    public boolean removeFirstOccurrence (T deqVal);
    public boolean removeLastOccurrence (T deqVal);
        
    //retrieves item in first or last position in deque
    public T getFirst();
    public T getLast();
    
    //retrieves value stored in size variable
    public int size();
    
}
