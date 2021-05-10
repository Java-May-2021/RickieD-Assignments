public class Project {
    private String name;
    private String description;
    private double initCost;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }
    public void setDesc(String description) {
        this.description = description;
    }
    
    public void project(){

    }

    public void project(String name) {
        this.name = name;
    }

    public void project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Double getCost(){
        return initCost;      // Optional add on for assignment
    }

    public void setCost(Double cost) {
        this.initCost = cost;           // Optional add on for assignment
    }
    public String elevatorPitch() {
        return this.name+"($"+this.initCost+")" + ": " + this.description;
    }

    public static double portCost(double[] portCost) {  //Optional add on for assignment. Adds total cost of all projects.
        int sum = 0;
        for(int i = 0; i < portCost.length; i++) {
            sum += portCost[i];
        }
        System.out.println(sum);
        return sum;
    }
}
