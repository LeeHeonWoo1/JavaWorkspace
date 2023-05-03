package chap_02;

public class _03_operator3 {
    public static void main(String[] args) {
        // 삼항 연산자
        int x = 5;
        int y = 3;

        // x가 y보다 크면 x, 아니면 y
        int max = (x > y) ? x : y;
        System.out.println(max);
        int min = (x < y) ? x : y;
        System.out.println(min);

        x = 3;
        y = 3;
        // x랑y가 같으면 true, 아니면 false
        boolean b = (x==y) ? true : false;
        System.out.println(b);

        String s = (x!=y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
