package backjoon;

import java.io.*;
import java.util.*;

public class BackJoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        Queue<Integer> numbers = new ArrayDeque<>();
        for (int i = 1; i < N; i++) {
            numbers.offer(i);
        }
        bw.write("<");
       while(numbers.size()!=1){
           for (int i = 0; i < K-1; i++) {
               numbers.offer(numbers.poll());
           }
           bw.write(numbers.poll()+", ");
       }
       bw.write(numbers.poll()+">");
        bw.flush();
        bw.close();
    }
}
