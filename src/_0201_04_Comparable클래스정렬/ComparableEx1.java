package _0201_04_Comparable클래스정렬;
import java.util.TreeSet;
// 자바의 기본 정렬 방식 : quick sort
// Comparable 은 클래스 정렬을 구현 할 수 있도록 해주는 인터페이스이며 TreeSet 컬렉션에서 사용해야 함
// compareTo() 메소드를 오버라이딩 해서 정렬조건을 구현해야 함 (compareTo()는 상속받았기 때문에 이미 존재)
// 정렬 조건은 자신의 객체와 매개변수로 입력 받은 객체를 비교
// 정렬 조건은 양의 정수 값을 반환하면 정렬 조건이 됨
// 정렬 조건을 0으로 반환하면 Set 의 특성으로 인해 해당 객체가 표시 되지 않음
// (Set 에서 같은 정렬 조건이 나오면 (return 0), Set은 중복허용하지 않기 때문에 하나를 지워버림. 이름순이나 학번순등의  정렬조건을 추가로 넣어줘야 함)
public class ComparableEx1 {
    public static void main(String[] args) {
        TreeSet<CarSort> ts = new TreeSet<>(); // Tree 형태는 자동정렬을 해주는 조건이 있어서 사용. + compareTo() 사용자 정의 정렬조건
        ts.add(new CarSort("싼타페", 2016, "흰색"));
        ts.add(new CarSort("쏘렌토", 2012, "은색"));
        ts.add(new CarSort("그랜져", 2022, "검정"));
        ts.add(new CarSort("G80  ", 2022, "은색")); // modelYear 이 똑같기 때문에 compareTo 정렬조건 추가로 걸어줘야 함
        System.out.println("생성된 객체의 수 : " + ts.size()); // [3] // 2022가 같기 때문에 Set 특성상 붙이지 않음 -> 정렬조건 추가로 걸어주면 [4]가 나옴

        for(CarSort e : ts) {
            System.out.println("자총 : " + e.modelName + "   연식 : " + e.modelYear + "   색상 : " + e.color);
        }

        // 양수일때만 뒤집어서 정렬조건 : 헷갈리면 아래처럼 찍어보기
        System.out.println("gggg".compareTo("aaa")); // 양수 [6]
        System.out.println("aaaa".compareTo("aaa")); // 양수 [1]
        System.out.println("abcde".compareTo("abcdf")); // 음수[-1]


    }
}
