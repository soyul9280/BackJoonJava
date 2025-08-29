package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 압력: 처음잔액 입금D출금W 조건금액
 * 마지막 입력줄은 0 W 0
 *
 * 출력: 계산된 결과
 * 결과가 -200초과면 Not allowed
 */
public class Transaction2975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            st=new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken());
            String action = st.nextToken();
            int account = Integer.parseInt(st.nextToken());
            if (begin == 0 && action.equals("W")&& account == 0) {
                break;
            }
            int result;
            if (action.equals("W")) {
                result = begin - account;
                if(result < -200 ){
                    sb.append("Not allowed").append("\n");
                    continue;
                }
                sb.append(result).append("\n");
            }
            else if (action.equals("D")) {
                result = begin + account;
                sb.append(result).append("\n");
            }
        }
        System.out.println(sb);
    }
    /**
     * String은 equals비교
     *
     * &&: 앞이 false면 어차피 false니까 뒤에 신경 안씀
     * &: 앞이 false여도 뒤에 검사
     */
}
