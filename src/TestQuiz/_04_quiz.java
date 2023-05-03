package TestQuiz;

public class _04_quiz {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
        // 주차요금은 시간당 4000원(일일 최대 요금은 30000원)
        // 경차 또는 장애인차량은 최종 요금에서 50% 할인

        int pay = 4000;
        int hour = 12;
        int total = pay * hour;
        boolean isDisabled = false;
        boolean isMini = false;

        if (total >= 30000){
            total = 30000;
        }

        if (isDisabled || isMini){
            total = total/2;
        }

        System.out.println(total);
    }
}
