package beakjoon.algorithm.mathematics;
/*
문제
- 꿍은 오늘 학교에서 삼각형에 대해 배웠다. 삼각형은 변의 길이에 따라 다음과 같이 분류될 수 있다.
    정삼각형(equilateral triangle)은 모든 변의 길이가 같다. 각 역시 60도로 모두 같다.
    이등변삼각형(isosceles triangle)은 두 개의 변의 길이가 같다. 각 역시 두 개의 각의 크기가 같다.
    부등변삼각형(scalene triangle)은 모든 변의 길이가 같지 않다. 각 역시 모두 다르다. 몇몇 부등변삼각형의 경우 직각삼각형이다.
  수학선생님이 삼각형의 세 변의 길이를 가지고 삼각형을 분류하라는 숙제를 내줬는데 꿍은 정말 놀고싶다. 꿍이 놀수있도록 여러분이 도와주어라.
입력
- 입력의 첫 줄에는 테스트케이스의 개수 T(1 <= T <= 100)가 주어진다. 
  다음 T줄에는 각 줄에 삼각형의 세 변을 나타내는 3개의 정수 A, B, C(1 <= A,B,C <= 1,000,000)가 주어진다.
출력
- 각 테스트 케이스에 대해 삼각형이 “equilateral”, “isosceles”, “scalene” 타입 중 어느 타입에 속하는지 출력한다. 
  만약 주어진 세 변의 길이로 삼각형이 만들어지지 않을경우, “invalid!”를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon9366 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= n; i++) {
      int[] arr = new int[3];
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 3; j++) arr[j] = Integer.parseInt(st.nextToken());
      Arrays.sort(arr);

      System.out.print("Case #" + i + ": ");

      if (arr[0] + arr[1] <= arr[2]) System.out.println("invalid!");
      else if (arr[0] == arr[1] && arr[0] == arr[2]) System.out.println("equilateral");
      else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) System.out.println("isosceles");
      else System.out.println("scalene");
    }
  }
}
