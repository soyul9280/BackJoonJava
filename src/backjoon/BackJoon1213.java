package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'A';
            arr[index]++;
        }
        int odd=0;
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
                num=i;
            }
            if (odd >= 2) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }
        String result = sb.toString();
        if (odd == 1) {
            result += (char) (num + 'A');
        }
        result += sb.reverse().toString();
        System.out.println(result);
    }
}
