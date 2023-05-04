package chap_06;

public class _04_ParameterAndReturn {
    // 정수 인자값 하나를 받아 그 제곱값을 return하는 메소드
    public static int getPower(int number){
        int result = number * number;
        return result;
    }
    // 두 개의 정수 인자값을 받아 number라는 인자를 exponent라는 수 만큼 제곱하여 그 값을 return하는 메소드
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 함께있는 메소드
        int returnValue = getPower(18);
        System.out.println(returnValue);

        int returnValue2 = getPowerByExp(2, 7);
        System.out.println(returnValue2);
    }
}
