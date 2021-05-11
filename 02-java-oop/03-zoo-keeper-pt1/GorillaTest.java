public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        System.out.println("------------BEGINNING ENERGY LEVEL:------------\n");
        gorilla.displayEnergyLvl();
        System.out.println("\n-----------------THROWING ITEMS----------------\n");
        
        //Show loss of energy from thorwing items.
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        
        System.out.println("\n----------------------EATING--------------------\n");

        //Show banans eaten
        gorilla.eatBananas();
        gorilla.eatBananas();

        System.out.println("\n---------------------CLIMBING-------------------\n");
        
        //Show times climbed
        gorilla.climb();
        
        //Can you add in a final energy level output?
        // int[] crntLvl = gorilla.currentEnergyLvl();
        // System.out.println(crntLvl);
    }
}