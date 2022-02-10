import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите размер квадратной матрицы: ");

        int N = scan.nextInt(); //размер матрицы

        int[][] array = new int[N][N];

        int flag = 0;

        System.out.println("Для автогенерации матрицы нажмите 1");

        System.out.println("Для ввода вручную нажмите 2");

        flag = scan.nextInt();

        if (flag == 1) {

            System.out.println("Матрица автоматически сгенерирована:");


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = rand.nextInt(100);
                }

            }
        }

        if (flag == 2) {

            System.out.println("Введите матрицу вручную:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = scan.nextInt();
                }

            }


        }

        //вывод исходной матрицы
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        int[] B = new int[2 * array.length];

        if (CheckMagic2p0(array, B)) {
            System.out.println("Матрица - магическая");
        }

        else {
            System.out.println("Матрица не магическая");
        }

    }

    public static boolean CheckMagic(int[][] A, int[] B) {
        boolean isMagic = true;
        int sumRow = 0, sumCol = 0, ind = 0;
        for (int i = 0; i < A.length; i++) {
            sumRow = 0;
            sumCol = 0;
            for (int j = 0; j < A.length; j++) {
                sumRow = sumRow + A[i][j]; //суммируем элементы в строках
                sumCol = sumCol + A[j][i]; //суммируем элементы в столбцах
            }
            B[ind] = sumRow;
            B[ind + 1] = sumCol;
            ind += 2;
        }
//проверка:
        for (int i = 0; i < B.length; i++) {
            if (B[i] != B[i + 1]) {
                isMagic = false;
                break;
            }
        }

        return isMagic;
    }


    public static boolean CheckMagic2p0(int[][] A, int[] B){
        boolean magic_square = true;
        int size = A.length;
        int sum = 0;
        for (int i = 0; i < size; ++i)
            sum += A[i][i];

        int buf = 0;
        for (int i = 0; i < size; ++i)
            buf += A[size - i -1][size - i - 1];

        if (buf != sum)
            magic_square = false;

        for (int i = 0; i < size && magic_square; ++i) {
            int buf1 = 0, buf2 = 0;
            for (int j = 0; j < size; ++j) {
                buf1 += A[i][j];
                buf2 += A[j][j];
            }

            if (buf1 != sum || buf2 != sum)
                magic_square = false;
        }

       return magic_square;
    }


}