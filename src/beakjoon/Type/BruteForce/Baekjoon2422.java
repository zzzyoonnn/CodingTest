package beakjoon.Type.BruteForce;
/*
문제
- 한윤정과 친구들은 이탈리아로 방학 여행을 갔다. 
  이탈리아는 덥다. 
  윤정이와 친구들은 아이스크림을 사먹기로 했다. 
  아이스크림 가게에는 N종류의 아이스크림이 있다. 
  모든 아이스크림은 1부터 N까지 번호가 매겨져있다. 
  어떤 종류의 아이스크림을 함께먹으면, 맛이 아주 형편없어진다. 
  따라서 윤정이는 이러한 경우를 피하면서 아이스크림을 3가지 선택하려고 한다. 
  이때, 선택하는 방법이 몇 가지인지 구하려고 한다.
입력
- 첫째 줄에 정수 N과 M이 주어진다. 
  N은 아이스크림 종류의 수이고, M은 섞어먹으면 안 되는 조합의 개수이다. 
  아래 M개의 줄에는 섞어먹으면 안 되는 조합의 번호가 주어진다. 
  같은 조합은 두 번 이상 나오지 않는다. (1 ≤ N ≤ 200, 0 ≤ M ≤ 10,000)
출력
- 첫째 줄에, 가능한 방법이 총 몇 개 있는지 출력한다.
ex 1)
입력        출력
- 5 3       - 3
  1 2
  3 4
  1 3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2422 {
  static int n;     // 아이스크림 종류의 수
  static int m;     // 섞어먹으면 안 되는 조합의 개수
  static boolean[][] map;   // 아이스크림 선택 가능 여부를 저장하는 2차원 배열

  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    map = new boolean[n + 1][n + 1];

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      // x와 y를 선택하면 선택 불가능한 조합으로 표시
      map[x][y] = true;
      map[y][x] = true;
    }
    System.out.println(bruteForce());
  }

  static int bruteForce() {
    int count = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = i + 1; j <= n; j++) {
        for (int k = j + 1; k <= n; k++) {
          if (map[i][j] || map[i][k] || map[j][k]) continue;
          count++;
        }
      }
    }
    return count;
  }
}