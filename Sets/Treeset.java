//1
//Operation 1: Adding Elements

//In order to add an element to the TreeSet, we can use the add() method. 
//However, the insertion order is not retained in the TreeSet. Internally, for every element, the values are compared and sorted in ascending order. We need to keep a note that duplicate elements are not allowed and all the duplicate elements are ignored. 
//And also, Null values are not accepted by the TreeSet

Set<String> ts = new TreeSet<>();
  
        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
  
        // Print all elements inside object
        System.out.println(ts);

//2
//Operation 2: Accessing the Elements

//After adding the elements, if we wish to access the elements, 
//we can use inbuilt methods like contains(), first(), last(), etc. 

//Check if the above string exists in
        // the treeset or not
        System.out.println("Contains " + check + " "+ ts.contains(check));


// Print the first element in
// the TreeSet
        System.out.println("First Value " + ts.first());
  
// Print the last element in
// the TreeSet
        System.out.println("Last Value " + ts.last());
  
        String val = "Geek";
  
// Find the values just greater
// and smaller than the above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));

//3
//Operation 3: Removing the Values
//The values can be removed from the TreeSet using the remove() method.
//There are various other methods that are used to remove the first value or the last value. 

// Removing a specific existing element inserted above
        ts.remove("B");

//4
//Operation 4: Iterating through the TreeSet
//There are various ways to iterate through the TreeSet. 
//The most famous one is to use the enhanced for loop. 
//and geeks mostly you would be iterating the elements with this approach while practicing questions over TreeSet as this is most frequently used when it comes to tree, maps, and graphs problems.

// Now we will be using for each loop in order
// to iterate through the TreeSet
        for (String value : ts)
  
            // Printing the values inside the object
            System.out.print(value + ", ");