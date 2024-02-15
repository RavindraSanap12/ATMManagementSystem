package bank.managemenmt.sysem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardtextfield;
    JPasswordField pintextfield;

    Login()
    {
        setTitle("Automated Teller Machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);


        getContentPane().setBackground(Color.white);


        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);


        JLabel cardno = new JLabel("Card No");
        cardno.setBounds(120, 150, 150, 30);
        cardno.setFont(new Font("Raleway", Font.BOLD, 38));
        add(cardno);
        cardtextfield = new JTextField();
        cardtextfield.setBounds(300, 150, 230,30);
        add(cardtextfield);
        cardtextfield.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel pin = new JLabel("Pin");
        pin.setBounds(120, 220, 250, 30);
        pin.setFont(new Font("Osward", Font.BOLD, 38));
        add(pin);
        pintextfield = new JPasswordField();
        pintextfield.setBounds(300, 220, 230,30);
        add(pintextfield);
        pintextfield.setFont(new Font("Arial", Font.BOLD, 14));



        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        add(login);
        login.addActionListener(this);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        add(signup);
        signup.addActionListener(this);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);


        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        add(clear);
        clear.addActionListener(this);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);



        setLayout(null);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear)
        {
            cardtextfield.setText("");
            pintextfield.setText("");

        }
        else if (ae.getSource() == login)
        {
            Conn conn = new Conn();
            String cardnumber = cardtextfield.getText();
            String pinnumber = pintextfield.getText();
            String query ="select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
            try {
                conn.s.executeQuery(query);
                ResultSet rs = conn.s.executeQuery(query);

                if (rs.next())
                {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }


            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }

        }
        else if (ae.getSource() == signup)
        {
            setVisible(false);
            new Signupone().setVisible(true);
        }

    }


    public static void main (String[] args)
    {
        Login l = new Login();
    }


}
