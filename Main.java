import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FileWriter fileWriter = null;
        try {
            File outputFile = new File("Output.txt");
            fileWriter = new FileWriter(outputFile, true);

            //FileWriter fileWriter = new FileWriter("Output.txt");

            fileWriter.write("This is our first line in the file");
            fileWriter.write("\n");
            fileWriter.write("This is our second line in the file");
            fileWriter.write("\n");
            fileWriter.write("This is our third line in the file");
            fileWriter.write("\n");

/*            for(int i = 0; i < 100000; i++){
                fileWriter.write(i);
            }

            fileWriter.flush();*/

            //fileWriter.close();

            Scanner scanner = new Scanner(outputFile);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

            Properties props = new Properties();
            FileInputStream inputStream = new FileInputStream("Config.properties");
            props.load(inputStream);
            System.out.println(props.getProperty("LoginPage.LoginEditBox"));
            System.out.println(props.getProperty("LoginPage.PasswordEditBox"));

        }
        catch (IOException ex){
            System.out.println(ex.toString());
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
        finally {
            try{
                if (fileWriter != null){
                    fileWriter.close();
                }
            }
            catch (IOException exception){
                System.out.println(exception.toString());
            }
        }
    }
}
