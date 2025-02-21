package backjoon;

import java.io.*;
import java.util.HashMap;

import java.util.StringTokenizer;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> toStr = new HashMap<>();
        HashMap<String, Integer> toNum = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String name=br.readLine();
            toStr.put(i, name);
            toNum.put(name, i);
        }
        for (int i = 0; i < M; i++) {
            String q=br.readLine();
            if (isNum(q)) {
                bw.write(toStr.get(Integer.parseInt(q))+"\n");
            }else {
                bw.write(String.valueOf(toNum.get(q)));
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
