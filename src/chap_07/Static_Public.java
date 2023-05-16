package chap_07;

public class Static_Public {
    // Static Method : 객체를 생성하지 않고 바로 호출 가능
    static void myStaticMethod(){
        System.out.println("Static Method can be called without creating objects");
    }

    // Public Method : 객체를 반드시 생성해야만 호출 가능
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();
//        myPublicMethod(); // public으로 선언된 메소드는 오류를 발생시키는 모습을 볼 수 있다.

        Static_Public myClass = new Static_Public();
        myClass.myPublicMethod();
    }
}
