//package 상속실습예제;
//
//import java.util.Scanner;
//
//// 인간(Person)이라는 클래스 생성
//// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터) - 몇살?
//// - sleep : 잠자는 특성 (정수 값 사용, 게터/세터) = 몇시간 자는지?
//// 인간으로부터 직장인을 생성
//// -work - 몇 시간 일하는지 (정수, 게터/세터)
//// 인간으로부터 학생을 생성
//// -study : 공부하는 특성 (1 입력 "열심히", 2"적당히", 3"놀면서")
//public class InheritanceEx1 {
//    protected int age;
//    protected int sleep;
//
//    void setAge(int age) {
//        this.age = age;
//    }
//    int getAge() {
//        return age;
//    }
//    void setSleep(int sleep) {
//        this.sleep = sleep;
//    }
//    int getSleep() {
//        return age;
//    }
//}
//
//    class Worker extends InheritanceEx1 {
//        Worker(String name) {
//        int workHrs;
//
//        void setWorkHrs(int workHrs) {
//             workHrs = ;
//            }
//
//        int getWorkHrs() {
//            return numHr;
//        }
//
//        void infoWorker() {
//            System.out.println("나이 : " + age);
//            System.out.println("잠자는 시간 : " + sleep + "시간");
//            System.out.println("일하는 시간 : " + workHrs + "시간");
//        }
//
//    }
//
//
//
//
//
//
//
//
//    class Student extends InheritanceEx1 {
//        Student(String name) {
//            age = 10;
//            sleep = 10;
//            int studyType = setStudyType;
//        }
//        int getAge() {
//
//        }
//
//        void setAge() {
//        }
//
//        void getStudyType() {
//            Scanner sc = new Scanner(System.in);
//            while (true) {
//                System.out.print("공부하는 특성을 번호로 입력: [1]열심히, [2]적당히, [3]놀면서");
//                int type = sc.nextInt();
//                if (type > 0 && type < 4 ) return;
//                System.out.println("번호를 제대로 입력하셈..제발..");
//        }
//
//        void setStudyType(int num) {
//                 =
//            }
//
//
//
//        void infoStudent() {
//            final String[] type = {"", "열심히", "적당히", "놀면서"};
//            System.out.println("---- 학생 ----");
//            System.out.println("나이 : " + age);
//            System.out.println("잠자는 시간 : " + sleep + "시간");
//            System.out.println("공부 특성 : " + type[setStudyType]);
//        }
//
//}
//
//
