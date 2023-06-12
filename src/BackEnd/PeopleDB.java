package BackEnd;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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


        public static String getPassengerDetails(String flightNumber, String seat) {
            String filePath = "src/BackEnd/PeopleData/testDB"; // Replace with the actual file path

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                String passengerDetails = "";
                boolean found = false;

                while ((line = reader.readLine()) != null) {
                    if (line.contains("flight: " + flightNumber) && line.contains("seat: " + seat)) {
                        found = true;
                    } else if (line.startsWith("flight: ")) {
                        found = false;
                    }
                    if (found && line.startsWith("first name:")) {
                        passengerDetails += line.substring(line.indexOf(':') + 1).trim() + "\n";
                    }
                    if (found && line.startsWith("last name:")) {
                        passengerDetails += line.substring(line.indexOf(':') + 1).trim() + "\n";
                    }
                    if (found && line.startsWith("DOB:")) {
                        passengerDetails += line.substring(line.indexOf(':') + 1).trim() + "\n";
                    }
                    if (found && line.startsWith("age:")) {
                        passengerDetails += line.substring(line.indexOf(':') + 1).trim() + "\n";
                    }
                    if (found && line.startsWith("phone:")) {
                        passengerDetails += line.substring(line.indexOf(':') + 1).trim() + "\n";
                    }
                    if (found && line.startsWith("email:")) {
                        passengerDetails += line.substring(line.indexOf(':') + 1).trim() + "\n";
                    }
                }

                return passengerDetails;
            } catch (IOException e) {
                e.printStackTrace();
                return "somthing went wrong";
            }
        }

        public static String findFlightINfo(String fight, String seat){

        return "oh no";
        }

}
