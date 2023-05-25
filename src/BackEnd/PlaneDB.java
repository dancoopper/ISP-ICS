package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;


//TODO fix the text file path name


/**
 * The type Plane db.
 */
public class PlaneDB {
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
     * @param info       the info
     * @param whichPlane the which plane
     */
    public static void wrightToFile(String[] info, int whichPlane){
        if(whichPlane == 1) {
            try {
                File Obj = new File("PlaneData/P1_data.txt");
                if (Obj.createNewFile()) {
                    System.out.println("New File Made");
                    FileWriter fWriter = new FileWriter("PlaneData/P1_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                        fWriter.close();
                    }
                } else {
                    FileWriter fWriter = new FileWriter("PlaneData/P1_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                        fWriter.close();
                    }
                }
            } catch (Exception e) {
                System.out.println("err code: " + e);

                System.out.println("something went wrong and could not wright to file");
            }
        }else if(whichPlane == 2){
            try {
                File Obj = new File("PlaneData/P2_data.txt");
                if (Obj.createNewFile()) {
                    System.out.println("New File Made");
                    FileWriter fWriter = new FileWriter("PlaneData/P2_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                        fWriter.close();
                    }
                } else {
                    FileWriter fWriter = new FileWriter("PlaneData/P2_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                        fWriter.close();
                    }
                }
            } catch (Exception e) {
                System.out.println("err code: " + e);

                System.out.println("something went wrong and could not wright to file");
            }
        }else{
            System.out.println("could not find plane number");
        }

    }

    /**
     * Read file string [ ].
     *
     * @param witchPlane the witch plane
     * @param date       the date
     * @return the string [ ]
     */
    public static String[] readFile(int witchPlane, String date){
    String[] s = new String[10];
    
    try {
        File fileObj = new File("src/BackEnd/PlaneFiles/testDB");
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
