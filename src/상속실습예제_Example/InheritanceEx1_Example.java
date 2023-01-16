package 상속실습예제_Example;
// 인간(Person)이라는 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터) - 몇살?
// - sleep : 잠자는 특성 (정수 값 사용, 게터/세터) = 몇시간 자는지?
// 인간으로부터 직장인을 생성
// -work - 몇 시간 일하는지 (정수, 게터/세터)
// 인간으로부터 학생을 생성
// -study : 공부하는 특성 (1 입력 "열심히", 2"적당히", 3"놀면서")
public class InheritanceEx1_Example {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAge(30);
        worker.setSleep(6);
        worker.setWork(12);
        System.out.println("직장인은 " + worker.getAge() + "살 입니다");
        System.out.println("직장인은 " + worker.getSleep() + "시간 동안 잠을자용.");
        System.out.println("직장인이 " + worker.getWork() + "시간 동안 일을 합니다.");
                                        // context switching=문맥전환 이 일어남

        System.out.println("-----------------------------");

        Student student = new Student();
        student.setAge(10);
        student.setSleep(12);
        student.setStudy(1);
        System.out.println("학생은 " + student.age + "살 입니다");
        System.out.println("학생은 " + student.sleep + "시간 동안 잠을자용");
        System.out.println("학생이 " + student.getStudy() + " 공부를 합니다.");

        System.out.println("-----------------------------"); // getStudy() 오버라이드
        Student1 student1 = new Student1();
        student1.setAge(11);
        student1.setSleep(12);
        student1.setStudy(3);
        student1.setStudy1(1);

        System.out.println("학생1은 " + student1.getAge() + "살 입니다");
        System.out.println("학생1은 " + student1.getSleep() + "시간 동안 잠을자용.");
        System.out.println("학생1이 " + student1.getStudy() + " 공부를 합니다.");
        System.out.println("학생1이 " + student1.getStudy1() + "시간 동안 공부를 합니다.");

        System.out.println("-----------------------------");
        Student2 student2 = new Student2(); // student2는 부모클래스를 Student로 데려와서 getStudy()부분이 Student꺼가 나옴
        student2.setAge(11);
        student2.setSleep(12);
        student2.setStudy(3);
        student2.setStudy1(5);

        System.out.println("학생1은 " + student2.getAge() + "살 입니다");
        System.out.println("학생1은 " + student2.getSleep() + "시간 동안 잠을자용.");
        System.out.println("학생1이 " + student2.getStudy() + " 공부를 합니다.");
        System.out.println("학생1이 " + student2.getStudy1() + "시간 동안 공부를 합니다.");


// ****************stdudent.getAge()로 가져와야 클래스를 또 상속받은 객체의 값이 나오나??

    }

}
