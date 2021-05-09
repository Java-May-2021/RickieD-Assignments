import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class PuzzleJavaTest{
    public static void main(String[] args){
        int[] nums1 = {3,5,1,2,7,9,8,13,25,32};
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int lowerbound = 55;
        int upperbound = 100;
        
        PuzzleJava.SumGreater(nums1);
        ArrayList<String> GetNames = new ArrayList<>(Arrays.asList ("Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"));
        PuzzleJava.GetNames(GetNames);
        PuzzleJava.GetAlphabet();
        PuzzleJava.GetRandomNum(lowerbound, upperbound);
        PuzzleJava.RandomString(alphabet);
        PuzzleJava.GetRandomString();
    }
}