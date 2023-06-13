package BackEnd;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
    public static String toString(int num) {
        String sNum = String.valueOf(num);
        return sNum;
    }

    /**
     * Wright to file.
     *
     * @param info the info
     */
    public static void wrightToFile(String[] info) {

    }


    /**
     * Read file string [ ].
     *
     * @param witchPlane the witch plane
     * @param date       the date
     * @return the string [ ]
     */
    public static String[] readFile(int witchPlane, int date) {
        String[] s = new String[10];

        try {
            File fileObj = new File("src/BackEnd/PeopleData/primary");
            Scanner reader = new Scanner(fileObj);
            int counter = 0;
            while (reader.hasNextLine()) {
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


    public static void canncelSeat(String flight, String seat){
        HashMap<String, String> pplIndex = new HashMap<>();
        pplIndex.put("101", "1");
        pplIndex.put("102", "81");
        pplIndex.put("103", "161");
        pplIndex.put("104", "241");
        pplIndex.put("105", "321");
        pplIndex.put("106", "401");
        pplIndex.put("107", "481");
        pplIndex.put("108", "561");
        pplIndex.put("109", "641");
        pplIndex.put("110", "721");
        pplIndex.put("111", "801");
        pplIndex.put("112", "881");
        pplIndex.put("113", "961");
        pplIndex.put("114", "1041");
        pplIndex.put("115", "1121");
        pplIndex.put("116", "1201");
        pplIndex.put("117", "1281");
        pplIndex.put("118", "1361");
        pplIndex.put("119", "1441");
        pplIndex.put("120", "1521");
        pplIndex.put("201", "1601");
        pplIndex.put("202", "1681");
        pplIndex.put("203", "1761");
        pplIndex.put("204", "1841");
        pplIndex.put("205", "1921");
        pplIndex.put("206", "2001");
        pplIndex.put("207", "2081");
        pplIndex.put("208", "2161");
        pplIndex.put("209", "2241");
        pplIndex.put("210", "2321");
        pplIndex.put("211", "2401");
        pplIndex.put("212", "2481");
        pplIndex.put("213", "2561");
        pplIndex.put("214", "2641");
        pplIndex.put("215", "2721");
        pplIndex.put("216", "2801");
        pplIndex.put("217", "2881");
        pplIndex.put("218", "2961");
        pplIndex.put("219", "3041");
        pplIndex.put("220", "3121");

        HashMap<String, Integer> seatOffSets = new HashMap<>();
        seatOffSets.put("A1", 1);
        seatOffSets.put("A2", 9);
        seatOffSets.put("B1", 17);
        seatOffSets.put("B2", 25);
        seatOffSets.put("C1", 33);
        seatOffSets.put("C2", 41);
        seatOffSets.put("D1", 49);
        seatOffSets.put("D2", 57);
        seatOffSets.put("E1", 65);
        seatOffSets.put("E2", 73);
        try{
            File file = new File("src/BackEnd/PeopleData/testDB");
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            int currentLineNumber = 0;
            int iFlightNum = Integer.parseInt(pplIndex.get(flight));
            int index = iFlightNum + seatOffSets.get(seat);
            int lineNumber = index;
    
            String newLine = "";
            // Read each line and update the specified line
            while ((line = br.readLine()) != null) {
                currentLineNumber++;
                if (currentLineNumber == lineNumber+1 ) {
                    newLine = "first name:";
                    sb.append(newLine).append(System.lineSeparator());
                }else if(currentLineNumber == lineNumber+2){
                    newLine = "last name:";
                    sb.append(newLine).append(System.lineSeparator());
                }else if(currentLineNumber == lineNumber+3){
                    newLine ="DOB:";
                    sb.append(newLine).append(System.lineSeparator());
                }else if(currentLineNumber == lineNumber+4){
                    newLine = "age:";
                    sb.append(newLine).append(System.lineSeparator());
                }else if(currentLineNumber == lineNumber+5){
                    newLine = "phone:";
                    sb.append(newLine).append(System.lineSeparator());
                }else if(currentLineNumber== lineNumber+6){
                    newLine = "email:";
                    sb.append(newLine).append(System.lineSeparator());
                }else {
                    sb.append(line).append(System.lineSeparator());
                }
            }
            br.close();
    
            FileWriter writer = new FileWriter(file);
                writer.write(sb.toString());
                writer.close();
    
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void bookSeat(String flight, String seat, String[] info){
        HashMap<String, String> pplIndex = new HashMap<>();
        pplIndex.put("101", "1");
        pplIndex.put("102", "81");
        pplIndex.put("103", "161");
        pplIndex.put("104", "241");
        pplIndex.put("105", "321");
        pplIndex.put("106", "401");
        pplIndex.put("107", "481");
        pplIndex.put("108", "561");
        pplIndex.put("109", "641");
        pplIndex.put("110", "721");
        pplIndex.put("111", "801");
        pplIndex.put("112", "881");
        pplIndex.put("113", "961");
        pplIndex.put("114", "1041");
        pplIndex.put("115", "1121");
        pplIndex.put("116", "1201");
        pplIndex.put("117", "1281");
        pplIndex.put("118", "1361");
        pplIndex.put("119", "1441");
        pplIndex.put("120", "1521");
        pplIndex.put("201", "1601");
        pplIndex.put("202", "1681");
        pplIndex.put("203", "1761");
        pplIndex.put("204", "1841");
        pplIndex.put("205", "1921");
        pplIndex.put("206", "2001");
        pplIndex.put("207", "2081");
        pplIndex.put("208", "2161");
        pplIndex.put("209", "2241");
        pplIndex.put("210", "2321");
        pplIndex.put("211", "2401");
        pplIndex.put("212", "2481");
        pplIndex.put("213", "2561");
        pplIndex.put("214", "2641");
        pplIndex.put("215", "2721");
        pplIndex.put("216", "2801");
        pplIndex.put("217", "2881");
        pplIndex.put("218", "2961");
        pplIndex.put("219", "3041");
        pplIndex.put("220", "3121");

        HashMap<String, Integer> seatOffSets = new HashMap<>();
        seatOffSets.put("A1", 1);
        seatOffSets.put("A2", 9);
        seatOffSets.put("B1", 17);
        seatOffSets.put("B2", 25);
        seatOffSets.put("C1", 33);
        seatOffSets.put("C2", 41);
        seatOffSets.put("D1", 49);
        seatOffSets.put("D2", 57);
        seatOffSets.put("E1", 65);
        seatOffSets.put("E2", 73);

        /*
         * first name: +2
         * last name: +3
         * DOB: +4
         * age: +5
         * phone: +6
         * email: +7
         */
        String firstName = info[0];
        String lastName = info[1];
        String DOB = info[2];
        String age = info[3];
        String phone = info[4];
        String email = info[5];
        
        try{
        File file = new File("src/BackEnd/PeopleData/testDB");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;
        int currentLineNumber = 0;
        int iFlightNum = Integer.parseInt(pplIndex.get(flight));
        int index = iFlightNum + seatOffSets.get(seat);
        int lineNumber = index;

        String newLine = "";
        // Read each line and update the specified line
        while ((line = br.readLine()) != null) {
            currentLineNumber++;
            if (currentLineNumber == lineNumber+1 ) {
                newLine =line + firstName;
                sb.append(newLine).append(System.lineSeparator());
            }else if(currentLineNumber == lineNumber+2){
                newLine = line + lastName;
                sb.append(newLine).append(System.lineSeparator());
            }else if(currentLineNumber == lineNumber+3){
                newLine =line + DOB;
                sb.append(newLine).append(System.lineSeparator());
            }else if(currentLineNumber == lineNumber+4){
                newLine = line + age;
                sb.append(newLine).append(System.lineSeparator());
            }else if(currentLineNumber == lineNumber+5){
                newLine = line+ phone;
                sb.append(newLine).append(System.lineSeparator());
            }else if(currentLineNumber== lineNumber+6){
                newLine = line + email;
                sb.append(newLine).append(System.lineSeparator());
            }else {
                sb.append(line).append(System.lineSeparator());
            }
        }
        br.close();

        FileWriter writer = new FileWriter(file);
            writer.write(sb.toString());
            writer.close();

    } catch (IOException e) {
        e.printStackTrace();
    }
}


        


    
    

    /**
     * Find flight i nfo string.
     *
     * @param fight the fight
     * @return the string
     */
    public static String[] findFlightInfo(String fight) {
        HashMap<String, String> pplIndex = new HashMap<>();
        pplIndex.put("101", "1");
        pplIndex.put("102", "81");
        pplIndex.put("103", "161");
        pplIndex.put("104", "241");
        pplIndex.put("105", "321");
        pplIndex.put("106", "401");
        pplIndex.put("107", "481");
        pplIndex.put("108", "561");
        pplIndex.put("109", "641");
        pplIndex.put("110", "721");
        pplIndex.put("111", "801");
        pplIndex.put("112", "881");
        pplIndex.put("113", "961");
        pplIndex.put("114", "1041");
        pplIndex.put("115", "1121");
        pplIndex.put("116", "1201");
        pplIndex.put("117", "1281");
        pplIndex.put("118", "1361");
        pplIndex.put("119", "1441");
        pplIndex.put("120", "1521");
        pplIndex.put("201", "1601");
        pplIndex.put("202", "1681");
        pplIndex.put("203", "1761");
        pplIndex.put("204", "1841");
        pplIndex.put("205", "1921");
        pplIndex.put("206", "2001");
        pplIndex.put("207", "2081");
        pplIndex.put("208", "2161");
        pplIndex.put("209", "2241");
        pplIndex.put("210", "2321");
        pplIndex.put("211", "2401");
        pplIndex.put("212", "2481");
        pplIndex.put("213", "2561");
        pplIndex.put("214", "2641");
        pplIndex.put("215", "2721");
        pplIndex.put("216", "2801");
        pplIndex.put("217", "2881");
        pplIndex.put("218", "2961");
        pplIndex.put("219", "3041");
        pplIndex.put("220", "3121");
        String line = "";
        int index = Integer.parseInt(pplIndex.get(fight)) -1;
        String[] arr = new String[80];
        for(int i =0; i<80; i++){
            File fileObj = new File("src/BackEnd/PeopleData/testDB");
            try {
                line= Files.readAllLines(Paths.get(String.valueOf(fileObj))).get(index);
                arr[i] = line;
                index++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return arr;
    }

}
