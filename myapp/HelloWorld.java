package myapp;

import java.io.Console;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello World :3");

        // Console console = System.console();
        // String name = console.readLine("What is your name? ");

        // System.out.println("Your name is " + name);

        // String sport = console.readLine("What is the sport that you like to do? ");

        // if (sport.toUpperCase().equals("SWIMMING")) {
        //     System.out.println("That's a nice water sport!");
        // } else if (sport.toUpperCase().equals("SOCCER")) {
        //     System.out.println("That's a widely loved sport!");
        // } else {
        //     System.out.println("I've never heard of that sport before...");
        // }

        // String replacedName = name.replace('a', 'e');
        // System.out.printf("your name... %s \n", replacedName);

        // String valueString = console.readLine("Enter your score between 0 and 100: ");
        // Integer score = Integer.parseInt(valueString);

        // switch (score) {
        //     case 100: 
        //         System.out.println("Perfect Score");
        //     case 50: 
        //         System.out.println("FAIL");
        // }

        // int i = 0; 
        // while (i < score) {
        //     System.out.print(i + ", "); 
        //     i++;
        // }

        // do {
        //     System.out.print(i + ", ");
        //     i++;
        // } while (i < score);

        // }

        // Day 2: Scanner Example
        Console console = System.console(); 

        List<String> words = new ArrayList<String>(); 

        String keyboardInput = ""; 
        keyboardInput = console.readLine("Enter a sentence: ");

        Scanner scan = new Scanner(keyboardInput); 

        while (scan.hasNext()) {
            words.add(scan.next());
        }

        scan.close();

        // Simple printing method 
        // for (String s : words) {
        //     System.out.printf("%s\n", s);
        // }

        for (int z=0; z < words.size(); z++) {
            System.out.printf("%d : %s \r\n", z+1, words.get(z));
        }

    }
}