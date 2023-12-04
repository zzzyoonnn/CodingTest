package beakjoon.algorithm.greedy;
/*
문제
- 준하는 라디오 수집광으로 신제품의 라디오가 나올때마다 흥분을 금치 못한다고 한다.
  최근 준하가 구입한 라디오는 매우 하이테크 한데, 그 라디오에는 다음과 같은 버튼이 있다.
    첫 번째 버튼은 주파수를 1MHz 증가시킨다.
    두 번째 버튼은 주파수를 1MHz 감소시킨다.
    나머지 N개의 버튼은 즐겨찾기 기능으로, 미리 지정된 주파수로 이동한다.
  준하는 몸이 안좋아 하루에 손가락을 몇 번 움직이지 못하기 때문에 우리의 도움이 필요하다.
  현재 주파수 A와 듣고싶은 주파수 B가 주어질 때, 
  주파수 A에서 B로 갈 때 눌러야 하는 가장 적은 버튼수를 구해주자.
입력
- 첫 줄엔 정수 A와 B가 주어진다 (1 ≤ A, B < 1000, A ≠ B).
  다음 줄엔 정수 N이 주어진다 (1 ≤ N ≤ 5).
  다음 N개의 줄엔 미리 지정되어 있는 주파수가 주어진다 (주파수는 1000 보다 작다).
출력
- 주파수 A에서 B로 갈 때 눌러야 하는 버튼수의 최솟값을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3135 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int min = Math.abs(b - a);

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      int m = Integer.parseInt(br.readLine());
      if (min >= Math.abs(b - m)) {
        min = Math.abs(b - m);
      }
    }

    if (min != Math.abs(b - a)) min++;
    System.out.println(min);
  }
}
