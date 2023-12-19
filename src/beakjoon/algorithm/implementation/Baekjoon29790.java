package beakjoon.algorithm.implementation;
/*
문제
- 여러 대회에서 문제를 출제 및 검수를 해왔던 임스는 20년 동안 플레이 중인 메이플을 주제로 비공식 메이플컵을 준비 중이다.
  임스는 해당 대회의 출제진이 되기 위한 조건 두 가지를 정했다.
    백준의 대회 문제 출제 조건인 1,000문제 이상을 해결하였는가
    메이플스토리의 유니온 레벨이 8,000이상이거나 최고 레벨이 260이상인가
  해당 조건을 모두 만족하는 출제진은 임스가 기쁜 마음으로 모셔 올 예정이다.
  출제진으로 지원한 지원자의 백준에서 해결한 문제 수 N과 유니온 레벨 U, 최고 레벨 L이 주어질 때, 
  임스의 마음에 들었는지에 대해 출력한다. 
  조건을 모두 만족하면 Very Good을, 백준의 대회 출제 조건만 만족하면 Good을, 만족하지 못하면 Bad를 출력한다.
입력
- 첫 번째 줄에 메이플컵에 지원한 지원자의 문제 해결 개수 N과 유니온 레벨 U, 최고 레벨 L이 공백을 사이에 두고 주어진다. 
  (1 <= N <= 130,000; 1 <= U <= 12,500;1 <= L <= 300) 
  입력은 모두 정수로 주어진다.
출력
- 조건을 모두 만족하면 Very Good을, 백준의 대회 출제 조건만 만족하면 Good을, 만족하지 못하면 Bad를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon29790 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int u = Integer.parseInt(st.nextToken());
    int l = Integer.parseInt(st.nextToken());

    if (n >= 1000) {
      if (u >= 8000 || l >= 260) System.out.println("Very Good");
      else System.out.println("Good");
    } else System.out.println("Bad");
  }
}
