package chap_02;

public class _shift_operator {
    public static void main(String[] args) {
        // 시프트 연산
        // 바이트 타입에서 left shift, right shift 연산을 지원한다.
        // - 128 ~ 127까지 표현이 되기에 이를 이진수로 표현하면 010000000 이고, (맨 앞은 부호 비트)
        // 2는 00000010이다. 이를 left shift를 두 번 진행하게 되면 00001000 이고, 이는 8이다.

        byte x = 2;
        int y = x << 2;

        System.out.println(y);
    }
}
