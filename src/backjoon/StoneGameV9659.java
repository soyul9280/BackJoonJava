package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * 돌 1번/3번 가져감. 마지막에 가져가는 사람 승리. 상근 먼저
 * 입력 : N
 * 출력: SK CY
 *
 * N이 홀수면 SK 짝수면 CY
 * 동적 계획법 , 게임이론 수학
 */
public class StoneGameV9659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        if(n%2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }

       /* int count = 0;
        while(true){
            if(n==0){
                break;
            }
            Random random = new Random();
            boolean skip = random.nextBoolean();
            if(skip&&n>=3){
                n -=3;
                count++;
            }
            else{
                n -=1;
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }*/
    }

}
/**
 * 틀린 이유
 * n이 3보다 작을때 3빼는 경우 생각 안함
 * Random은 매번 시도마다 답 달라질수있어 사용하지 않는다
 * 입력 제한 n은 조까지였는데 int는 10억까지임. 제한 확인 할것!!!
 */
