import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StoryLetters {

    public void StoryLetters()
    {


        Set<Character> storyFindVowels = new HashSet<>();

        storyFindVowels.add('a');
        storyFindVowels.add('e');
        storyFindVowels.add('i');
        storyFindVowels.add('o');
        storyFindVowels.add('u');
        storyFindVowels.add('y');
        storyFindVowels.add('æ');
        storyFindVowels.add('ø');
        storyFindVowels.add('å');

        int vokaler = 0;
        int konsonant = 0;

        String word;

        // Map<Character> vowelMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast filnavnet: ");
        File file = new File(input.next() + ".txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                word = scanner.next();
                for (int i = 0; i < word.length(); i++) {
                    char c = Character.toLowerCase(word.charAt(i));
                    if (storyFindVowels.contains(c)) {
                        vokaler++;
                        // System.out.print(c + " - ");
                    } else {
                        konsonant++;
                    }
                }
            }
            System.out.println(vokaler + " vokaler \n" +
                    konsonant + " konsonanter");


        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
