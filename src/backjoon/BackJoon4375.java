package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        long oneNumber,cnt;
        while (br.readLine()!=null) {
            n = Integer.parseInt(br.readLine());
            oneNumber=1;
            cnt=1;
            while (true) {
                if (oneNumber % n == 0) {
                    System.out.println(cnt);
                    break;
                }
                else{
                    oneNumber=(oneNumber*10)+1;
                    oneNumber %= n; //여기서 미리 첫번째 나누기 힌거라 생각  111%7=41->6 41은 전 값이었네!
                    cnt++;
                }
            }
        }
    }
}
