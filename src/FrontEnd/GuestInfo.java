package FrontEnd;

import BackEnd.PlaneDB;

public class GuestInfo {

    public static void sortFullName(int plane, String date){
        String[] list = PlaneDB.readFile(1, "24");
        
    }

    public static void sortSeatNum(int plane, String date){

    }

    public static String getFullName(String name){
        return name;
    }

    public static String getSeatNum(int seatNum){
        String something="";
        return something;
    }
    public static void setFullName(){
    }
    
    public static String toString(int num){
        String sNum = String.valueOf(num);
        return sNum;
    }
}
