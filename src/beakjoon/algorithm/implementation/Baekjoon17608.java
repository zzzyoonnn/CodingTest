package beakjoon.algorithm.implementation;
/*
문제
- 아래 그림처럼 높이만 다르고 (같은 높이의 막대기가 있을 수 있음) 
  모양이 같은 막대기를 일렬로 세운 후, 왼쪽부터 차례로 번호를 붙인다. 
  각 막대기의 높이는 그림에서 보인 것처럼 순서대로 6, 9, 7, 6, 4, 6 이다. 
  일렬로 세워진 막대기를 오른쪽에서 보면 보이는 막대기가 있고 보이지 않는 막대기가 있다. 
  즉, 지금 보이는 막대기보다 뒤에 있고 높이가 높은 것이 보이게 된다. 
  예를 들어, 그림과 같은 경우엔 3개(6번, 3번, 2번)의 막대기가 보인다.
  N개의 막대기에 대한 높이 정보가 주어질 때, 
  오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다.
입력
- 첫 번째 줄에는 막대기의 개수를 나타내는 정수 N (2 ≤ N ≤ 100,000)이 주어지고 
  이어지는 N줄 각각에는 막대기의 높이를 나타내는 정수 h(1 ≤ h ≤ 100,000)가 주어진다.
출력
- 오른쪽에서 N개의 막대기를 보았을 때, 보이는 막대기의 개수를 출력한다.
ex 1)
입력      출력
- 6       - 3
  6
  9
  7
  6
  4
  6
ex 2)
입력      출력
- 5       - 5
  5
  4
  3
  2
  1
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17608 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int count = 1;
    int criteria = arr[arr.length - 1];

    for (int j = arr.length - 2; j >= 0; j--) {
      if (arr[j] > criteria) {
        count++;
        criteria = arr[j];
      }
    }

    System.out.println(count);
  }
}