package chap_06;

public class _09_RecursiveCall {
    // Recursive call(재귀 호출)
    // 메소드 내부에서 해당 메소드가 또다시 호출되는 것을 의미한다.
    // 이러한 호출은 자기가 자신을 계속해서 호출하므로, 재귀호출을 중단하는 조치가 필요하다.
    // 값을 하나 받아서 그 직전값까지 더하는 메소드를 만들어보자.
    public static int recursiveSum(int n){ // 메소드 생성
        if (n==1){ // n=1이면
            return 1; // 1을 반환하며 중단
        }

        // 10이면 10 + recursiveSum(9)가 실행되며, 이는 10 + 9 + recursiveSum(8)과 같으며
        // 이를 10 + 9 + ... + 2 + recursiveSum(1)까지 반복하다가 recursiveSum(1) == 1을 return하기에
        // 55라는 결과를 얻을 수 있다.
        return n + recursiveSum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveSum(10));
    }
}
