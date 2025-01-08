import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> workingMap = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    workingMap.put("Words", 10);
    workingMap.put("fun", 20);
    workingMap.put("excited", 30);
    // (it's OK to do this one-by-one)

    // Get the value associated with a given key in the Map

    System.out.println(workingMap.get("fun"));
    // Find the size (number of key/value pairs) of the Map

    // Replace the value associated with a given key (the size of the Map shoukld not change)

    // Check whether the Map contains a given key

    // Check whether the Map contains a given value

    // Iterate over the keys of the Map, printing each key

    // Iterate over the values of the map, printing each value

    // Iterate over the entries in the map, printing each key and value

    /*
     
Usage tip!
Maps are great when you want a specific key to value mapping.
Example: The key could be a person's name, and the value could be their phone number
However if your keys are simple ascending 0-indexed integers with no gaps
(0, 1, 2, 3, 4...) then an array or List is likely a better choice.
Example: If you want to store the order of songs in a playlist.
If you're finding that you're just wanting to store unordered values and the keys
are unimportant, a Set may be a better choice.
Example: If you want to hold the student ID numbers of everyone in a course,
and you don't care about any ordering.*/
}
}