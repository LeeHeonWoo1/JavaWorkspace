package chap_04;

public class _02_SwitchCase {
    public static void main(String[] args) {
        int ranking = 3;
        switch (ranking) {
            // break가 없으면 해당 케이스에서 시행했음에도 다음 케이스로 넘어간다
            // 이를 적절히 잘 활용해 볼 것..
            case 1:
                System.out.println("전액");
                break;
            case 2:
                System.out.println("반액");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("대상아님"); // 위 케이스들에서 아무 케이스에도 걸리지 않을 때 실행된다.
        }
        System.out.println("조회완료");
    }
}
