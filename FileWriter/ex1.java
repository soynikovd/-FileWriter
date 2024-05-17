package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("numbers.txt");
        for(int i = 1; i < 21; i++) {
            fr.write(i + "\n");
        }
        fr.close();
    }
}
