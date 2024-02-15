package bank.managemenmt.sysem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signupone extends JFrame implements ActionListener {
    long random;
    JTextField nametextfield, fnametextfield, emailtextfield, addresstextfield, citytextfield, statetextfield, pintextfield;
    JButton button;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser date;
    Signupone()
    {
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("Application Form No : " + random);
        formno.setBounds(140, 20, 600, 40);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        add(formno);

        JLabel personaldeatails = new JLabel("Page 1 : Personal Details");
        personaldeatails.setBounds(290, 80, 400, 30);
        personaldeatails.setFont(new Font("Raleway", Font.BOLD, 22));
        add(personaldeatails);

        JLabel name = new JLabel("Name : ");
        name.setBounds(100, 140, 200, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        add(name);
        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        nametextfield.setBounds(300, 140, 400, 30);
        add(nametextfield);

        JLabel fname = new JLabel("Fathers Name : ");
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(fname);
        fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        fnametextfield.setBounds(300, 190, 400, 30);
        add(fnametextfield);


        JLabel dob = new JLabel("Date of Birth : ");
        dob.setBounds(100, 240, 400, 30);
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        add(dob);
        date = new JDateChooser();
        date.setBounds(300, 240, 400, 30);
        date.setForeground(new Color(105, 105, 105));
        add(date);


        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(100, 290, 200, 30);
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 60, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);



        JLabel email = new JLabel("Email Address : ");
        email.setBounds(100, 340, 200, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        add(email);
        emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        emailtextfield.setBounds(300, 340, 400, 30);
        add(emailtextfield);

        JLabel marital = new JLabel("Marital Status : ");
        marital.setBounds(100, 390, 200, 30);
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 60, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup marritalgroup = new ButtonGroup();
        marritalgroup.add(married);
        marritalgroup.add(unmarried);
        marritalgroup.add(other);


        JLabel address = new JLabel("Address : ");
        address.setBounds(100, 440, 200, 30);
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        add(address);
        addresstextfield = new JTextField();
        addresstextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        addresstextfield.setBounds(300, 440, 400, 30);
        add(addresstextfield);


        JLabel city = new JLabel("City : ");
        city.setBounds(100, 490, 200, 30);
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        add(city);
        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        citytextfield.setBounds(300, 490, 400, 30);
        add(citytextfield);


        JLabel state = new JLabel("State : ");
        state.setBounds(100, 540, 200, 30);
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        add(state);
        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        statetextfield.setBounds(300, 540, 400, 30);
        add(statetextfield);



        JLabel pincode = new JLabel("Pincode : ");
        pincode.setBounds(100, 590, 200, 30);
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pincode);
        pintextfield = new JTextField();
        pintextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        pintextfield.setBounds(300, 590, 400, 30);
        add(pintextfield);


        button = new JButton("Next");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.setBounds(620, 660, 80, 30);
        add(button);
        button.addActionListener(this);



        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

    }

    public static void main(String args[])
    {
        Signupone s = new Signupone();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = "" + random;
        String name = nametextfield.getText();
        String fname = fnametextfield.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected())
        {
            gender = "male";
        }
        else if (female.isSelected())
        {
            gender = "female";
        }
        String email = emailtextfield.getText();
        String marital = null;
        if (married.isSelected())
        {
            marital = "married";
        } else if (unmarried.isSelected())
        {
            marital = "unmarried";
        } else if (other.isSelected())
        {
            marital = "other";
        }
        String address = addresstextfield.getText();
        String city = citytextfield.getText();
        String state = statetextfield.getText();
        String pin = pintextfield.getText();

        try {
            if (name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values ('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new Signuptwo(formno).setVisible(true);
            }

        }
        catch (Exception ae)
        {
            System.out.println(ae);
        }

    }
}
