package beakjoon.algorithm.Simulation;
/*
문제
- 도현이는 바구니를 총 N개 가지고 있고, 
  각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 
  바구니는 일렬로 놓여져 있고, 
  가장 왼쪽 바구니를 1번째 바구니, 
  그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 
  도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 
  도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 
  그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
  바구니의 순서를 어떻게 바꿀지 주어졌을 때, 
  M번 바구니의 순서를 역순으로 만든 다음, 
  바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
입력
- 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
  둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 
  방법은 i j로 나타내고, 
  왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
  도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
출력
- 모든 순서를 바꾼 다음에, 
  가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
ex 1)
입력		출력
- 5 4       - 3 4 1 2 5
  1 2
  3 4
  1 4
  2 2
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10811 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] basket = new int[n + 1];

    for (int i = 0; i <= n; i++) basket[i] = i;

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      for (int j = 0; j <= (b - a) / 2; j++) {
        int temp = basket[a + j];
        basket[a + j] = basket[b - j];
        basket[b - j] = temp;
      }
    }
    for (int i = 1; i <= n; i++) System.out.print(basket[i] + " ");
  }
}
