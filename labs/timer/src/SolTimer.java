import java.util.Scanner;


public class SolTimer {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Нажмите Enter для заупска таймера");
        Scanner scan = new Scanner(System.in);

        int start_flag = scan.nextInt();

        long start_time = 0;



        while(start_flag != 0){

            System.out.println("Прошло " + start_time + " секунд(ы)\n");
            start_time++;
            Thread.sleep(1000);



        }


    }






    public void Timer(){


        Thread myTimer = new Thread();

        myTimer.run();





    }




}
