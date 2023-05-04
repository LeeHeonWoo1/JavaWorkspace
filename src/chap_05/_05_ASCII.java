package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키코드 (ANSI) : 미국 표준 코드
        char a = 'A'; // 알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작
        System.out.println(a);
        System.out.println((int)a);

        a = 'B';
        System.out.println(a);
        System.out.println((int)a);

        a++;
        System.out.println(a);
        System.out.println((int)a);

        // 아스키코드 활용하기
        String[][] seats3 = new String[10][15];
        char ch = 'A';

        // 값 할당하기
        for (int i=0; i < seats3.length; i++){
            for (int j = 0; j < seats3[i].length; j++) {
                // String.valueof를 활용해 char문자인 ch를 문자열로 만들고 아래에서
                seats3[i][j] = String.valueOf(ch)+(j+1);
            }
            // ++를 통해 하나씩 더해줌으로서 B, C, D, E, F, G, H, I, J까지 표현할 수 있다.
            ch++;
        }

        for (int i=0; i < seats3.length; i++){
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
