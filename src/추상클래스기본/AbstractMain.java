package 추상클래스기본;

import java.util.Scanner;

// 추상클래스란? 실체가 없는 부모가 상속을 주는 것
// 추상클래스에는 반드시 추상메소드가 포함되어야 하고, 해당 메소드는 상속 받은 자식 클래스에서 구현해줘야함(오버라이딩)
// 추상클래스의 키워드는 abstract
// 추상클래스는 일반메소드, 추상메소드, 일반필드(=인스턴스필드) 등을 모두 포함할 수 있음.
public class AbstractMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = null;
        System.out.print("동물을 선택 하세요.  [1]고양이 [2]강아지 [3]오리 : ");
        int sel = sc.nextInt();
        switch (sel) { // 여기다가 cry넣으면 똑같은 울음소리가 세번 나옴
            case 1 : animal = new Cat(); break;
            case 2 : animal = new Dog(); break;
            case 3 : animal = new Duck(); break;
            default:
        }
        animal.cry();


//        Cat cat1 = new Cat();
//        Dog dog1 = new Dog();
//        Duck duck1 = new Duck();
//        Cat으로 접근해도 되는데 Animal로 접근 가능

    }
}

abstract class Animal { // 추상클래스
    abstract void cry(); // 추상메소드는 abstract 키워드를 사용하고 반드시 (;)세미콜론으로 끝나야 함. 중괄호 X. (메소드가 아니기 때문에..)
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹야옹");
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍멍!!");
    }
}

class Duck extends Animal {
    @Override
    void cry() {
        System.out.println("꽥꽥");
    }
}

