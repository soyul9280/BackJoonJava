package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 입력 :첫줄 -> 1<=N 성냥 개수<=50 1<=W 박스가로 H 박스세로<=100, 다음 N줄 -> 성냥 길이
 * 출력 : 들어가면 DA 안되면 NE
 *
 * 성냥길이 <= 가로, 세로 - 성공
 * 성냥길이^2 = 가로^2+세로^2 - 성공(피타고라스)
 * 나머지 실패
 */
public class AngryChangYoung3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num=Integer.parseInt(st.nextToken());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        for (int i = 1; i < num + 1; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x <= a || x <= b || (x * x <= a * a + b * b)) {
                sb.append("DA").append("\n");
            }else {
                sb.append("NE").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }

}
