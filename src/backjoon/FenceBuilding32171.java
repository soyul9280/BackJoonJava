package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 직사각형 건물 xy축평행
 * 비용 = 직사각형 둘레
 * 입력: 첫줄 건물수 1<=N<=10,N줄 건물정보(-10<=a b c d<=10)
 * 출력 : 건물 1<=i<=N채 지을때 드는 비용
 *
 * 매번 입력할때마다 최대 최소 가로세로 길이 갱신
 */
public class FenceBuilding32171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int xmin=Integer.MAX_VALUE;
        int ymin=Integer.MAX_VALUE;
        int xmax=Integer.MIN_VALUE;
        int ymax=Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            xmin=Math.min(xmin,a);
            ymin=Math.min(ymin,b);
            xmax=Math.max(xmax,c);
            ymax=Math.max(ymax,d);
            int width=xmax-xmin;
            int height=ymax-ymin;
            int result = 2*(width + height);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
    /**
     * 오타 주의
     * 갱신하는 로직생각
     */
}
