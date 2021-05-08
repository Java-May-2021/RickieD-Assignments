public class BasicJavaTest {
    public static void main(String[] args){
        int[] nums = {1,3,5,7,9,13};
        int[] negnums = {1,5,10,-2};
        int[] nums2 = {1,5,10,7,-2};
        int y = 3;
        BasicJava.OneTo255();
        BasicJava.PrintOdds();
        BasicJava.GetArraySum(nums);
        BasicJava.PrintSum();
        BasicJava.ArrayIterate(nums);
        BasicJava.Maximum(nums);
        BasicJava.GetAvg(nums);
        BasicJava.OddArray();
        BasicJava.GreaterThanY(nums,y);
        BasicJava.ValSquare(nums);
        BasicJava.MaxMinAvg(negnums);
        BasicJava.ShiftingValues(nums2);
    }
}