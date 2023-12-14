package programmers.level0;
// [PCCE 기출문제] 8번 / 창고 정리

public class Page1_08 {
  public static void main(String[] args) {
    String[] storage = {"pencil", "pencil", "pencil", "book"};
    int[] num = {2, 4, 3, 1};

    int num_item = 0;
    String[] clean_storage = new String[storage.length];
    int[] clean_num = new int[num.length];

    for (int i = 0; i < storage.length; i++) {
      int clean_idx = -1;
      for (int j = 0; j < storage.length; j++) {
        if (storage[i].equals(clean_storage[j])) {
          clean_idx = j;
          break;
        }
      }

      if (clean_idx == -1) {
        clean_storage[num_item] = storage[i];
        clean_num[num_item] = num[i];
        num_item += 1;
      } else {
        clean_num[clean_idx] += num[i];
      }
    }

    int num_max = -1;
    String answer = "";

    for (int i = 0; i < num_item; i++) {
      if (clean_num[i] > num_max) {
        num_max = clean_num[i];
        answer = clean_storage[i];
      }
    }

    System.out.println(answer);
  }
}
