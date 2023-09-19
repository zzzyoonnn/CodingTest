package beakjoon.Type.BruteForce;
/*
문제
- 페르마의 마지막 정리는, a, b, c가 0이 아닌 정수이고, n이 2보다 큰 자연수 일 때, 
  a^n = b^n + c^n을 만족하는 자연수 a, b, c가 존재하지 않는다는 정리이다. 
  이 정리는 아직 증명되지 않았다.
  하지만, 완전 세제곱 방정식 a3 = b3 + c3 + d3을 만족하는 1보다 큰 자연수를 찾는 것은 어렵지 않다. (123 = 63 + 83 + 103)
  이러한 완전 세제곱 방정식과 a ≤ 100을 만족하는 {a, b, c, d}쌍을 모두 찾는 프로그램을 작성하시오.
입력
- 이 문제는 입력이 없다.
출력
- a값이 증가하는 순서대로 아래 출력 형식과 같이 출력한다. 
  b, c, d도 증가하는 순서로 이루어져야 한다. 
  a값에 해당하는 b, c, d쌍이 여러 개 존재할 수 있다. 
  이때는 b 값이 작은 것부터 먼저 출력한다.
  아래 출력 예제는 일부분만 나와있다.
ex 1)
출력
- Cube = 6, Triple = (3,4,5)
  Cube = 12, Triple = (6,8,10)
  Cube = 18, Triple = (2,12,16)
  Cube = 18, Triple = (9,12,15)
  Cube = 19, Triple = (3,10,18)
  Cube = 20, Triple = (7,14,17)
  Cube = 24, Triple = (12,16,20)
 */

public class Baekjoon4690 {
  public static void main(String[] agrs) {
    for (int a = 1; a <= 100; a++) {
      for (int b = 2; b <= 100; b++) {
        for (int c = b + 1; c <= 100; c++) {
          for (int d = c + 1; d <= 100; d++) {
            int a3 = a * a * a;
            int b3 = b * b * b;
            int c3 = c * c * c;
            int d3 = d * d * d;
            if (a3 == (b3 + c3 + d3)) System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d + ")");
          }
        }
      }
    }
  }
}
