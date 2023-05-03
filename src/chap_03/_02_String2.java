package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        // 문자열 내부 내용 바꾸기
        String s = "My major is applied mathmatics.";
        System.out.println(s.replace("mathmatics","python"));

        // 원하는 부분만 출력하기
        System.out.println(s.substring(s.indexOf("major")));

        // 시작과 끝
        System.out.println(s.substring(s.indexOf("major"), s.indexOf("is")));

        // 공백제거
        s = "              I hate seaweed           ";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Python";
        String s2 = "Java";
        System.out.println(s1.concat(",").concat(s2));
    }
}
