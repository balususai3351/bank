import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame mf =new MyFrame("notebook",1000,500,10,20);
		System.out.println(mf);
		mf.setVisible(true);

	}
}
class MyFrame extends JFrame implements ActionListener{
	JLabel jl1= new JLabel("enter ur file name");
	JTextField jtf  =new JTextField(20);
	JLabel  jl2= new JLabel("write ur matter");
	JTextArea jta= new JTextArea(5,25);
	
	JButton jb3=new JButton("read");
	JButton jb1=new JButton("write");
	JButton jb2=new JButton("clear");
	
	
	MyFrame(String title,int x,int y,int row,int col){
		setTitle(title);
		setSize(row,col);
		setLocation(x,y);
		FlowLayout f1 =new FlowLayout();
		setLayout(f1);
		add(jl1);   add(jtf);
		add(jl2);   add(jta);
		add(jb1);
		add(jb2);
		add(jb3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}

//
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1) {
			System.out.println("submit is clicked");
			String filename=jtf.getText();
			String getchar = jta.getText();
			
			try {
				FileWriter fw=new FileWriter(filename);
				System.out.println("file is ready");
				fw.write(getchar);
				System.out.println("file is written");
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		else if(e.getSource()==jb2) {
				System.out.println("clear is clicked");
			}
		else {
			System.out.println("submit is clicked");
			String filename=jtf.getText();
			String getchar = jta.getText();
			
			try {
				FileReader fr=new FileReader(filename);
			   int r =fr.read();
			   while(r!=1) {
				   System.out.print((char)r);
				    r =fr.read();
				   
			   }
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
		
	}
	


