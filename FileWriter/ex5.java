package FileWriter;

import java.io.FileWriter;
import java.io.IOException;


public class ex5 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("wordz.txt");
        String[] words = {"Кіт", "Собака", "Риба Хліб", "Стіл", "Вода", "Літак", "Рука Диван", "квіти"};
        for (int i = 0; i < words.length; i++) {
            if(i % 2 != 0) {
                fr.write(words[i] + " ");
            }
        }
        fr.close();
    }
}
