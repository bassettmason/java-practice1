import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("morning dave");





        String pet = "cat";
        int number = 2;

        pluralize(number, pet);

        FlipNHeads(3);

        clock();
    }

    public static void pluralize(int number, String pet) {

        if (number != 1) {
            System.out.println("I own " + number + " " + pet + "s");
        } else {
            System.out.println("I own " + number + " " + pet);
        }
    }


    public static void FlipNHeads(int n) {



        int streak = 0;

        int flips = 0;

        while (streak < n) {
            if (Math.random() >= 0.5) {
                System.out.println("heads");
                streak += 1;
                flips += 1;

                //run coinflip again and add to array
            } else {
                System.out.println("tails");
                streak = 0;
                flips += 1;

            }

        }
        System.out.println("It took " + flips + " flips to flip " + streak + " heads in a row.");
        flips = 0;
        streak = 0;
    }

    public static void clock () {


        LocalDateTime startTime = LocalDateTime.now();
        int startHour = startTime.getHour();
        int startMinute = startTime.getMinute();
        int startSecond = startTime.getSecond();
        LocalDateTime now;



        System.out.println(startHour + ":" + startMinute + ":" + startSecond );

        while (true) {

            now = LocalDateTime.now();
            int currentHour = now.getHour();
            int currentMinute = now.getMinute();
            int currentSecond = now.getSecond();

            if (currentHour != startHour || currentMinute != startMinute || currentSecond != startSecond){
                System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond);
            }
            startHour = currentHour;
            startMinute = currentMinute;
            startSecond = currentSecond;
        }







    }


}
