package beakjoon.algorithm.mathematics;
/*
문제
- 설날을 맞아 부대원들을 위해 특식으로 치킨을 주문했다. 
  후라이드 치킨, 간장치킨, 양념치킨을 각각 N마리씩 주문했고, 1인당 치킨을 한 마리씩 배부하고자 한다.
  최대한 많은 부대원에게 본인이 선호하는 종류의 치킨을 배부해주기 위해 
  으뜸병사는 부대원들의 치킨 종류 선호도를 조사했고, 
  세 가지 치킨 중 후라이드 치킨, 간장치킨, 양념치킨을 가장 선호하는 인원의 수는 각각 A명, B명, C명이라는 것을 알아냈다. 
  이때, 모든 부대원은 각자 한 종류의 치킨만 골라 답했다.
  본인이 가장 선호하는 종류의 치킨을 받을 수 있는 인원수의 최댓값을 구하여라.
입력
- 첫 번째 줄에 주문한 각 종류의 치킨 마릿수 N이 주어진다. (1 <= N <= 1\,000) 
  두 번째 줄에 후라이드 치킨을 가장 선호하는 병사의 수 A, 
  간장치킨을 가장 선호하는 병사의 수 B, 양념치킨을 가장 선호하는 병사의 수 C가 공백으로 구분되어 주어진다. 
  (1 <= A,B,C <= 3\,000) 
출력
- 본인이 가장 선호하는 종류의 치킨을 받을 수 있는 최대 인원수를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon27110 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int sum = 0;
    for (int i = 0; i < 3; i++) {
      int m = Integer.parseInt(st.nextToken());
      if (n > m) sum += m;
      else sum += n;
    }

    System.out.println(sum);
  }
}
