package beakjoon.algorithm.implementation;
/*
문제
- 헌우는 제주도로 수학여행을 갔다. 
  들뜬 마음으로 공항을 나와 맞은 것은, 선글라스를 쓴 조교였다.
  "선린인들, 아주 예의바르고 최고라고 들었는데 제가 맡았던 학교 중에서 최악입니다. 
  여기서 번호 순서대로 서지 않은 사람들은 전부 빠따로 맞을 각오하시기 바랍니다.“
  그 말인즉슨, 자신의 번호 순대로 서지 않은 사람들은 엉덩이가 야구공이 된다는 것이다. 
  헌우네 반 학생 수 N이 주어지고 N명의 번호가 현재 줄 서있는 순서대로 주어질 때, 몇 명의 학생들이 맞게 될지 구하여라.
입력
- 첫 번째 줄에 헌우네 반 학생의 수 N이 주어진다. (1 ≤ N ≤ 20,000) 
  두 번째 줄에 학생들의 번호가 현재 줄을 서있는 순서대로 주어진다. (1 ≤ 번호 ≤ N) 
  중복되는 번호는 없다.
출력
- 몇 명이 맞게 될지 구하여라.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon14656 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = 0;
    for (int i = 1; i <= n; i++) {
      int num = Integer.parseInt(st.nextToken());
      if (num != i) count++;
    }
    System.out.println(count);
  }
}
