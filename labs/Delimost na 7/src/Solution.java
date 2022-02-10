import java.util.Scanner;


public class Solution {

    public static void main(String[] args){

        System.out.println("Кол-во чисел");

        Scanner scan = new Scanner(System.in);

        //solution

        int count = 0;

        int[] arr1 = {7, 5, 777, 777, 2};
        double[] arr2 = {11.7, 6.1, 777, 90.4};
        long[] arr3 = {0, 2, 343, 90, 34, 5};

        NumberOfDivisibleBySeven(arr1);
        NumberOfDivisibleBySeven(arr2);
        NumberOfDivisibleBySeven(arr3);

        //System.out.println("Кол-во искомых = " + count);


    }



    public static int NumberOfDivisibleBySeven(long[] arr){

        int count = 0;
        for(int i = 0; i < arr.length; i++){

            if(((arr[i] % 7) == 0) && String.valueOf(Math.abs(arr[i])).length() == 3){

                count++;


            }


        }
        System.out.println("Метод для long отработал");
        System.out.println("Кол-во искомых = " + count + "\n\n\n");
        return count;

        }
    public static int NumberOfDivisibleBySeven(int[] arr){

        int count = 0;
        for(int i = 0; i < arr.length; i++){

            if(((arr[i] % 7) == 0) && String.valueOf(Math.abs(arr[i])).length() == 3){

                count++;


            }


        }
        System.out.println("Метод для int отработал");
        System.out.println("Кол-во искомых = " + count + "\n\n\n");
        return count;

    }
    public static int NumberOfDivisibleBySeven(double[] arr){

        int count = 0;
        for(int i = 0; i < arr.length; i++){

            if(((arr[i] % 7) == 0) && String.valueOf(Math.abs(arr[i])).length() == 3){

                count++;


            }


        }
        System.out.println("Метод для double отработал");
        System.out.println("Кол-во искомых = " + count + "\n\n\n");
        return count;

    }


    }



