package FrontEnd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class UI extends JFrame implements ActionListener {
    public UI(){
        super("Fly Away Airlines");
    }
    public void mainWindow(){
        setSize(500,300);
        setVisible(true);
        setLayout(new GridLayout(4,0));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        GridLayout lay = new GridLayout(1,4);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.BLUE);
        p1.setLayout(lay);
        add(p1);

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
            case "Book" -> System.out.println("went to Book");
            case "Guest" -> System.out.println("went to Guest");
            case "Man" -> System.out.println("went to Manuel");
            case "Can" -> System.out.println("went to Cancel");
            default -> System.out.println("something went wrong");
        }
    }

    public static void SwitchWindow(String whatWin){

    }


    public static void BookingScreen(){

    }

    public static void DisplayManuel(){

    }

    public static void DisplayCancellation(){

    }

    public static void GuestInfo(){

    }
}
