package beakjoon.algorithm.greedy;
/*
문제
- 자랑스러운 부산대학교의 새내기인 산지니는 
  일직선상의 등굣길을 가로막고 있는 정체불명의 첨탑들을 밀어 넘어뜨려서 부수기로 하였다.
  첨탑은 일렬로 줄지어 서 있으며 산지니가 첨탑을 앞에서 밀면 뒤로 밀려 넘어진다.
  밀려 넘어지는 첨탑의 높이가 바로 그다음 첨탑의 높이보다 클 때만 그다음 첨탑도 밀려 넘어진다.
  산지니가 모든 첨탑을 밀어 넘어뜨리기 위해서 몇 번을 밀어야 하는지 구하여라. 
  산지니는 반드시 앞으로만 이동하며 길을 우회하지 않는다.
입력
- 첫째 줄에 첨탑의 개수 N이 주어진다. (1 <= N <= 5,000,000)
  둘째 줄에는 앞에서부터 차례대로 첨탑의 높이 H1, H2, ..., Hn (1 <= Hi <= 1,000,000) 이 주어진다.
  입력으로 주어지는 모든 수는 정수이다.
출력
- 첫째 줄에 첨탑을 밀어야 하는 횟수를 출력하라.
ex 1)
입력            출력
- 6             - 4
  1 3 2 5 8 1
ex 2)
입력            출력
- 8             - 8
  1 2 3 4 5 6 7 8
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon28014 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int [] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int cnt = 1;

    for (int i = 0; i < n - 1; i++) {
      if (arr[i] <= arr[i + 1]) cnt++;
    }

    System.out.println(cnt);

  }
}
