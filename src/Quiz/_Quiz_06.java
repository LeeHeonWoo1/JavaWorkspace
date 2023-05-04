package Quiz;

public class _Quiz_06 {
    public static String getHiddenData(String args, int start_point){
        String result = args.substring(0, start_point);
        for (int i = 0; i < args.length() - start_point; i++) {
            result += "*";
        }

        return result;
    }
    public static void main(String[] args) {
        // 개인정보 중 일부를 비공개로 전환하는 프로그램을 아래 코드를 활용하여 작성하시오
        // 개인정보를 비공개로 전환하는 메소드 작성
        // 하나의 메소드에서 모든 동작 처리
        // 각 정보는 아래 위치부터 비공개 적용
        // 이름 : 2번째 글자(나**)
        // 주민등록번호 : 9번째 글자(990130-1******)
        // 전화번호 : 10번째 글자(010-1234-****)

        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }
}
