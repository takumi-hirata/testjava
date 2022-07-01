import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class sample10 {
    // ファイルクローズ漏れbr.closeが実行される保証なし
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("XXX/test.txt");
            BufferedReader br = new BufferedReader(fr);
            String text = br.readLine();
            System.out.println(text);
            try {
                if (fr != null)
                    fr.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}