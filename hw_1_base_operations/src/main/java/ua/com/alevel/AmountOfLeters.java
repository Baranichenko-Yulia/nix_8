package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class AmountOfLeters {
    public void run(BufferedReader reader) throws IOException {
        while (true) {
            System.out.println("Here user can enter the string and see the amount of each letter");
            String st = reader.readLine();
            if (st.compareTo("0") == 0) break;
            st = st.replaceAll("[^a-zA-Za-яА-ЯёЁ]+", "");
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            st = String.valueOf(arr);
            int n = 1;
            for (int i = 0; i < arr.length; ) {
                System.out.println(n + ". " + arr[i] + "-" + (1 + st.lastIndexOf(arr[i]) - st.indexOf(arr[i])));
                i += (1 + st.lastIndexOf(arr[i]) - st.indexOf(arr[i]));
                n++;
            }
            if (n == 1)
                System.out.println("No latin/cyrillic symbols were found");
        }
    }
}
