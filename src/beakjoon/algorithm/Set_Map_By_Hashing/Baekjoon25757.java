package beakjoon.algorithm.Set_Map_By_Hashing;
/*
문제
- 임스가 미니게임을 같이할 사람을 찾고 있습니다.
  플레이할 미니게임으로는 윷놀이 Y, 같은 그림 찾기 F, 원카드 O가 있습니다. 
  각각 2, 3, 4 명이서 플레이하는 게임이며 인원수가 부족하면 게임을 시작할 수 없습니다.
  사람들이 임스와 같이 플레이하기를 신청한 횟수 N과 임스가 플레이할 게임의 종류가 주어질 때, 
  최대 몇 번이나 임스와 함께 게임을 플레이할 수 있는지 구하시오.
  임스와 여러 번 미니게임을 플레이하고자 하는 사람이 있으나, 임스는 한 번 같이 플레이한 사람과는 다시 플레이하지 않습니다.
  임스와 함께 플레이하고자 하는 사람 중 동명이인은 존재하지 않습니다. 
  임스와 lms0806은 서로 다른 인물입니다.
입력
- 첫 번째 줄에는 사람들이 임스와 같이 플레이하기를 신청한 횟수 N과 같이 플레이할 게임의 종류가 주어진다. (1 <= N <= 100,000) 
  두 번째 줄부터 N개의 줄에는 같이 플레이하고자 하는 사람들의 이름이 문자열로 주어진다. (1 <= 문자열 길이 <= 20) 
  사람들의 이름은 숫자 또는 영문 대소문자로 구성되어 있다.
출력
- 임스가 최대로 몇 번이나 게임을 플레이할 수 있는지 구하시오.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon25757 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());   // 플레이 신청 횟수
    String game = st.nextToken();   // 게임 종류
    int people = 0;  // 필요 인원
    int count = 0;  // 플레이 횟수

    if (game.equals("Y")) people = 2;        // 윷놀이 2명
    else if (game.equals("F")) people = 3;   // 같은 그림 찾기 F
    else if (game.equals("O")) people = 4;   // 원카드 4명

    HashSet<String> set = new HashSet<>();
    HashSet<String> total = new HashSet<>();

    boolean check = false;
    int temp = 1;   // 임스
    while (n-- > 0) {
      String name = br.readLine();
      if (total.contains(name)) continue;
      if (set.contains(name)) continue;
      else {
        set.add(name);
        total.add(name);
        temp++;
      }
      if (temp == people) {
        count++;
        temp = 1;
        set.clear();
      }

    }
    System.out.println(count);
  }
}
