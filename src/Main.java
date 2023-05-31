import BackEnd.PeopleDB;
import BackEnd.PlaneDB;
import FrontEnd.UI;

import java.nio.file.Files;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        //FrontEnd.UI mainObj = new UI();
        //mainObj.mainWindow();
/*
        String[] s =  PlaneDB.readFile(1, 1);
        String[] p = PeopleDB.readFile(1,"something");
        System.out.println("PLANE DB");
        for(int i =0; i<s.length; i++){
            System.out.println(s[i]);
        }
        System.out.println("PEOPLE DB");
        for(int j = 0; j<p.length; j++){
            System.out.println(p[j]);
        }
*/
/*
        String[] test = PlaneDB.readFile("201");

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }


        String filePath = "src/BackEnd/PeopleData/testDB";
        int lineNumber = 4;
        String newContent = "fff";


        try {
            // Read the original file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder content = new StringBuilder();

            // Read the file line by line
            int currentLineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (currentLineNumber == lineNumber) {
                    // Modify the desired line
                    content.append(newContent).append("\n");
                } else {
                    content.append(line).append("\n");
                }
                currentLineNumber++;
            }
            reader.close();

            // Write the modified content back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content.toString());
            writer.close();

            System.out.println("Successfully wrote to line " + lineNumber);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
*/
        UI obj = new UI();
        obj.mainWindow();

    }
}
