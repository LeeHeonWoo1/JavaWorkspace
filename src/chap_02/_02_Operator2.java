package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 비교연산자 동일
        // 논리연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = false;

        // or ==> 하나라도 true면 true
        System.out.println(김치찌개||계란말이||제육볶음);
        // and ===> 하나라도 false면 false
        System.out.println(김치찌개&&계란말이&&제육볶음);

        // 산술 비교 연산자
        System.out.println((5>3)&&(3>1));

        // 논리 부정
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5==5));
    }
}
