package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        // 대소문자 구별해서 비교
        System.out.println(s1.equals("Java"));

        // 대소문자 상관없이 내용만 비교
        System.out.println(s2.equalsIgnoreCase("python"));

        s1 = "1234";
        s2 = "1234";
        // 두 변수에 할당된 srting이 같은지 비교
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        // new를 사용해서 변수를 생성하면 각 변수가 저장되는 위치가 달라
        // 등호를 사용하면 값이 같아도 false가 출력된다. 따라서 가급적
        // equals를 사용할 것
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
