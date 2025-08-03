// Java.lang.String method lastIndexOf() to show index of characters we are looking for occurred the last in text.

package com.strings;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string to keep text for finding occurrences
        String text = "Sunday is awesome. After Sunday comes Monday.";

        // Using lastIndexOf() for word ´Sunday´ will show index of last meeting this word
        System.out.println(text.lastIndexOf("Sunday")); // Output: 25

        //  Using lastIndexOf("str", int index) for word ´Sunday´ starting from index 0 will show index of first meeting
        //  of the word
        System.out.println(text.lastIndexOf("Sunday", 0)); // Output: 0
    }
}