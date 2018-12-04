/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.util.*;

public class Library {







    //rolls a dice n amount of times and returns an array of each roll
    public static int[] roll(int n) {
        int[] rollArray = new int[n];
        for (int i = 0; i<n; i++){

            rollArray[i] = rand();

        }
        return(rollArray);

    }
    //returns a random int 1-6
    private static int rand() {
        while (true) {
            int dice = new Random().nextInt(6);

            if (dice != 0) {

                return(dice);


            }

        }

    }
//   two for loops check eachother for duplicates returning boolean
    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if (array[i] == array[j]) {
                    System.out.println("duplicates yay");
                    return (true);
                }
            }
        }
        System.out.println("no dup");
        return(false);
    }
    //returns average of array
    public static double calculateAverages(int[] array){
        double total = 0;
        double average = 0;
        for (int i = 0; i<array.length; i++){

            total += array[i];
        }
        average = total/array.length;
        System.out.println("average is " + average);
        return(average);
    }

    public static int[] arrayOfArrays(int[][] weatherSet) {
        int[]lowest = weatherSet[0];
        double lowestAverage = 200;
        for (int i = 0; i < weatherSet.length; i++) {

            double currentAverage = calculateAverages(weatherSet[i]);



            if (currentAverage < lowestAverage) {
                lowestAverage = currentAverage;
                lowest = weatherSet[i];

            }


        }
        return(lowest);

    }

    public static String analyzingWeatherData(int[][] weatherData) {
        HashMap<Integer, Integer> unique = new HashMap<>();

        int max = 0;
        int min = 200;

        for (int i = 0; i < weatherData.length; i++) {

            for (int j = 0; j < weatherData[i].length; j++) {
                int temp = weatherData[i][j];

                if (unique.containsKey(temp)) {
                    unique.put(temp, (unique.get(temp) + 1));
                } else {
                    unique.put(temp, 1);
                }
                if (temp < min) {
                    min = temp;


                }


                if (temp > max) {
                    max = temp;
                }

            }
        }
        String returnString = "High: " + max + "\n" + "Low: " + min;

        while(min < max) {
            min ++;

            if(!unique.containsKey(min)) {
                returnString += "\n" + "Never saw temp " + min;
            }
        }
        return(returnString);

    }

    public static String tally(ArrayList <String> voteCount) {


        HashMap<String, Integer> countMap = new HashMap<>();

        String winner = "";
        int most = 0;

        for (String person : voteCount) {
            if (!countMap.containsKey(person)) {
                countMap.put(person, 1);
            } else {
                countMap.put(person, (countMap.get(person) + 1));
            }
        }

        for (String person : countMap.keySet()) {
            int total = countMap.get(person);
            if (total > most) {
                most = total;
                winner = person;
            }
        }

        return (winner + "recieved the most votes!");

    }


}
