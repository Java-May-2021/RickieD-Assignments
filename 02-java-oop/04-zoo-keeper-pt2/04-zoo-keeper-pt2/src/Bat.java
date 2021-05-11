public class Bat extends Mammal {
    
    public Bat(int energyLvl) {
        super(energyLvl);
    }
    //Bat will fly, eat humans, and attack a town
    public void fly() {
        energyLvl -= 50;
        System.out.println("(SOUND OF BAT TAKING OFF!)--Energy Level decreased to: " + this.energyLvl);
    }

    public void eatHumans() {
        energyLvl += 25;
        System.out.println("(SOUND OF DEATH AND DESTRUCTION!)--Energy Level increased to: " + this.energyLvl);
    }

    public void attackTown() {
        energyLvl -= 100;
        System.out.println("(SOUNDS OF TOWN BEING ATTACKED BY GIANT BAT!)--Energy Level decreased to: " + this.energyLvl);
    }
}