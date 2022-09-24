//// LinkedHashSet of String Type
LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<String>();

//1
// Adding elements to the LinkedHashSet
lhset.add("Z");
lhset.add("PQ");
lhset.add("N");
lhset.add("O");
lhset.add("KK");
lhset.add("FGH");
System.out.println(lhset);

//2. Add elements to LinkedHashSet 
LinkedHashSet.add("A");
LinkedHashSet.add("B");
LinkedHashSet.add("C");
LinkedHashSet.add("D");
LinkedHashSet.add("E");
 
System.out.println(LinkedHashSet);
 
//3. Check if element exists
boolean found = LinkedHashSet.contains("A");        //true
System.out.println(found);
 
//4. Remove an element
LinkedHashSet.remove("D");
 
//5. Iterate over values
Iterator<String> itr = LinkedHashSet.iterator();
 
while(itr.hasNext()) 
{
    String value = itr.next();
     
    System.out.println("Value: " + value);
}
