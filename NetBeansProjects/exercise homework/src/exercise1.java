import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the nubmer of students: ");
        int[] grScores = new int[input.nextInt()];
        char[] allGrades = new char[grScores.length];

        System.out.print("Enter " + grScores.length + " scores: ");
        for (int i = 0; i < grScores.length; i++) {
            grScores[i] = input.nextInt();
        }

        getGrades(grScores, allGrades);

        for (int i = 0; i < grScores.length; i++) {
            System.out.println("Student " + i + " score is " +
                    grScores[i] + " and grade is " + allGrades[i]);
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void getGrades(int[] grScores, char[] allGrades) {
        int best = max(grScores);
        for (int i = 0; i < grScores.length; i++) {
            if (grScores[i] >= best - 10)
                allGrades[i] = 'A';
            else if (grScores[i] >= best - 20)
                allGrades[i] = 'B';
            else if (grScores[i] >= best - 30)
                allGrades[i] = 'C';
            else if (grScores[i] >= best - 40)
                allGrades[i] = 'D';
            else
                allGrades[i] = 'F';
        }
    }
}