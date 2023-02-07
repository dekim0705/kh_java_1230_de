package _0207_01_RPG게임만들기;
import java.util.Scanner;
// 추상클래스 Unit -> 기본특성 -> Character
// interface     -> 기본동작 -> Character
// Character : 생성자 초기값 1) 전사, 2) 마법사
public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // (캐릭터 이름 입력)
        System.out.print("강력한 체력과 물리공격력의 전사 이름을 정하세요 : ");
        String warriorName = sc.next();
        System.out.print("궁극의 마법 능력을 지닌 마법사 이름을 정하세요 : ");
        String wizardName = sc.next();
        // (캐릭터 만들기)
        Character warrior = new Character(warriorName, 8, 2, 0.8, 0.5, 40, 100);
        Character wizard = new Character(wizardName, 2, 28, 0.5, 0.9, 100, 50);
        // (쓰레드 만들기)
        GameThA gameThA = new GameThA(warrior, wizard);
        GameThA gameThB = new GameThA(warrior, wizard);

        gameThA.start();
        gameThB.start();
    }
}
