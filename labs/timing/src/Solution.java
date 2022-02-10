import java.io.IOException;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Введите время до окончания пары(в минутах): ");
        Scanner scan = new Scanner(System.in);
        int start_time = scan.nextInt();

        int hours = start_time / 60;
        int minutes = 0;
        if(start_time > 60) {

            try {
                //hours /= 10;
            } finally {

            }
            minutes = start_time % 60;
        }
        if(start_time <= 60){

            minutes = start_time;

        }

        while (start_time != 0){

            if(start_time > 60){

                System.out.println("До конца занятия " + hours + " часов " + minutes + " минут\n");
                minutes --;

            }
            else {
                System.out.println("До конца занятия " + start_time + " минут(ы)\n");
                minutes--;
            }
            start_time -= 1;
            Thread.sleep(60000);
            
        }



    }


}
