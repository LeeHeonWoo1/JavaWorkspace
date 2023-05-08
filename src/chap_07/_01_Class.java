package chap_07;

public class _01_Class { // 클래스 선언
    // Class : 예를 들자면, 차의 설계도 같은 것
    // 여러 객체를 생성하여 사용하고, 객체의 상태를 나타내는 필드(field)와 객체의 행동을 나타내는 메소드(method)로 구성된다.
    // field : 클래스에 포함된 변수를 의미.
    // 필드와 메소드를 합쳐 클래스의 멤버라고 한다.
    private String modelName; // 필드
    private int modelYear; // 필드
    private String color = "파란색";
    _01_Class(String modelName, int modelYear) { // 생성자
        // 생성자는 반환값이 없지만, void로 선언하지는 않는다.
        // 생성자는 초기화를 위한 데이터를 인수로 전달받을 수 있다.
        // 객체를 초기화하는 방법이 여러 개 존재할 경우에는 하나의 클래스가 여러개의 생성자를 가질 수 있다.
        // 즉, 생성자도 하나의 메소드이므로 메소드 오버로딩이 가능하다.

        // this 참조 변수
        // 인스턴스가 자기 자신을 참조하는 데 사용하는 변수. 해당 인스턴스의 주소를 가리키고 있다.
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public String getModel(){
        return this.modelYear + "년식 " + this.modelName + " " + color;
    }

    public static void main(String[] args) {
        // 클래스 사용
        // 인스턴스 생성
        _01_Class myCar = new _01_Class("아반떼", 12);
        // 메소드 실행
        System.out.println(myCar.getModel());
    }
}


