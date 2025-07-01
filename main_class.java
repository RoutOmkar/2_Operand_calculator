package Pack_cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    JTextField t1, t2;
    JLabel j1;
    JButton AC, b0, b00, bx, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_a, b_s, b_d, b_m, b_e;
    String wholeStr;
    Double operand1,operand2;
    String s1="";
    String s2="";
    int y;
    char c;
    double result;
    main_class() {
        super("Calculator");

        b9 = new JButton("9");
        b9.setBounds(180, 300, 70, 70);
        b9.setFont(new Font("Raleway", Font.BOLD, 16));
        b9.setBackground(new Color(240, 240, 240));
        b9.setForeground(Color.black);
        b9.addActionListener(this);
        add(b9);

        b8 = new JButton("8");
        b8.setBounds(280, 300, 70, 70);
        b8.setFont(new Font("Raleway", Font.BOLD, 16));
        b8.setBackground(new Color(240, 240, 240));
        b8.setForeground(Color.black);
        b8.addActionListener(this);
        add(b8);

        b7 = new JButton("7");
        b7.setBounds(380, 300, 70, 70);
        b7.setFont(new Font("Raleway", Font.BOLD, 16));
        b7.setBackground(new Color(240, 240, 240));
        b7.setForeground(Color.black);
        b7.addActionListener(this);
        add(b7);

        b6 = new JButton("6");
        b6.setBounds(180, 390, 70, 70);
        b6.setFont(new Font("Raleway", Font.BOLD, 16));
        b6.setBackground(new Color(240, 240, 240));
        b6.setForeground(Color.black);
        b6.addActionListener(this);
        add(b6);

        b5 = new JButton("5");
        b5.setBounds(280, 390, 70, 70);
        b5.setFont(new Font("Raleway", Font.BOLD, 16));
        b5.setBackground(new Color(240, 240, 240));
        b5.setForeground(Color.black);
        b5.addActionListener(this);
        add(b5);

        b4 = new JButton("4");
        b4.setBounds(380, 390, 70, 70);
        b4.setFont(new Font("Raleway", Font.BOLD, 16));
        b4.setBackground(new Color(240, 240, 240));
        b4.setForeground(Color.black);
        b4.addActionListener(this);
        add(b4);

        b3 = new JButton("3");
        b3.setBounds(180, 480, 70, 70);
        b3.setFont(new Font("Raleway", Font.BOLD, 16));
        b3.setBackground(new Color(240, 240, 240));
        b3.setForeground(Color.black);
        b3.addActionListener(this);
        add(b3);

        b2 = new JButton("2");
        b2.setBounds(280, 480, 70, 70);
        b2.setFont(new Font("Raleway", Font.BOLD, 16));
        b2.setBackground(new Color(240, 240, 240));
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        add(b2);

        b1 = new JButton("1");
        b1.setBounds(380, 480, 70, 70);
        b1.setFont(new Font("Raleway", Font.BOLD, 16));
        b1.setBackground(new Color(240, 240, 240));
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        add(b1);

        b0 = new JButton("0");
        b0.setBounds(180, 570, 70, 70);
        b0.setFont(new Font("Raleway", Font.BOLD, 16));
        b0.setBackground(new Color(240, 240, 240));
        b0.setForeground(Color.black);
        b0.addActionListener(this);
        add(b0);

        b00 = new JButton("00");
        b00.setBounds(280, 570, 70, 70);
        b00.setFont(new Font("Raleway", Font.BOLD, 16));
        b00.setBackground(new Color(200, 220, 255));
        b00.setForeground(Color.black);
        b00.addActionListener(this);
        add(b00);

        bx = new JButton(".");
        bx.setBounds(380, 570, 70, 70);
        bx.setFont(new Font("Raleway", Font.BOLD, 16));
        bx.setBackground(new Color(200, 220, 255));
        bx.setForeground(Color.black);
        bx.addActionListener(this);
        add(bx);

        b_a = new JButton("+");
        b_a.setBounds(480, 300, 95, 60);
        b_a.setFont(new Font("Raleway", Font.BOLD, 20));
        b_a.setBackground(new Color(102, 255, 178));
        b_a.setForeground(Color.black);
        b_a.addActionListener(this);
        add(b_a);

        b_s = new JButton("-");
        b_s.setBounds(480, 380, 95, 60);
        b_s.setFont(new Font("Raleway", Font.BOLD, 20));
        b_s.setBackground(new Color(0, 204, 153));
        b_s.setForeground(Color.black);
        b_s.addActionListener(this);
        add(b_s);

        b_m = new JButton("X");
        b_m.setBounds(480, 460, 95, 60);
        b_m.setFont(new Font("Raleway", Font.BOLD, 20));
        b_m.setBackground(new Color(0, 153, 153));
        b_m.setForeground(Color.black);
        b_m.addActionListener(this);
        add(b_m);

        b_d = new JButton("/");
        b_d.setBounds(480, 540, 95, 60);
        b_d.setFont(new Font("Raleway", Font.BOLD, 20));
        b_d.setBackground(new Color(0, 102, 102));
        b_d.setForeground(Color.white);
        b_d.addActionListener(this);
        add(b_d);

        b_e = new JButton("=");
        b_e.setBounds(480, 610, 95, 33);
        b_e.setFont(new Font("Raleway", Font.BOLD, 20));
        b_e.setBackground(new Color(51, 153, 255));
        b_e.setForeground(Color.black);
        b_e.addActionListener(this);
        add(b_e);

        j1 = new JLabel("CATIGA CD-2786-12");
        j1.setFont(new Font("Raleway", Font.BOLD, 13));
        j1.setBounds(350, 250, 150, 30);
        add(j1);

        AC = new JButton("ON / AC");
        AC.setBounds(490, 250, 90, 30);
        AC.setBackground(new Color(144, 238, 144));
        AC.setForeground(Color.black);
        AC.addActionListener(this);
        add(AC);

        t2 = new JTextField();
        t2.setBounds(180, 250, 170, 30);
        t2.setFont(new Font("Raleway", Font.BOLD, 22));
        t2.setBackground(Color.white);
        t2.setForeground(Color.black);
        t2.addActionListener(this);
        add(t2);

        t1 = new JTextField();
        t1.setBounds(180, 170, 400, 60);
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        t1.setBackground(Color.white);
        t1.setForeground(Color.black);
        t1.addActionListener(this);
        add(t1);

        setLayout(null);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	JButton arr1[]= {b0, b00, bx, b1, b2, b3, b4, b5, b6, b7, b8, b9,b_a, b_s, b_d, b_m};
    	char arr2[]= {'+','-','X','/'};
    	String current_text=t1.getText();
    	if(e.getSource()==b_e)
    	{
    		wholeStr = t1.getText();
    	    for (y = 0; y < wholeStr.length(); y++)
    	    {
    	        char ch1 = wholeStr.charAt(y);
    	        if (ch1 == '+' || ch1 == '-' || ch1 == 'X' || ch1 == '/')
    	        {
    	            c = ch1;
    	            break;
    	        }
    	    }
    	    evalute();            
    	    main_evalution();
    	    return;
    	}
    	for(JButton i:arr1)
    	{
    		if(e.getSource()==i)
    		{
    			
    			t1.setText(current_text+i.getText());
    			wholeStr=t1.getText();
    	if (c == '\0')		
    	{
    	for(y=0;y<wholeStr.length();y++)
    	{
    		char ch1=wholeStr.charAt(y);
    		
    			for(char ch:arr2)
    			{
    				if(ch1==ch)
    				{
    					c=ch1;
    					return;
    					
    				}
    			}
    	}
    		}
    	
    }
    	}
    	if(e.getSource()==AC)
    	{
    		t1.setText("");
    		t2.setText("");
    		wholeStr="";
    		s1="";
    		s2="";
    		operand1=0.0;
    		operand2=0.0;
    		result=0.0;
    		c = '\0';
    	}
    }
    
    public void evalute()
    {
    	s1="";
    	s2="";
    	for(int x=0;x<y;x++)
    	{
    		s1=s1+wholeStr.charAt(x);
    		
    	}
    	for(int z=y+1;z<wholeStr.length();z++)
    	{
    		s2=s2+wholeStr.charAt(z);
    		
    	}
    	if (s1.isEmpty() || s2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid input. Enter both numbers.");
            operand1 = operand2 = null;
            return;
        }
		try {
			
			operand1=Double.parseDouble(s1);
			operand2=Double.parseDouble(s2);
			
		}catch(Exception e1)
		{
			e1.printStackTrace();
			operand1=operand2=null;
		}
    }
    
    public void main_evalution()
    {
    	if (operand1 == null || operand2 == null) {
            JOptionPane.showMessageDialog(null, "Operands missing.");
            return;
        }
    	if(c=='+')
    	{
    		result=operand1+operand2;
    		//JOptionPane.showMessageDialog(null,"result is :"+result);
    		
    	}else if(c=='-')
    	{
    		result=operand1-operand2;
    	}else if(c=='X')
    	{
    		result=operand1*operand2;
    	}
    	else if(c=='/')
    	{
    		if(operand2==0)
    		{
    			JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
    		}else {
    			result=operand1/operand2;
    		}
    	}
    	
    	t2.setText(String.valueOf(result));
    	t1.setText("");
    	s1="";
    	s2="";
    	operand1=0.0;
    	operand2=0.0;
    	c = '\0';
    	
    }

    public static void main(String[] args) {
        new main_class();
    }
}
