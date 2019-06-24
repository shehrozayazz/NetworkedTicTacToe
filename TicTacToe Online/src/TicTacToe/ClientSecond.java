package TicTacToe;
import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import  java.lang.NullPointerException;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.lang.Thread;
import java.net.Socket;
import java.lang.Runnable;
public class ClientSecond extends Thread {
//Network
	
	static Socket s;
	static  DataInputStream din;
	static DataOutputStream  dout;
	static JTextArea MessageArea1;
	static JScrollPane scrollPane;
	static String Client1,ClientN,sname,PN;
	static int PortNum;
	
	static int iN=0,k=0;
	//====
	private JFrame frame;
	static JTextField textFieldPlayer1Score;
	static JTextField textFieldPlayer2Score;
    public static int draw=0,i=0;
   public static  int player=1,player1=0,player2=0;
  static int buttonI[]=new int[9];
  static char button[]=new char[9];
  
	static JButton ButtonReset,ButtonName,Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9;
	static JLabel labelPlayerTurn,Player2Label,Player1Label;
	public static JTextField textFieldPlayerTurn;
  static void PlayerProb() {
	  try {
			String msgout="";
			
		msgout=	"NO"; 
		dout.writeUTF(msgout);
		
		checkWin();
				
			
			}
			catch(IOException e) {
				JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

			}
  }
 static void NullButton() {
	 for(int i=0;i<9;++i) 
		 buttonI[i]=2;
 }
  static   void checkWin() {
		 // For player 1  Win 
		 draw++;
		

		 if (button[0]=='x' &&  button[1]=='x' && button[2]=='x') {
			  if(i==0) {
			 draw=0;
			 player=0;
			
			 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));
			 Button2.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));
			 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));
            
            		 player1++;
			 textFieldPlayer1Score.setText(Integer.toString(player1));
		
			 i++;
			 NullButton();
			 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");

				
			 }
              else 
            	  i=1;
              

			 
		 }
		 else if (button[3]=='x' &&  button[4]=='x' && button[5]=='x') {
			// JOptionPane.showMessageDialog(null, " Player 1 wins the ClientTic");
			 if(i==0) {
			 draw=0;
			
			 player=1;
			 Button4.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));			
			 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));
			 Button6.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));
			 
				  player1++;
					 textFieldPlayer1Score.setText(Integer.toString(player1));
					 i++;
					 NullButton();
					 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");
					 }
			  else 
            	  i=1;
			
		 }
	 else if (button[6]=='x' &&  button[7]=='x' && button[8]=='x') {
		 if(i==0) {
		 draw=0;
		
		 player=1;
		 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));			
		 Button8.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));
		 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\q.png"));
		 
			  player1++;
				 textFieldPlayer1Score.setText(Integer.toString(player1));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");
				 }
		  else 
        	  i=1;
		
		 }
		 
	 else if (button[0]=='x' &&  button[4]=='x' && button[8]=='x') {
		 if(i==0) {
		 draw=0;
		
		 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\f.png"));			
		 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\f.png"));
		 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\f.png"));
		 
			  player1++;
				 textFieldPlayer1Score.setText(Integer.toString(player1));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");
				 }
		  else 
        	  i=1;
	
		
		 
	 }
	else if (button[2]=='x' &&  button[4]=='x' && button[6]=='x') {
		 if(i==0) {
		 draw=0;
		
		 player=1;
		 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\e.png"));			
		 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\e.png"));
		 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\e.png"));
		 
			  player1++;
				 textFieldPlayer1Score.setText(Integer.toString(player1));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");
				 }
		  else 
        	  i=1;
	
		
		 
	 }
	else if (button[0]=='x' &&  button[3]=='x' && button[6]=='x') {
if(i==0) {
		 draw=0;
		
		 player=1;
		 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));			
		 Button4.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));
		 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));
		  
			  player1++;
				 textFieldPlayer1Score.setText(Integer.toString(player1));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");
				 }
		  else 
        	  i=1;
	
		
		 }
		 
	else if (button[1]=='x' &&  button[4]=='x' && button[7]=='x') {
		 if(i==0) {
		 draw=0;
		
		 player=1;
		 Button2.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));			
		 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));
		 Button8.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));
		 
			  player1++;
				 textFieldPlayer1Score.setText(Integer.toString(player1));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");
				 }
		  else 
        	  i=1;
	
		
	}
	else if (button[2]=='x' &&  button[5]=='x' && button[8]=='x') {
		 if(i==0) {
		 draw=0;
		 
		 player=1;
		 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));			
		 Button6.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));
		 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\w.png"));
		  
			  player1++;
				 textFieldPlayer1Score.setText(Integer.toString(player1));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "    Y O U    W I N  ");
				 }
		  else 
        	  i=1;
		
	}
		 // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%        For Player 2
		 
		 
		 
	else  if (button[0]=='o' &&  button[1]=='o' && button[2]=='o') {
		 if(i==0) {
		 draw=0;
		 
		 player=0;
		 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));			
		 Button2.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));
		 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));
		 
			  player2++;
				 textFieldPlayer2Score.setText(Integer.toString(player2));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
				 PlayerProb();

				 }
		  else 
       	  i=1;
				
		 }
		 
		 else if (button[3]=='o' &&  button[4]=='o' && button[5]=='o') {
			 if(i==0) {
		 
			 draw=0;
			 
			 player=0;
			 Button4.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));			
			 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));
			 Button6.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));
			 
				  player2++;
					 textFieldPlayer2Score.setText(Integer.toString(player2));
					 i++;
					 NullButton();
					 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
					 PlayerProb();

					 }
			  else 
	       	  i=1;
					
		 }
	 else if (button[6]=='o' &&  button[7]=='o' && button[8]=='o') {
		 if(i==0) {
          draw=0;
		 
		 player=0;
		 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));			
		 Button8.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));
		 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\c.png"));
		 
			  player2++;
				 textFieldPlayer2Score.setText(Integer.toString(player2));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
				 PlayerProb();

				 }
		  else 
       	  i=1;
				
		 }
		 
	 else if (button[0]=='o' &&  button[4]=='o' && button[8]=='o') {
		 if(i==0) {
 draw=0;
		 
		 player=0;
		 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\v.png"));			
		 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\v.png"));
		 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\v.png"));
		 
			  player2++;
				 textFieldPlayer2Score.setText(Integer.toString(player2));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
				 PlayerProb();

				 }
		  else 
       	  i=1;
				
		 
	 }
	else if (button[2]=='o' &&  button[4]=='o' && button[6]=='o') {
		 if(i==0) {
 draw=0;
		 
		 player=0;
		 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\b.png"));			
		 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\b.png"));
		 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\b.png"));
		 
			  player2++;
				 textFieldPlayer2Score.setText(Integer.toString(player2));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
				 PlayerProb();

				 }
		  else 
       	  i=1;
				
	 }
		 
		 
	else if (button[0]=='o' &&  button[3]=='o' && button[6]=='o') {
		 if(i==0) {
 draw=0;
		 
		 player=0;
		 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));			
		 Button4.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));
		 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));
		  
			  player2++;
				 textFieldPlayer2Score.setText(Integer.toString(player2));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
				 PlayerProb();

				 }
		  else 
       	  i=1;
				
		 }
		 
	else if (button[1]=='o' &&  button[4]=='o' && button[7]=='o') {
		 if(i==0) {
 draw=0;
		 
		 player=0;
		 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));			
		 Button2.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));
		 Button8.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));
		
			  player2++;
				 textFieldPlayer2Score.setText(Integer.toString(player2));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
				 PlayerProb();

				 }
		  else 
       	  i=1;
				
	}
	else if (button[2]=='o' &&  button[5]=='o' && button[8]=='o') {
		 if(i==0) {
 draw=0;
		 
		 player=0;
		 Button6.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));			
		 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));
		 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\n.png"));
		
			  player2++;
				 textFieldPlayer2Score.setText(Integer.toString(player2));
				 i++;
				 NullButton();
				 JOptionPane.showMessageDialog(null, "     Y O U      L O S E !  ");
				 PlayerProb();

				 }
		  else 
       	  i=1;
				
	}
		 
		 
		 
		 
		 
	/*else {
	if (draw==9) {
		 JOptionPane.showMessageDialog(null, "   IT'S  A   DRAW !!!   ");
	player=0;
	 draw=0;
		 
	 }
	}*/
	 }
//  &&&&&&&&& &&&&&&&& &&&&&& &&&& &&&&&&&  &&&&&  &&&&&&&&&&&&&&&&&&  &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	public static void main(String[] args) {
	
		for(int x: buttonI) 
			buttonI[x]=0;
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Client1=JOptionPane.showInputDialog("Enter Your  name : ");
					sname=Client1; 
					ClientSecond window = new ClientSecond();
					window.frame.setVisible(true);
									
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
		// networking 
		
		
		

		String msgin="";		
		
		
		try {
			
			
			
			
			
			PN=JOptionPane.showInputDialog("Enter the IP address : ");
			//PortNum=Integer.parseInt(PN);
			s= new Socket(PN,12001); 
			JOptionPane.showMessageDialog(null," Connected to the server ");
			din= new DataInputStream(s.getInputStream());
			dout=new DataOutputStream(s.getOutputStream());
			
			while(!msgin.equals("exit")) {
				msgin=din.readUTF();
				
				
				 if (msgin.endsWith("1")) {
					Button1.doClick();
					 checkWin();
					continue;
				}
				
				else if (msgin.endsWith("2")) {
					Button2.doClick();
					 checkWin();
					continue;
				}
				else if (msgin.endsWith("3")) {
					Button3.doClick();
					 checkWin();
					continue;
				}
				else if (msgin.endsWith("4")) {
					Button4.doClick();
					 checkWin();
					continue;
				}
				else if (msgin.endsWith("5")) {
					Button5.doClick();
					 checkWin();
					continue;
				}
				else if (msgin.endsWith("6")) {
					Button6.doClick();
					 checkWin();
					continue;
				}
				else if (msgin.endsWith("7")) {
					Button7.doClick();
					 checkWin();
					continue;
				}
				else if (msgin.endsWith("8")) {
					Button8.doClick();
					 checkWin();
					continue;
				}
				else if (msgin.endsWith("9")) {
					Button9.doClick();
					 checkWin();
					continue;
				}
				
				 
			}
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null,e+"Error! No connection found!");
			System.exit(0);
		}
		// ===========
		
	}
	

	
	public ClientSecond() {
		
		initialize();
		

	}

	
	private void initialize() {
		
		
		frame = new JFrame(Client1);
		frame.setBounds(100, 100, 524, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel TicTacToeLabel = new JLabel("                        TIC  TAC  TOE");
		TicTacToeLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		TicTacToeLabel.setBounds(10, 4, 410, 48);
		frame.getContentPane().add(TicTacToeLabel);

		
		
		//&&&&&&&&&&&&&&&&&&&&&&&&            RESET BUTTON          &&&&&&&&&&&&&&&&&&&&&&&&&&&&

		 ButtonReset = new JButton("RESET");
		ButtonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int x=0;x<9;x++) { 
					buttonI[x]=0;}
				for(int x=0;x<9;x++ ) {
					button[x]='\0';
				}
             draw=0;
				i=0;
				/*Random r=new Random();
				player=r.nextInt(2);*/
				player=1;
				Button1.setIcon(null);
				Button2.setIcon(null);
				Button3.setIcon(null);
				Button4.setIcon(null);
				Button5.setIcon(null);
				Button6.setIcon(null);
				Button7.setIcon(null);
				Button8.setIcon(null);
				Button9.setIcon(null);
				
				
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
				 
			}
		});
		ButtonReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		ButtonReset.setBounds(283, 221, 99, 57);
		frame.getContentPane().add(ButtonReset);
		
		
		
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 1          &&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
		 Button1= new JButton("");
		 
		Button1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 5));
		Button1.setForeground(new Color(255, 0, 0));
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[0]==0&& player==0) {
					 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
					
				player=1;
				button[0]='x';
				checkWin();
				buttonI[0]=1;
				//networking
				
				
				
				try {
					String msgout="";
					
				msgout=	"1"; 
				dout.writeUTF(msgout);
				
				checkWin();
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				//=====
				
				
				
				
				
				}
				
				else if (buttonI[0]==0&& player==1) {
					 Button1.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[0]='o';
					checkWin();
					buttonI[0]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
			
			}
		});
		Button1.setBackground(Color.BLACK);
		Button1.setBounds(14, 78, 78, 66);
		frame.getContentPane().add(Button1);
		Player1Label = new JLabel("Y O U - X");
		
		Player1Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		Player1Label.setBounds(278, 120, 104, 40);
		
		frame.getContentPane().add(Player1Label);
		
		 Player2Label = new JLabel("OPPONENT-O");
		 
		Player2Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		Player2Label.setBounds(282, 168, 104, 40);
		frame.getContentPane().add(Player2Label);
		
		textFieldPlayer1Score = new JTextField();
		textFieldPlayer1Score.setBackground(new Color(240, 255, 240));
		textFieldPlayer1Score.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlayer1Score.setFont(new Font("Tahoma", Font.PLAIN, 31));
		textFieldPlayer1Score.setText(Integer.toString(player1));
		textFieldPlayer1Score.setBounds(390, 123, 104, 31);
		frame.getContentPane().add(textFieldPlayer1Score);
		textFieldPlayer1Score.setColumns(10);
		
		textFieldPlayer2Score = new JTextField();
		textFieldPlayer2Score.setBackground(new Color(240, 255, 240));
		textFieldPlayer2Score.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlayer2Score.setFont(new Font("Tahoma", Font.PLAIN, 31));
		textFieldPlayer2Score.setText(Integer.toString(player2));

		textFieldPlayer2Score.setColumns(10);
		textFieldPlayer2Score.setBounds(391, 173, 104, 30);
		frame.getContentPane().add(textFieldPlayer2Score);
		
		JButton ExitButton = new JButton("EXIT");
		ExitButton.setVisible(true);
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		ExitButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		ExitButton.setBounds(390, 221, 104, 57);
		frame.getContentPane().add(ExitButton);
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 2          &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button2 = new JButton("");
		Button2.setFont(new Font("Tahoma", Font.PLAIN, 5));
		
		Button2.setBackground(Color.BLACK);
		Button2.setBounds(94, 78, 78, 66);
		frame.getContentPane().add(Button2);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[1]==0&& player==0) {
					 Button2.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[1]='x';
				checkWin();
				buttonI[1]=1;
				
				
				
				try {
					String msgout="";
					
				msgout=	"2"; 
				dout.writeUTF(msgout);
				
				checkWin();
						
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				
				
				}
				
				else if (buttonI[1]==0&& player==1) {
					 Button2.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[1]='o';
					checkWin();
					buttonI[1]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
				
			}
		});
	
		
		
		
		
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 3          &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button3 = new JButton("");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[2]==0&& player==0) {
					 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[2]='x';
				checkWin();
				buttonI[2]=1;
				
				
				
				try {
					String msgout="";
					
				msgout=	"3"; 
				dout.writeUTF(msgout);
				
			
				checkWin();
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				
				}
				
				else if (buttonI[2]==0&& player==1) {
					 Button3.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[2]='o';
					checkWin();
					buttonI[2]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
				
			}
		});
	
		Button3.setFont(new Font("Tahoma", Font.PLAIN, 3));
		Button3.setBackground(Color.BLACK);
		Button3.setBounds(174, 78, 78, 66);
		frame.getContentPane().add(Button3);
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 4          &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button4 = new JButton("");
		Button4.setBackground(Color.BLACK);
		Button4.setBounds(14, 146, 78, 66);
		frame.getContentPane().add(Button4);
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[3]==0&& player==0) {
					 Button4.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[3]='x';
				checkWin();
				buttonI[3]=1;
				
				
				
				try {
					String msgout="";
					
				msgout=	"4"; 
				dout.writeUTF(msgout);
				checkWin();
			
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				}
				
				else if (buttonI[3]==0&& player==1) {
					 Button4.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[3]='o';
					checkWin();
					buttonI[3]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
				
			}
		});
	
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 5         &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button5 = new JButton("");
		Button5.setBackground(Color.BLACK);
		Button5.setBounds(94, 146, 78, 66);
		frame.getContentPane().add(Button5);
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[4]==0&& player==0) {
					 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[4]='x';
				checkWin();
				buttonI[4]=1;
				
				
				try {
					String msgout="";
					
				msgout=	"5"; 
				dout.writeUTF(msgout);
				
			
				checkWin();
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				}
				
				else if (buttonI[4]==0&& player==1) {
					 Button5.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[4]='o';
					checkWin();
					buttonI[4]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
			}
		});
	
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 6          &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button6 = new JButton("");
		Button6.setBackground(Color.BLACK);
		Button6.setBounds(174, 146, 78, 66);
		frame.getContentPane().add(Button6);
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[5]==0&& player==0) {
					 Button6.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[5]='x';
				checkWin();
				buttonI[5]=1;
				
				
				try {
					String msgout="";
					
				msgout=	"6"; 
				dout.writeUTF(msgout);
				
				checkWin();
						
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				}
				
				else if (buttonI[5]==0&& player==1) {
					 Button6.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[5]='o';
					checkWin();
					buttonI[5]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
			}
		});
	
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 7         &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button7 = new JButton("");
		Button7.setBackground(Color.BLACK);
		Button7.setBounds(14, 214, 78, 66);
		frame.getContentPane().add(Button7);
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[6]==0&& player==0) {
					 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[6]='x';
				checkWin();
				buttonI[6]=1;
				
				
				try {
					String msgout="";
					
				msgout=	"7"; 
				dout.writeUTF(msgout);
				
				checkWin();
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				}
				
				else if (buttonI[6]==0&& player==1) {
					 Button7.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[6]='o';
					checkWin();
					buttonI[6]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
				
			}
		});
	
		//&&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 8         &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button8 = new JButton("");
		Button8.setBackground(Color.BLACK);
		Button8.setBounds(94, 214, 78, 66);
		frame.getContentPane().add(Button8);
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[7]==0&& player==0) {
					 Button8.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[7]='x';
				checkWin();
				buttonI[7]=1;
				
				
				try {
					String msgout="";
					
				msgout=	"8"; 
				dout.writeUTF(msgout);
				
				checkWin();
					
						
					
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				}
				
				else if (buttonI[7]==0&& player==1) {
					 Button8.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[7]='o';
					checkWin();
					buttonI[7]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
			}
		});
	
		// &&&&&&&&&&&&&&&&&&&&&&&&            B.U.T.T.O.N 9          &&&&&&&&&&&&&&&&&&&&&&&&&&&&
		 Button9 = new JButton("");
		Button9.setFont(new Font("Tahoma", Font.PLAIN, 3));
		Button9.setBackground(Color.BLACK);
		Button9.setBounds(174, 214, 78, 66);
		frame.getContentPane().add(Button9);
		
		labelPlayerTurn = new JLabel(" T U R N ");
		labelPlayerTurn.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelPlayerTurn.setBounds(282, 75, 104, 40);
		frame.getContentPane().add(labelPlayerTurn);
		
		textFieldPlayerTurn = new JTextField();
		textFieldPlayerTurn.setForeground(new Color(255, 0, 0));
		textFieldPlayerTurn.setBackground(new Color(0, 0, 0));
		textFieldPlayerTurn.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlayerTurn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		textFieldPlayerTurn.setBounds(388, 74, 106, 32);
		frame.getContentPane().add(textFieldPlayerTurn);
		textFieldPlayerTurn.setColumns(10);
		textFieldPlayerTurn.setEditable(false);
		textFieldPlayer1Score.setEditable(false);
		textFieldPlayer2Score.setEditable(false);
		
		JButton ButtonName = new JButton("NAME");
		ButtonName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String msgout="";
					
					if(iN==0)
					{
						sname+=".";
						dout.writeUTF(sname);
						ButtonName.setVisible(false);
						ExitButton.setVisible(true);
						iN++;
						
					}
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}
				
				
				
			}
		});
		ButtonName.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		ButtonName.setBounds(395, 221, 99, 57);
		
		
		
		
		frame.getContentPane().add(ButtonName);

		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (buttonI[8]==0&& player==0) {
					 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\x.png"));
				
				player=1;
				button[8]='x';
				checkWin();
				buttonI[8]=1;
				
				try {
					String msgout="";
					
				msgout=	"9"; 
				dout.writeUTF(msgout);
				checkWin();
			
					}
					catch(IOException e) {
						JOptionPane.showMessageDialog(null,e+"Error! The connection has lost!");

					}

				}
				
				else if (buttonI[8]==0&& player==1) {
					 Button9.setIcon(new ImageIcon("C:\\Users\\Shehroz\\Documents\\JAVA Projects\\Calculator3\\src\\o.png"));
					
					player=0;
					button[8]='o';
					checkWin();
					buttonI[8]=1;
					}
				if(player==0)
					textFieldPlayerTurn.setText("X");
				else if(player ==1)
					textFieldPlayerTurn.setText("O");
			}
		});
		
		
	
	}
}


