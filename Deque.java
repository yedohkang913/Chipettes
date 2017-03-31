public interface Deque<T>{

    public void addFirst(T deqVal);
    public void addLast(T deqVal);
    
    public T removeFirst();
    public T removeLast();
    
    public int size();
    
    public T getFirst();
    public T getLast();
    
}
