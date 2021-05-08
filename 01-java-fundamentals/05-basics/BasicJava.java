import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {	
	
    public static void OneTo255() {
		for(int i = 0; i <= 255; i++)
			System.out.println(i);
	}
	
	public static void PrintOdds() {
		for(int i = 0; i <= 255; i++) {
			if(i % 2 == 1){
				System.out.println(i);
            }
		}
	}
    public static int GetArraySum(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static int PrintSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println(String.format("New number: %d, Sum: %d", i, sum));
        }
        return sum;
    }
    public static void ArrayIterate(int[] nums) {
        for(int val: nums) {
            System.out.println(val);
        }
    }
    public static int Maximum(int[] nums) {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("Max: " + max);
        return max;
    }
    public static double GetAvg(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double avg = sum/nums.length;
        System.out.println("Average: "+ avg);
        return avg;

    }
    public static ArrayList<Integer> OddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i < 256; i++) {
            if(i % 2 == 1){
            y.add(i);
            }
        }
        System.out.println(y);
        return y;
    }
    public static int GreaterThanY(int[] nums, int y) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > y) {
                count ++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void ValSquare(int[] nums){
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
            System.out.println(nums[i]);
        }
    }

    public static void MaxMinAvg(int[] negnums){
        int max = negnums[0];
        int min = negnums[0];
        int sum = 0;
        for(int i = 0; i < negnums.length; i++){
            if(negnums[i] > max){
                max = negnums[i];
            }
            if(negnums[i] < min) {
                min = negnums[i];
            }
            sum += negnums[i];
        }
        int avg = sum/negnums.length;
        int[] newArr = {max,min,avg};
        System.out.println(Arrays.toString(newArr));

    }

    public static void ShiftingValues(int[] nums2){
        for(int i = 1; i < nums2.length; i++){
            nums2[i-1] = nums2[i];
        }
        nums2[nums2.length-1] = 0;
        System.out.println(Arrays.toString(nums2));
    }
}