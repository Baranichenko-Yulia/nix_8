package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunProgram {
    public static void run() {
        System.out.println("You have four possible variants: ");
        System.out.println(" -Enter 1, if you want to  check the sum of the numbers in the string");
        System.out.println(" -Enter 2, if you want to  check the number of the letters in the string");
        System.out.println(" -Enter 3, if you want to  find out when the certain lesson takes place");
        System.out.println(" -And enter 0, if you want to  end the program, to end any program you want to choose also enter 0");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String event;
        try {
            while (true) {
                if ((event = reader.readLine()) == null) break;
                switch (event) {
                    case "1": {
                        new NumbersInString().run(reader);
                    }
                    break;
                    case "2": {
                        new AmountOfLeters().run(reader);
                    }
                    break;
                    case "3": {
                        new EndOfLessons().run(reader);
                    }
                    break;
                    case "0": {
                        System.exit(0);
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
