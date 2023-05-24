package FrontEnd;

import BackEnd.PlaneDB;

public class GuestInfo {


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


    public static void sortFullName(int plane, String date) {
        String[] list = PlaneDB.readFile(1, "24");
        for(int i =0; i<list.length; i++){

        }
    }

    public static void sortSeatNum(int plane, String date) {

    }

    public static String getFullName(String name) {
        return name;
    }

    public static String getSeatNum(int seatNum) {
        String something = "";
        return something;
    }

    public static void setFullName() {
    }

    public static String toString(int num) {
        String sNum = String.valueOf(num);
        return sNum;
    }
}
