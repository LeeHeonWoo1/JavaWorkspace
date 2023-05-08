package chap_04;

public class _03_For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // 2중 for문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("*");
            }

        }
        // enhanced for문
        // for (타입 변수이름:배열(컬렉션)이름){
        // 배열의 길이만큼 반복적으로 실행하고자 하는 명령문
        // }
        // 배열의 값들을 참조 시에만 사용, 내부 값 변경에는 사용하지 않음
        // 배열 요소 그 자체가 아니라 복사본을 가져와서 사용하기 때문
        int[] test1 = new int[]{1, 2, 3, 4, 5};

        for (int e:test1){
            e += 10;
        }

        // 값이 변경되지는 않는 모습을 확인할 수 있다.
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + " ");
        }

    }
}