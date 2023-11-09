package beakjoon.algorithm.mathematics;
/*
문제
- 은하는 수업 때 1부터 N까지 수의 합과 1부터 N까지 수의 세제곱의 합과 관련된 다음 공식을 배웠습니다.
    (1 + 2 + ... + N)^2 = 1^3 + 2^3 + ... + N^3 
  믿을 수 없었던 은하는 직접 코딩을 해서 검증해 보기로 했습니다. 
  1부터 N까지 수의 합과 그 수를 제곱한 수, 또 1부터 N까지 수의 세제곱의 합을 차례대로 출력하세요.
입력
- 첫 줄에 문제의 정수 N이 주어집니다. (5 <= N <= 100) 
출력
- 세 줄을 출력하세요.
    첫 줄에는 1부터 N까지 수의 합 1+2+...+N을 출력하세요.
    둘째 줄에는 1부터 N까지 수의 합을 제곱한 수 (1+2+...+N)^2을 출력하세요.
    셋째 줄에는 1부터 N까지 수의 세제곱의 합 1^3+2^3+...+N^3을 출력하세요.
 */
import java.util.Scanner;

public class Baekjoon28701 {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
    System.out.println(sum * sum);

    sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += (i * i * i);
    }
    System.out.println(sum);
  }
}
