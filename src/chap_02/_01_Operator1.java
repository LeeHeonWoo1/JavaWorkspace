package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술연산 -> 파이썬과 동일 + - * / %
        // 수학 연산과 동일한 순서로 진행
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println((2 + 2) * 2 + 3 * 2);

        // 변수 할당 후 연산도 동일
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        // 증감 연산자
        int plus = 10;
        // 1을 먼저 더하고 plus변수 식 실행
        System.out.println(++plus);
        System.out.println(plus);
        plus = 10;
        System.out.println(plus);
        System.out.println(plus++);
        System.out.println(plus);
        // 음수 동일
        // 대입연산 동일
    }
}
