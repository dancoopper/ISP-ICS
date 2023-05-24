package FrontEnd;

/**
 * The type Cancellation.
 */
public class Cancellation {


    /**
     * Search name string [ ].
     *
     * @param Name the name
     * @return the string [ ]
     */
    public static String[] SearchName(String Name){
        String[] something = {Name};
        return something;
    }

    /**
     * Search seat string [ ].
     *
     * @param seat the seat
     * @return the string [ ]
     */
    public static String[] SearchSeat(String seat){
        String[] something = {seat};
        return something;
    }

    /**
     * Search flight string [ ].
     *
     * @param place    the place
     * @param somthing the somthing
     * @return the string [ ]
     */
    public static String[] SearchFlight(String place, int somthing){
        String[] something = {place};
        return something;
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
