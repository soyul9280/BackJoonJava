package backjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class BackJoon2178 {
    static int N,M;
    static int[][] map;
    static boolean[][] visited;
    static int cnt=1;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];
        String str;//next로 연속으로 받으니까
        for (int i = 0; i < N; i++) {
            str = sc.next();//엔터치면 i++
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        bfs();
        System.out.println(map[N - 1][M - 1]);
    }

    public static void bfs() {
        var queue = new LinkedList<int[]>();
        queue.add(new int[]{0, 0});
        int[] tmp = new int[2];
        visited[0][0]=true;
        int y, x;
        int ny,nx;
        while (!queue.isEmpty()) {
            tmp = queue.poll();
            y = tmp[0];
            x = tmp[1];
            for (int i = 0; i < 4; i++) {
                ny = y + dy[i];
                nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny > N || nx > M) {
                    continue;
                }
                if (!visited[ny][nx] && map[ny][nx] == 1) {
                    visited[ny][nx]=true;
                    map[ny][nx] += map[y][x];
                    queue.add(new int[]{ny, nx});
                }
            }
        }
    }
}
