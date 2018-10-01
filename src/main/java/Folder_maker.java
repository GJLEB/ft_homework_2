import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

public class Folder_maker {
    public static void main(String[] args)
    {
        Random rnd = new Random((System.currentTimeMillis()));
        int number = 1+rnd.nextInt(20);
        String name = UUID.randomUUID().toString();
        name = name.replace("-","");
        name = name.substring(0,number);
        File dir = new File(name);
        dir.mkdir();
        File file = new File(dir + "\\text.txt");
        try
        {
            file.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
