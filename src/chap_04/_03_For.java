package chap_04;

public class _03_For {
    public static void main(String[] args) {
        for (int i=0 ; i < 10 ; i++ ) {
            System.out.println(i);
        }

        for (int i=5 ; i > 0 ; i-- ) {
            System.out.println(i);
        }

        // 2중 for문
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++){
                System.out.println("*");
            }

        }
    }
}
