package TestQuiz;

public class _01_quiz {
    public static void main(String[] args) {
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
        // 각 정보는 적절한 자료형의 변수에 정의합니다.
        // 버스번호는 "1234", "상암08"과 같은 형태
        // 남은 시간은 분단위
        // 남은 거리는 km단위
        String busName = "상암08";
        int leftTime = 3;
        double distance = 1.2;

        System.out.println(busName + "번 버스");
        System.out.println("약 " + leftTime + "분 후 도착");
        System.out.println("남은 거리 : " + distance + "km");
    }
}
