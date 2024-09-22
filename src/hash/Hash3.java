package hash;

import java.util.ArrayList;
import java.util.List;

public class Hash3 {

    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 10장의 카드
        int k = 3; // 3장을 뽑기
        int cnt = 0;

        List<List<Integer>> result = new ArrayList<>(); // 결과를 저장할 리스트

        // 3중 반복문을 사용하여 모든 조합을 생성
        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int l = j + 1; l < cards.length; l++) {
                    List<Integer> currentCombo = new ArrayList<>();
                    currentCombo.add(cards[i]);
                    currentCombo.add(cards[j]);
                    currentCombo.add(cards[l]);
                    result.add(currentCombo); // 현재 조합을 결과 리스트에 추가
                    System.out.println("cnt: " + cnt++);
                }
            }
        }

        // 결과 출력
        System.out.println("카드 10장 중 3장을 뽑을 수 있는 모든 경우의 수:");
        for (List<Integer> combo : result) {
            System.out.println(combo);
        }

        // 총 조합의 수 출력
        System.out.println("총 조합의 수: " + result.size());
    }
}

