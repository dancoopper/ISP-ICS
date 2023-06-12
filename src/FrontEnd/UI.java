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

    /**
     * Instantiates a new Ui.
     *
     * @param n the n
     */
    public UI(int n) {

    }

    /**
     * Main window.
     */
    public static JPanel p2 = new JPanel(); //default panel for blank screen
    /**
     * The Book panel.
     */
    JPanel bookPanel = new JPanel();
    /**
     * The Guest panel.
     */
    JPanel guestPanel = new JPanel();
    /**
     * The Manual panel.
     */
    JPanel manualPanel = new JPanel();

    /**
     * Main window.
     */
    public void mainWindow() {
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(1, 1));

        //booleans for each page
        boolean bookPan = false;
        boolean guestPan = false;
        boolean manualPan = false;



        JMenuBar mb = new JMenuBar();
        JMenu bookings, guests, manuals, cancel;
        JMenuItem booking, guest, manual, ticketC, planeC;


        booking = new JMenuItem("Book Ticket ");
        booking.addActionListener(this);
        booking.setActionCommand("Book");
        bookings = new JMenu("Booking"); //dropping from

        guest = new JMenuItem("Flight Info ");
        guest.addActionListener(this);
        guest.setActionCommand("Guest");
        guests = new JMenu("Ticket information"); //dropping from

        manual = new JMenuItem("User Manual ");
        manual.addActionListener(this);
        manual.setActionCommand("Manual");
        manuals = new JMenu("Manual Access"); //dropping from

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
            DisplayManual();
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
    public void DisplayManual() {
        repaint();
        remove(p2);
        add(manualPanel);
        manualPanel.setLayout(new GridLayout(6, 1));

        manualPanel.setBackground(Color.GRAY);

        //sections of manual
        JPanel manualTPan = new JPanel(); //title panel for manual
        JPanel manualIntroPan = new JPanel(); //intro panel for manual
        JPanel manualBooking = new JPanel(); //booking explanation panel for manual
        JPanel manualGuest = new JPanel(); //ticket information explanation panel for manual
        JPanel manualCancelT = new JPanel(); //ticket cancellation panel for manual
        JPanel manualCancelF = new JPanel(); //flight cancellation panel for manual

        //adding sections
        manualPanel.add(manualTPan);
        manualPanel.add(manualIntroPan);
        manualPanel.add(manualBooking);
        manualPanel.add(manualGuest);
        manualPanel.add(manualCancelT);
        manualPanel.add(manualCancelF);

        //title section
        JLabel manualTitle = new JLabel("Fly-Away Airlines User Manual");
        manualTPan.add(manualTitle);

        //manual introduction
        JLabel introA = new JLabel("Hello! Welcome to the Fly-Away Airlines Booking Application. " +
                "Below you will find explanations on each page and how to navigate the interface.");
        JLabel introB = new JLabel("At any point in time, feel free to visit another page by using the menu at the top. " +
                "If for any reason the page doesn't load, try clicking the once more. Have fun booking!");
        manualIntroPan.add(introA);
        manualIntroPan.add(introB);

        //manual booking
        JLabel bookA = new JLabel("*** Welcome to the booking explanation:");
        JLabel bookB = new JLabel("The booking page allows the admin to book a ticket for the passenger in question.");
        JLabel bookC = new JLabel("First you will be prompted 3 buttons with the destination you wish to travel to. " +
                "We fly round trips to Jamaica, Peru, and Norway using our 2 state of the art planes." +
                "Every weekend there is at least one flight running to each destination, so your passengers have tons of flexibility.");
        JLabel bookD = new JLabel("Once you've selected the destination for your passenger, you will be shown a calendar offering all availible flights" +
                " to that location throughout the month of August 2023. Take a moment to ask the passenger which day they'd like to fly," +
                " then select it by pressing the button shown on that day.");
        JLabel bookE = new JLabel("Next you will be shown a list of all available seats on the selected flight. We have 5 rows A through E, " +
                " and 2 seats per row. If a specific seat is not showing up, it has likely already been booked by another passenger.");
        JLabel bookF = new JLabel(" Now that the flight and seat have been chosen, a screen will pop up allowing you to type in the passengers deatails." +
                "Once you have filled all the fields, Press the button 'OKAY' to proceed. A screen will show up confirming the ticket was booked, " +
                "and you will be returned to the main page.");
        manualBooking.add(bookA);
        manualBooking.add(bookB);
        manualBooking.add(bookC);
        manualBooking.add(bookD);
        manualBooking.add(bookE);
        manualBooking.add(bookF);

        //manual flight info
        JLabel tickInfoA = new JLabel(" *** Welcome to the the ticket information explanation:");
        JLabel tickInfoB = new JLabel("The ticket information page allows the admin to view all available information on each ticket for a selected flight.");
        JLabel tickInfoC = new JLabel("When you selected this page you will be asked what flight is being checked and prompted a textbox." +
                "Please fill this field in by typing in the flight code of the flight you are retrieving information for, then press the 'OKAY' button to proceed");
        JLabel tickInfoD = new JLabel("From here, a list will print out showing each seat, and who has booked that seat along with their information.");

        manualGuest.add(tickInfoA);
        manualGuest.add(tickInfoB);
        manualGuest.add(tickInfoC);
        manualGuest.add(tickInfoD);



    }

    /**
     * Display cancellation.
     */
    public void DisplayCancellation() {

    }
}