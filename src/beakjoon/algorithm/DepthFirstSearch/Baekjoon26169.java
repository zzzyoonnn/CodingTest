package beakjoon.algorithm.DepthFirstSearch;
/*
문제
- 5 x 5 크기의 보드가 주어진다. 
  보드는 1 x 1 크기의 정사각형 격자로 이루어져 있다. 
  보드의 격자는 사과가 1개 있는 격자, 장애물이 있는 격자, 빈칸으로 되어 있는 격자로 구분된다. 
  격자의 위치는 (r, c)로 표시한다. 
  r은 행 번호, c는 열 번호를 나타낸다. 
  행 번호는 맨 위 위치가 0이고 아래 방향으로 1씩 증가한다. 
  열 번호는 맨 왼쪽 위치가 0이고 오른쪽으로 1씩 증가한다. 
  즉, 맨 왼쪽 위 위치가 (0, 0), 맨 아래 오른쪽 위치가 (4, 4)이다.
  현재 한 명의 학생이 (r, c) 위치에 있고 한 번의 이동으로 상, 하, 좌, 우 방향 중에서 한가지 방향으로 한 칸 이동할 수 있다. 
  학생이 사과가 있는 칸으로 이동하면 해당 칸에 있는 사과를 1개 먹는다. 
  장애물이 있는 칸으로는 이동할 수 없다. 
  학생이 지나간 칸은 학생이 해당 칸을 떠나는 즉시 장애물이 있는 칸으로 변경된다. 
  즉, 학생이 해당 칸에서 상, 하, 좌, 우 방향으로 한 칸 이동하는 즉시 해당 칸은 장애물이 있는 칸으로 변경된다.
  학생이 현재 위치 (r, c)에서 세 번 이하의 이동으로 사과를 2개 이상 먹을 수 있으면 1을 출력하고, 그렇지 않으면 0을 출력하자.
입력
- 첫 번째 줄부터 다섯 개의 줄에 걸쳐 보드의 정보가 주어진다. 
  i번째 줄의 j번째 수는 보드의 (i - 1)번째 행, (j - 1)번째 열의 정보를 나타낸다. 
  보드의 정보가 1이면 해당 칸은 사과가 1개 있는 격자임을 나타내고, 
  0이면 빈칸이 있는 격자를 나타내고, 
  -1이면 장애물이 있는 격자임을 나타낸다.
  다음 줄에 학생의 현재 위치 r, c가 빈칸을 사이에 두고 순서대로 주어진다.
출력
- 첫 번째 줄에 학생이 현재 위치 (r, c)에서 세 번 이하의 이동으로 
  사과를 2개 이상 먹을 수 있으면 1을 출력하고, 먹을 수 없으면 0을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon26169 {
  static int mx[] = {0, -1, 0, 1};
  static int my[] = {-1, 0, 1, 0};
  static int map[][] = new int[5][5];
  static int start_x, start_y;
  static int result;

  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st;
    for (int i = 0; i < 5; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 5; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    st = new StringTokenizer(br.readLine());
    start_x = Integer.parseInt(st.nextToken());
    start_y = Integer.parseInt(st.nextToken());

    findApple(start_x, start_y, 0, 0);

    System.out.println(result);
  }

  public static void findApple(int x, int y, int depth, int apple) {
    if (map[x][y] == 1) apple++;

    if (depth == 3) {
      if (apple >= 2) {
        result = 1;
      }
      return;
    }

    for (int i = 0; i < 4; i++) {
      int xx = x + mx[i];
      int yy = y + my[i];

      if (xx < 0 || xx >= 5 || yy < 0 || yy >= 5 || map[xx][yy] == -1) {
        continue;
      }

      map[x][y] = -1;
      findApple(xx, yy, depth + 1, apple);
      map[x][y] = 0;
    }

  }
}
