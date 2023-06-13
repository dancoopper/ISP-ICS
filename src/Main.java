import BackEnd.PeopleDB;
import BackEnd.PlaneDB;
import FrontEnd.UI;

import java.nio.file.Files;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        //UI s = new UI();
        //s.mainWindow();

        //System.out.print(Arrays.toString(PeopleDB.findFlightInfo("103")));
        /*
         * first name: +2
         * last name: +3
         * DOB: +4
         * age: +5
         * phone: +6
         * email: +7
         */

         String[] info = {"bob", "last", "05/7/2005", "6", "647-222-2222", "google@google.com"};
         PeopleDB.bookSeat("203", "C2", info);

    }
}