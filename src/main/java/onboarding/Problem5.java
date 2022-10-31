package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(solution(50237));
        System.out.println(solution(15000));
    }
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>(); // 리스트를 선언하고
        // 정해진 수의 몫을 add하고 나머지를 머니로 받는걸 반복.
        answer.add(money/50000);
        money %= 50000;
        answer.add(money/10000);
        money %= 10000;
        answer.add(money/5000);
        money %= 5000;
        answer.add(money/1000);
        money %= 1000;
        answer.add(money/500);
        money %= 500;
        answer.add(money/100);
        money %= 100;
        answer.add(money/50);
        money %= 50;
        answer.add(money/10);
        money %= 10;
        answer.add(money);
        return answer;
    }
}
