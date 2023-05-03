package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // 정수->실수 실수->정수
        // 계산 결과는 실수이지만 정수형 변수에 담으려 해서 오류
//        int score = 93 + 98.2;

        int score1 = 92;
        System.out.println(score1);
        System.out.println((float) score1);
        System.out.println((double) score1);

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        score_d = (double) score1 + score_f;
        System.out.println(score_d);

        // int -> long -> float -> double ==> 자동 형변환
        double convertedScoreDouble = score1;

        // double -> float -> long -> int ===> 수동으로 형변환
        int convertedScoreInt = (int) score_d;

        // 숫자를 문자열로 ==> String class의 valueOf함수로
        String s1 = String.valueOf(93);

        // 숫자형 자료형들을 문자열로
        s1 = Integer.toString(98);
        String s2 = Float.toString(93.2F);
        String s3 = Double.toString(33.222);

        // 문자열을 숫자로
        int s4 = Integer.parseInt(s1);
        float s5 = Float.parseFloat(s2);
        double s6 = Double.parseDouble(s3);
        System.out.println();
    }
}


