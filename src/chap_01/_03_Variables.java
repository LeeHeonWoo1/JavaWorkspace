package chap_01;

import java.math.BigInteger;

public class _03_Variables {
    public static void main(String[] args) {
        // 변수 선언
        String name = "이헌우";
        int day = 15;

        // 문자열끼리의 덧셈
        System.out.println(name+" 님, 안녕하세요. " + day + "일 만에 뵙네요!");

        // 실수
        double score = 90.5;
        // 딱 한글자의 변수를 사용하려면 char를 사용하고 한 글자는 작은 따옴표 안에도 들어간다
        char grade = 'A';
        // 변수 수정
        System.out.println(name);
        name = "주재원";
        System.out.println("my score is "+score+", and grade is "+grade);
        System.out.println(name);
        // bool
        boolean pass = true;
        System.out.println("am i passed? " + pass + "!");

        // 정밀도는 떨어지지만 실수 정의 시 float도 쓴다. 맨 끝에는 항상 F나 f를 써줘야함
        double d = 3.14335478992165;
        float f = 3.14159233121498796216F;
        // double은 모두 출력되지만
        System.out.println(d);
        // float은 모두는 출력되지 않는 모습
        System.out.println(f);

        // int는 -21억~21억 까지의 값을 받기에 큰 int를 지정하려면 long을 사용 long또한 맨 끝에 L또는 l사용
        // _를 넣어도 일반적인 숫자로 표현됨. 보기 편하라고 쓰는 것
        long l = 10_000_000_000l;
        System.out.println(l);
    }
}

