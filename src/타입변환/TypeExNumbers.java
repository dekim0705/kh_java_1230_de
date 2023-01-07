package 타입변환;

public class TypeExNumbers {
    public static void main(String[] args) {
        int var1 = 0b1010; // 2진수 = 10  /0b라고 표시하면 2진법이라는 것
        int var2 = 0267; // 8진수 = 앞에 0을 붙이면 0~7 8진법은 잘 안쓰임
        int var3 = 399; // 10진수
        int var4 = 0x100abd; // x는 헥사의 약자 16진수
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);

    }
}
