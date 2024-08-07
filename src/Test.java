public class Test {
    public static void main(String [] args){
        int[][] arr = new int[2][4];

        for(byte i = 0; i < 2; i++){
            for(byte j = 0; j < 4; j++){
                arr[i][j] = i+j;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println();
        }
    }
}
