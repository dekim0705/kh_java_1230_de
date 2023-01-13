package TV만들기_Upgrade;
// 상속관계 있는 TV
// 오버라이딩 적용
public class TVMain_Upgrade_Inheritance {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(120);
        lgTV.setChannel(1900);
        lgTV.viewTV();

        System.out.println("--------------");

        ProductTV lgTV1 = new ProductTV("남의집 TV");
        lgTV1.setPower(true);
        lgTV1.setVolume(99);
        lgTV1.setChannel(2000, true );
        lgTV1.viewTV();







    }
}


/*
클래스에서 만든걸 main페이지 에서만 System.out~ 사용해서 출력 가능한 줄 알았는데
클래스 페이지에서 출력가능하게 만들어서 그 메소드를 main으로 가져와도 출력이 가능한거같지..? 반환 여부가 중요한듯?
 */