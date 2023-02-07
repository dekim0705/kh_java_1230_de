package _0207_01_RPG게임만들기;

public class Character extends Unit implements GameAction {

    // 생성자의 매개변수를 전달 받는 값으로 캐릭터의 기본 능력치를 설정
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
        this.name = name;
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hp;
    }
    @Override
    public double pAttack() { // 물리 공격력
        return pPower * pHit; // (힘이 100이라면 적중률이 0.8이면 80)
    }

    @Override
    public double mAttack() { // 마법 공격력
        return mPower * mHit;
    }

    @Override
    public int ultimate() { // (궁극기는 100% 확률이라서 적중률 필요 X)
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) { // 받는 피해량
        if(hp > damage) {
            hp -= damage; // (공격을 받았으니 생명력이 깎임)
            System.out.println("---- 남아 있는 [" + name + "]의 체력은 [" + hp + "]입니다. ----");
            return false; // 아직 살아있음
        } else {
            System.out.println("===== [" + name + "]가 죽었습니다. 게임을 종료 합니다. =====");
            return true; // 죽었음
        }
    }
}
