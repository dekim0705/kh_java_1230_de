package _0201_04_Comparable클래스정렬;
// 자동차 연식으로 정렬하기

public class CarSort implements Comparable<CarSort> { // (자기 자신과 다른 객체를 비교하기 때문에 여기서 인터페이스 상속(해당(본인)클래스를 타입으로 넣어줘야 함))
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarSort o) { // (양수가 나오면 정렬조건)
        if(this.modelYear == o.modelYear) { // (modelYear 가 같을 경우 추가 정렬조건)
            return this.modelName.compareTo(o.modelName); // 앞의 문자열 사전순으로 뒤에 있으면 양수값 반환
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬 (앞(현재객채(this.modelYear))이 뒤보다 크면 정렬 (오름차순 정렬))
    }
}
/*
return this.modelName.compareTo(o.modelName);
.compareTo()는 문자열(ASCII code 비교) 비교시 사용 함. 같으면 0, 다르면 양수 or 음수
equals 와는 다름. 정렬에 대한 조건으로 비교를 하려면 ASCII 코드로 비교를 해야 함.
ex) 그랜저.compareTo(G80) : G80이 그랜저보다 짧기 때문에 뒤집어야함. -> 나 자신과 매개변수 비교시 내가 크면 양수가 나옴. 그리고 뒤집어버림
정렬조건을 주면 quick sort 를 이용해서 자바가 정렬 함
*/