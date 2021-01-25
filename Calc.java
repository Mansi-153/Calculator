import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
class Calc implements ActionListener
{
	JFrame f;
	JPanel pa;
	JTextField t,t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	double a=0,b=0,result=0;
	int op=0,count=0;
	Calc()
	{
		f = new JFrame("Calculator");
		pa = new JPanel();
		f.getContentPane().add(pa);
		t = new JTextField(20);
		t1 = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bdiv = new JButton("/");
		bmul = new JButton("*");	
		bsub = new JButton("-");
		badd = new JButton("+");
		bdec = new JButton(".");
		beq = new JButton("=");
		bdel = new JButton("Delete");
		bclr = new JButton("Clear");

		t.setBorder(null);
		t1.setBorder(null);
		
		t.setBounds(30,40,280,30);
		t1.setBounds(30,10,280,30);
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		bdiv.setBounds(250,100,50,40);

		b4.setBounds(40,150,50,40);
		b5.setBounds(110,150,50,40);
		b6.setBounds(180,150,50,40);
		bmul.setBounds(250,150,50,40);

		b1.setBounds(40,210,50,40);
		b2.setBounds(110,210,50,40);
		b3.setBounds(180,210,50,40);
		bsub.setBounds(250,210,50,40);

		bdec.setBounds(40,270,50,40);
		b0.setBounds(110,270,50,40);
		beq.setBounds(180,270,50,40);
		badd.setBounds(250,270,50,40);

		bdel.setBounds(60,380,100,40);
		bclr.setBounds(180,380,100,40);
		
		pa.add(t);
		pa.add(t1);
		pa.add(b7);
    		pa.add(b8);
		pa.add(b9);
		pa.add(bdiv);
		pa.add(b4);
		pa.add(b5);
		pa.add(b6);
		pa.add(bmul);
		pa.add(b1);
		pa.add(b2);
		pa.add(b3);
		pa.add(bsub);
		pa.add(bdec);
		pa.add(b0);
		pa.add(beq);
		pa.add(badd);
		pa.add(bdel);
		pa.add(bclr);

		pa.setLayout(null);
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		try
		{
			if(evt.getSource()==b1)
			{
				t.setText(t.getText().concat("1"));
				t1.setText(t1.getText().concat("1"));
			}
			if(evt.getSource()==b2)
			{	
				t.setText(t.getText().concat("2"));
				t1.setText(t1.getText().concat("2"));
			}

			if(evt.getSource()==b3)
			{
				t.setText(t.getText().concat("3"));
				t1.setText(t1.getText().concat("3"));
			}

			if(evt.getSource()==b4)
			{
				t.setText(t.getText().concat("4"));
				t1.setText(t1.getText().concat("4"));
			}

			if(evt.getSource()==b5)
			{
				t.setText(t.getText().concat("5"));
				t1.setText(t1.getText().concat("5"));
			}
	
			if(evt.getSource()==b6)
			{
				t.setText(t.getText().concat("6"));
				t1.setText(t1.getText().concat("6"));
			}


			if(evt.getSource()==b7)
			{
				t.setText(t.getText().concat("7"));
				t1.setText(t1.getText().concat("7"));
			}

			if(evt.getSource()==b8)
			{
				t.setText(t.getText().concat("8"));
				t1.setText(t1.getText().concat("8"));
			}

			if(evt.getSource()==b9)
			{
				t.setText(t.getText().concat("9"));
				t1.setText(t1.getText().concat("9"));
			}


			if(evt.getSource()==b0)
			{
				t.setText(t.getText().concat("0"));
				t1.setText(t1.getText().concat("0"));
			}

			if(evt.getSource()==bdec)
			{
				t.setText(t.getText().concat("."));
				t1.setText(t1.getText().concat("."));
			}

			if(evt.getSource()==badd)
			{
				a=Double.parseDouble(t.getText());
				if(count!=0)
				{
					switch(op)
					{
						case 1:result=b+a;
						break;
						case 2:result=b-a;
						break;
	
						case 3:result=a*b;
						break;

						case 4:result=b/a;
						break;
				
						default:result=0;
					}
				}
				else
				{
					result=a;
				}
				t1.setText(t1.getText().concat("+"));
				b=result;
				op=1;
				t.setText("");
				count++;
			}

			if(evt.getSource()==bsub)
			{
				a=Double.parseDouble(t.getText());
				if(count!=0)
				{
					switch(op)
					{
						case 1:result=a+b;
						break;
						case 2:result=b-a;
						break;

						case 3:result=a*b;
						break;

						case 4:result=b/a;
						break;
				
						default:result=0;
					}
				}
				else
				{
					result=a;
				}
				b=result;
				t1.setText(t1.getText().concat("-"));
				op=2;
				count++;
				t.setText("");
			}
		
			if(evt.getSource()==bmul)
			{
				a=Double.parseDouble(t.getText());
				if(count!=0)
				{
					switch(op)
					{
						case 1:result=a+b;
						break;
						case 2:result=a-b;
						break;
	
						case 3:result=a*b;
						break;
	
						case 4:result=a/b;
						break;
				
						default:result=0;
					}
				}
				else
				{
					result=a;
				}
				t1.setText(t1.getText().concat("*"));
				b=result;

				op=3;
				count++;
				t.setText("");
			}


			if(evt.getSource()==bdiv)
			{
				a=Double.parseDouble(t.getText());
				if(count!=0)
				{
					switch(op)
					{
						case 1:result=a+b;
						break;
						case 2:result=a-b;
						break;

						case 3:result=a*b;
						break;

						case 4:result=a/b;
						break;
				
						default:result=0;
					}
				}
				else
				{
					result=a;
				}
				t1.setText(t1.getText().concat("/"));
				b=result;
				op=4;
				count++;
				t.setText("");
			}


			if(evt.getSource()==beq)
			{
				a=Double.parseDouble(t.getText());

				switch(op)
				{
					case 1:result=a+b;
					break;
					case 2:result=b-a;
					break;

					case 3:result=b*a;
					break;
	
					case 4:result=b/a;
					break;
				
					default:result=0;
				}
				t.setText(""+result);
				t1.setText(""+result);
				b=result;
				count=0;
				op=0;

			}
	


			if(evt.getSource()==bdel)
			{
				String s=t.getText();
				String p=t1.getText();
				t.setText("");
				t1.setText("");
				for(int i=0;i<s.length()-1;i++)
				t.setText(t.getText()+s.charAt(i));
				for(int j=0;j<p.length()-1;j++)
				t1.setText(t1.getText()+p.charAt(j));

			}

			if(evt.getSource()==bclr)
			{
				t1.setText(null);
				t.setText(null);
			}
		}
		catch(ArithmeticException e)
		{
		}
	}
	public static void main(String aa[])
	{
		new Calc();
	}
}



		