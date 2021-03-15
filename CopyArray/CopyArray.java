import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args){
        int[] scores1 = {88, 81, 74, 68, 78, 76, 77};
        int[] scores2 = Arrays.copyOf(scores1, scores1.length);
        for(int value : scores2)
            System.out.printf("%3d", value);
        System.out.println();
        scores2[0] = 99;
        for(int value : scores1)
            System.out.printf("%3d", value);
        System.out.println();
        for(int value : scores2)
            System.out.printf("%3d", value);
    }
}