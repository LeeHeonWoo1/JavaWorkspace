package Quiz;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오
        // 신발 사이즈는 250부터 295까지 5단위로 증가
        // 신발 사이즈 수는 총 10가지

        // 내가 작성한 방법
        int[] shoesList = new int[10];
        shoesList[0] = 250;
        for (int i = 1; i < shoesList.length; i++) {
            shoesList[i] = shoesList[i-1] + 5;
        }

        for (int i = 0; i < shoesList.length; i++) {
            System.out.println("사이즈 "+shoesList[i]+" (재고 있음)");
        }

        // 강의에서 나온 부분
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        // enhanced for loop 사용
        for (int size: sizeArray){
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

    }
}
