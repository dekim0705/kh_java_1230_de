package 상속기본;

public class BasicInheritance {
    public static void main(String[] args) {
        Dog puppy = new Dog(); // Dog클래스를 가지고 puppy라는 객체를 만들어 줌 (??이건 뭐쥐 참조변수를 가지는 객체를 만들어줌?
        puppy.setName("멍멍이");
        System.out.println(puppy.name);
        puppy.sleep();
//      puppy.sleep(4); // 얘는 Dog내에 있는 메소드가 아니고 HouseDog에있는 메소드라서 불러올 수 X


        HouseDog houseDog = new HouseDog();
        houseDog.setName("집멍이");
        System.out.println(houseDog.name);
        houseDog.sleep();
        houseDog.sleep(4);

    }
}


/*
오버라이딩이 필요한 경우 :
재활용을 하기 위해서 - 편의성
그런데 그 기능이 미흡하거나 개선의 여지가 있는 경우에는 오버라이딩 사용
ex. modifying a given template
 */
