package chap_06;

public class _07_VariableScope {
//    public static void methodA(){
          // main영역에 정의된 number라는 변수는 지역변수로, main영역 내부에서만 사용 가능하다. 외부에 정의한 method에서는 사용할 수 없다.
//        System.out.println(number);
//    }

    public static void methodB(){
        int result = 1;
    }
    public static void main(String[] args) {
        int number = 3;

        // 마찬가지로, result는 methodB라는 메소드 내에 정의된 지역변수로, main영역에서는 사용할 수 없다.
        // System.out.println(result);

        {
            int res = 3;
        }
//        이 경우에도 다른 중괄호 안에 정의된 res라는 int변수를 사용할 수 없다.
//        System.out.println(res);
    }
}
