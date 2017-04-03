public interface Deque<T>{

    public void addFirst(T deqVal);
    public void addLast(T deqVal);
    
    public T removeFirst();
    public T removeLast();
        
    public T getFirst();
    public T getLast();
    
    public boolean contains (T deqVal);
    
    public int size();
    
}
