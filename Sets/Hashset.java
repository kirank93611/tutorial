// HashSet declaration
HashSet<String> hset = new HashSet<String>();
//1
// Adding elements to the HashSet
hset.add("Apple");
hset.add("Mango");
hset.add("Grapes");
hset.add("Orange");
hset.add("Fig");

//Addition of duplicate elements
hset.add("Apple");
hset.add("Mango");

//Addition of null values
hset.add(null);
hset.add(null);

//Displaying HashSet elements
System.out.println(hset);

////removing elements
hSet.remove("EE");
hSet.remove("CC");

//2
//Adding elements from other Collection
//ArrayList declaration and and adding elements
ArrayList<String> arrList=new ArrayList<>();
arrList.add("AA");
arrList.add("BB");
arrList.add("CC");

//3
//copying ArrayList elements to HashSet
HashSet<String> hSet=new HashSet(arrList);
//adding another element to HashSet after copy
hSet.add("DD");

System.out.println("HashSet elements: ");
Iterator<String> it= hSet.iterator();
while(it.hasNext())
{
  System.out.println(it.next());
}

//3
//public void clear(): It removes all the elements
//from HashSet. The set becomes empty after this
//method gets called.

hset.clear();

//4
//// Create a HashSet
HashSet<String> hset = new HashSet<String>();
 
//add elements to HashSet
hset.add("Chaitanya");
hset.add("Rahul");
hset.add("Tim");
hset.add("Rick");
hset.add("Harry");

Iterator<String> it = hset.iterator();
while(it.hasNext()){
   System.out.println(it.next());
}

//Iterate without using Iterator
for (String temp : hset) {
    System.out.println(temp);
 }

//5
//Converting a HashSet to an Array// Create a HashSet

 
//add elements to HashSet
     hset.add("Element1");
     hset.add("Element2");
     hset.add("Element3");
     hset.add("Element4");

     for(String temp : array){
        System.out.println(temp);
     }

//6
//// Creating a TreeSet of HashSet elements
Set<String> tset = new TreeSet<String>(hset);

//7
// Creating a List of HashSet elements
List<String> list = new ArrayList<String>(hset);
 