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
            String line = "";
            int lineNo;
            try {
                File f = new File("c:/file.txt");
                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                LineNumberReader lnr = new LineNumberReader(new FileReader(f));
                lnr.setLineNumber(4);
                for (int i = 1; i < lnr.getLineNumber(); i++) {
                    bw.newLine();
                }
                bw.close();
                lnr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (whichPlane == planeTwo) {
            String filePath = "src/BackEnd/PeopleData/secondary";
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
     * @param seatNum   the somehting
     * @return the string [ ]
     */
    public static boolean bookSeat(String flightNum, int seatNum) {
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

        String[] seatsArr = {"A1", "A2", "B1", "B2", "C1", "C2", "E1", "E2"};

        int nFlightNum = Integer.parseInt(flightNum);
        if (nFlightNum < 121 && nFlightNum > 100) {
            try {
                // Read the existing file
                File file = new File("src/BackEnd/PlaneData/primary");
                BufferedReader br = new BufferedReader(new FileReader(file));
                StringBuilder sb = new StringBuilder();
                String line;
                int currentLineNumber = 0;

                int lineNumber = plane1Index.get(flightNum) + 2 + seatNum;
                String newLine = "";

                // Read each line and update the specified line
                while ((line = br.readLine()) != null) {
                    currentLineNumber++;
                    if (currentLineNumber == lineNumber) {
                        if (line.charAt((line.length() - 1)) == 'N') {
                            newLine = seatsArr[seatNum] + ": Y";
                        } else if (line.charAt((line.length() - 1)) == 'Y') {
                            newLine = seatsArr[seatNum] + ": N";
                        }
                        sb.append(newLine).append(System.lineSeparator());
                    } else {
                        sb.append(line).append(System.lineSeparator());
                    }
                }
                br.close();

                // Write the updated content back to the file
                FileWriter writer = new FileWriter(file);
                writer.write(sb.toString());
                writer.close();

                System.out.println("Line " + lineNumber + " edited successfully.");
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (nFlightNum < 221 && nFlightNum > 200) {
            int val = plane2Index.get(flightNum);
            int place = 1 + seatNum + val;
            String line = "";
            int lineNo;
            try {
                File f = new File("src/BackEnd/PlaneData/secondary");
                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                LineNumberReader lnr = new LineNumberReader(new FileReader(f));
                lnr.setLineNumber(place);
                for (int i = 1; i < lnr.getLineNumber(); i++) {
                    bw.newLine();
                }
                bw.write("Hello World");
                bw.close();
                lnr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * Cancel.
     *
     * @param flight the flight
     */
    public static void cancel(String flight) {
        HashMap<String, Integer> planeAvailIndex = new HashMap<>();
        planeAvailIndex.put("101", 1);
        planeAvailIndex.put("102", 2);
        planeAvailIndex.put("103", 3);
        planeAvailIndex.put("104", 4);
        planeAvailIndex.put("105", 5);
        planeAvailIndex.put("106", 6);
        planeAvailIndex.put("107", 7);
        planeAvailIndex.put("108", 8);
        planeAvailIndex.put("109", 9);
        planeAvailIndex.put("110", 10);
        planeAvailIndex.put("111", 11);
        planeAvailIndex.put("112", 12);
        planeAvailIndex.put("113", 13);
        planeAvailIndex.put("114", 14);
        planeAvailIndex.put("115", 15);
        planeAvailIndex.put("116", 16);
        planeAvailIndex.put("117", 17);
        planeAvailIndex.put("118", 18);
        planeAvailIndex.put("119", 19);
        planeAvailIndex.put("120", 20);
        planeAvailIndex.put("201", 21);
        planeAvailIndex.put("202", 22);
        planeAvailIndex.put("203", 23);
        planeAvailIndex.put("204", 24);
        planeAvailIndex.put("205", 25);
        planeAvailIndex.put("206", 26);
        planeAvailIndex.put("207", 27);
        planeAvailIndex.put("208", 28);
        planeAvailIndex.put("209", 29);
        planeAvailIndex.put("210", 30);
        planeAvailIndex.put("211", 31);
        planeAvailIndex.put("212", 32);
        planeAvailIndex.put("213", 33);
        planeAvailIndex.put("214", 34);
        planeAvailIndex.put("215", 35);
        planeAvailIndex.put("216", 36);
        planeAvailIndex.put("217", 37);
        planeAvailIndex.put("218", 38);
        planeAvailIndex.put("219", 39);
        planeAvailIndex.put("220", 40);


        try {
            // Read the existing file
            File file = new File("src/BackEnd/PlaneData/book_avail");
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            int currentLineNumber = 0;

            int lineNumber = planeAvailIndex.get(flight);

            String newLine = "";
            // Read each line and update the specified line
            while ((line = br.readLine()) != null) {
                currentLineNumber++;
                if (currentLineNumber == lineNumber && currentLineNumber < 40) {
                    newLine = line;
                    char[] cNew = newLine.toCharArray();
                    cNew[newLine.length() - 1] = '-';
                    newLine = "";
                    for (int i = 0; i < cNew.length; i++) {
                        newLine = newLine + cNew[i];
                    }
                    sb.append(newLine).append(System.lineSeparator());
                } else {
                    sb.append(line).append(System.lineSeparator());
                }
            }
            br.close();

            // Write the updated content back to the file
            FileWriter writer = new FileWriter(file);
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Is seat booked boolean.
     *
     * @param flightNum the flight num
     * @param seatNum   the seat num
     * @return the boolean
     */
    public static boolean isSeatBooked(String flightNum, int seatNum) {
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
                int math = plane1Index.get(flightNum) + 1 + seatNum;
                String line = Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(math);
                if (line.charAt(line.length() - 1) == 'Y') {
                    return true;
                }
            } else if (nFlightNum < 221 && nFlightNum > 200) {
                File fileObj = new File("src/BackEnd/PlaneData/secondary");
                int math = plane2Index.get(flightNum) + 1 + seatNum;
                String line = Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(math);
                if (line.charAt(line.length() - 1) == 'Y') {
                    return true;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
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
            File fileObj1 = new File("src/BackEnd/PlaneData/primary");
            if (nFlightNum < 121 && nFlightNum > 100) {
                int counter = 0;
                int val = plane1Index.get(flightNum);
                for (int i = val; i < val + 13; i++) {
                    String line = Files.readAllLines(Paths.get(String.valueOf(fileObj1))).get(i);
                    list[counter] = line;
                    counter++;
                }

            } else if (nFlightNum < 221 && nFlightNum > 200) {
                File fileObj2 = new File("src/BackEnd/PlaneData/secondary");
                int counter = 0;
                int val = plane2Index.get(flightNum);
                for (int i = val; i < val + 13; i++) {
                    String line = Files.readAllLines(Paths.get(String.valueOf(fileObj2))).get(i);
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
