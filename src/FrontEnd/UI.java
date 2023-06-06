package FrontEnd;
import BackEnd.PlaneDB;

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
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 1));


        JMenuBar mb = new JMenuBar();
        JMenu booking, guest, manual, cancel;
        JMenuItem ticketC, planeC;

        booking = new JMenu("Book Ticket");
        booking.addActionListener(this);
        booking.setActionCommand("Book");

        guest = new JMenu("Flight Info");
        guest.addActionListener(this);
        guest.setActionCommand("Guest");

        manual = new JMenu("User Manual");
        manual.addActionListener(this);
        manual.setActionCommand("Manual");

        cancel = new JMenu("Cancellations");
        cancel.addActionListener(this);
        cancel.setActionCommand("Cancel");

        ticketC = new JMenuItem("Cancel Ticket");
        ticketC.addActionListener(this);
        ticketC.setActionCommand("TicketCancel");

        planeC = new JMenuItem("Cancel Flight");
        planeC.addActionListener(this);
        planeC.setActionCommand("FlightCancel");


        mb.add(booking);
        mb.add(guest);
        mb.add(manual);
        mb.add(cancel);
        cancel.add(ticketC);
        cancel.add(planeC);
        setJMenuBar(mb);
        add(p2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sE = e.getActionCommand();

        switch (sE) {
            case "Book" :
                //BookingScreen();
                System.out.println("hi");
            break;
            case "Guest" : System.out.println(PlaneDB.isSeatBooked("201", 2));
            break;
            case "Manual" : DisplayManuel();
            break;
            case "Cancel" : System.out.println(PlaneDB.isSeatBooked("201", 6));
            break;
            default : System.out.println("something went wrong");
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
