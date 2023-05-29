package beakjoon.algorithm.greedy;
/*
문제
- 등산가 김강산은 가족들과 함께 캠핑을 떠났다. 
  하지만, 캠핑장에는 다음과 같은 경고문이 쓰여 있었다.
  캠핑장은 연속하는 20일 중 10일동안만 사용할 수 있습니다.
  강산이는 이제 막 28일 휴가를 시작했다. 
  이번 휴가 기간 동안 강산이는 캠핑장을 며칠동안 사용할 수 있을까?
  강산이는 조금 더 일반화해서 문제를 풀려고 한다. 
  캠핑장을 연속하는 P일 중, L일동안만 사용할 수 있다. 
  강산이는 이제 막 V일짜리 휴가를 시작했다. 
  강산이가 캠핑장을 최대 며칠동안 사용할 수 있을까? (1 < L < P < V)
입력
- 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
  각 테스트 케이스는 한 줄로 이루어져 있고, L, P, V를 순서대로 포함하고 있다. 
  모든 입력 정수는 int범위이다. 
  마지막 줄에는 0이 3개 주어진다.
출력
- 각 테스트 케이스에 대해서, 강산이가 캠핑장을 최대 며칠동안 사용할 수 있는지 예제 출력처럼 출력한다.
ex 1)
입력		출력
- 5 8 20    - Case 1: 14
  5 8 17      Case 2: 11
  0 0 0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon4796 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    int n = 0;

    while ((str = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(str);
      int l = Integer.parseInt(st.nextToken());
      int p = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      if (l == 0 && p == 0 && v == 0) break;

      int max = 0;

      max += (v / p * l) + Math.min(l, (v % p));
      ++n;

      System.out.println("Case " + n +": " + max);


    }
  }
}
