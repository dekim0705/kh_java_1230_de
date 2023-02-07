package _0207_01_RPG게임만들기;
// 게임에 존재하는 캐릭터의 기본 특성을 정의, 객체로 만들 수 없음 (기본특성이니까 객체로 만들 수 없음!)
abstract public class Unit {
    protected String name; // 캐릭터 이름 설정
    protected int pPower;  // 피지컬 파워 (물리적인 힘)
    protected int mPower;  // 매지컬 파워
    protected double pHit; // 물리 적중률 (적중률은 랜덤함수 구해서 넣는게 좋은데 현재 예시에서는 간단하게 곱해주기)
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기 : 해당 캐릭터가 가진 특수 능력
    protected int hp;      // 체력
}
