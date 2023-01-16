package 접근제한자;

public class ParentsRestricted {
    public String name; // 누구나 접근 가능
    protected String money; // 동일패키지와 다른 패키지의 상속 관계가 있으면 접근 가능
    protected String addr; // default 접근 제한자는 동일 패키지 내에서 접근 가능
    public ParentsRestricted() { // 생성자는 거의 모든 경우 public 으로 생성
        name = "이름이뭘까유";
        money = "34254억";
        addr = "서울시 강남구";


    }
}


