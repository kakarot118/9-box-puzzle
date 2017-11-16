import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;

public class HelloWorlsClass implements ActionListener {

	JButton btnnewgame;
	private int moves;
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;
	JLabel lbl4;
	JLabel lbl5;
	JButton btn0;
	JButton btn1; 
	JButton btn2; 
	JButton btn3; 
	JButton btn4; 
	JButton btn5; 
	JButton btn6; 
	JButton btn7;
	JButton btn8;
	int solve[][]=new int[30][3];
	String name="Player";
	private int a[][]=new int[3][3];
	//JButton btn[][]=new JButton[3][3];
	private JFrame frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorlsClass window = new HelloWorlsClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	HelloWorlsClass() {
		
		
		name=JOptionPane.showInputDialog(null, "Enter Your Name", "9-box puzzle",JOptionPane.QUESTION_MESSAGE );
		frame = new JFrame();
		frame.setResizable(true);
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel0 = new JPanel();
		frame.getContentPane().add(panel0, BorderLayout.NORTH);
		//frame.getContentPane().add(panel0,BorderLayout.AFTER_LAST_LINE);
		//Font f2=new Font();
		
		panel0.setBackground(Color.MAGENTA);
		btnnewgame = new JButton("New Game");
		panel0.add(btnnewgame);
		
		lbl1 = new JLabel("Moves  :            ");
		panel0.add(lbl1);
		
		lbl2 = new JLabel("Player Name :                      ");
		panel0.add(lbl2);
		
		lbl3 = new JLabel("    HighscorePlayer :          ");
		panel0.add(lbl3);
		
		lbl4 = new JLabel("    High Score :                ");
		panel0.add(lbl4);
		
		
		String player=lbl2.getText();
		player="Player Name : " + name;;
		lbl2.setText(player);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3));
		panel.setBackground(Color.CYAN);
		
		lbl5 = new JLabel("               ");
		panel0.add(lbl5,BorderLayout.SOUTH );
		
		btn0 = new JButton("New button0");
		
		panel.add(btn0);
		
		btn1 = new JButton(" ");
		panel.add(btn1);
		
		btn2 = new JButton(" ");
		panel.add(btn2);
		
		btn3 = new JButton(" ");
		panel.add(btn3);
		
		btn4 = new JButton(" ");
		panel.add(btn4);
		
		btn5 = new JButton(" ");
		panel.add(btn5);
		
		btn6 = new JButton(" ");
		panel.add(btn6);
		
		btn7 = new JButton(" ");
		panel.add(btn7);
		
		btn8 = new JButton(" ");
		panel.add(btn8);
		
		replay();
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btnnewgame.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == btnnewgame ) {
			replay();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				JButton b=new JButton();
				if(i==0 && j==0) {
					b=btn0;
					if(e.getSource()==btn0) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==0 && j==1) {
					b=btn1;
					if(e.getSource()==btn1) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==0 && j==2) {
					b=btn2;
					if(e.getSource()==btn2) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==1 && j==0) {
					b=btn3;
					if(e.getSource()==btn3) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==1 && j==1) {
					b=btn4;
					if(e.getSource()==btn4) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==1 && j==2) {
					b=btn5;
					if(e.getSource()==btn5) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==2 && j==0) {
					b=btn6;
					if(e.getSource()==btn6) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==2 && j==1) {
					b=btn7;
					if(e.getSource()==btn7) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				else if(i==2 && j==2) {
					b=btn8;
					if(e.getSource()==btn8) {
						String mcheck;
						if(moves>0) {
							mcheck="Moves :  "+moves;
							
							lbl1.setText(mcheck);
						}
						
						find(i,j);
					}
				}
				
			}
		}
		checkwin();
		
	}
	
	void replay() {
		
		moves=1;
		randomgenerate();
		a[2][2]=9;
		btn8.setText(" ");
		lbl5.setText("          ");
		lbl1.setText("Moves  :       ");
	}
	
	void randomgenerate() {
		
		int ar[]=new int[8];
		int k=0,check=0;
		
		/*btn0.setText("8");
		a[0][0]=8;
		btn1.setText("2");
		a[0][1]=2;
		btn2.setText("1");
		a[0][2]=1;
		btn3.setText("4");
		a[1][0]=4;
		btn4.setText("3");
		a[1][1]=3;
		btn5.setText(" ");
		a[1][2]=9;
		btn6.setText("7");
		a[2][0]=7;
		btn7.setText("6");
		a[2][1]=6;
		btn8.setText("5");
		a[2][2]=2;*/
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				check=0;
				int x=(int)(Math.random() * 8);
				x=x+1;
				
				if(k==0) {
					String num=" "+x;
					if(i==0 && j==0) {
						btn0.setText(num);
					}
					if(i==0 && j==1) {
						btn1.setText(num);
					}
					if(i==0 && j==2) {
						btn2.setText(num);
					}
					if(i==1 && j==0) {
						btn3.setText(num);
					}
					if(i==1 && j==1) {
						btn4.setText(num);
					}
					if(i==1 && j==2) {
						btn5.setText(num);
					}
					if(i==2 && j==0) {
						btn6.setText(num);
					}
					if(i==2 && j==1) {
						btn7.setText(num);
					}
					if(i==2 && j==2) {
						btn8.setText(num);
					}
					
					a[0][0]=x;
					ar[k]=x;
					k++;
				}
				else if(k<=7) {
					while(check==0) {
						int chk = 0;
						for (int a = 0; a < k; a++) {
							if (ar[a] != x) {
								chk++;
							} else a = 10;
						}
						if (k == chk) {
							
							String num = " " + x;
							if(i==0 && j==0) {
								btn0.setText(num);
							}
							else if(i==0 && j==1) {
								btn1.setText(num);
							}
							else if(i==0 && j==2) {
								btn2.setText(num);
							}
							else if(i==1 && j==0) {
								btn3.setText(num);
							}
							else if(i==1 && j==1) {
								btn4.setText(num);
							}
							else if(i==1 && j==2) {
								btn5.setText(num);
							}
							else if(i==2 && j==0) {
								btn6.setText(num);
							}
							else if(i==2 && j==1) {
								btn7.setText(num);
							}
							else {
								btn8.setText(num);
							}
							//b[i][j].setLabel(str);
							ar[k] = x;
							a[i][j] = x;
							k++;
							check= 1;
						} else {
							x = (int)(Math.random() * 8);
							x = x + 1;
						}
					}
				}
				a[2][2]=9;
			}
		}
	}
	
	int checkwin() {
		
		int c=1;
		int check=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(c==a[i][j]) {
					check++;
				}
				c++;
				
			}
		}
		if(c==9) {
			String win="You Win";
			lbl5.setText(win);
		}
		return 0;
	}
	int find(int i,int j) {
		int p, q, temp;
		String st1 = new String(" ");
		p = i;
		q = j;
		
		JButton b=new JButton();
		JButton b1=new JButton();
		if (p - 1 >= 0) {
			p--;
			if (a[p][q] == 9) {
				st1 = st1 + a[i][j];
				if(i==0 && j==0) {
					b=btn0;
					btn0.setText(" ");
				}
				if(i==0 && j==1) {
					b=btn1;
					btn1.setText(" ");
				}
				if(i==0 && j==2) {
					b=btn2;
					btn2.setText(" ");
				}
				if(i==1 && j==0) {
					b=btn3;
					btn3.setText(" ");
				}
				if(i==1 && j==1) {
					b=btn4;
					btn4.setText(" ");
				}
				if(i==1 && j==2) {
					b=btn5;
					btn5.setText(" ");
				}
				if(i==2 && j==0) {
					b=btn6;
					btn6.setText(" ");
				}
				if(i==2 && j==1) {
					b=btn7;
					btn7.setText(" ");
				}
				if(i==2 && j==2) {
					b=btn8;
					btn8.setText(" ");
				}
				if(p==0 && q==0) {
					b1=btn0;
					btn0.setText(st1);
				}
				if(p==0 && q==1) {
					b1=btn1;
					btn1.setText(st1);
				}
				if(p==0 && q==2) {
					b1=btn2;
					btn2.setText(st1);
				}
				if(p==1 && q==0) {
					b1=btn3;
					btn3.setText(st1);
				}
				if(p==1 && q==1) {
					b1=btn4;
					btn4.setText(st1);
				}
				if(p==1 && q==2) {
					b1=btn5;
					btn5.setText(st1);
				}
				if(p==2 && q==0) {
					b1=btn6;
					btn6.setText(st1);
				}
				if(p==2 && q==1) {
					b1=btn7;
					btn7.setText(st1);
				}
				if(p==2 && q==2) {
					b1=btn8;
					btn8.setText(st1);
				}
				//b1.setLabel(st1);
				//b.setLabel(" ");
				a[p][q] = a[i][j];
				a[i][j] = 9;
				moves++;
				return 0;
			}
		}
		p = i;
		q = j;
		if (p + 1 <= 2) {
			p++;
			if (a[p][q] == 9) {
				st1 = st1 + a[i][j];
				if(i==0 && j==0) {
					b=btn0;
					btn0.setText(" ");
				}
				if(i==0 && j==1) {
					b=btn1;
					btn1.setText(" ");
				}
				if(i==0 && j==2) {
					b=btn2;
					btn2.setText(" ");
				}
				if(i==1 && j==0) {
					b=btn3;
					btn3.setText(" ");
				}
				if(i==1 && j==1) {
					b=btn4;
					btn4.setText(" ");
				}
				if(i==1 && j==2) {
					b=btn5;
					btn5.setText(" ");
				}
				if(i==2 && j==0) {
					b=btn6;
					btn6.setText(" ");
				}
				if(i==2 && j==1) {
					b=btn7;
					btn7.setText(" ");
				}
				if(i==2 && j==2) {
					b=btn8;
					btn8.setText(" ");
				}
				if(p==0 && q==0) {
					b1=btn0;
					btn0.setText(st1);
				}
				if(p==0 && q==1) {
					b1=btn1;
					btn1.setText(st1);
				}
				if(p==0 && q==2) {
					b1=btn2;
					btn2.setText(st1);
				}
				if(p==1 && q==0) {
					b1=btn3;
					btn3.setText(st1);
				}
				if(p==1 && q==1) {
					b1=btn4;
					btn4.setText(st1);
				}
				if(p==1 && q==2) {
					b1=btn5;
					btn5.setText(st1);
				}
				if(p==2 && q==0) {
					b1=btn6;
					btn6.setText(st1);
				}
				if(p==2 && q==1) {
					b1=btn7;
					btn7.setText(st1);
				}
				if(p==2 && q==2) {
					b1=btn8;
					btn8.setText(st1);
				}
				//b1.setLabel(st1);
				//b.setLabel(" ");
				a[p][q] = a[i][j];
				a[i][j] = 9;
				moves++;
				return 0;
			}
		}
		p = i;
		q = j;
		if (q - 1 >= 0) {
			q--;
			if (a[p][q] == 9) {
				st1 = st1 + a[i][j];
				if(i==0 && j==0) {
					b=btn0;
					btn0.setText(" ");
				}
				if(i==0 && j==1) {
					b=btn1;
					btn1.setText(" ");
				}
				if(i==0 && j==2) {
					b=btn2;
					btn2.setText(" ");
				}
				if(i==1 && j==0) {
					b=btn3;
					btn3.setText(" ");
				}
				if(i==1 && j==1) {
					b=btn4;
					btn4.setText(" ");
				}
				if(i==1 && j==2) {
					b=btn5;
					btn5.setText(" ");
				}
				if(i==2 && j==0) {
					b=btn6;
					btn6.setText(" ");
				}
				if(i==2 && j==1) {
					b=btn7;
					btn7.setText(" ");
				}
				if(i==2 && j==2) {
					b=btn8;
					btn8.setText(" ");
				}
				if(p==0 && q==0) {
					b1=btn0;
					btn0.setText(st1);
				}
				if(p==0 && q==1) {
					b1=btn1;
					btn1.setText(st1);
				}
				if(p==0 && q==2) {
					b1=btn2;
					btn2.setText(st1);
				}
				if(p==1 && q==0) {
					b1=btn3;
					btn3.setText(st1);
				}
				if(p==1 && q==1) {
					b1=btn4;
					btn4.setText(st1);
				}
				if(p==1 && q==2) {
					b1=btn5;
					btn5.setText(st1);
				}
				if(p==2 && q==0) {
					b1=btn6;
					btn6.setText(st1);
				}
				if(p==2 && q==1) {
					b1=btn7;
					btn7.setText(st1);
				}
				if(p==2 && q==2) {
					b1=btn8;
					btn8.setText(st1);
				}
				moves++;
				a[p][q] = a[i][j];
				a[i][j] = 9;
				return 0;
			}
		}
		p = i;
		q = j;
		if (q + 1 <= 2) {
			q++;
			if (a[p][q] == 9) {
				st1 = st1 + a[i][j];
				if(i==0 && j==0) {
					b=btn0;
					btn0.setText(" ");
				}
				if(i==0 && j==1) {
					b=btn1;
					btn1.setText(" ");
				}
				if(i==0 && j==2) {
					b=btn2;
					btn2.setText(" ");
				}
				if(i==1 && j==0) {
					b=btn3;
					btn3.setText(" ");
				}
				if(i==1 && j==1) {
					b=btn4;
					btn4.setText(" ");
				}
				if(i==1 && j==2) {
					b=btn5;
					btn5.setText(" ");
				}
				if(i==2 && j==0) {
					b=btn6;
					btn6.setText(" ");
				}
				if(i==2 && j==1) {
					b=btn7;
					btn7.setText(" ");
				}
				if(i==2 && j==2) {
					b=btn8;
					btn8.setText(" ");
				}
				if(p==0 && q==0) {
					b1=btn0;
					btn0.setText(st1);
				}
				if(p==0 && q==1) {
					b1=btn1;
					btn1.setText(st1);
				}
				if(p==0 && q==2) {
					b1=btn2;
					btn2.setText(st1);
				}
				if(p==1 && q==0) {
					b1=btn3;
					btn3.setText(st1);
				}
				if(p==1 && q==1) {
					b1=btn4;
					btn4.setText(st1);
				}
				if(p==1 && q==2) {
					b1=btn5;
					btn5.setText(st1);
				}
				if(p==2 && q==0) {
					b1=btn6;
					btn6.setText(st1);
				}
				if(p==2 && q==1) {
					b1=btn7;
					btn7.setText(st1);
				}
				if(p==2 && q==2) {
					b1=btn8;
					btn8.setText(st1);
				}
				moves++;
				a[p][q] = a[i][j];
				a[i][j] = 9;
				return 0;
			}
		}
		return 0;
	}

}
