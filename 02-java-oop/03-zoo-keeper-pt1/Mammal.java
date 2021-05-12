public class Mammal {

    //initial animal energy level
    protected int energyLvl = 100;

    public Mammal(int energyLvl) {
        this.energyLvl = energyLvl;
    }

    //Display energy levels through method
    public int displayEnergyLvl() {
        System.out.println(" Current Energy Level: " + this.energyLvl);
        return energyLvl;
    }


}