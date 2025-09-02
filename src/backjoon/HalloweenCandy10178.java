package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 공정하게 나누는데 아빠는 최대한 많은 사탕 나눠주고 자신에게 몇개 남는지 알고싶어함
 * 입력
 * 테스트 케이스 수
 * 사탕개수c 형제수v
 * 출력: You get ___piece(s) and your dad gets ___ piece(s)."
 */
public class HalloweenCandy10178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int v= Integer.parseInt(st.nextToken());
            int me = c / v;
            int dad = c%v;
            sb.append("You get " + me + " piece(s) and your dad gets " + dad + " piece(s).")
                    .append("\n");
        }
        System.out.println(sb);
    }
}
