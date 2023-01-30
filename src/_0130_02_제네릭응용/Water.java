package _0130_02_제네릭응용;

public class Water { // extends Material, 추상화 상속을 받지 않았기 때문에 메인에서 사용 불가.
    public void doPrinting() { // void - no return
        System.out.println("Water 재료로 출력 합니다.");
    }

    @Override
    public String toString() { // toString 은 object 로 부터 오버라이딩
        return "재료는 Water 입니다.";
    }


}

