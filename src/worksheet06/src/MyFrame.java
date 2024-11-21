
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private static  final int FRAME_WIDTH = 900;
    private  static  final int FRAME_HEIGHT = 600;

    private static  final int FRAME_X_ORIGIN = 150;

    private static final int FRAME_Y_ORIGIN = 200;


    private JButton submit, reset;
    private JTextField resultsText, mobilenum;
    private JTextArea information, adressarea;
    private JCheckBox checkBox;
    private JLabel success,gender,dob,nameLabel,mobile,adress;

    private JComboBox dateCombo,yearCombo,monthCombo;
    private JRadioButton male,female;
    private ButtonGroup genderx;

    MyFrame(){
        getContentPane().setLayout(null);
        setTitle("Registration Form");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel Registration_Form = new JLabel("Registration Form");
        Registration_Form.setFont(new Font("Arial",Font.PLAIN,25));
        Registration_Form.setSize(300,30);
        Registration_Form.setLocation(350,10);


         nameLabel = new JLabel("Name: ");
        nameLabel.setFont(new Font("Arial",Font.PLAIN, 18));
        nameLabel.setSize(300,30);
        nameLabel.setLocation(30,60);

         resultsText = new JTextField();
        resultsText.setFont(new Font("Arial", Font.PLAIN,15));
        resultsText.setSize(300,30);
        resultsText.setLocation(90,60);

         mobile = new JLabel("Mobile: ");
        mobile.setFont(new Font("Arial",Font.PLAIN,18));
        mobile.setSize(250,30);
        mobile.setLocation(30,110);

         mobilenum = new JTextField();
        mobilenum.setFont(new Font("Arial",Font.PLAIN,15));
        mobilenum.setSize(250,30);
        mobilenum.setLocation(90,110);


         gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial",Font.PLAIN,18));
        gender.setSize(250,30);
        gender.setLocation(30,150);

         male = new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.PLAIN,15));
        male.setSelected(true);
        male.setSize(75,20);
        male.setLocation(110,155);

         female = new JRadioButton("female");
        female.setFont(new Font("Arial",Font.PLAIN,15));
        female.setSelected(true);
        female.setSize(75,20);
        female.setLocation(190,155);

         dob = new JLabel("DOB");
        dob.setFont(new Font("Arial",Font.PLAIN,18));
        dob.setSize(250,30);
        dob.setLocation(30,200);

       Integer [] date = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        dateCombo = new JComboBox<>(date);
       dateCombo.setSize(50,20);
       dateCombo.setLocation(80,206);

       String [] month ={"Jan","Feb","Mar","Apr","May","Jun","Jully","Aug","Sep","Oct","Nov","Dec"};
        monthCombo = new JComboBox<>(month);
       monthCombo.setSize(70,20);
       monthCombo.setLocation(130,206);

       Integer [] year = new Integer[21];
       for (int i=0;i< year.length;i++){
           year[i] = i+1990;
       }
        yearCombo = new JComboBox<>(year);
       yearCombo.setSize(60,25);
       yearCombo.setLocation(230,204);

        adress = new JLabel("Address");
       adress.setLocation(30,250);
       adress.setSize(300,30);
       adress.setFont(new Font("Arial",Font.PLAIN,18));

        adressarea = new JTextArea();
       adressarea.setSize(200,100);
       adressarea.setLocation(120,255);


        JCheckBox checkBox = new JCheckBox("Accept terms and conditions");
        checkBox.setFont(new Font("Arial",Font.PLAIN,15));
        checkBox.setSize(250,20);
        checkBox.setLocation(90,390);

         submit = new JButton("Submit");
        submit.setSize(80,20);
        submit.setLocation(88,460);

         reset = new JButton("Reset");
        reset.setSize(80,20);
        reset.setLocation(230,460);

         information = new JTextArea();
        information.setSize(250,350);
        information.setLocation(500,60);

         success = new JLabel();
        success.setSize(200,30);
        success.setLocation(190,520);






        add(Registration_Form);
        add(resultsText);
        add(nameLabel);
        add(mobile);
        add(mobilenum);
        add(gender);
        add(male);
        add(female);
        add(dob);
        add(dateCombo);
        add(monthCombo);
        add(yearCombo);
        add(adress);
        add(adressarea);
        add(checkBox);
        add(submit);
        add(reset);
        add(information);
        add(success);
        submit.addActionListener(this);
        reset.addActionListener(this);


        genderx = new ButtonGroup();
        genderx.add(male);
        genderx.add(female);

    }

    @Override
    public void actionPerformed(ActionEvent e){

   if(e.getSource() == submit){
       Integer selectedDate = (Integer) dateCombo.getSelectedItem();
       String selectedMonth = (String) monthCombo.getSelectedItem();
       Integer selectedYear = (Integer) yearCombo.getSelectedItem();
       String gender = male.isSelected() ? "Male" : "Female";
       information.setText("Name :"+resultsText.getText()+"\n"+
        "Mobile :"+mobilenum.getText()+"\n"+"Gender :"+ gender+"\n" + "DOB :" + selectedDate+"/"+selectedMonth+"/"+selectedYear +"\n" + "Address:" +adressarea.getText() );
       success.setText("Registration Successfully!");

   } else if (e.getSource() == reset) {
       resultsText.setText("");
       mobilenum.setText("");
       adressarea.setText("");
       genderx.clearSelection();
       dateCombo.setSelectedIndex(0);
       monthCombo.setSelectedIndex(0);
       yearCombo.setSelectedIndex(0);
       information.setText("");
       success.setText("");

   }


    };
}
