package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력: n0, 마지막줄 0
 * n1=3*n0 ->짝수 n2=n1/2. 홀수 n2=(n1+1)/2
 * n3=3*n2
 * n4=n3/9 몫
 * n1이 짝수면 n0=2*n4, 홀수면 n0=2*n4+1
 *
 * 출력: 케이스 번호.짝수 even 홀수 odd n4
 */
public class NumGuess4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=0;
        while (true) {
            int n0 = Integer.parseInt(br.readLine());
            if(n0==0)break;
            N +=1;
            int n1 = 3 * n0;
            int n2;

            if (n1 % 2 == 0) {
                n2 = n1 / 2;
            }else{
                n2 = (n1 + 1) / 2;
            }

            int n3 = 3 * n2;
            int n4 = n3 / 9;

            if (n1 % 2 == 0) {
                n0 = 2 * n4;
            }else{
                n0 = 2 * n4 + 1;
            }

            if (n1 % 2 == 0) {
                sb.append(N).append(".").append(" even ").append(n4).append("\n");
            }else{
                sb.append(N).append(".").append(" odd ").append(n4).append("\n");
            }
        }
        System.out.println(sb);
    }
    /**
     * while(조건){}
     * while(boolean){무한루프 조건식 break}
     */
}
