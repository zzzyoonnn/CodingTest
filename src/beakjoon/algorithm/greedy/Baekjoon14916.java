package beakjoon.algorithm.greedy;
/*
문제
- 춘향이는 편의점 카운터에서 일한다.
  손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 
  2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 
  동전의 개수가 최소가 되도록 거슬러 주어야 한다. 
  거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
  예를 들어, 
  거스름돈이 15원이면 5원짜리 3개를, 
  거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를, 
  거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
입력
- 첫째 줄에 거스름돈 액수 n(1 ≤ n ≤ 100,000)이 주어진다.
출력
- 거스름돈 동전의 최소 개수를 출력한다. 만약 거슬러 줄 수 없으면 -1을 출력한다.
ex 1)
입력      출력
- 13      - 5
ex 2)
입력      출력
- 14      - 4
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14916 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    if (n == 1 || n ==3) System.out.println(-1);
    else if (n == 2) System.out.println(1);
    else if (n % 5 == 0) System.out.println(n / 5);
    else if (n % 5 == 1) System.out.println((n / 5) + 2);
    else if (n % 5 == 2) System.out.println((n / 5) + 1);
    else if (n % 5 == 3) System.out.println((n / 5) + 3);
    else if (n % 5 == 4) System.out.println((n / 5) + 2);
  }
}
