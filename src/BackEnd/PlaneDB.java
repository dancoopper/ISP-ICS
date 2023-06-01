package BackEnd;


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
     * @param place      the place
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
     * @param flightNum the witch plane
     * @param seatNum  the somehting
     * @return the string [ ]
     */
    public static boolean isSeatBooked(String flightNum, int seatNum) {
        String[] list = new String[13];
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

        try {
            int nFlightNum = Integer.parseInt(flightNum);
            if (nFlightNum < 121 && nFlightNum > 100) {
                File fileObj = new File("src/BackEnd/PlaneData/primary");
                String line = Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(seatNum);
                if(line.charAt(line.length()) == 'y'){
                    return false;
                }
            } else if (nFlightNum < 221 && nFlightNum > 200) {
                File fileObj = new File("src/BackEnd/PlaneData/secondary");
                String line = Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(seatNum);
                if(line.charAt(line.length()) == 'y'){
                    return false;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
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
