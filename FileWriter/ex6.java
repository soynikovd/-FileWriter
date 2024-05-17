package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class ex6 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("helloword.txt");
        for (int i = 1; i < 11; i++) {
            fr.write("Hello World!" + "\n");
        }
        fr.close();
    }
}
