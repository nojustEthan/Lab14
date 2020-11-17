import java.util.Scanner;

public class Lab14A {
    static Scanner request = new Scanner(System.in);

    public static int[] rowTotal(int row[][]){

        int []array = new int[row.length];

        for (int i = 0; i < row.length; i++){
            int sum = 0;
            for (int j = 0; j < row[i].length; j++){
                sum = sum + row[i][j];
            }
            array[i] = sum;
        }

        return array;
    }

    public static int[] columnTotal(int column[][]){

        int []array = new int[column[0].length];

        for (int i = 0; i < column[0].length; i++){
            int sum = 0;
            for (int j = 0; j < column.length; j++){
                sum = sum + column[j][i];
            }
            array[i] = sum;
        }

        return array;
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

        int row[] = rowTotal(arr);
        int column[] = columnTotal(arr);

        for (int i = 0; i < column.length; i++){
            System.out.println("Sum of column " + i + " is " + column[i]);
        }
        for (int i = 0; i < row.length; i++){
            System.out.println("Sum of row " + i + " is " + row[i]);
        }



    }
}
