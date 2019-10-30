package Travel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

public class ConnectionManager {
	protected static final String DateTime = null;

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{

	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","");  

	Statement statement=(Statement) con.createStatement();
//	if (con != null)
//	{
//		System.out.println("Connected");
//	}
//	else
//	{
//		System.out.println("not Connected");
//	}
	JFrame f=new JFrame();
	JLabel head=new JLabel("Travelling Ticket System");
	head.setBounds(30, 15, 200, 50);
	JLabel ticket=new JLabel("Ticket type");
	ticket.setBounds(10, 45, 200, 50);
	JRadioButton s1=new JRadioButton();
	s1.setText("Standard");
	s1.setBounds(15, 95, 100, 50);
	JRadioButton s2=new JRadioButton();
	s2.setText("Economy");
	s2.setBounds(15, 125, 100, 50);
	JRadioButton s3=new JRadioButton();
	s3.setText("First Class");
	s3.setBounds(15, 155, 100, 50);
	ButtonGroup g1=new ButtonGroup();
	g1.add(s1);	g1.add(s2);	g1.add(s3);
	
	JRadioButton s4=new JRadioButton();
	s4.setText("Single Ticket");
	s4.setBounds(115, 95, 100, 50);
	JRadioButton s5=new JRadioButton();
	s5.setText("Double Ticket");
	s5.setBounds(115, 125, 140, 50);
	ButtonGroup g2=new ButtonGroup();
	g2.add(s4);	g2.add(s5);	
	JRadioButton s6=new JRadioButton();
	s6.setText("Child");
	s6.setBounds(255, 95, 200, 50);
	JRadioButton s7=new JRadioButton();
	s7.setText("Adult");
	s7.setBounds(255, 125, 200, 50);
	ButtonGroup g3=new ButtonGroup();
	g3.add(s6);	g3.add(s7);
	JComboBox t2=new JComboBox();
	t2.setBounds(235, 180, 150, 30);
	t2.addItem("Coimbatoore");
	t2.addItem("Kerala");
	JLabel tax=new JLabel("Tax");
	tax.setBounds(25, 280, 150, 30);
	JTextField txt1=new JTextField();
	txt1.setBounds(105, 280, 150, 30);
	JLabel sub=new JLabel("Sub Total");
	sub.setBounds(25, 320, 150, 30);
	JTextField txt2=new JTextField();
	txt2.setBounds(105, 320, 150, 30);
	JLabel tot=new JLabel("Total");
	tot.setBounds(25, 360, 150, 30);
	JTextField txt3=new JTextField();
	txt3.setBounds(105, 360, 150, 30);
	JButton ok=new JButton("OK");
	ok.setBounds(65, 500, 70, 30);
	
	JButton reset=new JButton("RESET");
	reset.setBounds(155, 500, 100, 30);
	JButton exit=new JButton("EXIT");
	exit.setBounds(275, 500, 70, 30);
	JLabel cls=new JLabel("Class");
	cls.setBounds(475, 60, 150, 30);
	JTextField clst=new JTextField();
	clst.setBounds(475, 90, 100, 30);
	JLabel tct=new JLabel("Ticket");
	tct.setBounds(575, 60, 150, 30);
	JTextField tctt=new JTextField();
	tctt.setBounds(575, 90, 100, 30);
	JLabel adt=new JLabel("Adult");
	adt.setBounds(675, 60, 150, 30);
	JTextField adtt=new JTextField();
	adtt.setBounds(675, 90, 100, 30);
	JLabel chl=new JLabel("Child");
	 chl.setBounds(775, 60, 150, 30);
	 JTextField chlt=new JTextField();
		chlt.setBounds(775, 90, 100, 30);
		
		JLabel frm=new JLabel("From");
		frm.setBounds(475, 280, 150, 30);
		JTextField from=new JTextField();
		from.setBounds(525, 280, 150, 30);
		JLabel to=new JLabel("To");
		to.setBounds(475, 320, 150, 30);
		JTextField tto=new JTextField();
		tto.setBounds(525, 320, 150, 30);
		JLabel dt=new JLabel("Date");
		dt.setBounds(475, 360, 150, 30);
		JTextField date1=new JTextField();
		date1.setBounds(525, 360, 150, 30);
		JLabel tm=new JLabel("Time");
		tm.setBounds(475, 400, 150, 30);
		JTextField time=new JTextField();
		time.setBounds(525, 400, 150, 30);
		JLabel tno=new JLabel("Tickt No");
		tno.setBounds(775, 280, 150, 30);
		JTextField num=new JTextField();
		num.setBounds(775, 320, 150, 30);
		JLabel pri=new JLabel("Price");
		pri.setBounds(775, 360, 150, 30);
		JTextField price=new JTextField();
		price.setBounds(775, 400, 150, 30);
		JLabel rout=new JLabel("Route");
		rout.setBounds(775, 440, 150, 30);
		JTextField route=new JTextField();
		route.setBounds(775, 480, 150, 30);
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s = null,q = null,p = null;
				if(s1.isSelected())
				{
					s="Standard";
				}
				else if(s2.isSelected())
				{
					s="Economy";
				}
				else if(s3.isSelected())
				{
					s="Firstclass";
				}
				
				if(s4.isSelected())
				{
					q="single";
				}
				else if(s5.isSelected())
				{
					q="double";
				}
				if(s6.isSelected())
				{
					p="child";
				}
				else if(s7.isSelected())
				{
					p="adult";
				}
				String st1= (String) t2.getSelectedItem();
				int t=Integer.parseInt(txt1.getText());
				int st=Integer.parseInt(txt2.getText());
				int ft=Integer.parseInt(txt3.getText());
				String fm=frm.getText();
				String top=tto.getText();
				String d=date1.getText();
				String tmi=time.getText();
				String tctno=num.getText();
				int pric=Integer.parseInt(price.getText());
				String rout=route.getText();
				try {
					statement.executeUpdate("insert into tickettype (type,quantity,person,place) values('"+s+"','"+q+"','"+p+"','"+st1+"')");
					statement.executeUpdate("insert into calc (tax,total,subtotal) values('"+t+"','"+ft+"','"+st+"')");
					statement.executeUpdate("insert into dest (fromp,top,date,time) values('"+fm+"','"+top+"','"+d+"','"+tmi+"')");
					statement.executeUpdate("insert into details (tck,price,route) values('"+tctno+"','"+pric+"','"+rout+"')");
					JOptionPane.showMessageDialog(ok, "data inserted succesfully");
					t2.setSelectedItem(null);
					txt1.setText(null);
					txt2.setText(null);
					txt3.setText(null);
					ResultSet rs=statement.executeQuery("select * from tcttype");
					while(rs.next())
					{
						String sr=rs.getString("+type+");
						clst.setText(sr);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(reset, "data reset succesfully");
				t2.setSelectedItem(null);
				txt1.setText(null);
				txt2.setText(null);
				txt3.setText(null);
				frm.setText(null);
				tto.setText(null);
				date1.setText(null);
				time.setText(null);
				num.setText(null);
				price.setText(null);
				rout.setText(null);
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(exit, "Thank you for using this service");
			}
		});
	f.setSize(1000, 600);
	f.add(head);f.add(s1);
	f.add(ticket);f.add(s2);f.add(s3);
	f.add(s4);f.add(s5);f.add(s6);f.add(s7);
	f.add(t2);f.add(tax);f.add(sub);f.add(tot);
	f.add(txt2);f.add(txt1);f.add(txt3);
	f.add(ok);f.add(exit);f.add(reset);
	f.add(cls);f.add(tct);f.add(adt);f.add(chl);
	f.add(clst);f.add(tctt);f.add(adtt);f.add(chlt);
	f.add(frm);f.add(from);f.add(to);f.add(tto);f.add(dt);f.add(date1);
	f.add(tm);f.add(time);
	f.add(tno);f.add(num);f.add(pri);f.add(price);f.add(rout);f.add(route);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	
}
}
