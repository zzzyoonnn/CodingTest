package beakjoon.step03;
/*
문제
- 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력
- 입력은 여러 개의 테스트 케이스로 이루어져 있다.
  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력
- 각 테스트 케이스마다 A+B를 출력한다.
ex 1)
입력			출력
- 1 1           - 2
  2 3             5
  3 4             7
  9 8             17
  5 2             7
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10951 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;

    while ((str = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(str);

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      System.out.println(a + b);
    }
  }
}
