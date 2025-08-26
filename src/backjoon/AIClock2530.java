package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 시분초 입력 - 공백 구분
 * 요리시간 입력
 *
 * 분 % 60 = 시 + 몫, 분 -> 나머지
 * 초 % 60 = 분 + 몫 ,초 ->나머지
 */
public class AIClock2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int cook = Integer.parseInt(br.readLine());
        int si = Integer.parseInt(st.nextToken());
        int bun = Integer.parseInt(st.nextToken());
        int cho = Integer.parseInt(st.nextToken());

        cho = cho + cook;
        bun = bun + (cho / 60);
        cho = cho %60;
        si = si + (bun / 60);
        bun = bun % 60;
        si = si % 24;
        sb.append(si).append(" ").append(bun).append(" ").append(cho);
        System.out.println(sb);
    }
    /**
     * si % 24 부분 안함
     * cho + cook 안하고 바로 cook % 60함.
     */
}
