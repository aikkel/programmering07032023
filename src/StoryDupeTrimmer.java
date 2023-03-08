import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class StoryDupeTrimmer {

    public void StoryDupeTrimmer() {

        HashMap<String, Integer> storyWordSort = new HashMap<>();
        File file = new File("Hare1.txt");
        String word;
        int value;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                word = scanner.next();
                if (storyWordSort.containsKey(word)) {
                    value = storyWordSort.get(word);
                    value++;
                    storyWordSort.put(word, value);
                } else {
                    storyWordSort.put(word, 1);
                }

            }

        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        storyWordSort.forEach((k, v) -> {
            if (v == 1) System.out.println(k);
        });
    }
}
