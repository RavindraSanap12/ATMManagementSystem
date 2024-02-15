package bank.managemenmt.sysem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton hundread, fivehundread, thousand, twothousand, fivethousand, tenthousand, back;
    String pinnumber;
    FastCash(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        hundread = new JButton("RS 100");
        hundread.setBounds(170, 415, 150, 30);
        hundread.addActionListener(this);
        image.add(hundread);

        fivehundread = new JButton("RS 500");
        fivehundread.setBounds(355, 415, 150, 30);
        fivehundread.addActionListener(this);
        image.add(fivehundread);

        thousand = new JButton("RS 1000");
        thousand.setBounds(170, 450, 150, 30);
        thousand.addActionListener(this);
        image.add(thousand);

        twothousand = new JButton("RS 2000");
        twothousand.setBounds(355, 450, 150, 30);
        twothousand.addActionListener(this);
        image.add(twothousand);

        fivethousand = new JButton("RS 5000");
        fivethousand.setBounds(170, 485, 150, 30);
        fivethousand.addActionListener(this);
        image.add(fivethousand);

        tenthousand = new JButton("RS 10000");
        tenthousand.setBounds(355, 485, 150, 30);
        tenthousand.addActionListener(this);
        image.add(tenthousand);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);



    }
    public static void main(String args[])
    {
        FastCash f = new FastCash("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else
        {
            String amount = ((JButton)e.getSource()).getText().substring(3);
            JOptionPane.showMessageDialog(null, "RS " + amount + " Debited Sucessfully");

            Conn conn = new Conn();
           try
            {
             ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
              int balance = 0;
              while (rs.next())
              {
                   if(rs.getString("type").equals("Deposit"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else
                   {
                       balance -= Integer.parseInt(rs.getString("amount"));
                    }

                }
                if (e.getSource() != back && balance < Integer.parseInt("amount"))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
               String query = "insert into bank values ('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                conn.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "RS " + amount + "Debited Sucessfully");

                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
   }
}
