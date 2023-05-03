package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자 \n => 줄바꿈 \t => 탭(4칸의 공백) \\ => \
        System.out.println("i\nlove\nJAVA");
        System.out.println("i\tlove\tJAVA");

        // 문자열안에서 쌍따옴표를 쓸때(작은 따옴표도 동일)
        // 쌍따옴표 앞에 백슬래쉬 하나씩
        System.out.println("I love my \"mother\"");

    }
}
