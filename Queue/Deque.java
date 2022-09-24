/*** Methods of Deque interface
void addFirst(E e): Inserts the specified element at the beginning of the Deque.

void addLast(E e): Inserts the specified element at the end of the Deque.

boolean contains(Object o): Returns true if the specified element is present in the Deque.

E getFirst(): It returns the first element of the Deque.

E getLast(): It returns the last element of the Deque.

E peekFirst(): Returns the first element of Deque, or null if the Deque is empty.

E peekLast(): Returns the last element of Deque, or null if the Deque is empty.

E pollFirst(): Returns and removes the first element of Deque, or null if the Deque is empty.

E pollLast(): Returns and removes the last element of Deque, or null if the Deque is empty.

int size(): Returns the number of elements present in Deque. ***/


/*
	* We cannot create instance of a Deque as it is an
	* interface, we can create instance of ArrayDeque or
	* LinkedList and assign it to Deque
	*/
    Deque<String> dq = new ArrayDeque<String>();


    /*
	* Adding elements to the Deque.
	* addFirst() adds element at the beginning 
        * and addLast() method adds at the end.
	*/
	dq.add("Glenn");
	dq.add("Negan");
	dq.addLast("Maggie");
	dq.addFirst("Rick");
	dq.add("Daryl");

/*
	 * We can remove element from Deque using remove() method,
	 * we can use normal remove() method which removes first 
	 * element or we can use removeFirst() and removeLast()
	 * methods to remove first and last element respectively.
	 */
	System.out.println("Removed element: "+dq.removeLast());

/*
	 * element() method - returns the head of the
	 * Deque. Head is the first element of Deque
	 */
    System.out.println("Head: "+dq.element());

/*
	 * pollLast() method - this method removes and returns the 
	 * tail of the Deque(last element). Returns null if the Deque is empty.
	 * We can also use poll() or pollFirst() to remove the first element of
	 * Deque.
	 */
	System.out.println("poll(): "+dq.pollLast());


/*
	 * peek() method - it works same as element() method,
	 * however it returns null if the Deque is empty. We can also use 
	 * peekFirst() and peekLast() to retrieve first and last element
	 */
	System.out.println("peek(): "+dq.peek());