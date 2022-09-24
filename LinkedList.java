//For all the examples in the below methods, consider llistobj as a reference for LinkedList<String>.

LinkedList<String> llistobj  = new LinkedList<String>();

//1)
// boolean add(Object item): It adds the item at the end of the list.

llistobj.add("Hello");

//2) 
//void add(int index, Object item): It adds an item at the given index of the the list.

llistobj.add(2, "bye");

//3) boolean addAll(Collection c): It adds all the elements of the specified collection c to the list. 
//It throws NullPointerException if the specified collection is null

LinkedList<String> llistobj = new LinkedList<String>();
ArrayList<String> arraylist= new ArrayList<String>();
arraylist.add("String1");
arraylist.add("String2");
//add all starts here but 
llistobj.addAll(arraylist);

//4) 
//boolean addAll(int index, Collection c): It adds all the elements of collection c to the list starting from a give index in the list. It throws NullPointerException if the collection c is null and IndexOutOfBoundsException when the specified index is out of the range.

llistobj.add(5, arraylist);

//5)
//void addFirst(Object item): It adds the item (or element) at the first position in the list.

llistobj.addFirst("text");

//6)
// void addLast(Object item): It inserts the specified item at the end of the list.

llistobj.addLast("Chaitanya");

//7)
//void clear(): It removes all the elements of a list.

llistobj.clear();

//8)
//Object clone(): It returns the copy of the list.

Object str= llistobj.clone();
 System.out.println(str);

//9) 
//boolean contains(Object item): It checks whether the given item is present in the list or not.
//If the item is present then it returns true else false.

boolean var = llistobj.contains("TestString");

//10)
//Object get(int index): It returns the item of the specified index from the list.

Object var = llistobj.get(2);

//11
//Object getFirst(): It fetches the first item from the list.

Object var = llistobj.getFirst();

//12)
// Object getLast(): It fetches the last item from the list.

Object var= llistobj.getLast();

//13) 
//int indexOf(Object item): It returns the index of the specified item.

llistobj.indexOf("bye");

//14) int lastIndexOf(Object item): It returns the index of last occurrence of the specified element.

int pos = llistobj.lastIndexOf("hello");

//15) Object poll(): It returns and removes the first item of the list.

Object o = llistobj.poll();

//16) Object pollFirst(): same as poll() method. Removes the first item of the list.

Object o = llistobj.pollFirst();

//17) Object pollLast(): It returns and removes the last element of the list.

Object o = llistobj.pollLast();

//18) Object remove(): It removes the first element of the list.

llistobj.remove();

//19) Object remove(int index): It removes the item from the list which is present at the specified index.

llistobj.remove(4);

//20) Object remove(Object obj): It removes the specified object from the list.

llistobj.remove("Test Item");

//21) Object removeFirst(): It removes the first item from the list.

llistobj.removeFirst();

//22) Object removeLast(): It removes the last item of the list.

llistobj.removeLast();

//23) Object removeFirstOccurrence(Object item): It removes the first occurrence of the specified item.

llistobj.removeFirstOccurrence("text");

//24) Object removeLastOccurrence(Object item): It removes the last occurrence of the given element.

llistobj.removeLastOccurrence("String1");

//25) Object set(int index, Object item): It updates the item of specified index with the give value.

llistobj.set(2, "Test");

//26) int size(): It returns the number of elements of the list.

llistobj.size();

// 27)
//Get first and last elements from LinkedList
//1) public E getFirst(): Returns the first element in this list.
//2) public E getLast(): Returns the last element in this list.

// Getting First element of the List
    Object firstElement = linkedlist.getFirst();
    System.out.println("First Element is: "+firstElement);
 
// Getting Last element of the List
    Object lastElement = linkedlist.getLast();
    System.out.println("Last Element is: "+lastElement);

//28)
//
//Java – Get element from specific index of LinkedList
//public E get(int index): Returns the element at the specified position in this list.
 System.out.println("LinkedList Elements : ");
//get(i) returns element present at index i
for(int i=0; i < linkedlist.size(); i++){
    System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
} 


///29)iterating through a linked list
// Obtaining ListIterator
    ListIterator listIt = linkedlist.listIterator();

//Iterating the list in forward direction
    System.out.println("Forward iteration:");
    while(listIt.hasNext()){
       System.out.println(listIt.next());
    }

// Iterating the list in backward direction
    System.out.println("\nBackward iteration:");
    while(listIt.hasPrevious()){
       System.out.println(listIt.previous());

//30)LinkedList push() and pop() methods:
// Create a LinkedList of Strings
LinkedList<String> list = new LinkedList<String>();

// push Element the list
     list.push("NEW ELEMENT");

// pop Element from list
     System.out.println("Element removed: "+list.pop());


//30)
//LinkedList.poll()
//Retrieves and removes the head (first element) of this list.

//poll(): Retrieves and removes the head (first element) of this list.
    System.out.println("Element removed: "+list.poll());

///31)
// pollFirst(): Retrieves and removes the first element of this list,
// or returns null if this list is empty.*/
     System.out.println("Element removed: "+list.pollFirst());

///32)
// pollLast(): Retrieves and removes the first element of this list,
// or returns null if this list is empty.*/
     System.out.println("Element removed: "+list.pollLast());