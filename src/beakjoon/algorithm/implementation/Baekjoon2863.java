package beakjoon.algorithm.implementation;
/*
문제
- 상근이는 덧셈과 나눗셈을 엄청나게 못한다. 
  이런 상근이를 위해 정인이는 상근이에게 다음과 같은 문제를 냈다.
  정인이는 양의 정수 A,B,C,D로 이루어진 2*2 표를 그렸다.
    A B
    C D
  위와 같은 표가 있을 때, 표의 값은 A/C + B/D 이다.
  상근이는 표를 몇 번 돌리면 표의 값이 최대가 되는지 궁금해졌다.
  표는 90도 시계방향으로 돌릴 수 있다.
  문제 상단의 표를 1번 회전 시키면 다음과 같다.
    C A
    D B
  2번 회전 시키면 다음과 같이 된다.
    D C
    B A
  표에 쓰여 있는 A,B,C,D가 주어졌을 때, 
  표를 몇 번 회전시켜야 표의 값이 최대가 되는지 구하는 프로그램을 작성하시오.
입력
- 첫째 줄에 A와 B가 공백으로 구분되어 주어진다. 
  둘째 줄에 C와 D가 공백으로 구분되어 주어진다. 
  모든 수는 100보다 작거나 같은 양의 정수이다.
출력
- 첫째 줄에 표를 몇 번 돌려야 표의 값이 최대가 되는지 출력한다. 
  만약, 그러한 값이 여러개라면 가장 작은 값을 출력한다. 
 */
import java.util.Scanner;

public class Baekjoon2863 {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();

    double max = 0;

    double zero = a / c + b / d;
    if (zero > max) max = zero;
    double one = c / d + a / b;
    if (one > max) max = one;
    double two = d / b + c / a;
    if (two > max) max = two;
    double three = b / a + d / c;
    if (three > max) max = three;

    if (max == zero) System.out.println(0);
    else if (max == one) System.out.println(1);
    else if (max == two) System.out.println(2);
    else System.out.println(3);
  }
}
