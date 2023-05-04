package chap_06;

public class _02_Parameter {
    // 정수를 인자로 받는 메소드 정의

    // 강의엔 나오지 않았지만, 함수에 대한 설명을 적으려면 아래와 같이 작성한다.
    /**
     * @implSpec
     * 이 메소드는 정수 인자값을 받아 그 값을 제곱하는 메소드입니다.
     */
    public static void power(int number){
        int result = number * number;
        System.out.println(result);
    }
    /**
     * @implSpec
     * 이 메소드는 두 개의 정수 인자값들을 받아 number를 exponent만큼 제곱하는 메소드 입니다.
     */
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "를 " + exponent + " 제곱한 값은 " + result + " 입니다.");

    }
    public static void main(String[] args) {
        // 전달값, 인자, 파라미터

        // 정수 인자값과 함께 메소드 호출
        power(16);
        powerByExp(2, 6);
        powerByExp(2, 0);
    }
}
