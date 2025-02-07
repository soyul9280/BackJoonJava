package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(pow(a,b,c));
    }

    static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 1) {
            return (a * pow(a, b - 1, mod)) % mod;
        }
        long k = pow(a, b / 2, mod);
        return (k * k) % mod;
    }
}
