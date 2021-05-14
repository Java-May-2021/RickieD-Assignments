public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
        return "Unlocked via facial recognition";
    }
    @Override
    public void displayInfo() {
        // your code here
        System.out.printf("Phone version: %s" , getVersionNumber());

        System.out.printf("Phone battery percentage: %d", getBatteryPercentage()); 

        System.out.printf("Phone carrier: %s", getCarrier());
        
        System.out.printf("Phone ring tone: %s", getRingTone());
    }
}

