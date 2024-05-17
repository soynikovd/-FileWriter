package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("numberss.txt");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                fr.write(i + "\n");
            }
        }
        fr.close();
    }
}
