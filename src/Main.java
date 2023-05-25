import BackEnd.PeopleDB;
import BackEnd.PlaneDB;
import FrontEnd.UI;

public class Main {
    public static void main(String[] args){
        //FrontEnd.UI mainObj = new UI();
        //mainObj.mainWindow();

        String[] s =  PlaneDB.readFile(1, "test");
        String[] p = PeopleDB.readFile(1,"something");
        System.out.println("PLANE DB");
        for(int i =0; i<s.length; i++){
            System.out.println(s[i]);
        }
        System.out.println("PEOPLE DB");
        for(int j = 0; j<p.length; j++){
            System.out.println(p[j]);
        }
    }
}
