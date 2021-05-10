import java.util.ArrayList;
public class ProjectTest {
    public static void main(String[] args) {
        double[] portCost = {125.99, 145.99};
        Project newProj1 = new Project();
        newProj1.getName();
        newProj1.setName("The Sage");
        newProj1.getDesc();
        newProj1.setDesc("A new project to reflect the joys of nature.");
        newProj1.getCost();
        newProj1.setCost(125.99);
        String printThis = newProj1.elevatorPitch();
        System.out.println(printThis);
        
        Project newProj2 = new Project();
        newProj2.getName();
        newProj2.setName("Harper Inc");
        newProj2.getDesc();
        newProj2.setDesc("Where people come togeher to help others.");
        newProj2.getCost();
        newProj2.setCost(145.99);
        String printOther = newProj2.elevatorPitch();
        System.out.println(printOther);

        ArrayList<Object> portfolio = new ArrayList<Object>();
        portfolio.add(printThis);
        portfolio.add(printOther);
        portfolio.add(portCost);
        System.out.println(portfolio);

        Project.portCost(portCost);

    }
}