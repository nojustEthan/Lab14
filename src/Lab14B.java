import java.util.Scanner;

public class Lab14B {
    static Scanner request = new Scanner(System.in);

    public static String findMax(int arr[][]){

        int max = Integer.MIN_VALUE;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    row = i;
                    column = j;

                }
            }
        }
        String result = String.valueOf(row) + String.valueOf(column);
        return result;
    }

    public static void main(String[] args){

        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println("Enter a value: ");
                arr[i][j] = request.nextInt();
            }
        }

        System.out.println("The entered matrix:");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println("");
        }


        System.out.println("First largest value is located at row " + findMax(arr).charAt(0) + " and column " + findMax(arr).charAt(1));

    }
}
