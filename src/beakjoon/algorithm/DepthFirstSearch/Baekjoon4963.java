package beakjoon.algorithm.DepthFirstSearch;
/*
문제
- 정사각형으로 이루어져 있는 섬과 바다 지도가 주어진다. 
  섬의 개수를 세는 프로그램을 작성하시오.
  한 정사각형과 가로, 세로 또는 대각선으로 연결되어 있는 사각형은 걸어갈 수 있는 사각형이다. 
  두 정사각형이 같은 섬에 있으려면, 한 정사각형에서 다른 정사각형으로 걸어서 갈 수 있는 경로가 있어야 한다. 
  지도는 바다로 둘러싸여 있으며, 지도 밖으로 나갈 수 없다.
입력
- 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
  각 테스트 케이스의 첫째 줄에는 지도의 너비 w와 높이 h가 주어진다. 
  w와 h는 50보다 작거나 같은 양의 정수이다.
  둘째 줄부터 h개 줄에는 지도가 주어진다. 
  1은 땅, 0은 바다이다.
  입력의 마지막 줄에는 0이 두 개 주어진다.
출력
- 각 테스트 케이스에 대해서, 섬의 개수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4963 {
  static int[][] map;
  static boolean[][] check;
  static int w;
  static int h;
  static int dx[] = {0, 0, -1, 1, -1, 1, -1, 1};
  static int dy[] = {-1, 1, 0, 0, 1, 1, -1, -1};

  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    while (true) {
      st = new StringTokenizer(br.readLine());

      h = Integer.parseInt(st.nextToken());
      w = Integer.parseInt(st.nextToken());

      if (w == 0 && h == 0) break;

      map = new int[w][h];
      check = new boolean[w][h];

      for (int i = 0; i < w; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < h; j++) {
          map[i][j] = Integer.parseInt(st.nextToken());
        }
      }

      int count = 0;

      for (int i = 0; i < w; i++) {
        for (int j = 0; j < h; j++) {
          if (map[i][j] == 1 && !check[i][j]) {
            dfs(i, j);
            count++;
          }
        }
      }

      System.out.println(count);
    }
  }

  private static void dfs(int x, int y) {
    check[x][y] = true;

    for (int i = 0; i < 8; i++) {
      int nowX = x + dx[i];
      int nowY = y + dy[i];

      if (nowX >= 0 && nowY >= 0 && nowX < w && nowY < h) {
        if (map[nowX][nowY] == 1 && !check[nowX][nowY]) {
          dfs(nowX, nowY);
        }
      }
    }
  }
}
