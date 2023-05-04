package chap_06;

public class _03_Return {
    // void의 의미는 반환값이 없는 메소드임을 의미한다. 따라서 전달값이 있는 경우, void자리에는 반환할 값의 타입을 입력해준다.
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울시 어딘가";
    }
    public static void main(String[] args) {
        // 리턴값(반환값)

        // 리턴되는 값을 변수에 할당해서 출력하기
        String phoneNum = getPhoneNumber();
        String address = getAddress();

        System.out.println(phoneNum);
        System.out.println(address);

        // sout안에서 메소드를 호출해서 바로 출력해도 무관
        System.out.println(getPhoneNumber());
        System.out.println(getAddress());
    }
}
