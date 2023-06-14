package FrontEnd;

import javax.swing.*;

import BackEnd.PeopleDB;
import BackEnd.PlaneDB;

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
    JPanel ticketCanPanel = new JPanel();
    JPanel planeCanPanel = new JPanel();

    //booleans for each page
    boolean bookPan = false;
    boolean guestPan = false;
    boolean manualPan = false;
    boolean ticketCanPan = false;
    boolean flightCanPan = false;

    public void mainWindow() {
        setLayout(new GridLayout(1, 1));
        setSize(1000, 800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p2.add(new JLabel(new ImageIcon("src/FrontEnd/Splash.png"))); //adds splash screen

        //MenuBar
        JMenuBar mb = new JMenuBar();
        JMenu bookings, guests, manuals, cancel;
        JMenuItem booking, guest, manual, ticketC, planeC;
        //Booking
        booking = new JMenuItem("Book Ticket ");
        booking.addActionListener(this);
        booking.setActionCommand("Book");
        bookings = new JMenu("Booking"); //dropping from
        //Flight info
        guest = new JMenuItem("Flight Info ");
        guest.addActionListener(this);
        guest.setActionCommand("Guest");
        guests = new JMenu("Ticket information"); //dropping from
        //Manual
        manual = new JMenuItem("User Manual ");
        manual.addActionListener(this);
        manual.setActionCommand("Manual");
        manuals = new JMenu("Manual Access"); //dropping from
        //Overall Cancel
        cancel = new JMenu("Cancellations");
        cancel.addActionListener(this);
        cancel.setActionCommand("Cancel");
        ticketC = new JMenuItem("Cancel Ticket"); //CANCEL TICKET
        ticketC.addActionListener(this);
        ticketC.setActionCommand("TicketCancel");
        planeC = new JMenuItem("Cancel Flight"); //CANCEL FLIGHT
        planeC.addActionListener(this);
        planeC.setActionCommand("FlightCancel");
        //Adding everything to menu bar
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

        setVisible(true); //make frame visible

        //Other buttons
        //Destination buttons in booking
        JButton jamaica = new JButton("Jamaica"); //jamaica
        jamaica.addActionListener(this);
        jamaica.setActionCommand("jam");
        JButton peru = new JButton("Peru"); //peru
        peru.addActionListener(this);
        peru.setActionCommand("per");
        JButton norway = new JButton("Norway"); //norway
        norway.addActionListener(this);
        norway.setActionCommand("nor");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Book")) {
            p2.removeAll();
            p2.add(bookPanel);
            bookPan = true;
            guestPan = false;
            manualPan = false;
            ticketCanPan = false;
            flightCanPan = false;
            BookingScreen();
        } else if (e.getActionCommand().equals("Guest")) {
            p2.removeAll();
            p2.add(guestPanel);
            bookPan = false;
            guestPan = true;
            manualPan = false;
            ticketCanPan = false;
            flightCanPan = false;
            GuestInfo();
        } else if (e.getActionCommand().equals("Manual")) {
            p2.removeAll();
            p2.add(manualPanel);
            bookPan = false;
            guestPan = false;
            manualPan = true;
            ticketCanPan = false;
            flightCanPan = false;
            DisplayManual();
        } else if (e.getActionCommand().equals("TicketCancel")) {
            p2.removeAll();
            p2.add(ticketCanPanel);
            bookPan = false;
            guestPan = false;
            manualPan = false;
            ticketCanPan = true;
            flightCanPan = false;
            DisplayCancellationTicket();
        } else if (e.getActionCommand().equals("FlightCancel")) {
            p2.removeAll();
            p2.add(planeCanPanel);
            bookPan = false;
            guestPan = false;
            manualPan = false;
            ticketCanPan = false;
            flightCanPan = true;
            DisplayCancellationTicket();
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
        bookPanel.setLayout(new GridLayout(4, 1));

        //make textfeald here and make the output become one of the args in the booking method
        JLabel flightIn = new JLabel("What is the flight number?");
        JTextField flightInput = new JTextField(3);
        JLabel seatIn = new JLabel("Which seat?");
        JTextField seatInput = new JTextField(2);

        JLabel firstNameIn = new JLabel("First Name:");
        JTextField firstNameInput = new JTextField(15);
        JLabel lastNameIn = new JLabel("Last Name:");
        JTextField LastNameInput = new JTextField(15);
        JLabel dobIn = new JLabel("Date of birth, dd mm format:");
        JTextField DOBInput = new JTextField(4);
        JLabel ageIn = new JLabel("Age:");
        JTextField AgeInput = new JTextField(3);
        JLabel phoneIn = new JLabel("Phone number:");
        JTextField PhoneInput = new JTextField(12);
        JLabel emailIn = new JLabel("Email:");
        JTextField emailInput = new JTextField(30);

        JPanel bookPI = new JPanel();
        JPanel bookNameI = new JPanel();
        JPanel bookAgeI = new JPanel();
        JPanel bookContactI = new JPanel();

        bookPI.add(flightIn);
        bookPI.add(flightInput);

        bookPI.add(seatIn);
        bookPI.add(seatInput);

        bookNameI.add(firstNameIn);
        bookNameI.add(firstNameInput);

        bookNameI.add(lastNameIn);
        bookNameI.add(LastNameInput);

        bookAgeI.add(dobIn);
        bookAgeI.add(DOBInput);

        bookAgeI.add(ageIn);
        bookAgeI.add(AgeInput);

        bookContactI.add(phoneIn);
        bookContactI.add(PhoneInput);

        bookContactI.add(emailIn);
        bookContactI.add(emailInput);
        JButton bookOkay = new JButton("OKAY");
        bookContactI.add(bookOkay);

        bookPanel.add(bookPI);
        bookPanel.add(bookNameI);
        bookPanel.add(bookAgeI);
        bookPanel.add(bookContactI);

        String flight = flightInput.toString();
        String seat = seatInput.toString(); 
        String[] infoArr = new String[6];// first name, last name, DOB, age, phone, email <- in that order

        infoArr[0] = firstNameInput.toString();
        infoArr[1] = LastNameInput.toString();
        infoArr[2] = DOBInput.toString();
        infoArr[3] = AgeInput.toString();
        infoArr[4] = PhoneInput.toString();
        infoArr[5] = emailInput.toString();

        int seatNum = 0;
        switch(seat){
            case "A1": seatNum =0;
            break;
            case "A2": seatNum =1;
            break;
            case "B1": seatNum = 2;
            break;
            case "B2": seatNum = 3;
            break;
            case "C1": seatNum = 4;
            break;
            case "C2": seatNum = 5;
            break;
            case "D1": seatNum = 6;
            break;
            case "D2": seatNum = 7;
            break;
            case "E1": seatNum = 8;
            break;
            case "E2": seatNum = 9;
            break;
            default: JOptionPane.showConfirmDialog(this, "that is not one of the seat numbers", "Error", JOptionPane.OK_OPTION); // make this refresh the screen
        }

        PlaneDB.bookSeat(flight, seatNum);
        PeopleDB.bookSeat(flight, seat, infoArr);
    }

    /**
     * Guest info.
     */
    public void GuestInfo() {
        repaint();
        guestPanel.setBackground(Color.WHITE);

        JLabel fc = new JLabel("What flight is being checked:");
        JTextField ffield = new JTextField(3);

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);


        guestPanel.add(fc);
        guestPanel.add(ffield);
        guestPanel.add(checkButton);

        
       String[] infoArr =  PeopleDB.findFlightInfo(ffield.toString());//this arr is full of all infor for the given flight number it is 80 big 
        String info = "";
       for(int i= 0; i<infoArr.length; i++){
            info = info + infoArr[i];
       }
    }


    /**
     * Display manuel.
     */
    public void DisplayManual() {
        repaint();
        manualPanel.setLayout(new FlowLayout());

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
        JTextArea manualTitle = new JTextArea("FLY AWAY AIRLINES USER MANUAL");
        manualTPan.add(manualTitle);
        manualTPan.add(new JLabel(new ImageIcon("src/FrontEnd/Logo.png")));


        //manual introduction
        manualIntroPan.setLayout(new FlowLayout());
        JTextArea introA = new JTextArea("Hello! Welcome to the Fly-Away Airlines Booking Application. " +
                "Below you will find explanations on each page and how to navigate the interface." +
                "At any point in time, feel free to visit another page by using the menu at the top. " +
                "If for any reason the page doesn't load, try clicking the once more. Have fun booking!");
        manualIntroPan.add(introA);


        //manual booking
        manualBooking.setLayout(new FlowLayout());
        JTextArea bookA = new JTextArea("*** WELCOME TO THE BOOKING EXPLANATION::");
        JTextArea bookB = new JTextArea("The booking page allows the admin to book a ticket for the passenger in question.");
        JTextArea bookC = new JTextArea("First you will be prompted 3 buttons with the destination you wish to travel to. " +
                "We fly round trips to Jamaica, Peru, and Norway using our 2 state of the art planes." +
                "Every weekend there is at least one flight running to each destination, so your passengers have tons of flexibility." +
                "Once you've selected the destination for your passenger, you will be shown a calendar offering all availible flights" +
                " to that location throughout the month of August 2023. Take a moment to ask the passenger which day they'd like to fly," +
                " then select it by pressing the button shown on that day." +
                "Next you will be shown a list of all available seats on the selected flight. We have 5 rows A through E, " +
                " and 2 seats per row. If a specific seat is not showing up, it has likely already been booked by another passenger.");
        JTextArea bookD = new JTextArea(" Now that the flight and seat have been chosen, a screen will pop up allowing you to type in the passengers deatails." +
                "Once you have filled all the fields, Press the button 'OKAY' to proceed. A screen will show up confirming the ticket was booked, " +
                "and you will be returned to the main page.");
        manualBooking.add(bookA);
        manualBooking.add(bookB);
        manualBooking.add(bookC);
        manualBooking.add(bookD);

        //manual flight info
        manualGuest.setLayout(new FlowLayout());
        JTextArea tickInfoA = new JTextArea(" *** WELCOME TO THE TICKET INFORMATION EXPLANATION::");
        JTextArea tickInfoB = new JTextArea("The ticket information page allows the admin to view all available information on each ticket for a selected flight.");
        JTextArea tickInfoC = new JTextArea("When you selected this page you will be asked what flight is being checked and prompted a textbox." +
                "Please fill this field in by typing in the flight code of the flight you are retrieving information for, then press the 'OKAY' button to proceed" +
                "From here, a list will print out showing each seat, and who has booked that seat along with their information.");

        manualGuest.add(tickInfoA);
        manualGuest.add(tickInfoB);
        manualGuest.add(tickInfoC);

        //ticket cancellation explanation
        manualCancelT.setLayout(new FlowLayout());
        JTextArea TCancelA = new JTextArea(" *** WELCOME TO TICKET CANCELLATION:");
        JTextArea TCancelB = new JTextArea("This page is used when a single passenger intends to cancel their ticket. They must provide their ticket information");
        JTextArea TCancelC = new JTextArea("On this screen, two text boxes are provided, one for flight and one for seat on this flight." +
                " In the flight box, please fill in the flight number of the ticket being cancelled. In the seat box, please fill in the seat number as [row][seat].");
        JTextArea TCancelD = new JTextArea("An example of this would be --> Flight: 214, Seat: D1");
        JTextArea TCancelE = new JTextArea("Once filled in, click 'OKAY' to proceed. A message should now pop up indicating that the ticket was successfully cancelled." +
                " If the selected seat was never booked, a different message will pop up prompting you to select a new seat.");

        manualCancelT.add(TCancelA);
        manualCancelT.add(TCancelB);
        manualCancelT.add(TCancelC);
        manualCancelT.add(TCancelD);
        manualCancelT.add(TCancelE);

        //plane cancellation explanation
        manualCancelF.setLayout(new FlowLayout());
        JTextArea FCancelA = new JTextArea(" *** WELCOME TO FLIGHT CANCELLATION:");
        JTextArea FCancelB = new JTextArea("This page is for when an entire flight needs to be cancelled. We must handle all the passengers on the flight.");
        JTextArea FCancelC = new JTextArea("First you will be provided a box for flight. In this box, please provide the flight number." +
                " Once flight is found, all seats will show up in a list as well as passenger information for each flight." +
                " Please use one of the buttons below this, to select if this information will sort alphabetically by passenger name, or by seat number" +
                "Once you've made all your selections press 'OKAY' to proceed and the information will pop up as necessary." +
                " Besisde each booked ticket will be a refund button and a rebook button. Determine what each passenger would like to do with their ticket." +
                " If refund is clicked, a pop up will appear confirming the refund. If rebook is clicked, the second half of the screen will prompt you to rebook.");

        manualCancelF.add(FCancelA);
        manualCancelF.add(FCancelB);
        manualCancelF.add(FCancelC);

    }


    /**
     * Display cancellation.
     */
    public void DisplayCancellationTicket() {
        //ticket cancel
        JTextField flightNumber = new JTextField(3);
        
        
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

    public void DisplayCancellationPlane(){
            
    }
}