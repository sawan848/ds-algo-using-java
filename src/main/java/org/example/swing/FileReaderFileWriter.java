package org.example.swing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.io.*;

public class FileReaderFileWriter extends JFrame implements ActionListener {
	static String file="file.txt";
	private JPanel contentPane;
	private JTextField textField;

	public FileReaderFileWriter (){
		contentPane=new JPanel();

		getContentPane().setBackground(Color.darkGray);
		contentPane.setBackground(Color.gray);

	    setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 308, 600);
		contentPane.add(panel);
		panel.setLayout(null);


		final JButton button=new JButton("click");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(250, 128, 114));
		button.setBounds(43, 391, 81, 51);

        panel.add(button);
		setTitle("FileReaderFileWriter");
		setVisible(true);
		setSize(600,600);
//		setBounds(100,100,600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField=new JTextField();

		textField.setBounds(3, 91, 83, 75);

		panel.add(textField);

		button.addActionListener(this);

	}

	public static String read(String filename) throws IOException{
		BufferedReader reader=new BufferedReader(
				new FileReader(filename));
		String s;
		StringBuilder builder=new StringBuilder();
		while((s=reader.readLine())!=null)
			builder.append(s+"\n");
		reader.close();
		return builder.toString();

	}	
	public static void write(String txt) throws IOException{
		PrintWriter out=new PrintWriter(new BufferedWriter(
					new FileWriter(file)));
		Scanner scanner=new Scanner(System.in);
		
		int count=1;

             //for(int i=0;i<10;i++){
			 //txt=scanner.nextLine();
			out.write(count++ +" "+txt+"\n");
		//}
		
		out.close();

		System.out.println(read(file));
	}
	public static void main(String []args){
		new FileReaderFileWriter();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		try {
			write(text);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		System.out.println(text);
	}
}

