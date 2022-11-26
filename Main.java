public class Main {
    public static void main(String[]args){
        Player player = new Player(100, 10);
        Monster monster = new Monster(50, 5);

        while (player.getPlayerHp() > 0 && monster.getMonsterHp() > 0) {
            player.attack(monster);
            System.out.println(">>>Player hit monster " + player.getPlayerAtk() + ", monster remaining" + monster.getMonsterHp() + " hp");
            monster.attack(player);
            System.out.println(">>>Monster hit player " + monster.getMonsterAtk() + ", player remaining" + player.getPlayerHp() + " hp");
            System.out.println("-------------------");

        }
        if (player.getPlayerHp()<=0){
            System.out.println("Player lose!");
        }else if (monster.getMonsterHp()<=0){
            System.out.println("Player win!");
        }
    }
}
