package TestQuiz;

public class _03_quiz {
    public static void main(String[] args) {
        // 주빈등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.
        // 주민등록번호는 3자리의 숫자로 구성
        // 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        // 입력 데이터는 -을 포함한 14자리의 문자열 형태

        String secNum = "981002-1234567";
        System.out.println(secNum.substring(0, 8));
    }
}
