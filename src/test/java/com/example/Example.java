package com.example;


public class Example {
    public static void main(String[] args) {
        // Unused variable
        int unusedVariable = 42;

        // Avoid branching statement as last in loop
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            // System.out.println(i);
        }

        // Uncomment the line below to trigger Checkstyle's LineLength rule
        System.out.println("This line exceeds the maximum allowed mlk mlsk mlksm lks mslk mslkm lkss.");

        // Uncomment the line below to trigger PMD's UnusedLocalVariable rule
        int unusedVariable2 = 0;

        // Uncomment the line below to trigger FindBugs' DM_DEFAULT_ENCODING rule
        String str = new String("some string");
    }
}
