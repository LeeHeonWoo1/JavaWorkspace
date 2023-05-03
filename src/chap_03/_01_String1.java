package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like C++ and Java and Python and C.";

        // 문자열 길이 출력
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함여부
        System.out.println(s.contains("Java"));

        // 위치찾기
        System.out.println(s.indexOf("Java"));

        // 마지막으로 and가 나오는 위치 반환
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.indexOf("C#")); // 없는 경우 -1 출력

        // 시작글자, 끝글자
        System.out.println(s.startsWith("I"));
        System.out.println(s.startsWith("My"));
        System.out.println(s.endsWith("C."));
    }
}
