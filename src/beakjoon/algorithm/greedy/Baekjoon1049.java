package beakjoon.algorithm.greedy;
/*
문제
- Day Of Mourning의 기타리스트 강토가 사용하는 기타에서 N개의 줄이 끊어졌다. 
  따라서 새로운 줄을 사거나 교체해야 한다. 
  강토는 되도록이면 돈을 적게 쓰려고 한다. 
  6줄 패키지를 살 수도 있고, 1개 또는 그 이상의 줄을 낱개로 살 수도 있다.
  끊어진 기타줄의 개수 N과 기타줄 브랜드 M개가 주어지고, 
  각각의 브랜드에서 파는 기타줄 6개가 들어있는 패키지의 가격, 
  낱개로 살 때의 가격이 주어질 때, 
  적어도 N개를 사기 위해 필요한 돈의 수를 최소로 하는 프로그램을 작성하시오.
입력
- 첫째 줄에 N과 M이 주어진다. 
  N은 100보다 작거나 같은 자연수이고, M은 50보다 작거나 같은 자연수이다. 
  둘째 줄부터 M개의 줄에는 각 브랜드의 패키지 가격과 낱개의 가격이 공백으로 구분하여 주어진다. 
  가격은 0보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
출력
- 첫째 줄에 기타줄을 적어도 N개 사기 위해 필요한 돈의 최솟값을 출력한다.
ex 1)
입력      출력
- 4 2     - 12
  12 3
  15 4
ex 2)
입력      출력
- 10 3    - 36
  20 8
  40 7
  60 4
ex 3)
입력      출력
- 15 1    - 300
  100 40
ex 4)
입력      출력
- 17 1    - 36
  12 3
ex 5)
입력      출력
- 7 2     - 12
  10 3
  12 2
ex 6)
입력      출력
- 9 16    - 6
  21 25
  77 23
  23 88
  95 43
  96 19
  59 36
  80 13
  51 24
  15 8
  25 61
  21 22
  3 9
  68 68
  67 100
  83 98
  96 57
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1049 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int line = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int [] bundle = new int[n];
    int [] unit = new int[n];

    for (int i = 0; i < n; i++) {
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      bundle[i] = Integer.parseInt(st1.nextToken());
      unit[i] = Integer.parseInt(st1.nextToken());
    }

    Arrays.sort(bundle);
    Arrays.sort(unit);

    if (line <= 6) System.out.println(Math.min(bundle[0], line * unit[0]));
    else {
      int sum = 0;
      int result1 = (line / 6) * Math.min(bundle[0], 6 * unit[0]);
      int result2 = Math.min(bundle[0], (line % 6) * unit[0]);
      sum = result1 + result2;
      System.out.println(sum);
    }
  }
}
