package _0130_02_제네릭응용;

public class GenericPrinter<T extends Material> { // <T> 타입 변수에는 객체면 아무거나 다 올 수 있음
                                                  // Material 로 부터 상속 받은 클래스만 타입 변수로 지정 가능 하도록 함
    private T material;

    public void setMaterial(T material) {
        this.material = material; // 내부의 인스턴스 필드(this.material)에 외부로부터 받은 매개변수(material)를 대입
    }
    public T getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material.toString(); // 매개변수로 들어온 이 찍힘
    }
}
