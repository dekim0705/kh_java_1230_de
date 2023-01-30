package _0130_02_제네릭응용;

public class Powder extends Material {
    public void doPrinting() { // void - no return
        System.out.println("Powder 재료로 출력 합니다.");
    }

    @Override
    public String toString() { // toString 은 object 로 부터 오버라이딩 // 해쉬코드가 나오는걸 막기 위해 오버라이딩
        return "재료는 Powder 입니다.";
    }


}
