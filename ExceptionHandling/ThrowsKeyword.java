package Module2.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {
    static void except()throws FileNotFoundException, IOException {

    }

    public static void main(String[] args) {
        try {
            except();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
