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
    public UI() {
        super("Fly Away Airlines");
    }

    public UI(int n) {

    }

    /**
     * Main window.
     */

    public static JPanel p2 = new JPanel(); //default panel for blank screen

    public void mainWindow() {
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(1, 1));

        //booleans for each page
        boolean bookPan = false;
        boolean guestPan = false;
        boolean manualPan = false;

        JPanel bookPanel = new JPanel();
        JPanel guestPanel = new JPanel();
        JPanel manualPanel = new JPanel();


        JMenuBar mb = new JMenuBar();
        JMenu bookings, guests, manuals, cancel;
        JMenuItem booking, guest, manual, ticketC, planeC;


        booking = new JMenuItem("Book Ticket ");
        booking.addActionListener(this);
        booking.setActionCommand("Book");
        bookings = new JMenu("Booking"); //dropping from
        JPanel bookingPanel = new JPanel();

        guest = new JMenuItem("Flight Info ");
        guest.addActionListener(this);
        guest.setActionCommand("Guest");
        guests = new JMenu("Ticket information"); //dropping from
        JPanel guestPanel = new JPanel();

        manual = new JMenuItem("User Manual ");
        manual.addActionListener(this);
        manual.setActionCommand("Manual");
        manuals = new JMenu("Manual Access"); //dropping from
        JPanel manualPanel = new JPanel();

        cancel = new JMenu("Cancellations");
        cancel.addActionListener(this);
        cancel.setActionCommand("Cancel");

        ticketC = new JMenuItem("Cancel Ticket");
        ticketC.addActionListener(this);
        ticketC.setActionCommand("TicketCancel");

        planeC = new JMenuItem("Cancel Flight");
        planeC.addActionListener(this);
        planeC.setActionCommand("FlightCancel");

        bookings.add(booking);
        mb.add(bookings);

        guests.add(guest);
        mb.add(guests);

        manuals.add(manual);
        mb.add(manuals);


        cancel.add(ticketC);
        cancel.add(planeC);
        mb.add(cancel);

        setJMenuBar(mb);
        add(p2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Book")) {
            BookingScreen();
        } else if (e.getActionCommand().equals("Guest")) {
            GuestInfo();
        } else if (e.getActionCommand().equals("Manual")) {
            DisplayManuel();
        } else if (e.getActionCommand().equals("TicketCancel")) {
            repaint();
            p2.setBackground(Color.WHITE);
            System.out.println("ticket cancel");
        } else if (e.getActionCommand().equals("FlightCancel")) {
            repaint();
            p2.setBackground(Color.WHITE);
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
    public void BookingScreen() {
        repaint();

        p2.setBackground(Color.BLACK);
    }

    /**
     * Guest info.
     */
    public void GuestInfo() {
        repaint();
        //JPanel guestPan = new JPanel();
        //remove(p2);
        //add(guestPan);
        p2.setBackground(Color.WHITE);

        JLabel fc = new JLabel("What flight is being checked:");
        JTextField ffield = new JTextField(3);

        JLabel sc = new JLabel("What seat number is being checked?");
        JTextField stext = new JTextField(2);

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);
              /*
                @Override
                public void actionPerformed(ActionEvent e) {
                    String flightCheck = ffield.getText();
                    int seatCheck = Integer.parseInt(stext.getText());

                    boolean isSeatBooked = PlaneDB.isSeatBooked(flightCheck, seatCheck);
                    if (isSeatBooked) {
                        JOptionPane.showMessageDialog(UI.this, "The seat is booked.");
                    } else {
                        JOptionPane.showMessageDialog(UI.this, "The seat is not booked.");
                    }
                }

            });
               */

        p2.add(fc);
        p2.add(ffield);
        p2.add(sc);
        p2.add(stext);
        p2.add(checkButton);
    }


    /**
     * Display manuel.
     */
    public void DisplayManuel() {
        repaint();

        p2.setBackground(Color.GRAY);
    }

    /**
     * Display cancellation.
     */
    public void DisplayCancellation() {

    }
}