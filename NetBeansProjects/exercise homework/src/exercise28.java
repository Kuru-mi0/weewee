import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String play;
        do {

            char[] word = getWord();

            char[] asterisks = new char[word.length];
            fillAsterisks(asterisks);

            int missed = 0;
            do {

                char guess = getGuess(asterisks);

                if (!isCorrectGuess(word, asterisks, guess))
                    missed++;

            } while (!isWordFinish(asterisks));


            print(word, missed);

            System.out.println("Do you want to guess another word? Enter y or n>");
            play = input.next();

        } while (play.charAt(0) == 'y');
    }

    public static char[] getWord() {
        String[] words = {"widow", "reinhardt", "mauga", "soldier", "dva", "reaper", "zenyatta", "pharah", "mercy", "orisa", "interplanetarypurplythorny dragon"};

        String pick = words[(int)(Math.random() * words.length)];
        char[] word = new char[pick.length()];

        for (int i = 0; i < word.length; i++) {
            word[i] = pick.charAt(i);
        }
        return word;
    }

          System.out.print("The word is ");
        System.out.print(word);
        System.out.println(" You missed " + missed + " time");
    }

