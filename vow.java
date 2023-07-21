import java.util.Scanner;

public class vow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (countVowels(word) >= 3) {
                System.out.println(word);
            }
        }
    }

    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                count++;
            }
        }

        return count;
    }
}
