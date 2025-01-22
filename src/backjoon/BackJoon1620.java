package backjoon;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BackJoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> pocket1 = new HashMap<>();
        HashMap<String, Integer> pocket2 = new HashMap<>();
        for (int i = 1; i < N; i++) {
            String str = br.readLine();
            pocket1.put(i, str);
            pocket2.put(str, i);
        }
        for (int i = 0; i < M; i++) {
            String pocketMon = br.readLine();
            if (isNum(pocketMon)) {
                bw.write(pocket1.get(Integer.parseInt(pocketMon)) + "\n");
            }else {
                bw.write(pocket2.get(pocketMon));
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
