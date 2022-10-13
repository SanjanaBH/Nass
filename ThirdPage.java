import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ThirdPage
	extends JFrame
	implements ActionListener
	{

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel stitle;
	private JLabel name;
	private JTextField tename;
	private JTextField tename1;
	private JLabel mno;
	private JTextField tmno;
	private Graphics g;
	private JLabel mno1;
    private JLabel mno22;
    private JLabel mno3;
    private JLabel mno4;
    private JLabel mno5;
    
	
	
	
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	
	
	private JLabel name1;
    private JTextField tname2;
    private JLabel mno2;
    private JTextField tmno2;
	private JComboBox elementname1;
    private JComboBox version2;
	private JButton sub2;
	
	/*public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit(); 
		Image i=t.getImage("C:\\Users\\dhanashree.sonawane\\Desktop\\logo1.png");  
		g.drawImage(i,25,35,this);
		
    }*/  


	
	// constructor, to initialize the components
	// with default values.
	public ThirdPage()
	{
		setTitle("SDMX CONVERTER");
		setBounds(50, 50, 1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		ImageIcon img = new ImageIcon("C:\\Users\\dhanashree.sonawane\\Desktop\\pastedImage.jpg");
		this.setIconImage(img.getImage());
		

		c = getContentPane();
		c.setLayout(null);
		
		 Toolkit t=Toolkit.getDefaultToolkit(); 
		 ImageIcon image = new ImageIcon("C:\\Users\\dhanashree.sonawane\\Desktop\\logo1.png");  /*Used ImageIcon instead of Image class */
		//g.drawImage(i,25,35,this);
		
		//Added by Sandeep S
		 JLabel imageLabel = new JLabel(image);
        c.add(imageLabel);
        c.setLayout(null);
        imageLabel.setLocation(0, 0);
        imageLabel.setSize(150, 50);  /*change location either vertical or horizontal */
        imageLabel.setVisible(true);
        c.setVisible(true);
        c.setSize(1000, 750);
		
		stitle = new JLabel("SDMX CONVERTER");
		stitle.setFont(new Font("Arial", Font.PLAIN, 30));
		stitle.setSize(800, 30);
		//title.setLocation(300, 30);
		stitle.setLocation(500, 40);
		c.add(stitle);


		title = new JLabel("Mapping Submission");
		title.setFont(new Font("Arial", Font.PLAIN, 20));
		title.setSize(600, 80);
		//title.setLocation(300, 30);
		title.setLocation(520, 150);
		c.add(title);

		name = new JLabel("Element Name");
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		name.setSize(100, 20);
		//name.setLocation(100, 100);
		name.setLocation(150, 230);
		c.add(name);

		tename = new JTextField();
		//tename.setText("LOANS AND ADVANCES");
		//tename.setEditable(true);
		tename.setFont(new Font("Arial", Font.PLAIN, 12));
		tename.setSize(190, 20);
		//tename.setLocation(200, 100);
		tename.setLocation(250, 230);
		c.add(tename);
		
		name = new JLabel("Version");
		name.setFont(new Font("Arial", Font.PLAIN, 12));
		name.setSize(100, 20);
		//name.setLocation(480, 100);
		name.setLocation(550, 230);
		c.add(name);

		tename1 = new JTextField();
		tename1.setFont(new Font("Arial", Font.PLAIN, 12));
		//tename1.setText("Version 3.0");
		tename1.setSize(190, 20);
		//tename1.setLocation(550, 100);
		tename1.setLocation(640, 230);
		c.add(tename1);

		mno = new JLabel("Performing -");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(130, 320);
		c.add(mno);
		
		mno = new JLabel("Current");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(130, 340);
		c.add(mno);

		mno = new JLabel("Domestic");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(230, 320);
		c.add(mno);
		
		mno = new JLabel("Operations");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(230, 340);
		c.add(mno);
		
		mno = new JLabel("Bills Purchased");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(330, 320);
		c.add(mno);
		
		mno = new JLabel("and Discounts");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(330, 340);
		c.add(mno);
		
		mno = new JLabel("Amount");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(440, 320);
		c.add(mno);
		
		/*mno = new JLabel("Amount");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(300, 200);
		c.add(mno);*/
		
		mno = new JLabel("Indian");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(540, 320);
		c.add(mno);
		
		mno = new JLabel("Rupee");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(540, 340);
		c.add(mno);
		
		mno = new JLabel("Table name ");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(680, 280);
		c.add(mno);
		
		mno = new JLabel("Column name");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(800, 280);
		c.add(mno);
		
		mno = new JLabel("Item Column");
		mno.setFont(new Font("Arial", Font.PLAIN, 12));
		mno.setSize(100, 20);
		mno.setLocation(920, 280);
		c.add(mno);
		
		mno1 = new JLabel("Dimension 1");
		mno1.setFont(new Font("Arial", Font.PLAIN, 12));
		mno1.setSize(100, 20);
		mno1.setLocation(130, 280);
		c.add(mno1);
		
		mno22= new JLabel("Dimension 2");
		mno22.setFont(new Font("Arial", Font.PLAIN, 12));
		mno22.setSize(100, 20);
		mno22.setLocation(230, 280);
		c.add(mno22);
		
		mno3 = new JLabel("Dimension 3");
		mno3.setFont(new Font("Arial", Font.PLAIN, 12));
		mno3.setSize(100, 20);
		mno3.setLocation(330, 280);
		c.add(mno3);
		
		mno4 = new JLabel("Dimension 4");
		mno4.setFont(new Font("Arial", Font.PLAIN, 12));
		mno4.setSize(100, 20);
		mno4.setLocation(440, 280);
		c.add(mno4);
		
		mno5 = new JLabel("Dimension 5");
		mno5.setFont(new Font("Arial", Font.PLAIN, 12));
		mno5.setSize(100, 20);
		mno5.setLocation(540, 280);
		c.add(mno5);
		
		
		
		
		
		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(680, 320);
		c.add(tmno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(800, 320);
		c.add(tmno);
		
		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(920, 320);
		c.add(tmno);
		
		/*tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 10));
		tmno.setSize(100, 20);
		tmno.setLocation(750, 200);
		c.add(tmno);*/
		
		/*add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 300);
		c.add(add);
		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 75);
		tadd.setLocation(200, 300);
		tadd.setLineWrap(true);
		c.add(tadd);*/

		term = new JCheckBox("Validation");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		//term.setLocation(150, 400);
		term.setLocation(150, 450);
		c.add(term);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		//sub.setLocation(150, 450);
		sub.setLocation(150, 500);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		//reset.setLocation(270, 450);
		reset.setLocation(270, 500);
		reset.addActionListener(this);
		c.add(reset);

		/*tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);*/

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		/*resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);*/
		
		JTextField footer = new JTextField();
		footer.setText(" ©Reserve Bank of India. All Rights Reserved");
		footer.setEditable(false);
		footer.setFont(new Font("Arial", Font.PLAIN, 12));
		footer.setSize(1200, 20);
		//footer.setBackground(0,0,0,50);
		//tename.setLocation(200, 100);
		footer.setLocation(000, 530);
		c.add(footer);
		

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{	
		
		 /*JFileChooser chooser = new JFileChooser();
			if (JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(null)) 
			{
			sub.setIcon(new ImageIcon(chooser.getSelectedFile().getAbsolutePath()));*/

		String Ename = tename.getText(); 
		String ver = tename1.getText(); 
		Boolean status = term.isSelected();//.toString();     
		if (Ename.equals("Loans and Advances") && ver.equals("Version 3.0") && status.equals(term.isSelected()))
		{		
				//t.setVisible(false);
				FourthPage fp = new FourthPage();
				fp.setVisible(true);
				
				/*
				JComboBox version;
				String versions[]
				={"Audited", "Unaudited"};
				name1 = new JLabel("Element Name");
				name1.setFont(new Font("Arial", Font.PLAIN, 15));
				name1.setSize(100, 20);
				name1.setLocation(100, 100);
				fp.add(name1);
		 
				tname2 = new JTextField();
				tname2.setFont(new Font("Arial", Font.PLAIN, 15));
				tname2.setSize(190, 20);
				tname2.setLocation(200, 100);
				fp.add(tname2);
		 
				mno2 = new JLabel("Time Period");
				mno2.setFont(new Font("Arial", Font.PLAIN, 15));
				mno2.setSize(100, 20);
				mno2.setLocation(100, 150);
				fp.add(mno2);
		 
				tmno2 = new JTextField();
				tmno2.setFont(new Font("Arial", Font.PLAIN, 15));
				tmno2.setSize(150, 20);
				tmno2.setLocation(200, 150);
				fp.add(tmno2);
				
				/*elementname1 = new JComboBox("Status");
				elementname1.setFont(new Font("Arial", Font.PLAIN, 15));
				elementname1.setSize(100, 20);
				elementname1.setLocation(100, 200);
				fp.add(elementname1);
				
				
				version2 = new JComboBox(versions);
				version2.setFont(new Font("Arial", Font.PLAIN, 15));
				version2.setSize(60, 20);
				version2.setLocation(200, 200);
				fp.add(version2);
				
				sub2 = new JButton("Download");
				sub.setFont(new Font("Arial", Font.PLAIN, 15));
				sub.setSize(100, 20);
				sub.setLocation(150, 450);
				sub.addActionListener(this);
				fp.add(sub);*/
	}//if
				
				

				
			
		 
		 
				
				
		
		} //action

		
	}//main
	
	
	
	
	
// Driver Code

/*class RegistrationMm {

	public static void main(String[] args) throws Exception
	{
		ThirdPage t = new ThirdPage();
		
		
	}
}*/

