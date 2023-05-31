package FrontEnd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Ui.
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class UI extends JFrame implements ActionListener {
    /**
     * Instantiates a new Ui.
     */
    public UI(){
        super("Fly Away Airlines");
    }
    public UI(int n){

    }
    /**
     * Main window.
     */

    public static JPanel p2 = new JPanel();
    public void mainWindow(){
        setSize(500,300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //GridLayout lay = new GridLayout(1,4);


        JPanel p1 = new JPanel();
        p1.setBackground(Color.BLUE);
        p1.setLayout(new FlowLayout());


        JPanel BIG = new JPanel();
        BIG.add(p1);
        BIG.add(p2);
        add(BIG);

        JButton b1 = new JButton("go to booking");
        b1.addActionListener(this);
        b1.setActionCommand("Book");
        p1.add(b1);

        JButton b2 = new JButton("go to guest");
        b2.addActionListener(this);
        b2.setActionCommand("Guest");
        p1.add(b2);

        JButton b3 = new JButton("go to Manuel");
        b3.addActionListener(this);
        b3.setActionCommand("Man");
        p1.add(b3);

        JButton b4 = new JButton("go to Cancel");
        b4.addActionListener(this);
        b4.setActionCommand("Can");
        p1.add(b4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sE = e.getActionCommand();
        switch (sE) {
            case "Book" : BookingScreen();
            break;
            case "Guest" : System.out.println("went to Guest");
            break;
            case "Man" : DisplayManuel();
            break;
            case "Can" : System.out.println("went to Cancel");
            break;
            default : System.out.println("something went wrong");
        }
    }

    /**
     * Switch window.
     *
     * @param whatWin the  window it is switching to
     */
    public void SwitchWindow(String whatWin){
        switch (whatWin){
            case "main": mainWindow();
            break;
            case "booking": BookingScreen();
            break;
            case "can": DisplayCancellation();
            break;
            case "man": DisplayManuel();
            break;
            case "guest": GuestInfo();
            break;
            default: mainWindow();
        }
    }


    /**
     * Booking screen.
     */
    public void BookingScreen(){
        p2.setBackground(Color.BLACK);
    }

    /**
     * Display manuel.
     */
    public void DisplayManuel(){
        p2.setBackground(Color.GRAY);
    }

    /**
     * Display cancellation.
     */
    public void DisplayCancellation(){

    }

    /**
     * Guest info.
     */
    public void GuestInfo(){

    }
}
