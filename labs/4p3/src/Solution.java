import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        int n,m,smax,imax;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите размер матрицы (M): ");

        int M = scan.nextInt(); //размер матрицы

        System.out.println("Введите размер матрицы (N): ");

        int N = scan.nextInt(); //размер матрицы


        int[][] array = new int[N][M];

        int flag = 0;

        System.out.println("Для автогенерации матрицы нажмите 1");

        System.out.println("Для ввода вручную нажмите 2");

        flag = scan.nextInt();

        if (flag == 1) {

            System.out.println("Матрица автоматически сгенерирована:");


            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    array[i][j] = rand.nextInt(100);
                }

            }
        }

        if (flag == 2) {

            System.out.println("Введите матрицу вручную:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    array[i][j] = scan.nextInt();
                }

            }


        }

        //вывод исходной матрицы
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        int[] sumArray = new int[N];

        for(int i = 0;i < N;i++)
        {
            sumArray[i]=0;
            for(int j = 0;j < M;j++) { sumArray[i]+=array[i][j]; }

        }
        smax=sumArray[0];
        imax=0;
        for(int i = 0;i < N;i++)
        {
            if(smax<sumArray[i]) { smax=sumArray[i]; imax = i; }

        }

        System.out.println("Номер строки с наиб. суммой: " + (imax + 1) + "\n");

        System.out.println("Сумма: " + smax + "\n");


    }



    }



