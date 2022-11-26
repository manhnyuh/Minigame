public class Monster {

    private int monsterHp;
    private int monsterAtk;

    public Monster(int monsterHp, int monsterAtk) {
        this.monsterHp=monsterHp;
        this.monsterAtk=monsterAtk;
    }

    void attack(Player player){
        player.setPlayerHp(monsterAtk);
    }
    public int getMonsterHp() {
        return monsterHp;
    }

    public void setMonsterHp(int monsterHp) {
        this.monsterHp -= monsterHp;
    }

    public int getMonsterAtk() {
        return monsterAtk;
    }

    public void setMonsterAtk(int monsterAtk) {
        this.monsterAtk = monsterAtk;
    }
}
