package reflection_homework2;

import java.io.FileWriter;
import java.io.IOException;

public class Saver {

    @Save(path = "A:\\file.txt")
    public void save(String path, String text){
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.flush();
            writer.close();
            System.out.println("Text written!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Eror, text not written");

        }
    }

    public String getText(){
        return "Prog.kiev.ua";
    }
}
