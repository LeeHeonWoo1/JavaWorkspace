package chap_06;

public class _06_WhenToUse {
    public static void main(String[] args) {
        // 메소드 사용 예시, 필요한 이유
        // 12, 13, 14의 제곱값을 각각 구해야 한다고 가정하면 메소드 없이 코드를 짜면 아래와 같을 것이다.
        // 3개 값에 대한 제곱값을 구하는 코드의 줄 수만 해도 약 20줄 가량인데, 방대한 양의 값들을 같은 방식으로 구해야 한다면 코드 줄 수는 더욱 길어질 것이다.
        // 따라서 메소드를 사용하게 되면 코드의 간결성을 줄 수 있을 뿐만 아니라, 디버깅 혹은 수정 또한 원활하게 진행할 수 있다.

        // 12의 제곱 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 12;
        }
        System.out.println(result);

        // 13의 제곱 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 13;
        }
        System.out.println(result);

        // 14의 제곱 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 14;
        }
        System.out.println(result);
    }
}
