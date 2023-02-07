package _0207_01_RPG게임만들기;

public class GameThB extends Thread {
    private Character warrior;  // (만들어진 캐릭터의 객체를 집어넣을 것, Character 클래스에 대한 warrior 참조변수를 만든 상태)
    private Character wizard;

    public GameThB(Character warrior, Character wizard) { // (외부에서 만든 객체를 주입 받는 것)
        this.warrior = warrior; // 전사
        this.wizard = wizard;   // 마법사
    }

    @Override
    public void run() {
        int normal;  // 일반 공격에 대한 확률 구하기
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임에 대한 종료 여부
        while (true) {
            try {
                sleep(3300); // 3초마다 반복 (3초마다 셋중 하나의 공격이 랜덤하게 나감)
                normal = (int) (Math.random() * 2); // 50% 확률 (*2 하면 나올 수 있는 값은 0과 1밖에 없음, 50% 확률 구하기)
                special = (int) (Math.random() * 18); // (궁극기를 ThA보다 조금 더 빨리)
                if (normal == 1) {
                    System.out.println("마법 공격 : [" + wizard.name + "]가 [" + warrior.name + "]에게 [" + wizard.mAttack() + "]데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.mAttack());
                } else {
                    System.out.println("물리 공격 : [" +  wizard.name + "]가 [" + warrior.name + "]에게 [" + wizard.pAttack() + "]데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                }
                if (special == 10) { // 1/18확률
                    System.out.println("[" + wizard.name + "] 궁극기 발동 !!! " +
                            "[" + warrior.name + "]에게 [" + wizard.ultimate() + "]데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.ultimate());
                }
                if (endGame) {
                    System.exit(0);
                }
            } catch (InterruptedException e) {
            }

        }
    }
}
