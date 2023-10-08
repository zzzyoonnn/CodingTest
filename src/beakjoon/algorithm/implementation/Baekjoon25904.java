package beakjoon.algorithm.implementation;
/*
문제
- "안녕 클레오파트라 세상에서 제일가는 포테이토칩"은 이전 사람보다 높은 목소리로 
  🎵 안녕 클레오파트라 세상에서 제일가는 포테이토칩🎵 을 외치는 게임이다. 
  1번부터 N번까지의 사람이 원형으로 앉아서 순서대로 게임을 진행한다. 
  게임을 시작하면 먼저 1번이 높이 X의 목소리로 구호를 외친다. 
  다음 번호의 사람은 이전 번호의 사람이 냈던 목소리의 높이보다 1이 더 높은 목소리로 외친다. 
  즉, 1번이 X, 2번이 X+1, ...‎, N번이 X+N-1 높이의 목소리로 "안녕 클레오파트라 세상에서 제일가는 포테이토칩"을 외친다. 
  N번이 성공하면 1바퀴가 돌았으므로 다시 N번의 다음 번호인 1번으로 차례가 돌아오게 된다.
  자기 차례에 내는 목소리의 높이가 자신이 낼 수 있는 목소리의 상한선보다 클 경우 게임에서 지고 벌칙으로 술을 마신다. 
  각 사람마다 낼 수 있는 목소리의 높이의 상한선이 주어질 때, 처음으로 술을 마시는 사람을 구하여라.
입력
- 첫 번째 줄에 게임에 참여하는 사람 수 N, 1번이 처음으로 낼 목소리의 높이인 정수 X가 공백으로 구분되어 주어진다. (3 <= N <= 100; 1 <= X <= 100) 
  두 번째 줄에 N개의 정수 T1, ..., TN가 공백으로 구분되어 주어진다. 
  Ti는 i번이 낼 수 있는 목소리 높이의 상한선이다. (1 <= T{i} <= 200) 
출력
- 처음으로 술을 마시는 사람의 번호를 출력한다.
ex 1)
입력		출력
- 3 3       - 2
  8 6 5
ex 2)
입력        출력
- 4 5       - 1
  4 10 9 8
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon25904 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int sound = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int[] max = new int[n];
    for (int i = 0; i < n; i++) max[i] = Integer.parseInt(st.nextToken());

    int i = 0;
    while (true) {
      if (max[i] >= sound) {
        sound++;
        i++;
        if (i == n) i = 0;
      } else break;
    }
    System.out.println(i + 1);
  }
}
