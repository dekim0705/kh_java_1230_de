package _0207_01_RPG게임만들기;
// (인터페이스 특징 : 이름만 정해두고 상속 받은 클래스가 구체화해야 함 => 가져야 하는 액션 이름을 캐릭터 클래스가 상속받아 구현)
public interface GameAction {
    double pAttack(); // 물리 공격력
    double mAttack(); // 마법 공격력
    int ultimate();   // 궁극기의 공격력
    boolean setDamage(double damage); // 받는 피해량 (setDamage()에서 받은 데미지가 내 체력보다 크면 죽음)
}
