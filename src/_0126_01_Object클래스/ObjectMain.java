package _0126_01_Object클래스;
// Object 클래스 : 모든 클래스의 조상이 되는 최상위 클래스 (항상 존재하지만 숨어 있음)
// toString() : 해당 객체(인스턴스)에 대한 정보를 문자열로 반환 (출력 : 클래스정보@해시코드)
// 정보에 표시된 해시코드는 객체의 메모리 주소를 이용해 해시 코드 생성
// equals() : 해당 객체와 매개변수로 전달 받은 객체를 비교하여 결과 ( 참조가 같은지?)
public class ObjectMain extends Object { // 원래 여기에 숨어있음
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.toString()); // toString() 출력 : _0126_01_Object클래스.Student@7c30a502
        System.out.println(student1.equals(student2)); // equals() 출력 : false
//        student1 = student2;
//        System.out.println(student1.equals(student2)); // 대입 후 equals() 출력 : true
    }
}
// Object 클래스
class Student extends Object {
    int id;
    String name;
}
