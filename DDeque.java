// Chipettes (Yedoh Kang, Vernita Lawren, Kristin Lin)
// APCS2 pd1
// LAB02 -- All Hands on Deque!
// 2017-04-04

import java.util.NoSuchElementException;

public class DDeque<T> implements Deque<T>{

    private int _size;
    private DLLNode<T> _head;
    private DLLNode<T> _tail;

    //constructor; creates an empty deque wil null pointers
    public DDeque () {
	
        _head = null;
        _tail = null;
        _size = 0;	
    }
    
    //adds node to the front
    public void addFirst(T deqVal) {
	
	//insert node, where prevNode is null and the nextNode is current _head
        DLLNode<T> insert = new DLLNode<T> (deqVal, null, _head);

	//set head as new node
        _head = insert;
	
	//if this deque was empty, _tail also points to new node
	if (_size == 0) { 
            _tail = _head;
        } else { //otherwise, link previous _head to new _head
	    _head.getNext().setPrev(_head); 
	}
	
        _size++; //increase size
    }
    
    //adds node to the end
    public void addLast(T deqVal) {
	
	//insert node, where prevNode is the current _tail and the nextNode is null
        DLLNode<T> insert = new DLLNode<T> (deqVal, _tail, null);
	
	//last node becomes the insert node
	_tail = insert;
	
	//if this deque is empty, _head points to the _tail
        if (_size == 0) {
	    _head = _tail;
        } else { //otherwise, link previous _tail to new _tail
	    _tail.getPrev().setNext(_tail);
	}
	
	_size++; //increase size
    }
    
    //removes node from the front
    public T removeFirst() {
	
	//retrieve current _head 
        T retVal = getFirst();
	
	//if deque has a size of one, set both _head and _tail to null
        if (_size == 1) {
	    _head = _tail = null;
        } else { //otherwise, set _head to next node and point its prevNode to null 
	    _head = _head.getNext();
	    _head.setPrev( null );
        }
	
        _size--; //decrease _size
	
        return retVal;
    }

    //removes node from the end
    public T removeLast() {
	
	//retreive current _tail
        T retVal = getLast();
	
        //if deque has a size of one, set both _head and _tail to null
	if (_size == 1) {
	    _head = _tail = null;
	} else { //otherwise, set _tail to the prevNode and set nextNode to null
	    _tail = _tail.getPrev();
            _tail.setNext(null);
        }
	
        _size--; //decrease size
	
	return retVal;
    }
    
    //accessor for _size variable
    public int size() {
        return _size;
    }
    
    //returns first node
    public T getFirst() {
	
        if (_size == 0) { //if size is 0, throw an exception 
	    throw new NoSuchElementException();
        } else { //otherwise, return cargo of the first node
            return _head.getCargo();
        }
    }

    //return last node
    public T getLast() {
	
        if (_size == 0) { //if size is 0, throw an exception
	    throw new NoSuchElementException();
        } else { //otherwise, return the cargo of the last node
            return _tail.getCargo();
        }
    }


    //overwritten toString
    public String toString() {
	
        String retStr = "HEAD-->";
        DLLNode<T> temp = _head;
	
        while (temp != null) {
	    retStr += temp.getCargo() + "-->";
            temp = temp.getNext();
        }
	
        retStr += "NULL";
        return retStr;
    }

    //main method for testing
    public static void main( String[] args ) 
    {
	
	DDeque<String> james = new DDeque<String>();

	System.out.println("initially: " );
	System.out.println( james + "\tsize: " + james.size() );

	james.addLast("a");
	System.out.println( james + "\tsize: " + james.size() );

	james.addFirst("need");
	System.out.println( james + "\tsize: " + james.size() );

	james.addLast("beat");
	System.out.println( james + "\tsize: " + james.size() );

	james.addFirst("I");
	System.out.println( james + "\tsize: " + james.size() );

	System.out.println( "First item is: " + james.getFirst() );

	james.addFirst("wait");
	System.out.println( "...and now first item is: " + james.getFirst());
	System.out.println( james + "\tsize: " + james.size() );

	System.out.println( "...after remove last: " + james.removeLast() );
	System.out.println( james + "\tsize: " + james.size() );

	System.out.println( "...after remove first: " + james.removeFirst() );
	System.out.println( james + "\tsize: " + james.size() );

	System.out.println( "...after remove first: " + james.removeFirst() );
	System.out.println( james + "\tsize: " + james.size() );

	System.out.println( "...after removefirst: " + james.removeFirst() );
	System.out.println( james + "\tsize: " + james.size() );
	/*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }
}
