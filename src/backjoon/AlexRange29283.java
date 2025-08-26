package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력 : 누른 횟수 k
 * k<=5 - 30s
 * 5<k<=10 - 60s
 * 10<k<=15 - 90s
 *
 * 출력: 몇초동안 데워질지
 */
public class AlexRange29283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        long result = 0;
        long time = 30;
        for (int i = 1; i < k + 1; i++) {
            result +=time;
            if (i % 5 == 0) {
                time+=30;
            }
            //result +=time; 여기 문제
        }
        System.out.println(result);
    }
    /**
     * 5번까지 이전, 그 이후는 증가된 시간으로 계산되어야함
     * result time은 int로 부족하기에 꼭 long!!!!
     */
}
