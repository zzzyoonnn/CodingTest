package beakjoon.algorithm.implementation;
/*
문제
- 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
  각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
입력
- 첫째 줄에 단어 S가 주어진다. 
  단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
출력
- 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
ex 1)
입력
- baekjoon
출력
- 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10808 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int [] arr = new int[26];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = 0;
    }

    String s = br.readLine();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      arr[c - 'a']++;
    }

    for (int val : arr) {
      System.out.print(val + " ");
    }
  }
}
