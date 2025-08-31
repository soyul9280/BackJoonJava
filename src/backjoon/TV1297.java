package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 입력:대각선 길이D, 높이 비율 H 너비 비율 W
 * 출력: 높이 너비
 * 조건: 소수점이 나올경우 소수점 버리기
 *
 */
public class TV1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        double x = Math.sqrt(Math.pow(a,2)/(Math.pow(h,2)+Math.pow(w,2)));

        double realHeight= Math.floor(h*x);
        double realWeight = Math.floor(w*x);


        System.out.println((int)realHeight+" "+(int)realWeight);
    }

    /**
     * Math.round : 반올림
     * Math.floor: 내림
     * Math.ceil : 올림
     * System.out.printf("%.2f",num):2자리까지 출력
     */
}
