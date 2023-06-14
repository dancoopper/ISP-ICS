package FrontEnd;

import BackEnd.PeopleDB;
import BackEnd.PlaneDB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


/**
 * The type Ui.
 */
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class UI extends JFrame implements ActionListener {
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
    private JButton bookOkay;
    private boolean bookOkayPressed;

    /**
     * Instantiates a new Ui.
     */
    public UI() {
        super("Fly Away Airlines");
    }
    public UI(int n) {

    }

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

    public void removal() {
        if (bookPan == true) {
            guestPanel.removeAll();
            manualPanel.removeAll();
            ticketCanPanel.removeAll();
            planeCanPanel.removeAll();
        }
        if (guestPan == true) {
            bookPanel.removeAll();
            manualPanel.removeAll();
            ticketCanPanel.removeAll();
            planeCanPanel.removeAll();
        }
        if (manualPan == true) {
            bookPanel.removeAll();
            guestPanel.removeAll();
            ticketCanPanel.removeAll();
            planeCanPanel.removeAll();
        }
        if (ticketCanPan == true) {
            bookPanel.removeAll();
            guestPanel.removeAll();
            manualPanel.removeAll();
            planeCanPanel.removeAll();
        }
        if (flightCanPan == true) {
            bookPanel.removeAll();
            guestPanel.removeAll();
            manualPanel.removeAll();
            ticketCanPanel.removeAll();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Book")) {
            p2.removeAll();
            bookPan = true;
            guestPan = false;
            manualPan = false;
            ticketCanPan = false;
            flightCanPan = false;
            removal();
            BookingScreen();
        } else if (e.getActionCommand().equals("Guest")) {
            p2.removeAll();
            bookPan = false;
            guestPan = true;
            manualPan = false;
            ticketCanPan = false;
            flightCanPan = false;
            removal();
            GuestInfo();
        } else if (e.getActionCommand().equals("Manual")) {
            p2.removeAll();
            bookPan = false;
            guestPan = false;
            manualPan = true;
            ticketCanPan = false;
            flightCanPan = false;
            removal();
            DisplayManual();
        } else if (e.getActionCommand().equals("TicketCancel")) {
            p2.removeAll();
            bookPan = false;
            guestPan = false;
            manualPan = false;
            ticketCanPan = true;
            flightCanPan = false;
            removal();
            DisplayCancellationTicket();
        } else if (e.getActionCommand().equals("FlightCancel")) {
            p2.removeAll();
            bookPan = false;
            guestPan = false;
            manualPan = false;
            ticketCanPan = false;
            flightCanPan = true;
            DisplayCancellationPlane();
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
        p2.add(bookPanel);
        bookPanel.setLayout(new GridLayout(4, 1));

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
        bookOkay = new JButton("OKAY");
        bookOkay.setActionCommand("BookOkay");
        bookContactI.add(bookOkay);
        bookOkay.addActionListener(e->{
            System.out.println("TEST");
            String flight = flightInput.getText();
            String seat = seatInput.getText();
            String[] infoArr = new String[6];// first name, last name, DOB, age, phone, email <- in that order

            infoArr[0] = firstNameInput.getText();
            infoArr[1] = LastNameInput.getText();
            infoArr[2] = DOBInput.getText();
            infoArr[3] = AgeInput.getText();
            infoArr[4] = PhoneInput.getText();
            infoArr[5] = emailInput.getText();

            int seatNum = 0;
            switch (seat.toString()) {
                case "A1":
                    seatNum = 0;
                    break;
                case "A2":
                    seatNum = 1;
                    break;
                case "B1":
                    seatNum = 2;
                    break;
                case "B2":
                    seatNum = 3;
                    break;
                case "C1":
                    seatNum = 4;
                    break;
                case "C2":
                    seatNum = 5;
                    break;
                case "D1":
                    seatNum = 6;
                    break;
                case "D2":
                    seatNum = 7;
                    break;
                case "E1":
                    seatNum = 8;
                    break;
                case "E2":
                    seatNum = 9;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "that is not one of the seat numbers", "Error", JOptionPane.WARNING_MESSAGE);
                    break;
            }
            PlaneDB.bookSeat(flight, seatNum);
            PeopleDB.bookSeat(flight, seat, infoArr);
            JOptionPane.showMessageDialog(this, "Flight " + flight + " was successfully booked." +
                    "Cost: $257.00 " + " Seat: " + seat + " on flight " + flight);
        });


        bookPanel.add(bookPI);
        bookPanel.add(bookNameI);
        bookPanel.add(bookAgeI);
        bookPanel.add(bookContactI);
    }


    /**
     * Guest info.
     */
    public void GuestInfo() {
        guestPanel.setBackground(Color.WHITE);
        repaint();
        p2.add(guestPanel);
        guestPanel.setLayout(new GridLayout(2,1 ));

        JPanel guestAsk = new JPanel();
        JLabel fc = new JLabel("What flight is being checked:");
        JTextField flightRetrieve = new JTextField(3);
        JButton guestOkay = new JButton("OKAY");
        guestOkay.setActionCommand("hi");

        JPanel guestDisplayAsk = new JPanel();
        JTextArea displayInfo = new JTextArea();
        displayInfo.setLineWrap(true);
        displayInfo.setColumns(100);
        displayInfo.setRows(20);

        guestPanel.add(guestAsk);
        guestPanel.add(guestDisplayAsk);

        guestAsk.add(fc);
        guestAsk.add(flightRetrieve);
        guestAsk.add(guestOkay);
        guestDisplayAsk.add(displayInfo);

        guestOkay.addActionListener(e->{
            String flightToCheck = flightRetrieve.getText();
            int flightInt = Integer.parseInt(flightToCheck);
            String[] infoArr = PeopleDB.findFlightInfo(flightToCheck); //this arr is full of all info for the given flight number it is 80 big
            if (flightInt >= 101 && flightInt <= 120 || flightInt >= 201 && flightInt <= 220) {

                displayInfo.setText("TICKET INFORMATION FOR FLIGHT " + flightToCheck + ": "+ Arrays.toString(infoArr));

            } else {
                JOptionPane.showMessageDialog(this, "That is not a valid flight number", "Error", JOptionPane.WARNING_MESSAGE);
                flightRetrieve.setText(" ");
            }
        });





    }


    /**
     * Display manuel.
     */
    public void DisplayManual() {
        repaint();
        p2.add(manualPanel);
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
        JTextArea manualTitle = new JTextArea("FLY AWAY AIRLINES USER MANUAL");
        manualTPan.add(manualTitle);
        //manualTPan.add(new JLabel(new ImageIcon("src/FrontEnd/Logo.png")));


        //manual introduction
        manualIntroPan.setLayout(new FlowLayout());
        JTextArea introA = new JTextArea("Hello! Welcome to the Fly-Away Airlines Booking Application. " +
                "Below you will find explanations on each page and how to navigate the interface." +
                "At any point in time, feel free to visit another page by using the menu at the top. " +
                "If for any reason the page doesn't load, try clicking the once more. Have fun booking!");
        introA.setLineWrap(true);
        manualIntroPan.add(introA);


        //manual booking
        manualBooking.setLayout(new FlowLayout());
        JTextArea bookA = new JTextArea("*** WELCOME TO THE BOOKING EXPLANATION::");
        JTextArea bookB = new JTextArea("The booking page allows the admin to book a ticket for the passenger in question.");
        bookB.setLineWrap(true);
        JTextArea bookC = new JTextArea("First you will be prompted 3 buttons with the destination you wish to travel to. " +
                "We fly round trips to Jamaica, Peru, and Norway using our 2 state of the art planes." +
                "Every weekend there is at least one flight running to each destination, so your passengers have tons of flexibility." +
                "Once you've selected the destination for your passenger, you will be shown a calendar offering all availible flights" +
                " to that location throughout the month of August 2023. Take a moment to ask the passenger which day they'd like to fly," +
                " then select it by pressing the button shown on that day." +
                "Next you will be shown a list of all available seats on the selected flight. We have 5 rows A through E, " +
                " and 2 seats per row. If a specific seat is not showing up, it has likely already been booked by another passenger.");
        bookC.setLineWrap(true);
        JTextArea bookD = new JTextArea(" Now that the flight and seat have been chosen, a screen will pop up allowing you to type in the passengers deatails." +
                "Once you have filled all the fields, Press the button 'OKAY' to proceed. A screen will show up confirming the ticket was booked, " +
                "and you will be returned to the main page.");
        bookD.setLineWrap(true);
        manualBooking.add(bookA);
        manualBooking.add(bookB);
        manualBooking.add(bookC);
        manualBooking.add(bookD);

        //manual flight info
        manualGuest.setLayout(new FlowLayout());
        JTextArea tickInfoA = new JTextArea(" *** WELCOME TO THE TICKET INFORMATION EXPLANATION::");
        JTextArea tickInfoB = new JTextArea("The ticket information page allows the admin to view all available information on each ticket for a selected flight.");
        tickInfoB.setLineWrap(true);
        JTextArea tickInfoC = new JTextArea("When you selected this page you will be asked what flight is being checked and prompted a textbox." +
                "Please fill this field in by typing in the flight code of the flight you are retrieving information for, then press the 'OKAY' button to proceed" +
                "From here, a list will print out showing each seat, and who has booked that seat along with their information.");
        tickInfoC.setLineWrap(true);
        manualGuest.add(tickInfoA);
        manualGuest.add(tickInfoB);
        manualGuest.add(tickInfoC);

        //ticket cancellation explanation
        manualCancelT.setLayout(new FlowLayout());
        JTextArea TCancelA = new JTextArea(" *** WELCOME TO TICKET CANCELLATION:");
        JTextArea TCancelB = new JTextArea("This page is used when a single passenger intends to cancel their ticket. They must provide their ticket information");
        TCancelB.setLineWrap(true);
        JTextArea TCancelC = new JTextArea("On this screen, two text boxes are provided, one for flight and one for seat on this flight." +
                " In the flight box, please fill in the flight number of the ticket being cancelled. In the seat box, please fill in the seat number as [row][seat].");
        TCancelC.setLineWrap(true);
        JTextArea TCancelD = new JTextArea("An example of this would be --> Flight: 214, Seat: D1");
        JTextArea TCancelE = new JTextArea("Once filled in, click 'OKAY' to proceed. A message should now pop up indicating that the ticket was successfully cancelled." +
                " If the selected seat was never booked, a different message will pop up prompting you to select a new seat.");
        TCancelE.setLineWrap(true);

        manualCancelT.add(TCancelA);
        manualCancelT.add(TCancelB);
        manualCancelT.add(TCancelC);
        manualCancelT.add(TCancelD);
        manualCancelT.add(TCancelE);

        //plane cancellation explanation
        manualCancelF.setLayout(new FlowLayout());
        JTextArea FCancelA = new JTextArea(" *** WELCOME TO FLIGHT CANCELLATION:");
        JTextArea FCancelB = new JTextArea("This page is for when an entire flight needs to be cancelled. We must handle all the passengers on the flight.");
        FCancelB.setLineWrap(true);
        JTextArea FCancelC = new JTextArea("First you will be provided a box for flight. In this box, please provide the flight number." +
                " Once flight is found, all seats will show up in a list as well as passenger information for each flight." +
                " Please use one of the buttons below this, to select if this information will sort alphabetically by passenger name, or by seat number" +
                "Once you've made all your selections press 'OKAY' to proceed and the information will pop up as necessary." +
                " Besisde each booked ticket will be a refund button and a rebook button. Determine what each passenger would like to do with their ticket." +
                " If refund is clicked, a pop up will appear confirming the refund. If rebook is clicked, the second half of the screen will prompt you to rebook.");
        FCancelC.setLineWrap(true);

        manualCancelF.add(FCancelA);
        manualCancelF.add(FCancelB);
        manualCancelF.add(FCancelC);

    }


    /**
     * Display cancellation.
     */
    public void DisplayCancellationTicket() {
        //ticket cancel
        p2.add(ticketCanPanel);
        ticketCanPanel.setBackground(Color.WHITE);
        repaint();
        JLabel flightAsk = new JLabel("What is the flight number:");
        JTextField flightNumber = new JTextField(3);
        ticketCanPanel.add(flightAsk);
        ticketCanPanel.add(flightNumber);

        JLabel seatAsk = new JLabel("What is the seat number?");
        JTextField seatNumber = new JTextField(2);
        ticketCanPanel.add(seatAsk);
        ticketCanPanel.add(seatNumber);

        JButton ticketOkay = new JButton("OKAY");
        ticketCanPanel.add(ticketOkay);

        ticketOkay.addActionListener(e-> {
            String flight = "";
            String sFlightNum = flightNumber.getText();
            if (Integer.parseInt(sFlightNum) < 101 || Integer.parseInt(sFlightNum) > 120 && Integer.parseInt(sFlightNum) < 201 || Integer.parseInt(sFlightNum) > 220) {
                JOptionPane.showMessageDialog(this, "THAT IS NOT A FLIGHT NUMBER");
            } else {
                flight = flightNumber.getText();
            }

            String seat = "";
            String sSeatNum = seatNumber.getText();
            if (sSeatNum.length() != 2) { //if seat number is wrong length
                seat = "";
                JOptionPane.showMessageDialog(this, "this is not a valid seat number 1");
            } else if (seatNumber.getText().charAt(1) != '1' && seatNumber.getText().charAt(1) != '2') {
                seat = "";
                JOptionPane.showMessageDialog(this, "this is not a valid seat number 2");
            } else if (seatNumber.getText().charAt(0) != 'A' && seatNumber.getText().charAt(0) != 'B' && seatNumber.getText().charAt(0) != 'C' && seatNumber.getText().charAt(0) != 'D' && seatNumber.getText().charAt(0) != 'E') {
                seat = "";
                JOptionPane.showMessageDialog(this, "this is not a valid seat number 3");
            } else {
                seat = seatNumber.getText();
            }

            PeopleDB.canncelSeat(flight, seat);

            JOptionPane.showMessageDialog(this, "Ticket was successfully cancelled", "Cancellation Confirmation", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    public void DisplayCancellationPlane() {
        //ticket cancel
        p2.add(planeCanPanel);
        planeCanPanel.setBackground(Color.WHITE);
        repaint();

        JLabel cancelAsk = new JLabel("What is the flight number:");
        JTextField cancelFlight = new JTextField(3);
        planeCanPanel.add(cancelAsk);
        planeCanPanel.add(cancelFlight);

        JButton planeOkay = new JButton("OKAY");
        planeCanPanel.add(planeOkay);

        planeOkay.addActionListener(e-> {
            PlaneDB.cancel(cancelFlight.getText());
            JOptionPane.showMessageDialog(this, "This plane was successfully cancelled", "Cancellation Confirmation", JOptionPane.INFORMATION_MESSAGE);

        });

    }
}