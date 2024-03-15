package timbuchalka.collectionsPartTwo;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java is already inside the map");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-orientated, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java");
        }

        System.out.println("=====================================================================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol was removed");
        } else {
            System.out.println("Algol was not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative syntax")); // it returns the previous entry
        System.out.println(languages.replace("Scala", "this will not be added")); // returns null
        if (languages.replace("BASIC", "Beginners All Purpose Symbolic Instruction Code", "new definition for BASIC")) {
            System.out.println("value for BASIC was replaced");
        } else {
            System.out.println("Value for BASIC was not replaced");
        }

        System.out.println("=====================================================================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}