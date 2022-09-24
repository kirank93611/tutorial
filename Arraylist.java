//ARRAYLIST:
//creating ArrayList of string
ArrayList<String> arrList=new ArrayList<>();

//ArrayList  operations  tutorial code

//Adding elements to Arraylist in java
arrList.add("Steve"); //This will add "Steve" at the end of List
arrList.add(3, "Steve"); //This will add "Steve" at the fourth position

//Change an element in ArrayList
arrList.set(0, "Lucy");//The method updated the element present at the index 0 (“”) 
//with the new String element “Lucy”

//Removing Element from ArrayList:
//Removing "Steve" and "Angela"
arrList.remove("Steve");
arrList.remove("Lucy");

//displaying elements
System.out.println(arrList);

//Iterating ArrayList
for(String str:alist)  
    System.out.println(str); //if incase for loop contains multiple statements add {} to the for loop

//for calculating size of arrayList
System.out.println("Number of elements in ArrayList: "+arrList.size());

//Sort ArrayList
for (String str : fruits) {
         System.out.println(str);
      }

//////////Methods for the arrayList
// 1 
//add( Object o): This method adds an object o at the end of the arraylist.

obj.add("hello");
//2
//add(int index, Object o): It adds the object o at the specified index in the ArrayList.

obj.add(2, "bye");
//3
//remove(Object o): Removes the object o from the ArrayList.

obj.remove("Chaitanya");
//4
//remove(int index): Removes element from a given index.

obj.remove(3);
//5
 //set(int index, Object o): Used for updating an element. 
 //It replaces the element present at the specified index with the object o.

obj.set(2, "Tom");

//6
//int indexOf(Object o):Gives the index of the object o. 
//If the element is not found in the list then this method returns the value -1.

int pos = obj.indexOf("Tom");

//7
//Object get(int index):It returns the object of list which is present at the specified index.

String str= obj.get(2);

//8
 //int size():It returns the size of the ArrayList (Number of elements of the list). 

 int numberofitems = obj.size();

 //9
  //boolean contains(Object o): It checks whether the given object o is present in the array list.
  //If the element is found it returns true else it returns false.

  obj.contains("Steve");

  //10
   //clear(): It is used for removing all the elements of the array list in one go. 
  //The below code will remove all the elements of ArrayList whose object is obj.

  obj.clear();public class Arraylist {
    
  }
  