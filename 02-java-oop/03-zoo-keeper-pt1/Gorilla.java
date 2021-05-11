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

    // public void currentEnergyLvl(int[] energyLvl) {
    //     int sum = 0;
    //     for(int i = 0; i < energyLvl.length; i++) {
    //         sum += energyLvl[i];
    //     }
    //     System.out.println(sum);
    //     return this.energyLvl;
    // }
}