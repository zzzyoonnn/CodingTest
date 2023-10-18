package beakjoon.algorithm.greedy;
/*
문제
- 민규와 친구들은 바로 옆에 붙어있는 두 빌라, 알파빌과 베타빌에 살고 있다. 
  이 두 빌라 중 알파빌은 싼값에 좋은 빌라라서 너무 인기가 많아 입주하려는 사람들이 줄을 선다. 
  민규의 친구들 역시 대기 번호를 받아 알파빌의 대기 명단에 적혀있다. 
  알파빌 입주에 실패한 친구들은 어쩔 수 없이 조금 더 비싼 베타빌에 들어가게 될 것이다. 
  이를 안타까워한 민규는 더 많은 친구를 알파빌에 입주시키기 위해 집주인 몰래 대기 명단을 바꾸려고 한다.
  대기 명단에는 입주하려는 사람들의 대기 번호가 입주하는 순서대로 왼쪽에서 오른쪽으로 적혀 있으며, 
  대기 번호는 1번부터 N번까지의 서로 다른 정수이다.
  민규는 한 번 명단을 바꿀 때 번호 두 개를 선택해서 서로 위치를 교환할 수 있다. 
  대기 명단을 너무 많이 바꾸면 집주인이 눈치를 챌 수 있기 때문에, 
  민규는 가능한 한 최소한으로 명단을 바꾸려고 한다. 
  민규의 모든 친구가 친구가 아닌 사람들보다 먼저 입주하도록 명단을 바꿀 때, 최소 교환 횟수를 출력하자.
입력
- 첫 번째 줄에 대기 명단에 적힌 수의 개수 N과 민규 친구의 수 M이 공백으로 구분되어 주어진다. (1 <= M <= N <= 1,000)
  두 번째 줄에 대기 명단에 적힌 N개의 정수가 주어진다.
  세 번째 줄에 민규 친구의 대기 번호를 나타내는 M개의 정수가 주어진다.
출력
- 모든 친구들이 먼저 입주할 수 있도록 명단을 바꾸는 최소 횟수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon29615 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int friend = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

    int[] friends = new int[friend];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < friend; i++) friends[i] = Integer.parseInt(st.nextToken());

    int count = 0;
    for (int i = 0; i < friend; i++) {
      for (int j = 0; j < friend; j++) {
        if (arr[j] == friends[i]) count++;
      }
    }
    System.out.println(friend - count);
  }
}
