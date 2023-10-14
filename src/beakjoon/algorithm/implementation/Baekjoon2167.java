package beakjoon.algorithm.implementation;
/*
문제
- 2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 
  저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 
  배열의 (i, j) 위치는 i행 j열을 나타낸다.
입력
- 첫째 줄에 배열의 크기 N, M(1 ≤ N, M ≤ 300)이 주어진다. 
  다음 N개의 줄에는 M개의 정수로 배열이 주어진다. 
  배열에 포함되어 있는 수는 절댓값이 10,000보다 작거나 같은 정수이다. 
  그 다음 줄에는 합을 구할 부분의 개수 K(1 ≤ K ≤ 10,000)가 주어진다. 
  다음 K개의 줄에는 네 개의 정수로 i, j, x, y가 주어진다(1 ≤ i ≤ x ≤ N, 1 ≤ j ≤ y ≤ M).
출력
- K개의 줄에 순서대로 배열의 합을 출력한다. 
  배열의 합은 231-1보다 작거나 같다.
ex 1)
입력		출력
- 2 3       - 63
  1 2 4       2
  8 16 32     36
  3
  1 1 2 3
  1 2 1 2
  1 3 2 3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2167 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] arr = new int[n + 1][m + 1];
    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= m; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    int num = Integer.parseInt(br.readLine());

    for (int c = 0; c < num; c++) {
      int sum = 0;
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      for (int a = i; a <= x; a++) {
        for (int b =  j; b <= y; b++) sum += arr[a][b];
      }

      System.out.println(sum);
    }
  }
}
