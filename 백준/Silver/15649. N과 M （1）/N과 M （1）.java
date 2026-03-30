import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

//        for (int i = 0; i < N; i++) {             -> for문으로는 모든 경우의 수를 다 출력할 수 없을듯 -> dfs
//            for (int j = 0; j < M; j++) {
//                System.out.println(i + 1);
//            }
//        }

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
    }

    /*
    * 입력값이 4 2 일 때
    * 1 1, 1 2, 1 3, 1 4, 2 1, 2 2, 2 3, 2 4 ... 이렇게 반복
    * 근데 두 숫자가 같으면 출력 x
    *
    * 1: (N: 4, M: 2, depth: 0)
    * -> i = 0일 때, visit[0] = false(기본값)이므로 if문 속 문법 실행
    * visit[0] = true, arr[0] = 1, dfs(4, 2, 1)
    * dfs(4, 2, 1)
    * i = 0일 때, visit[0] = true 이므로 pass
    * i = 1일 때, visit[1] = false
    * visit[1] = true, arr[1] = 2, dfs(4, 2, 2)
    * dfs(4, 2, 2)
    * depth == M -> 출력 후 return;
    */
    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}
