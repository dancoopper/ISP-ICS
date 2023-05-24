package FrontEnd;

import BackEnd.PlaneDB;

/**
 * The type Guest info.
 */
public class GuestInfo {


    /**
     * Alphabetical sort boolean.
     *
     * @param input1 the input 1
     * @param input2 the input 2
     * @return the boolean
     */
    public boolean alphabeticalSort(String input1, String input2) {
        if (input1.charAt(0) > input2.charAt(1)) {
            return true;
        } else if (input1.charAt(0) == input2.charAt(0)) {
            if (input1.length() > 1 && input2.length()>1) {
                input1 = input1.substring(1, input1.length());
                input2 = input2.substring(1, input2.length());

                alphabeticalSort(input1, input2);
            } else if (input1.length() == 1) {
                return false;
            } else if (input2.length() == 1) {
                return true;
            }

        }
        return false;
    }


    /**
     * Sort full name.
     *
     * @param plane the plane
     * @param date  the date
     */
    public static void sortFullName(int plane, String date) {
        String[] list = PlaneDB.readFile(1, "24");
        for(int i =0; i<list.length; i++){

        }
    }

    /**
     * Sort seat num.
     *
     * @param plane the plane
     * @param date  the date
     */
    public static void sortSeatNum(int plane, String date) {

    }

    /**
     * Gets full name.
     *
     * @param name the name
     * @return the full name
     */
    public static String getFullName(String name) {
        return name;
    }

    /**
     * Gets seat num.
     *
     * @param seatNum the seat num
     * @return the seat num
     */
    public static String getSeatNum(int seatNum) {
        String something = "";
        return something;
    }

    /**
     * Sets full name.
     */
    public static void setFullName() {
    }

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
}
