package beakjoon.algorithm.implementation;
/*
문제
- 올해도 연세대학교 프로그래밍 경진대회가 열렸다!
  병철이는 원래 대회에 출전하여 상금을 타갈 생각을 하고 있었으나, 갑자기 출제진으로 끌려가게 되어버렸다.
  출제진으로 끌려온 병철이에게 연세대학교 프로그래밍 경진대회는 
  지원을 받지 못하면 출제진이 사비로 상금을 지급해야 한다는 충격적인 소식이 들려왔지만, 
  다행히 지원을 받았기에 그런 대참사는 막을 수 있었다.
  지갑이 털릴 위기를 벗어난 병철이는 바로 백준을 켜 D2 난이도의 문제를 풀었고, 대회 참가자들에게도 D2 난이도의 문제를 내려고 한다!
  그러나 실력이 딸려 D2 난이도의 문제를 낼 순 없었기에, 그냥 문제 이름을 D2로 했다.
  여러분들도 (이름만) D2급 문제를 풀어보자!
입력
- 첫 줄에 알파벳 대소문자 및 숫자, 그리고 공백으로 구성된 문자열이 들어온다. 
  이 문자열의 길이는 10,000자 이하다.
  문자열의 맨 앞이나 맨 뒤는 공백이 아님이 보장된다.
출력
- 문자열 안에 D2나 d2가 들어있다면 D2를 출력한다. 
  두 글자는 반드시 붙어있어야 하며, D/d와 2 사이에 공백이 있어도 안 된다.
  만약 문자열 안에 해당 문자가 없다면 unrated를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon23303 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();

    if (s.contains("d2") || s.contains("D2")) System.out.println("D2");
    else System.out.println("unrated");
  }
}
