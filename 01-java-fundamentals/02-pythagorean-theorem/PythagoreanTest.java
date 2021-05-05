class PythagoreanTest{
    public static void main(String[] args){
        double Adjacent=2, Opposite=3, Hypotenuse=4;

        double Hypotenuse1 = (Math.pow(Adjacent,2)) + (Math.pow(Opposite,2));
        Hypotenuse1=Math.sqrt(Hypotenuse1);
        System.out.println("Hypotenuse: " + Hypotenuse1);

        double Adjacent1 = (Math.pow(Hypotenuse,2)) - (Math.pow(Opposite,2));
        Adjacent1=Math.sqrt(Adjacent1);
        System.out.println("Adjacent: " + Adjacent1);

        double Opposite1 = (Math.pow(Hypotenuse,2)) - (Math.pow(Adjacent,2));
        Opposite1=Math.sqrt(Opposite1);
        System.out.println("Opposite: " + Opposite1);

    }
}