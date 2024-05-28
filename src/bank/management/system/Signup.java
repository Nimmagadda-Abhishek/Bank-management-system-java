package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{

    JButton next;

    JRadioButton r1,r2,r3,r4;

    JTextField textname, textFName, textEmail, textMs, textAdd,textCity,textPin,textstate;

    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first =" " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon("C:\\Users\\abhis\\OneDrive\\Desktop\\Bank managememt system\\bank\\management\\system\\icon\\bank.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,  38));
        getContentPane().setBackground(new Color(222, 255, 228));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,  22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,  22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Ralway",Font.BOLD,  20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textname = new JTextField();
        textname.setFont(new Font("Ralway",Font.BOLD,  14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Ralway",Font.BOLD,  20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Ralway",Font.BOLD,  14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB = new JLabel("Date of Barth :");
        DOB.setFont(new Font("Ralway",Font.BOLD,  20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel lableG = new JLabel("Gender :");
        lableG.setFont(new Font("Railway",Font.BOLD,  20));
        lableG.setBounds(100,290,200,30);
        add(lableG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Railway",Font.BOLD,  14));
        r1.setBounds(300,290,60,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Railway",Font.BOLD,  14));
        r2.setBounds(450,290,90,30);
        r2.setBackground(new Color(222,255,228));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Railway",Font.BOLD,  20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,  14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Railway",Font.BOLD,  20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Railway",Font.BOLD,  14));
        r3.setBounds(300,440,100,30);
        r3.setBackground(new Color(222,255,228));
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Railway", Font.BOLD,  14));
        r4.setBounds(450,440,100,30);
        r4.setBackground(new Color(222,255,228));
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel labeladd = new JLabel("Address :");
        labeladd.setFont(new Font("Railway",Font.BOLD,  20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,  14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Railway",Font.BOLD,  20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,  14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pincode :");
        labelPin.setFont(new Font("Railway",Font.BOLD,  20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Ralway",Font.BOLD,  14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Railway",Font.BOLD,  20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Ralway",Font.BOLD,  14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,  14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String formno = first;
        String name = textname.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String martial = null;
        if(r3.isSelected()){
            martial = "Married";
        }else if(r4.isSelected()){
            martial = "Unmarried";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textstate.getText();

        try{
            
            if(textname.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Fill all the fields");   
            }else{
                Conn conn1 = new Conn();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }

}