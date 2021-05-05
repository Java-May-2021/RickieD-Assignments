public class FizzBuzz{
    public String fizzBuzz(int number){
        if(number % 5 == 0 && number % 3 == 0){
            return "FizzBuzz";
        }else if(number % 5 == 0){
            return "Buzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else{
            return Integer.toString(number);
        }
    }
    public void counter() {
        for(int i = 0; i < 50; i++){
            String result = fizzBuzz(i);
            System.out.println("Number: " + i + "-" + "Result: "+ result);
        }
    }
}