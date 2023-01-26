package _0126_07_Calendar클래스;
import java.util.Calendar;

// Calendar 클래스는 추상클래스이므로 객체 생성없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이 하기 때문
// 정적메서드인 getInstance() 메서드를 이용해서 운영체제의 시간 기준의 정보를 가져옴, 포함된 필드도 전부 클래스 변수
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // 객체가 없으니까 new 연산자가 필요 X
                                               // Date now = new Date(); 과 같음
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1); // 배열의 인덱스와 똑같이 들어오기 때문에 +1 해줘야 함
//        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 일,월,화,수,목,금,토 중 몇번째?
//        System.out.println(now.get(Calendar.DAY_OF_MONTH));
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));

        // 캘린더를 이용해서 출력 : yyyy년MM월dd일 HH시mm분ss초

        System.out.printf("%d년%02d월%02d일 %02d시%02d분%02d초\n",
                (now.get(Calendar.YEAR)),(now.get(Calendar.MONTH) + 1),(now.get(Calendar.DAY_OF_MONTH)),
                (now.get(Calendar.HOUR)), (now.get(Calendar.MINUTE)),(now.get(Calendar.SECOND)));

        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPM == 1) hour += 12; // 오후일경우 계산
        System.out.printf("%d년%02d월%d일 %d시%d분%d초\n", year,mon,day,hour,min,sec);




    }
}
