package 참조타입학인;
// 참조 변수의 == (같음을 확인?)
public class RefType {
    public static void main(String[] args) {
        String name1 = "호두"; // name1은 주소(stack영역에 생김)고 "호두"는 이름(?) static영역에 들어가서 만들어짐
        String name2 = "호두";
        String name3 = new String("호두");
        if(name1 == name3)  { // 메모리공간에서 같은 위치에 있니? 주소가같니? 내용(이름)말구, 값 비교아니얌.
                              // name1 == name2 는 같다고 나옴. 실제 메모리 주소도 같아서
            System.out.println("두개의 이름에 대한 참조가 같음");
        } else {
            System.out.println("두개의 이름에 대한 참조가 다름");
        } // name1 과 name3는 내부적으로는 메모리의 위치가 다름
        if(name1.equals(name3)) { // 스트링에서 내용이 같은지를 확인하려면 이렇게 해야함
            System.out.println("두개의 이름의 내용이 같음");
        } else {
            System.out.println("두개의 이름의 내용이 다름");

        }

// *equalsIgnoreCase : 영문일때는 대소문자 상관 X



       /*
       int x = 0; // 초기값넣어줌; 기본타입, 값을 누적하는 경우 0
       String str = null; // 참조타입의 변수가 객체를 참조하지 않는다는 의미
                           // str이라는 참조타입 변수에는 값이 아니고 주소값이 올 수 있어서 초기값으로는 참조하고 있는 값이 없다는 의미로 null(기본값,초기값)을 넣어야함.
       int[] intArray = null;

       Integer val = null;  // int형에대한 참조타입; 값을 넣어도 되고 null도 들어감
       int val2 = val ; // NullPointException이 발생 = 값을 찍으려고했는데 주소가(에?)아무것도 없는 것. 해당하는 주소가 없음
            System.out.println(val2);
        */
    }
}
