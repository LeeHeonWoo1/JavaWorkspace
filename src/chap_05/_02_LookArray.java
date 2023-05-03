package chap_05;

public class _02_LookArray {
    public static void main(String[] args) {
        // 배열 순회
        String[] coffee = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        for (int i=0; i<coffee.length; i++){
            System.out.println(coffee[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------------------------");
        // enhanced for (for-each)구문
        for (String coffees : coffee) {
            System.out.println(coffees + " 하나");
        }
        System.out.println("주세요");
    }
}
