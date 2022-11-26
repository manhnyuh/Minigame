public class Player {
    private int playerHp;
    private int playerAtk;

    public Player(int playerHp, int playerAtk) {
        this.playerHp=playerHp;
        this.playerAtk=playerAtk;

    }

    void attack(Monster monster){
        monster.setMonsterHp(playerAtk);

    }

    public int getPlayerHp() {
        return playerHp;
    }

    public void setPlayerHp(int playerHp) {
        this.playerHp -= playerHp;
    }

    public int getPlayerAtk() {
        return playerAtk;
    }

    public void setPlayerAtk(int playerAtk) {
        this.playerAtk = playerAtk;
    }
}
