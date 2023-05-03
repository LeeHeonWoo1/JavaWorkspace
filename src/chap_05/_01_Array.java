package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 선언 방법 1
        String[] coffees = new String[4];

        // 두 번째 방법
//        String coffee[] = new String[4];

        // index값으로 배열에 값 할당하기
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";
//        System.out.println(coffees);

        // 세 번째 방법
//        String[] coffee = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 네 번째 방법
        String[] coffee = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        System.out.println(coffee[0]);
    }
}