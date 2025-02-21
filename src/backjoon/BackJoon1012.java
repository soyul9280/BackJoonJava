package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1012 {
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {1, -1, 0, 0};

    static int map[][];
    static boolean visit[][];
    static int nowX,nowY;
    static int M,N,K;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map=new int[N][M];
            visit = new boolean[N][M];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x]=1;
            }
            count=0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] == 1 && visit[j][k] == false) {
                        count++;
                        DFS(k, j);
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

    private static void DFS(int x, int y) {
        visit[y][x]=true;
        for (int i = 0; i < 4; i++) {
            nowX = x + dx[i];
            nowY = y + dy[i];
            if (RangeCheck() && visit[nowY][nowX] == false && map[nowY][nowX] == 1) {
                DFS(nowX,nowY);
            }
        }
    }

    private static boolean RangeCheck() {
        return (nowY < N && nowY >= 0 && nowX < M && nowX >= 0);
    }

}
