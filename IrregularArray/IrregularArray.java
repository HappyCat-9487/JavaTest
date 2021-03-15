public class IrregularArray {
    public static void main(String[] args){
        int[][] arr = new int[2][];
        arr[0] = new int[] {1,2,3,4};
        arr[1] = new int[] {5,6,7};
        for(int[] row : arr){
            for(int value : row)
                 System.out.printf("%2d", value);
            System.out.println();
        }
    }
}