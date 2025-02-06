package backjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BackJoon9375{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int n=Integer.parseInt(br.readLine());
            Map<String, Integer> clothes = new HashMap<>();
            for (int j = 0; j < n; j++) {
                st.nextToken();
                String type=st.nextToken();
                if (clothes.containsKey(type)) {
                    clothes.put(type, clothes.get(type) + 1);
                }else {
                    clothes.put(type,1);
                }
            }
            int result=1;
            for (Integer value : clothes.values()) {
                result *= (value + 1);
            }
            bw.write(String.valueOf(result-1));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
