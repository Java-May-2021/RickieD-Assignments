public class PhoneTest {
    public static void main(String[] args) {
        IPhone iphoneX = new IPhone("IPhoneX", 86, "Xfinity", "Frolic");

        System.out.println("\n-------------Phone specs:----------------\n");
        
        iphoneX.displayInfo();
        System.out.println(iphoneX.unlock());
        System.out.println(iphoneX.ring());

        Galaxy s21 = new Galaxy("S21", 45, "Verizon", "Organ Donor");
        System.out.println("\n-------------Phone specs:----------------\n");

        s21.displayInfo();
        System.out.println(s21.unlock());
        System.out.println(s21.ring());


    }
}