package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // 계속 사용해왔던 main section또한 일종의 Method. void로 선언되었기에 반환값은 없으며, 문자열을 요소로 가지는 args라는 배열을 인자값으로 받는다.
        // 자바 프로그램이 실행될 때 가장 처음으로 진입하는 부분이다.

        // 또한, args에 기본적으로 전달되는 값을 설정할 수도 있는데, 상단부 탭들 중 아래 순서대로 눌러보자.
        // Run->Edit Configurations->왼쪽 상단 + 클릭 -> Application 클릭 -> Name설정 -> 전달할 파일 설정(빨간 테두리 쳐진 Main영역)
        // -> Program Arguments 영역에 값들을 띄어쓰기를 기준으로 전달할 수 있음(현재 "테스트 전달값 입니다"를 전달)

        // 따라서 아래 코드를 실행하면 띄어쓰기를 기준으로 각 요소인 "테스트", "전달값", "입니다"가 출력되는걸 확인할 수 있다.
        for (String s: args) {
            System.out.println(s);
        }

        // 어떻게 활용할까?
        // 도서 관리 프로그램을 작성한다고 가정, (Program Arguments 영역의 값을 "테스트 전달값 입니다" -> "1"로 수정.
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        // 만약 args에 1번이 들어오면 도서 조회 부분 실행, 2번이 들어오면 도서 대출 부분 실행하는 식으로.

        // 1, 2, 3중 하나의 값만을 받아 해당되는 case구문의 문자열을 출력하는 프로그램
        if (args.length == 1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            // 인자로 받는 배열의 길이가 1이 아닌경우 사용법을 복기.
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력하세요.");
        }
    }
}
