package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;

public class NumbersInString {
    public void run(BufferedReader reader) throws IOException {
        while (true) {
            System.out.println("Here user can see the sum of the numbers in the string that user will enter");
            String st = reader.readLine();
            if (st.compareTo("0") == 0) break;
            String buff = "0";
            int sum = 0;
            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                if (Character.isDigit(ch))
                    buff += ch;
                else {
                    sum += Integer.parseInt(buff);
                    buff = "0";
                }
            }
            sum += Integer.parseInt(buff);
            System.out.println("sum of numbers: " + sum);
        }
    }
}
