public class Main {
    public static void main(String[] args) {
        System.out.println("morning dave");



        String pet = "cat";
        int number = 2;

        pluralize(number, pet);

        FlipNHeads(3);
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


}
