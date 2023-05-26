package BackEnd;

import FrontEnd.UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


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
    public static String toString(int num) {
        String sNum = String.valueOf(num);
        return sNum;
    }

    /**
     * Wright to file.
     *
     * @param info       the info
     * @param whichPlane the which plane
     */
    public static void wrightToFile(String[] info, int whichPlane) {
        if (info.length != 7) {
            UI.SwitchWindow("mainWin");

            System.out.println("Failed to wright to file because arr was size " + info.length + " instead of size 7");
        }

        int planeOne = 1;
        int planeTwo = 2;

        if (whichPlane == planeOne) {
            try {
                File Obj = new File("src/PlaneData/P1_data.txt");
                if (Obj.createNewFile()) {
                    System.out.println("New File Made");
                    FileWriter fWriter = new FileWriter("src/PlaneData/P1_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                    }
                    fWriter.close();
                } else {
                    FileWriter fWriter = new FileWriter("src/PlaneData/P1_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                        fWriter.close();
                    }
                }
            } catch (Exception e) {
                System.out.println("err code: " + e);

                System.out.println("something went wrong and could not wright to file");
            }
        } else if (whichPlane == planeTwo) {
            try {
                File Obj = new File("src/PlaneData/P2_data.txt");
                if (Obj.createNewFile()) {
                    System.out.println("New File Made");
                    FileWriter fWriter = new FileWriter("/srcPlaneData/P2_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                        fWriter.close();
                    }
                } else {
                    FileWriter fWriter = new FileWriter("src/PlaneData/P2_data.txt");
                    for (int i = 0; i < info.length; i++) {
                        fWriter.write(info[i]);
                        fWriter.close();
                    }
                }
            } catch (Exception e) {
                System.out.println("err code: " + e);

                System.out.println("something went wrong and could not wright to file");
            }
        } else {
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
    public static String[] readFile(int witchPlane, int date) {
        String[] s = new String[4];

        try {
            File fileObj = new File("src/BackEnd/PlaneData/testDB");
            Scanner reader = new Scanner(fileObj);
            int counter = 0;
            while (reader.hasNextLine()) {//TODO make it so that it starts and ends reading in the right group of info
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

    public static String[] readFile(int witchPlane, String name) {
        String[] s = new String[4];

        try {
            File fileObj = new File("src/BackEnd/PlaneData/testDB");
            Scanner reader = new Scanner(fileObj);
            int counter = 0;
            while (reader.hasNextLine()) {//TODO make it so that it starts and ends reading in the right group of info
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
    public static ArrayList<String> readFile(int witchPlane) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            File fileObj = new File("src/BackEnd/PlaneData/testDB");
            Scanner reader = new Scanner(fileObj);

            int counter = 0;
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                list.set(counter, line);
                counter++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


}
