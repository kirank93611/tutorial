/*
       * We cannot create instance of a Queue as it is an
       * interface, we can create instance of LinkedList or
       * PriorityQueue and assign it to Queue
       */
      Queue<String> q = new LinkedList<String>();

//Adding elements to the Queue
      q.add("Rick");
      q.add("Maggie"); 
      q.add("Glenn");
      q.add("Negan");
      q.add("Daryl");

//Methods of PriorityQueue Class:

//boolean add(E e): Adds the element into the PriorityQueue.

//void clear(): This method removes all the elements from the PriorityQueue.

//boolean contains(Element e): This method returns true, if the specified element is present in the Queue.

//boolean Offer(E e): Same as add() method.

//E peek(): Returns the head(the first element) of the Queue.

//E poll(): Removes the head of the Queue and returns it.

//boolean remove(E e): This method removes the specified element from the Queue and returns true if the deletion is successful. If the specified element is not present in the Queue then it returns false.

//int size(): Returns the size of the Queue.

//object[] toArray(): Returns array containing all the elements of Queue.

//Method reference: Official documentation.


//1. Adding Elements:
PriorityQueue<Integer> pq = new PriorityQueue<>();
for(int i=0;i<3;i++){
    pq.add(i);
    pq.add(1);
}

pq.add("Geeks");
pq.add("For");
pq.add("Geeks");

//2. Removing Elements:
// using the method
pq.remove("Geeks");

//3.Accessing the elements:
// Using the peek() method
String element = pq.peek();