public class Calculator{

    private double operandOne;
    private char operation;
    private double operandTwo;
    private double result;
    //Will need a setOperandOne that will set  to 10.5
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }
    //Will need a setOperation that will add "+".
    public void setOperation(char operation) {
        this.operation = operation;
    }
    //Will need a setOperandTwo that will set to 5.2.
    public void setOperandTwo(double operandTwo) {
        this.operandTwo=operandTwo;
    }

    public Double getOperandOne(double operandOne) {
        return this.operandOne;
    }
    
    public char getOperation(char operation) {
        return this.operation;
    }

    public Double getOperandTwo(double operandTwo) {
        return this.operandTwo;
    }

    //Will need a performOperation method that will execute calculation.
    public void performOperation() {
        if(this.operation == '+'){
            this.result = operandOne + operandTwo;
        }
        if(this.operation == '-'){
            this.result = operandOne - operandTwo;
        }
    }
    //Will need a getResult method to show result.
    public void getResult() {
        System.out.println(this.operandOne + " " + this.operation + " " + this.operandTwo + " " + "=" + " " + this.result);
    }
}