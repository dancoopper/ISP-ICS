package BackEnd;

import FrontEnd.UI;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;


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
    public static void wrightToFile(String info, int whichPlane, int place) {
        int planeOne = 1;
        int planeTwo = 2;

        HashMap<String, Integer> plane1Index = new HashMap<>();
        plane1Index.put("101", 0);
        plane1Index.put("102", 13);
        plane1Index.put("103", 26);
        plane1Index.put("104", 39);
        plane1Index.put("105", 52);
        plane1Index.put("106", 65);
        plane1Index.put("107", 78);
        plane1Index.put("108", 91);
        plane1Index.put("109", 104);
        plane1Index.put("110", 117);
        plane1Index.put("111", 130);
        plane1Index.put("112", 143);
        plane1Index.put("113", 156);
        plane1Index.put("114", 169);
        plane1Index.put("115", 182);
        plane1Index.put("116", 195);
        plane1Index.put("117", 208);
        plane1Index.put("118", 221);
        plane1Index.put("119", 234);
        plane1Index.put("120", 247);

        HashMap<String, Integer> plane2Index = new HashMap<>();
        plane2Index.put("201", 0);
        plane2Index.put("202", 13);
        plane2Index.put("203", 26);
        plane2Index.put("204", 39);
        plane2Index.put("205", 52);
        plane2Index.put("206", 65);
        plane2Index.put("207", 78);
        plane2Index.put("208", 91);
        plane2Index.put("209", 104);
        plane2Index.put("210", 117);
        plane2Index.put("211", 130);
        plane2Index.put("212", 143);
        plane2Index.put("213", 156);
        plane2Index.put("214", 169);
        plane2Index.put("215", 182);
        plane2Index.put("216", 195);
        plane2Index.put("217", 208);
        plane2Index.put("218", 221);
        plane2Index.put("219", 234);
        plane2Index.put("220", 247);

        if (whichPlane == planeOne) {
            String filePath = "src/BackEnd/PeopleData/primary";
            try {
                File Obj = new File(filePath);
                if (Obj.createNewFile()) {
                    System.out.println("New File Made");
                }
                int lineNumber = place + plane1Index.get(String.valueOf(whichPlane));


                try {
                    // Read the original file
                    BufferedReader reader = new BufferedReader(new FileReader(filePath));
                    String line;
                    StringBuilder content = new StringBuilder();
                    String newContent = info;

                    // Read the file line by line

                    int currentLineNumber = plane1Index.get(String.valueOf(whichPlane));


                    while ((line = reader.readLine()) != null) {
                        if (currentLineNumber == lineNumber) {
                            // Modify the desired line
                            content.append(newContent).append("\n");

                        } else {
                            content.append(line).append("\n");
                        }
                        currentLineNumber++;

                        reader.close();

                        // Write the modified content back to the file
                        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                        writer.write(content.toString());
                        writer.close();
                        lineNumber++;
                        System.out.println("Successfully wrote to line " + lineNumber);
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
            } catch (Exception e) {
                System.out.println("err code: " + e);

                System.out.println("something went wrong and could not wright to file");
            }


        } else if (whichPlane == planeTwo) {
            String filePath = "src/BackEnd/PeopleData/testDB";
            try {
                File Obj = new File(filePath);
                if (Obj.createNewFile()) {
                    System.out.println("New File Made");
                }
                int lineNumber = place + plane2Index.get(String.valueOf(whichPlane));


                try {
                    // Read the original file
                    BufferedReader reader = new BufferedReader(new FileReader(filePath));
                    String line;
                    StringBuilder content = new StringBuilder();
                    String newContent = info;

                    // Read the file line by line

                    int currentLineNumber = plane2Index.get(String.valueOf(whichPlane));


                    while ((line = reader.readLine()) != null) {
                        if (currentLineNumber == lineNumber) {
                            // Modify the desired line
                            content.append(newContent).append("\n");

                        } else {
                            content.append(line).append("\n");
                        }
                        currentLineNumber++;

                        reader.close();

                        // Write the modified content back to the file
                        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                        writer.write(content.toString());
                        writer.close();
                        lineNumber++;
                        System.out.println("Successfully wrote to line " + lineNumber);
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred: " + e.getMessage());
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
     * @return the string [ ]
     */
    public static String[] readFile(int witchPlane, int somehting) {
        String[] s = new String[13];

        try {
            File fileObj = new File("src/BackEnd/PlaneData/primary");
            for (int i = 0; i < 13; i++) {
                int math = (i * 13) + 2;
                String line = Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(3);

            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return s;
    }

    /**
     * Read file array list.
     *
     * @param flightNum the witch plane
     * @return the array list
     */


    public static String[] readFile(String flightNum) {
        String[] list = new String[13];
        HashMap<String, Integer> plane1Index = new HashMap<>();
        plane1Index.put("101", 0);
        plane1Index.put("102", 13);
        plane1Index.put("103", 27);
        plane1Index.put("104", 41);
        plane1Index.put("105", 55);
        plane1Index.put("106", 69);
        plane1Index.put("107", 83);
        plane1Index.put("108", 97);
        plane1Index.put("109", 111);
        plane1Index.put("110", 125);
        plane1Index.put("111", 139);
        plane1Index.put("112", 153);
        plane1Index.put("113", 167);
        plane1Index.put("114", 181);
        plane1Index.put("115", 195);
        plane1Index.put("116", 209);
        plane1Index.put("117", 223);
        plane1Index.put("118", 237);
        plane1Index.put("119", 251);
        plane1Index.put("120", 264);

        HashMap<String, Integer> plane2Index = new HashMap<>();
        plane2Index.put("201", 0);
        plane2Index.put("202", 13);
        plane2Index.put("203", 27);
        plane2Index.put("204", 41);
        plane2Index.put("205", 55);
        plane2Index.put("206", 69);
        plane2Index.put("207", 83);
        plane2Index.put("208", 97);
        plane2Index.put("209", 111);
        plane2Index.put("210", 125);
        plane2Index.put("211", 139);
        plane2Index.put("212", 153);
        plane2Index.put("213", 167);
        plane2Index.put("214", 181);
        plane2Index.put("215", 195);
        plane2Index.put("216", 209);
        plane2Index.put("217", 223);
        plane2Index.put("218", 237);
        plane2Index.put("219", 251);
        plane2Index.put("220", 264);

        try {
            int nFlightNum = Integer.parseInt(flightNum);
            File fileObj = new File("src/BackEnd/PlaneData/primary");
            if (nFlightNum < 121 && nFlightNum > 100) {
                int counter = 0;
                int val = plane1Index.get(flightNum);
                for (int i = val; i < val + 13; i++) {
                    String line = Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(i);
                    list[counter] = line;
                    counter++;
                }

            } else if (nFlightNum < 221 && nFlightNum > 200) {
                int counter = 0;
                int val = plane2Index.get(flightNum);
                for (int i = val; i < val + 13; i++) {
                    String line = Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(i);
                    list[counter] = line;
                    counter++;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }


}
