import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{

    public static ArrayList<Integer> SumGreater(int[] nums1){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
            sum += nums1[i];
            if(nums1[i] > 10){
                newArr.add(nums1[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArr);
        return newArr;
    }
    public static void GetNames(ArrayList<String> people){
        Collections.shuffle(people);
        System.out.println(people);
        for(int i = 0; i < people.size(); i++) {
            String c = people.get(i);
            if(c.length() > 5) {
                System.out.println(c);
            }
        }
    }
    public static void GetAlphabet() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.add(ch);
        }
        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet); //Needs to print agian to show shuffled alphabet.
        System.out.println(alphabet.get(25)); //Pulls the last character in the array.
        System.out.println(alphabet.get(0)); //Pulls the first character in the array.
            if(alphabet.get(0) == 'a') {
                System.out.println("You Got VOWELED!");
            }
            if(alphabet.get(0) == 'e') {
                System.out.println("You Got VOWELED!");
            }
            if(alphabet.get(0) == 'i') {
                System.out.println("You Got VOWELED!");
            }
            if(alphabet.get(0) == 'o') {
                System.out.println("You Got VOWELED!");
            }
            if(alphabet.get(0) == 'u') {
                System.out.println("You Got VOWELED!");
            }
    }
    private static int getMax(int[] arr) {
        return 0;
    }
    private static int getMin(int[] arr) {
        return 0;
    }
    public static int[] GetRandomNum(int lowerbound, int upperbound) {
        int[] arr = new int[10];
        int offset = upperbound - lowerbound;
        Random r = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(offset) + lowerbound; //Will give random numbers in the 45-99.
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        int max = getMax(arr);
        System.out.println("Max: " + arr[9]);
        int min = getMin(arr);
        System.out.println("Min: " + arr[0]);
        return arr;
    }
    public static String RandomString(String chars) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;
        for(int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println(randomString);
        return randomString;
    }

    public static ArrayList<String> GetRandomString() {
        ArrayList<String> random = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            random.add(RandomString(null)); //Calls on previous method.
        }
        return random;
    }
}
