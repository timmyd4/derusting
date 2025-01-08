import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String letters = "Hello World";
    String AssignString = letters;

    System.out.println(AssignString);

    // Find the length of the string

    System.out.println(AssignString.length());

    // Concatenate (add) two strings together and reassign the result
    String Value1 = "hel";
    String Value2 = "lo";

    System.out.println(Value1 + Value2);

    // Find the value of the character at index 3
    System.out.println(AssignString.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(AssignString.contains("Hell"));

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < AssignString.length(); i++)
    {
      System.out.println(AssignString.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> ValueList = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    ValueList.add("Blue");
    ValueList.add("Red");
    ValueList.add("Green");
    ValueList.add("Yellow");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String storeValues = String.join(",", ValueList);
    System.out.println(storeValues);

    // Check whether two strings are equal
    System.out.println(Value1.equals(Value2));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
