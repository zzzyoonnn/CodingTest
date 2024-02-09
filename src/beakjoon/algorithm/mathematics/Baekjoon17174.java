package beakjoon.algorithm.mathematics;
/*
문제
- 호근이는 한국에서 미국으로 유학을 하러 갔다. 
  그는 생활비로 쓰기 위해 가지고 온 원화를 전부 달러로 바꾸기 위해 환전소를 찾아갔다. 
  그런데 환전소에 1달러짜리 지폐를 제외하고는 다른 지폐가 없어서 전부 1달러 지폐로 바꾸어 숙소로 가져왔다. 
  환전한 금액을 알고 있지만 불안한 마음에 숙소에서 다시 한 번 얼마인지 세어 보려고 한다.
  호근이는 우선 1달러 지폐를 한 장씩 세면서 M개의 지폐를 한 묶음으로 만든다. 
  그 다음에는 새로 만들어진 묶음을 하나씩 세면서 M개의 묶음을 다시 하나로 묶는다. 
  더 이상 묶음이 만들어지지 않을 때까지 이 과정을 반복한다. 
  이때 호근이가 묶음을 포함해 지폐를 센 전체 횟수를 구하여라.
  예를 들어 N이 13이고 M이 10일 때, 
  13달러를 세기 위해서는 1달러씩 총 13번을 세고, 지폐 10장을 한 묶음으로 만들고, 한 개의 묶음을 다시 한 번 세어 총 14번을 세야 한다.
입력
- 첫 번째 줄에 환전한 금액 N과 묶음의 크기 M이 주어진다. (2 ≤ N ≤ 100,000, 2 ≤ M ≤ N)
출력
- 전체 센 횟수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon17174 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int total = 0;
    total += n;
    while (true) {
      n = n / m;

      total += n;

      if (n / m <= 0) break;
    }

    System.out.println(total);
  }
}
