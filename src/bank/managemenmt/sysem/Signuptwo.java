package bank.managemenmt.sysem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signuptwo extends JFrame implements ActionListener {

    JTextField pantextfield, aadhartextfield;
    JButton button;
    JRadioButton yes, no, eayes, eano;
    String formno;
    JComboBox religioncombobox, categorycombobox, incomecombobox, qualificationcombobox, occuputioncombobox;
     Signuptwo(String formno)
    {
        this.formno = formno;
        setLayout(null);
        setTitle("New Account Application Form Page 2");

        JLabel additionalldeatails = new JLabel("Page 2 : Additional Details");
        additionalldeatails.setBounds(290, 80, 400, 30);
        additionalldeatails.setFont(new Font("Raleway", Font.BOLD, 22));
        add(additionalldeatails);

        JLabel religion = new JLabel("Religion : ");
        religion.setBounds(100, 140, 200, 30);
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        add(religion);


        String valReligion[] = {"Hindu","Other"};
        religioncombobox = new JComboBox(valReligion);
        religioncombobox.setBounds(300, 140, 400, 30);
        add(religioncombobox);
        religioncombobox.setBackground(Color.WHITE);




        JLabel category = new JLabel("Category : ");
        category.setBounds(100, 190, 200, 30);
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        add(category);

        String valCategory[] = {"General", "OBC", "SC", "NT", "Others"};
        categorycombobox = new JComboBox(valCategory);
        categorycombobox.setBounds(300, 190, 400, 30);
        add(categorycombobox);
        categorycombobox.setBackground(Color.WHITE);



        JLabel income = new JLabel("Income : ");
        income.setBounds(100, 240, 400, 30);
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        add(income);

        String valIncome[] = {"< 50000", "< 100000", "< 150000", "< 200000"};
        incomecombobox = new JComboBox(valIncome);
        incomecombobox.setBounds(300, 240, 400, 30);
        add(incomecombobox);
        incomecombobox.setBackground(Color.WHITE);



        JLabel educational = new JLabel("Educational");
        educational.setBounds(100, 290, 200, 30);
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        add(educational);


        JLabel qualification = new JLabel("Qualification : ");
        qualification.setBounds(100, 315, 200, 30);
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        add(qualification);

        String valqualification[] = {"SSC", "HSC", "Diploma", "Graduate"};
        qualificationcombobox = new JComboBox(valqualification);
        qualificationcombobox.setBounds(300, 315, 400, 30);
        add(qualificationcombobox);
        qualificationcombobox.setBackground(Color.WHITE);


        JLabel marital = new JLabel("Occupution : ");
        marital.setBounds(100, 390, 200, 30);
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        add(marital);

        String valOccupution[] = {"Salaried", "Self Employed", "Business", "Student"};
        occuputioncombobox = new JComboBox(valOccupution);
        occuputioncombobox.setBounds(300, 390, 400, 30);
        add(occuputioncombobox);
        occuputioncombobox.setBackground(Color.WHITE);



        JLabel panno = new JLabel("Pan Number : ");
        panno.setBounds(100, 440, 200, 30);
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        add(panno);
        pantextfield = new JTextField();
        pantextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        pantextfield.setBounds(300, 440, 400, 30);
        add(pantextfield);


        JLabel aadhar = new JLabel("Aadhar Number : ");
        aadhar.setBounds(100, 490, 200, 30);
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        add(aadhar);
        aadhartextfield = new JTextField();
        aadhartextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhartextfield.setBounds(300, 490, 400, 30);
        add(aadhartextfield);


        JLabel ss = new JLabel("Senior Citizen : ");
        ss.setBounds(100, 540, 200, 30);
        ss.setFont(new Font("Raleway", Font.BOLD, 20));
        add(ss);

        yes = new JRadioButton("Yes");
        yes.setBounds(300, 540, 100, 30);
        yes.setBackground(Color.WHITE);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(450, 540, 100, 30);
        no.setBackground(Color.WHITE);
        add(no);


        ButtonGroup seniorcitizen = new ButtonGroup();
        seniorcitizen.add(yes);
        seniorcitizen.add(no);






        JLabel eaccount = new JLabel("Existing Account : ");
        eaccount.setBounds(100, 590, 200, 30);
        eaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        add(eaccount);

        eayes = new JRadioButton("Yes");
        eayes.setBounds(300, 590, 100, 30);
        eayes.setBackground(Color.WHITE);
        add(eayes);

        eano = new JRadioButton("No");
        eano.setBounds(450, 590, 100, 30);
        eano.setBackground(Color.WHITE);
        add(eano);


        ButtonGroup existaccount = new ButtonGroup();
        existaccount.add(eayes);
        existaccount.add(eano);




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
        Signuptwo s2 = new Signuptwo("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) religioncombobox.getSelectedItem();
        String category = (String) categorycombobox.getSelectedItem();
        String income = (String) incomecombobox.getSelectedItem();
        String education = (String) qualificationcombobox.getSelectedItem();
        String occupution = (String) occuputioncombobox.getSelectedItem();

        String ss = null;
        if (yes.isSelected())
        {
            ss = "Yes";
        }
        else if (no.isSelected())
        {
            ss = "No";
        }
        String ea = null;
        if (eayes.isSelected())
        {
            ea = "Yes";
        } else if (eano.isSelected())
        {
            ea = "No";
        }

        String pan = pantextfield.getText();
        String aadhar = aadhartextfield.getText();

        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values ('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupution+"', '"+ss+"', '"+ea+"', '"+pan+"', '"+aadhar+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new Signupthree(formno).setVisible(true);
            }


        catch (Exception ae)
        {
            System.out.println(ae);
        }

    }
}
