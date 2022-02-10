import java.util.Scanner;

public class LR4p1 {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Введите кол-во эл-тов массива: ");

        int N = scan.nextInt(); //размер массива

        int[] array = new int[N]; //инициализация массива

        System.out.println("Введите массив: ");
        //ввод массива
        for(int i = 0; i < N; i++) array[i] = scan.nextInt();

        TransformArray(array);
        int K = OddCount(array);
        if(true) {
            shiftK(array, K);
            printArray(array);
        }



    }

    public static int OddCount(int[] array){

        int k = 0;
        for(int i = 0; i < array.length; i++)
            if ((array[i] % 2) == 1) k++;

        return k;

    }
    public static void TransformArray(int[] array){


        //преобразование (прибавляем к чётным первый эл-т)
        for(int i = 1; i < array.length; i++){

            if( (array[i] % 2) == 0 ){

                array[i] += array[0];

            }

        }

    }
    public static void reverse(int[] arr, int start, int n){
        //arr - массив
        //start - начало левого блока
        //n - размер

        if(arr.length <= 1) return;

        int i = start;
        int j = n - 1;

        while(i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
            --j;
        }

    }
    public static void shiftK(int[] arr, int k){

        reverse(arr, 0,arr.length - k);
        reverse(arr, arr.length - k, k);
        reverse(arr, 0, arr.length);

    }
    public static void printArray(int[] arr){

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
