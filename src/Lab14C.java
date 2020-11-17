import java.util.Scanner;

public class Lab14C {
    static Scanner request = new Scanner(System.in);

    public static int[][] addArrays(int a[][], int b[][]){

        int result[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args){

        int[][] matrixA = new int[3][3];

        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[i].length; j++){
                System.out.println("Enter a value for Matrix A: ");
                matrixA[i][j] = request.nextInt();
            }
        }

        int[][] matrixB = new int[3][3];

        for (int i = 0; i < matrixB.length; i++){
            for (int j = 0; j < matrixB[i].length; j++){
                System.out.println("Enter a value for Matrix B: ");
                matrixB[i][j] = request.nextInt();
            }
        }

        System.out.println("Matrix A:");
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[i].length; j++){
                System.out.print("\t" + matrixA[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Matrix B:");
        for (int i = 0; i < matrixB.length; i++){
            for (int j = 0; j < matrixB[i].length; j++){
                System.out.print("\t" + matrixB[i][j]);
            }
            System.out.println("");
        }

        int addedArr[][] = addArrays(matrixA, matrixB);

        System.out.println("A + B:");
        for (int i = 0; i < addedArr.length; i++){
            for (int j = 0; j < addedArr[i].length; j++){
                System.out.print("\t" + addedArr[i][j]);
            }
            System.out.println("");
        }

    }

}
