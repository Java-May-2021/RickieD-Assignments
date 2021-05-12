public class Gorilla extends Mammal {

    public Gorilla(int energyLvl) {
        super(energyLvl);

    }
    
    public void throwSomething() {
        energyLvl -= 5;
        System.out.println("Energy level decreased to: " + this.energyLvl);
    }

    public void eatBananas()  {
        energyLvl += 10;
        System.out.println("Energy Level increased to: " + this.energyLvl);
    }

    public void climb() {
        energyLvl -= 10;
        System.out.println("Energy level decreased to: " + this.energyLvl);
    }
    //Method to show current energy level after actions
    public int currentEnergyLvl(int energyLvl) {
        System.out.println("Remaining energy: " + this.energyLvl);
        this.energyLvl -= energyLvl;
        return this.energyLvl;
    }

}