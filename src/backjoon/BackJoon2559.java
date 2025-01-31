package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon2559 {
    public static void main(String[] args) throws IOException {
        int max=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int[] temp=new int[N];
        for (int i = 0; i <N; i++) {
            temp[i]=Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <K; i++) {
            max = max + temp[i];
        }
        int temperature=max;
        for (int i = K; i < N; i++) {
            temperature = temperature - temp[i - K] + temp[i];
            max = Math.max(temperature, max);
        }
        System.out.println(max);
    }
}
