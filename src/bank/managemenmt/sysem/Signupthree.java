package bank.managemenmt.sysem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signupthree extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    Signupthree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 30, 400, 40);
        add(l1);

        JLabel acctype = new JLabel("Account Type");
        acctype.setFont(new Font("Raleway", Font.BOLD, 22));
        acctype.setBounds(100, 100, 200, 30);
        add(acctype);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 145, 250, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Diposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 145, 250, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 185, 250, 20);
        add(r3);

        r4 = new JRadioButton("Reccuring Diposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 185, 250, 20);
        add(r4);

        ButtonGroup b1 = new ButtonGroup();
        b1.add(r1);
        b1.add(r2);
        b1.add(r3);
        b1.add(r4);

        JLabel cardno = new JLabel("Card Number");
        cardno.setFont(new Font("Raleway", Font.BOLD, 22));
        cardno.setBounds(100, 240, 200, 30);
        add(cardno);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 240, 300, 30);
        add(number);
        JLabel cardnumber = new JLabel("Your 16 digit card Number");
        cardnumber.setFont(new Font("Raleway", Font.BOLD, 12));
        cardnumber.setBounds(100, 270, 300, 20);
        add(cardnumber);

        JLabel pin = new JLabel("Pin Number");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 320, 200, 30);
        add(pin);
        JLabel pnumber = new JLabel("Your 4 digit pin");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 12));
        pnumber.setBounds(100, 350, 300, 20);
        add(pnumber);

        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnumber.setBounds(330, 320, 300, 30);
        add(pinnumber);


        JLabel servic = new JLabel("Services Required :");
        servic.setFont(new Font("Raleway", Font.BOLD, 22));
        servic.setBounds(100, 400, 400, 30);
        add(servic);

        c1 = new JCheckBox("ATM CArd");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 440, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 440, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 480, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email and sms Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 480, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 520, 200, 30);
        add(c5);

        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 520, 200, 30);
        add(c6);

        c7 = new JCheckBox("I Hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 570, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 620, 100, 30);
        add(submit);
        submit.addActionListener(this);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 620, 100, 30);
        add(cancel);
        cancel.addActionListener(this);



        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String args[])
    {
        Signupthree s = new Signupthree("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit)
        {
        String accounttype = null;
        if (r1.isSelected())
        {
            accounttype = "Saving Account";
        }
        else if (r2.isSelected())
        {
            accounttype = "Fixed Diposit Account";
        }
        else if (r3.isSelected())
        {
            accounttype = "Current Account";
        }
        else if (r4.isSelected())
        {
            accounttype = "Reccuring Diposit Account";
        }
        Random random = new Random();
        String cnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
        String pnumber =  "" + Math.abs((random.nextLong() % 9000L) + 1000L);
        String facility = "";
        if (c1.isSelected())
        {
            facility = facility + " ATM Card";
        }
        if (c2.isSelected())
        {
            facility = facility + " Internet Banking";
        }
        if (c3.isSelected())
        {
            facility = facility + " Mobile Banking";
        }
        if (c4.isSelected())
        {
            facility = facility + " Email and sms alerts";
        }
        if (c5.isSelected())
        {
            facility = facility + " Cheque Book";
        }
        if (c6.isSelected())
        {
            facility = facility + " E Statement";
        }

            try
            {
                if (accounttype.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Account type is Required");
                }
                else
                {
                    if (c7.isSelected() == true) {
                        Conn con = new Conn();
                        String query = "insert into signupthree values ('" + formno + "', '" + accounttype + "', '" + cnumber + "', '" + pnumber + "', '" + facility + "')";
                        String query2 = "insert into login values ('" + formno + "', '" + cnumber + "', '" + pnumber + "')";
                        con.s.executeUpdate(query);
                        con.s.executeUpdate(query2);
                        JOptionPane.showMessageDialog(null, "card Number : " + cnumber + " \n Pin : " + pnumber);
                        setVisible(false);
                        new Deposit(pnumber).setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Make sure that information is corrrect by thick on Checkbox");
                    }
                }
            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }
        }
        else if (e.getSource() == cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
}
