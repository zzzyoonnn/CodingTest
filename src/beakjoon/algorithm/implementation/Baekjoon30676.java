package beakjoon.algorithm.implementation;
/*
문제
- 스타는 안에 별이 담긴 기계장치를 보았다. 
  기계장치 내부를 볼 수 없어 별을 구경할 순 없었지만, 기계장치에는 별빛의 파장을 알려주는 계기판이 있었다. 
  계기판에 표시된 파장의 값을 토대로 스타는 별의 색을 알아낼 수 있었다. 
  스타가 알아낸 별의 색은 무엇이었을까?
  색상별 파장의 범위는 다음과 같다.
    빨간색: 620nm 이상 780nm 이하
    주황색: 590nm 이상 620nm 미만
    노란색: 570nm 이상 590nm 미만
    초록색: 495nm 이상 570nm 미만
    파란색: 450nm 이상 495nm 미만
    남색: 425nm 이상 450nm 미만
    보라색: 380nm 이상 425nm 미만
입력
- 계기판에 표시된 별빛의 파장 lambda 가 주어진다. 
  파장은 항상 정수로 주어지며 단위는 nm이다. (380 <= lambda <= 780) 
출력
- 별의 색을 출력한다. 
  빨간색이면 "Red", 주황색이면 "Orange", 노란색이면 "Yellow", 
  초록색이면 "Green", 파란색이면 "Blue", 남색이면 "Indigo", 
  보라색이면 "Violet"을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon30676 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int lambda = Integer.parseInt(br.readLine());

    if (lambda >= 620) System.out.println("Red");
    else if (lambda >= 590) System.out.println("Orange");
    else if (lambda >= 570) System.out.println("Yellow");
    else if (lambda >= 495) System.out.println("Green");
    else if (lambda >= 450) System.out.println("Blue");
    else if (lambda >= 425) System.out.println("Indigo");
    else if (lambda >= 380) System.out.println("Violet");
  }
}
