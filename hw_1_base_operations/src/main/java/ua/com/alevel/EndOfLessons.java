package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;

public class EndOfLessons {
    public void run(BufferedReader reader) throws IOException {
        while (true) {
            System.out.println("Here user can check when the certain lesson takes place, to check what you need enter the serial number of the lesson");
            String st = reader.readLine();
            if (st.compareTo("0") == 0) break;
            int x;
            while (true) {
                try {
                    x = Integer.parseInt(st);
                } catch (Exception e) {
                    System.out.println("Could not parse input, enter another one.");
                    st = reader.readLine();
                    continue;
                }
                break;
            }
            if (x <= 10 && x > 0) {
                count(x);
            } else System.out.println("Invalid number. Enter another one.");
        }
    }

    public void count(int x) {
        x = x * 45 + (x / 2) * 5 + ((x + 1) / 2 - 1) * 15;
        System.out.println(9 + x / 60 + " " + x % 60);
    }
}
