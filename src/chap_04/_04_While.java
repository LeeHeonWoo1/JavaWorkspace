package chap_04;

public class _04_While {
    public static void main(String[] args) {
        // while문의 조건이 거짓이면 어떤 코드도 실행되지 않겠지만
        // do while의 경우 do 절에 있는 코드가 조건의 참거짓에 영향을 받지 않고 무조건 한 번은 실행된다.
        int move = 3;
        int distance = 25;
        int height = 2;
        do {
            System.out.println("I'm still swim");
            System.out.println("distance"+move);
            move += 3;
        }
            while (move + height < distance);{
            System.out.println();
        }
        }
}
