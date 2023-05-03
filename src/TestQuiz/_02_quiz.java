package TestQuiz;

public class _02_quiz {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        // 조건
        // 키가 120cm이상인 경우에만 탑승 가능
        // 삼항 연산자 이용

        double height = 119;
        String result = height >= 120 ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 "+height+"cm 이므로 "+result);
    }
}
