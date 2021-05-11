public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat(300);
        System.out.println("\n----------BAT INITIAL ENERGY LEVEL-----------------\n");
        bat.displayEnergyLvl();
        System.out.println("\n-----------------ATTACKING TOWNS-------------------\n");

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        System.out.println("\n-----------------EATING HUMANS-------------------\n");

        bat.eatHumans();
        bat.eatHumans();
        System.out.println("\n--------------------FLYING----------------------\n");
        
        bat.fly();
        bat.fly();
    }
}