package _0126_05_01_열거타입예제;

public class Developer {
    private String name; // 이 사람의 이름
    private DevType devType; // DevType 중 에서만 고를 수 있음
    private Career career;
    private Gender gender;

    public Developer(String name, DevType devType, Career career, Gender gender) { // 생성자
        this.name = name;
        this.devType = devType;
        this.career = career;
        this.gender = gender;
    }
    public void devInfo() {
        System.out.println("*******************");
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + devType);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);

    }
}
