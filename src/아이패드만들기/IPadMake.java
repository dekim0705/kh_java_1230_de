package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class IPadMake { // 디폴트상태이면 같은 패키지내에서는 접근이 가능한데 패키지가 바뀌면 접근 X 근데 메소드들은 퍼블릭이면 클래스가 다른 패키지로 가도 나옴
    // 앞에 private int screen 이런식으로 붙이면 접근제한자 생겨서 같은 패키지내라도 들어갈 수 없음
    int screen;  // 화면 크기 : 11인치, 12.9인치; easy to manage the options using int instead of other types
    int color;   // 색상 : 스페이스그레이, 실버
    int memory;  // 용량 : 128GB, 256GB, 512GB, 1TB
    int network; // 네트워크 : Wi-Fi, Wi-Fi+Cellular
    String name; // 각인서비스 시 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum;   // 제품 일련 번호 : iPad13123C2301121
    static int cnt = 0; // static변수 = 클래스 변수 : 객체 생성되지 않고 클래스 생성시 만들어 짐

    //IPadMake라는 생성자를 만들어야 함. 반환타입 없이 클래스 이름과 똑같아야 함
   public IPadMake(String name) {
        this.name = name;
        Date now = new Date(); // 현재의 시간 정보를 가져오기 위해 사용
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); // 시간정보를 패턴에 맞춰서 찍어줌
        productDate = sdf.format(now); // 시간 정보 중 "yyMMdd" 패턴으로 시간 정보를 가져옴
        cnt++; // 생성자는 객체가 만들어 질 때 호출 되므로 생성된 개객체의 횟수를 확인하는 용도로 사용 할 수 있음; 클래스가 객체로만들어질 때 생성자가 불러짐. 그때마다 하나씩 증가
        productDate += cnt; // 연월일 + 생산댓수
    }
    // 제품 구매에 대한 진행 여부를 묻는 메뉴 만들기 (반환값필요); boolean으로 반환값보고 넘어갈지 말지 결정해야 함
    public boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== iPad 구입하기 ====");
        System.out.print("구입을 원하시면 yes / 종료는 quit : ");
        String continueOrder = sc.next();
        if(continueOrder.equalsIgnoreCase("yes")) return true; // true조건-> true로 넘김
        return false; // 어차피 true에서 걸러지기 때문에 else 굳이 필요 없음
    }

    // 화면 크기 정하기. void = 호출해서 반환할 건 없고 내부에서 값 저장. 객체정보는 내부 인스턴스 필드로 포함하고 진행여부(위에꺼)는 반환값으로 넘김
    public void setScreen () {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("디스플레이 선택 [1] 11인치, [2] 12,9인치 : ");
            screen = sc.nextInt(); // don't need to create a new int variable cuz int screen is in the public class already?
            if(screen ==1 || screen == 2) return; // 여기서 해당 메소드가 끝남, 정상선택이기 때문에
            System.out.println("디스플레이를 다시 선택 하세요. ");
        }
    }

    // 색상 정하기
    public void setColor () {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("색상 선택 [1] 스페이스그레이, [2] 실버 : ");
            color = sc.nextInt(); // color 앞에 this. 숨어있음! this.color
            if(color == 1 || color == 2) return;
            System.out.println("색상을 다시 선택 하세요. ");
        }
    }

    // 메모리 정하기
    public void setMemory () {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("용량 선택 [1]128GB, [2]256GB, [3]512GB, [4]1TB : ");
            memory = sc.nextInt();
            if (memory > 0 && memory <5 ) return; // memory <= 1 && memory <= 4 works?
            System.out.println("용량을 다시 선택 하세요. ");
        }
    }

    public void setNetwork () {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("네트워크 선택 [1]Wi-Fi, [2]Wi-Fi+Cellular :");
            network = sc.nextInt();
            if(network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택 하세요. ");
        }
    }

    // 각인서비스 여부와 각인 문구
    public void setName () {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스 신청 하시겠습니까? yes / no: ");
        String service = sc.next();
        if (service.equalsIgnoreCase("yes")) {
             System.out.print("각인 문구를 이력 하세요 : ");
             name = sc.next(); // yes이외의 답이 들어가면 넘어가기때문에 따로 코드 추가할 필요 없음
        }
    }

    // 일련 번호 만들기 : iPad + 11/13 + 128/256/512/1024 + W/C + 230112 + 생산댓수
    public void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"}; // 값이 4개라서 삼항연산자 사용 불가. 문자열배열 필요. 0번째는 인덱스 맞추려고 비우기
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate;  // memStr에는 memory라는 인덱스를 넣어줘야 함. 인덱스에 대한 요소값
    }
    // 제품 구매가 완료 되면 출고까지 30초 대기
    public void inProductPad() throws InterruptedException {
        int cnt = 0; // 로컬변수 cnt
        while(true) {
            sleep(300); // sleep = 해당 메소드는 스레드가 도는 동안에 가만히~ millis=millisecond. 1000분의 1초
            cnt++;  // while문들어오면 0.3초 잠을자고 카운트가 하나 올라감
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >>");
            System.out.print("\r"); // 캐리지리턴 : 컷을 앞으로 돌리는거 위로 다시 돌아오는데 cnt값만 바뀌면서 찍힘
            if(cnt >= 100) break; // 0.3초가 1퍼센트가 되는 것 ,,(?)

        }
    }

    // 화면 출력
    public void productPad() {
        final String[] scrType = {"", "11인치", "12.9인치"}; // 1번이면 11인치 2번이면 12.9를 선택하기위한 배열
        final String[] colorType = {"", "스페이스컬러", "실버"};
        final String[] memoryType = {"", "128GB", "256GB", "512GB", "1TB"};
        final String[] netType = {"", "Wi-Fi", "Wi-Fi+Cellular"};
        System.out.println("==== iPad Pro가 출고 되었습니다 ====");
        System.out.println("디스플레이    : " + scrType[screen]);
        System.out.println("색상         : " + colorType[color]);
        System.out.println("제품 용량     : " + memoryType[memory]);
        System.out.println("네트워크      : " + netType[network]);
        System.out.println("이름         : " + name);
        System.out.println("일련번호(S/N) : " + serialNum); // 인스턴스에 private붙어있어도 같은 패키지 내에 있어서 사용 가능
        System.out.println("----------------------------------");






    }


    }

// public을 붙이면 접근제한이 없어짐. 누구나 사용할 수 있는 공용 부분
// ***** 비교연산자 equals / equalsIgnoreCase로 스트링 입력 비교 ==로 하면 불편