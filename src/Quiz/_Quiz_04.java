package Quiz;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하세요
        int per_hour = 4000;
        int max = 30000;
        int use_hour = 5;
        int pay = per_hour*use_hour;

        boolean isSmallCar = true;
        boolean isDisable = false;

        if (pay > max){
            pay = max;
        }
        // else if로 묶을 수도 있지만 만약에 초과요금 조건문에서 걸려버리면 else if부분은 건너뛰게 된다.
        if (isSmallCar || isDisable) {
            pay = pay/2;
        }
        System.out.println("주차 요금은 "+pay+"원 입니다.");
    }
}
