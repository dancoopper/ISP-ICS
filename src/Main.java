import BackEnd.PeopleDB;
import BackEnd.PlaneDB;
import FrontEnd.UI;

import java.nio.file.Files;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        UI s = new UI();
        s.mainWindow();
        PeopleDB.canncelSeat("203", "C2");
    }
}