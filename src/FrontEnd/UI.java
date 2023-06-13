package FrontEnd;

import javax.swing.*;

import BackEnd.PeopleDB;

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
    JPanel bookPanel = new JPanel();
    JPanel guestPanel = new JPanel();
    JPanel manualPanel = new JPanel();

    public void mainWindow() {
        setLayout(new GridLayout(1, 1));
        Dimension screeDimension = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screeDimension.getWidth();
        double hight = screeDimension.getHeight();
        String sWidth =  String.valueOf(width);
        String sHight =  String.valueOf(hight);
        setSize(Integer.parseInt(sWidth),Integer.parseInt(sHight));
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p2.add(new JLabel(new ImageIcon("src/FrontEnd/Splash.png"))); //adds splash screen

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


        
        //make textfeald here and make the output become one of the args in the booking method

        JTextField flightInput = new JTextField();
        JTextField seatInput = new JTextField();
        
        JTextField firstNameInput = new JTextField();
        JTextField LastNameInput = new JTextField();
        JTextField DOBInput = new JTextField();
        JTextField AgeInput = new JTextField();
        JTextField PhoneInput = new JTextField();
        JTextField emailInput = new JTextField();

        String flight = flightInput.toString();
        String seat = seatInput.toString(); 
        String[] infoArr = new String[6];// first name, last name, DOB, age, phone, email <- in that order

        infoArr[0] = firstNameInput.toString();
        infoArr[1] = LastNameInput.toString();
        infoArr[2] = DOBInput.toString();
        infoArr[3] = AgeInput.toString();
        infoArr[4] = PhoneInput.toString();
        infoArr[5] = emailInput.toString();


       
        PeopleDB.bookSeat(flight, seat, infoArr);


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

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);


        p2.add(fc);
        p2.add(ffield);
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
        manualTPan.setBackground(Color.PINK);
        manualPanel.add(manualIntroPan);
        manualPanel.add(manualBooking);
        manualBooking.setBackground(Color.PINK);
        manualPanel.add(manualGuest);
        manualPanel.add(manualCancelT);
        manualCancelT.setBackground(Color.PINK);
        manualPanel.add(manualCancelF);

        //title section
        manualTPan.setLayout(new FlowLayout());
        JLabel manualTitle = new JLabel("FLY AWAY AIRLINES USER MANUAL");
        manualTPan.add(manualTitle);
        //manualTPan.add(new JLabel(new ImageIcon("src/FrontEnd/Logo.png")));


        //manual introduction
        manualIntroPan.setLayout(new FlowLayout());
        JLabel introA = new JLabel("Hello! Welcome to the Fly-Away Airlines Booking Application. " +
                "Below you will find explanations on each page and how to navigate the interface.");
        JLabel introB = new JLabel("At any point in time, feel free to visit another page by using the menu at the top. " +
                "If for any reason the page doesn't load, try clicking the once more. Have fun booking!");
        manualIntroPan.add(introA);
        manualIntroPan.add(introB);

        //manual booking
        manualBooking.setLayout(new FlowLayout());
        JLabel bookA = new JLabel("*** WELCOME TO THE BOOKING EXPLANATION::");
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
        manualGuest.setLayout(new FlowLayout());
        JLabel tickInfoA = new JLabel(" *** WELCOME TO THE TICKET INFORMATION EXPLANATION::");
        JLabel tickInfoB = new JLabel("The ticket information page allows the admin to view all available information on each ticket for a selected flight.");
        JLabel tickInfoC = new JLabel("When you selected this page you will be asked what flight is being checked and prompted a textbox." +
                "Please fill this field in by typing in the flight code of the flight you are retrieving information for, then press the 'OKAY' button to proceed");
        JLabel tickInfoD = new JLabel("From here, a list will print out showing each seat, and who has booked that seat along with their information.");

        manualGuest.add(tickInfoA);
        manualGuest.add(tickInfoB);
        manualGuest.add(tickInfoC);
        manualGuest.add(tickInfoD);

        //ticket cancellation explanation
        manualCancelT.setLayout(new FlowLayout());
        JLabel TCancelA = new JLabel(" *** WELCOME TO TICKET CANCELLATION:");
        JLabel TCancelB = new JLabel("This page is used when a single passenger intends to cancel their ticket. They must provide their ticket information");
        JLabel TCancelC = new JLabel("On this screen, two text boxes are provided, one for flight and one for seat on this flight." +
                " In the flight box, please fill in the flight number of the ticket being cancelled. In the seat box, please fill in the seat number as [row][seat].");
        JLabel TCancelD = new JLabel("An example of this would be --> Flight: 214, Seat: D1");
        JLabel TCancelE = new JLabel("Once filled in, click 'OKAY' to proceed. A message should now pop up indicating that the ticket was successfully cancelled." +
                " If the selected seat was never booked, a different message will pop up prompting you to select a new seat.");

        manualCancelT.add(TCancelA);
        manualCancelT.add(TCancelB);
        manualCancelT.add(TCancelC);
        manualCancelT.add(TCancelD);
        manualCancelT.add(TCancelE);

        //plane cancellation explanation
        manualCancelF.setLayout(new FlowLayout());
        JLabel FCancelA = new JLabel(" *** WELCOME TO FLIGHT CANCELLATION:");
        JLabel FCancelB = new JLabel("This page is for when an entire flight needs to be cancelled. We must handle all the passengers on the flight.");
        JLabel FCancelC = new JLabel("First you will be provided a box for flight. In this box, please provide the flight number." +
                " Once flight is found, all seats will show up in a list as well as passenger information for each flight." +
                " Please use one of the buttons below this, to select if this information will sort alphabetically by passenger name, or by seat number");
        JLabel FCancelD = new JLabel("Once you've made all your selections press 'OKAY' to proceed and the information will pop up as necessary." +
                " Besisde each booked ticket will be a refund button and a rebook button. Determine what each passenger would like to do with their ticket." +
                " If refund is clicked, a pop up will appear confirming the refund. If rebook is clicked, the second half of the screen will prompt you to rebook.");

        manualCancelF.add(FCancelA);
        manualCancelF.add(FCancelB);
        manualCancelF.add(FCancelC);
        manualCancelF.add(FCancelD);
    }


    /**
     * Display cancellation.
     */
    public void DisplayCancellation() {
        //ticket cancel 
        JTextField flightNumber = new JTextField();
        
        
        String flight = "";
        String sFlightNum = flightNumber.toString();
        if(Integer.parseInt(sFlightNum)<101|| Integer.parseInt(sFlightNum)>120&&Integer.parseInt(sFlightNum)<201||Integer.parseInt(sFlightNum)>220){
            System.out.println("THAT IS NOT A FLIGHT NUMBER");
        }else{
            flight = flightNumber.toString();
        }
        
        JTextField seatNumber = new JTextField();
        
        String seat = "";
        String sSeatNum = seatNumber.toString();
        if(sSeatNum.length()> 2){
            seat = "";
        }else if(((int)seatNumber.toString().charAt(1)) >2){
            seat = "";
        }else if(seatNumber.toString().charAt(0) != 'A'||seatNumber.toString().charAt(0) != 'B'||seatNumber.toString().charAt(0) != 'C'||seatNumber.toString().charAt(0) != 'E'){
            seat="";
        }else{
            seat= seatNumber.toString();
        }
        
        PeopleDB.canncelSeat(flight, seat);
    }
}