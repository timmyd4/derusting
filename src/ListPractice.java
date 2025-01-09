import java.util.ArrayList;
public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> EmptyList = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    EmptyList.add("Hello");
    EmptyList.add("GoodBye");
    EmptyList.add("See you around");
    // Print the element at index 1
    System.out.println(EmptyList.get(2));
    // Replace the element at index 1 with a new value
    EmptyList.set(1,  "GoodMorning");
    // (Do not insert a new value. The length of the list should not change)
    // Insert a new element at index 0 (the length of the list will change)
    EmptyList.add(0, "Bonjour");
    System.out.println(EmptyList);
    // Check whether the list contains a certain string
    System.out.println(EmptyList.contains("Bonjour"));
    // Iterate over the list using a traditional for-loop.
    for(int i = 0; i < EmptyList.size(); i++)
    {
      System.out.println(EmptyList);
    }
    // Print each index and value on a separate line
    for(int i = 0; i < EmptyList.size(); i++)
    {
      System.out.println(i + " " + EmptyList.get(i));
    }

    // Sort the list using the Collections library
    EmptyList.sort(null);
    System.out.println(EmptyList);


    // Iterate over the list using a for-each loop
    for (String IterateOver : EmptyList)
    {
      System.out.println(IterateOver);
    }
    // Print each value on a second line
    for (String IterateOver : EmptyList)
    {
      System.out.println(IterateOver);
      System.out.println();
    }

    /*
     
Usage tip!
Use a traditional for-loop when you need to use the index or you need to iterate in an
unconventional order (e.g. backwards)
Otherwise, if you're iterating the in the conventional order and don't need the
index values a for-each loop is cleaner.*/
}
}