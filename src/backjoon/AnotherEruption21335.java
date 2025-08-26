package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력: 원형 면적
 * 출력: 지름으로 원의 둘레
 * 다시 풀기
 */
public class AnotherEruption21335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double square = Double.parseDouble(br.readLine());
        double r = Math.sqrt(square / Math.PI);
        double result =(r*2*Math.PI);
        System.out.printf("%.9f",result);
    }
}
