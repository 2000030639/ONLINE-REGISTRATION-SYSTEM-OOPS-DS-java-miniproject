package detail;
import java.awt.Font;
import
java.awt.event.ActionEvent;
import
java.awt.event.ActionListener;
import
javax.swing.ButtonGroup;
import javax.swing.JButton;
import
javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import
javax.swing.JOptionPane;
import
javax.swing.JRadioButton;
public class Form {
JFrame f=new JFrame("Doctors
list");
@SuppressWarnings("rawtypes
 ") public Form()
{
JLabel l=new JLabel("Doctor and
slots"); l.setFont(new Font
("Arial",Font.PLAIN,20));
l.setBounds(150,70,250,30);
f.add(l);
JLabel l7=new JLabel("
Doctor :");
l7.setBounds(50,140,135,30);
f.add(l7);
String s1[] = {"SELECT", "Dr.Sasidhar MBBS", "Dr.sriram", "Dr.Rakesh", "Dr.praveen",
"Dr.Yamini","Dr.manaswini" };
@SuppressWarnings("uncheck
ed") JComboBox t3=new
JComboBox(s1);
t3.setBounds(175,150,200,20);
f.add(t3);
JLabel l9=new JLabel(" Slot
Timings :");
l9.setBounds(50,220,135,30);
f.add(l9);
JRadioButton j1=new JRadioButton("09:00AM -
12:00PM"); j1.setBounds(150,220,200,30);
f.add(j1);
JRadioButton j2=new JRadioButton("02:00PM -
05:00PM"); j2.setBounds(150,250,200,30);
f.add(j2);
JRadioButton j3=new JRadioButton("06:00PM -
08:00PM"); j3.setBounds(150,280,200,30);
f.add(j3);
ButtonGroup bg=new
ButtonGroup(); bg.add(j1);
bg.add(j2);
bg.add(j3);
JButton b=new
JButton("Submit");
b.setBounds(200,400,95,20);
f.add(b);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
f.dispose();
JOptionPane.showMessageDialog(f,"OP has been added successfully. you will be called
soon");
}
});
f.setSize(500,600
);
f.setLayout(null);
f.setVisible(true)
;
f.setResizable(fal
se);
}
public static void main(String args[])
{
new Form();
