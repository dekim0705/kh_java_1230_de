package _0130_02_제네릭응용;
// 매개변수 다형성과 비슷하고, 컬렉션프레임워크에서 많이 쓰임. 평소에는 지난번에 배웠던 매개변수 다형성으로 구현하는쪽이 나음.
public class GenericApply {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder()); // 클래스타입은 클래스타입일 뿐이고 실제로 사용시 객체를 만들어 줘야함 -> new 사용
                                                 // Powder 타입의 객체를 생성해서 매개변수로 전달
        // System.out.println(powderPrinter.getMaterial());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);


        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());

        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

       // GenericPrinter<Water> waterPrinter = new GenericPrinter<>();


    }
}
