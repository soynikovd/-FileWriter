package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class ex2 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("words.txt");
        fr.write("Ось схопилась хуртовина,\n" +
                "закурилася долина,\n" +
                "і кипить мороз у полі,\n" +
                "на просторі та на волі,");
        fr.close();
    }
}
