package 상속실습예제_Example;

public class Person_Example {
    int age;
    int sleep;

//    public Person(int age, int sleep) { //생성자 만든건데 추가작업이 필요하니 지금은 생성자 없이
//        this.age = age;
//        this.sleep = sleep;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
}

class Worker extends Person_Example {
    int work;

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }
}


class Student extends Person_Example {
    int study;

    public String getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""}; // 쌍따옴표쓰려면 \" 해줘야 함
        return studyStr[study];
    }
    public void setStudy(int study) {
        this.study = study;
    }
}

    class Student1 extends Student {
        int study1;

        public String getStudy() {
            String[] studyStr = {"", "\"대충\"", "\"조금만\"", "\"아주쪼끔\""}; // 쌍따옴표쓰려면 \" 해줘야 함
            return studyStr[study];
        }

        public void setStudy(int study) {
            this.study = study;
        }

        public int getStudy1() {
            return study1;
        }

        public void setStudy1(int study1) {
            this.study1 = study1;
        }
    }



    class Student2 extends Student {

        int study1;


        public int getStudy1() {
            return study1;
        }

        public void setStudy1(int study1) {
            this.study1 = study1;
        }

    }
