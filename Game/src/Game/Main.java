package Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player1 player = new Player1("Abhay", "sword", 100);
//		System.out.println(player.getName());
//		System.out.println(player.getHealth());
//		System.out.println(player.getWeapon());

		player.damageByGun1();
		player.damageByGun1();
		player.damageByGun2();
		player.heal();
//		player.damageByGun2();

//		Player2 betterPlayer = new Player2("Sam", "machine Gun", 80, false);
//		betterPlayer.damageByGun1();

	}

}
