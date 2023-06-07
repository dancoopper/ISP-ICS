package FrontEnd;
import BackEnd.PlaneDB;

import javax.swing.*;
import javax.swing.border.Border;
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
        setLayout(new GridLayout(1, 1));


        JMenuBar mb = new JMenuBar();
        JMenu cancel;
        JMenuItem booking, guest, manual, ticketC, planeC;


        booking = new JMenuItem("Book Ticket ");
        booking.addActionListener(this);
        booking.setActionCommand("Book");

        guest = new JMenuItem("Flight Info ");
        guest.addActionListener(this);
        guest.setActionCommand("Guest");

        manual = new JMenuItem("User Manual ");
        manual.addActionListener(this);
        manual.setActionCommand("Manual");

        cancel = new JMenu("Cancellations");
        //cancel.addActionListener(this);
        //cancel.setActionCommand("Cancel");

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

        if ( e.getActionCommand().equals("Book")) {
            BookingScreen();
        } else if ( e.getActionCommand().equals("Guest")) {
            GuestInfo();
        } else if ( e.getActionCommand().equals("Manual")) {
            DisplayManuel();
        } else if ( e.getActionCommand().equals("TicketCancel")) {
            p2.setBackground(Color.WHITE);
            repaint();
            System.out.println("ticket cancel");
        } else if ( e.getActionCommand().equals("FlightCancel")) {
            p2.setBackground(Color.WHITE);
            repaint();;
            System.out.println("flight Cancel");
        } else {
            p2.setBackground(Color.WHITE);
            repaint();
            System.out.println("something went wrong");
        }

    }


    /**
     * Booking screen.
     */
    public void BookingScreen(){

        p2.setBackground(Color.BLACK);
    }

    /**
     * Guest info.
     */
    public void GuestInfo(){
        p2.setBackground(Color.WHITE);

        //String flightcheck;
        JLabel fc = new JLabel("What flight is being checked:");
        JTextField ffield = new JTextField(3);

        //int seatcheck;
        JLabel sc = new JLabel("What seat number is being checked?");
        JTextField stext = new JTextField(2);

        //JButton

        p2.add(fc);
        p2.add(ffield);
        p2.add(sc);
        p2.add(stext);


        //flightcheck = ffield.getText();
        //String t = stext.getText();
        //seatcheck = Integer.parseInt(t);
        //repaint();

        //System.out.println(PlaneDB.isSeatBooked(flightcheck,seatcheck));
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
}