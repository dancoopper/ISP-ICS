package FrontEnd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Booking.
 */
public class Booking{

    /**
     * Booking.
     */
    public void Booking(){
        
    }

    /**
     * Flight loc string [ ].
     *
     * @param loc the loc
     * @return the string [ ]
     */
    public static String[] FlightLoc(String loc){//uses plane db
        String[] somthinG = {loc};
        return somthinG;
    }

    /**
     * Plane ave boolean.
     *
     * @param planeName the plane name
     * @return the boolean
     */
    public static boolean PlaneAve(String planeName){
        return true;
    }// gets from plane db

    /**
     * Book seat.
     *
     * @param seatNum the seat num
     */
    public static void bookSeat(String seatNum){//checks and then add to planedb and also people db

    }

    /**
     * To string string.
     *
     * @param num the num
     * @return the string
     */
    public static String toString(int num){
        String sNum = String.valueOf(num);
        return sNum;
    }
}
