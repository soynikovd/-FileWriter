package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class ex3 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("numberz.txt");
        for (int i = 10; i > 0; i--) {
            fr.write(i + " ");
        }
        fr.close();
    }
}
