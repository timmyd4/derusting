public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable

    float negativeValue = -1.0f;

    float applyNegative = negativeValue;
    
    System.out.println(applyNegative);

    // Create an int with a positive value and assign it to a variable

    int positiveValue = 10;

    int applyPostive = positiveValue;

    System.out.println(applyPostive);

    // Use the modulo % operator to find the remainder when the int is divided by 3

    int equation = 7 % 2;

    System.out.println(equation);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)

    int value = 100;

    if(value % 2 == 0)
    {
      System.out.println("Even");
    }

    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    for(int i = 0; i < 100; i++)
    {
      if(i % 2 == 0)
      {
        System.out.println("Even" + "" + i);
      }
      else if(i % 3 == 0)
      {
        System.out.println("Odd" + "" + i);
      }
    }
    

    // Divide the number by another number using integer division

    int numberValue = 5;
    int divideValue = 10;

    System.out.println(divideValue / numberValue);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
