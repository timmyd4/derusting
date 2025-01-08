public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arrayOfStrings = {"None", "None", "None", "None"};

    // Set the value of the array at each index to be a different String
    arrayOfStrings[0] = "I";
    arrayOfStrings[1] = "Was";
    arrayOfStrings[2] = "In";
    arrayOfStrings[3] = "Class";

    // It's OK to do this one-by-one

    // Get the value of the array at index 2
    System.out.println(arrayOfStrings[2]);

    // Get the length of the array
    int item = arrayOfStrings.length;
    System.out.println(item);
    // Iterate over the array using a traditional for loop and print out each item

    for(int i = 0; i < item; i++)
    {
      System.out.println(arrayOfStrings[i]); 
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String Printing : arrayOfStrings)
    {
      System.out.println(Printing);
    }

    /*
     
Reminder!
Arrays start at index 0*/
}
}