package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackJoon2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputArr = new int[9];
        int sum=0;
        for (int i = 0; i < 9; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
            sum += inputArr[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (sum - inputArr[i] - inputArr[j] == 100) {
                    inputArr[i]=0;
                    inputArr[j]=0;
                    Arrays.sort(inputArr);
                    break;
                }
            }
        }
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 0) {
                continue;
            }
            System.out.println(inputArr[i]);
        }
    }
}
