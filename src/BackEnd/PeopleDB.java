package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The type People db.
 */
public class PeopleDB {

    /**
     * To string string.
     *
     * @param num the num
     * @return the string
     */
    public static String toString(int num){
        String sNum = String.valueOf(num);
        return sNum;
    }

    /**
     * Wright to file.
     *
     * @param info the info
     */
    public static void wrightToFile(String[] info){
        
    }


    public static String[] readFile(int witchPlane, String date){
        String[] s = new String[10];

        try {
            File fileObj = new File("src/BackEnd/PeopleData/testDB");
            Scanner reader = new Scanner(fileObj);
            int counter = 0;
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                s[counter] = line;
                counter++;
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }
}

