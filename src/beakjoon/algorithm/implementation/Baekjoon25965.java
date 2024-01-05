package beakjoon.algorithm.implementation;
/*
문제
- 리그오브전설 스트리머 순범이는 트위치 플랫폼으로 시청자를 끌어모으고 있다. 
  순범이는 '트윕' 음성 도네이션을 통해 시청자들과 소통하고는 한다. 
  순범이는 트윕에 '미션' 기능이 있다는 것을 알고, 
  자신의 리그오브 전설 실력을 활용해 매 게임마다 미션 기능으로 돈을 끌어모으려고 한다. 
  미션 기능을 이용하는 시청자가 너무 많을 때도 있어서 
  순범이는 게임이 끝난 후 자신이 미션으로 받을 수 있는 총 도네이션 금액이 얼마인지를 구하는 계산 프로그램을 작성하고자 한다. 
  각 게임들은 여러 개의 미션으로 이루어져 있으며, 
  각 미션들은 킬당 K원 추가, 데스당 D원 차감, 어시스트당 A원 추가의 형식으로 주어진다. 
  만약 어떤 미션의 계산 금액이 0보다 작은 경우에는 총 금액에 이를 합산하지 않는다. 
  각 게임을 새로 시작할 때에는 도네이션 금액은 0부터 시작한다. 
  순범이가 각 게임을 마칠 때마다 받게 되는 총 도네이션 금액을 구해보자.
입력
- 첫 줄에 총 게임의 수 N이 주어진다. (1 <= N <= 50) 
  각 게임마다 첫 줄에 총 미션의 수 M이 주어지며, M개의 줄에 거쳐 각 미션의 내용이 주어진다. (1 <= M <= 100) 
  각 미션들은 킬당 추가해야 하는 금액 K, 데스당 차감해야 하는 금액 D, 
  어시스트당 추가해야 하는 금액 A가 공백으로 구분되어 주어진다. (1,000 <= K, D, A <= 5 * 10^7) 
  각 게임당 마지막 줄에 게임이 종료된 후 순범이의 킬 k, 데스 d, 어시스트 a가 공백으로 구분해 주어진다. (0 <= k,d,a <= 50) 
출력
- 각 게임마다 순범이가 받는 총 도네이션 금액을 순서대로 한 줄씩 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon25965 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st;
    for (int i = 0; i < n; i++) {
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][3];
      for (int j = 0; j < m; j++) {
        st = new StringTokenizer(br.readLine());
        for (int k = 0; k < 3; k++) {
          arr[j][k] = Integer.parseInt(st.nextToken());
        }
      }
      long total_sum = 0;
      st = new StringTokenizer(br.readLine());
      long k = Integer.parseInt(st.nextToken());
      long d = Integer.parseInt(st.nextToken());
      long a = Integer.parseInt(st.nextToken());

      for (int x = 0; x < m; x++) {
        long sum = 0;
        sum = (arr[x][0] * k) - (arr[x][1] * d) + (arr[x][2] * a);
        if (sum > 0) total_sum += sum;
      }
      System.out.println(total_sum);
    }
  }
}
