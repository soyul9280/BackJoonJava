package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력: n: 몇번 덮어씌울지
 * 파일 삭제 전 파일 비트
 * 삭제후 비트
 * 0 ->1 1->0
 *
 * 출력: 삭제 성공 Deletion succeeded 실패 Deletion failed
 *
 *
 * 의문: 그럼 그냥 처음 입력값이랑 삭제 입력값 같은지 다른지만 확인하면 되는거 아닌가?
 */
public class FileRemove9243 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String original = br.readLine();
        String after = br.readLine();
        boolean success = true;
        for (int i = 0; i < original.length(); i++) {
            char a = original.charAt(i);
            char b = after.charAt(i);
            if (N % 2 == 0) {
                if (a != b) {
                    success = false;
                    break;
                }
            }else {
                if (a == b) {
                    success = false;
                }
            }
        }
        if(success) {
            System.out.println("Deletion succeeded");
        }else{
            System.out.println("Deletion failed");
        }
    }
}
