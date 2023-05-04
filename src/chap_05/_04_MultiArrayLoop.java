package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i=0; i<seats.length; i++){
            for (int j=0; j<seats[i].length; j++){
                System.out.println(seats[i][j]);
            }
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i=0; i<seats2.length; i++){
            for (int j=0; j<seats2[i].length; j++){
                System.out.println(seats2[i][j]);
            }
        }

        System.out.println("---------------------------");

        // 10by15
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};

        // 값 할당하기
        for (int i=0; i < seats3.length; i++){
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i]+(j+1);
            }
        }

        // 예매되었다고 가정하면,
        seats3[7][8] = "__";
        seats3[7][9] = "___";

        // 좌석 번호 확인
        for (int i=0; i < seats3.length; i++){
            for (int j = 0; j < seats3[i].length; j++) {
                // println은 자동 줄바꿈, print는 줄바꿈이 필요 없을 때
                System.out.print(seats3[i][j] + "  ");
            }

            System.out.println();
        }

    }
}
