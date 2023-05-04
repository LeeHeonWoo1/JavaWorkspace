package chap_06;

public class _05_MethodOverloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 : 이름이 같은 메소드를 여러개 만드는 것.
        // return값의 타입이 같다는 전제하에 인자값의 타입이 다르거나 개수가 다르면 같은 이름의 메소드를 여러번 선언해도 무관하다.
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3, 3));
    }
}
