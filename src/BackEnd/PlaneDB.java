package BackEnd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlaneDB {
    public static String toString(int num){
        String sNum = String.valueOf(num);
        return sNum;
    }

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
            return;
        }

    }
}
