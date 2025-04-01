import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class BankAccount extends JFrame implements ActionListener {
	private JLabel amountLabel;
	private JLabel accountLabel;
	private JLabel transactionLabel;
	private JTextField ammountField;
	private JButton depositButton;
	private JButton withdrawButton;
	private double userBalance = 0.0;
	private double moneyMoved = 0.0; 
	
	
	
	public BankAccount () {
		this.setSize(300,300);
		this.setTitle("Bank Account");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		amountLabel = new JLabel ("Amount: ");
		accountLabel = new JLabel ("Account Balance: ");
		transactionLabel = new JLabel ();
		ammountField = new JTextField(15);
		ammountField.setEditable(true);
		depositButton = new JButton ("Deposit");
		depositButton.addActionListener(this);
		withdrawButton = new JButton ("Withdraw");
		withdrawButton.addActionListener(this);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.add(panel3, BorderLayout.SOUTH);
		
		panel1.setLayout(new BorderLayout()); 
		panel1.add(amountLabel, BorderLayout.NORTH);
		panel1.add(ammountField, BorderLayout.CENTER);
	
		panel2.setLayout(new BorderLayout()); 
		panel2.add(accountLabel, BorderLayout.NORTH);
		panel2.add(transactionLabel, BorderLayout.CENTER);
		
		panel3.setLayout(new BorderLayout()); 
		panel3.add(depositButton, BorderLayout.NORTH);
		panel3.add(withdrawButton, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()== depositButton) {
			moneyMoved = Double.parseDouble(ammountField.getText());
			userBalance += moneyMoved;
			accountLabel.setText("Your Balance is: "+ String.valueOf(userBalance));
			ammountField.setText(String.valueOf(userBalance));
			transactionLabel.setText("Transaction Successful");
			
		}
		
		if (event.getSource () == withdrawButton) {
			moneyMoved = Double.parseDouble(ammountField.getText());
			if (moneyMoved > userBalance) {
				transactionLabel.setText("You do not have enough funds");
				ammountField.setText(String.valueOf(userBalance));
			}
			else {
				userBalance -= moneyMoved;
			
			accountLabel.setText("Your Balance is: "+ String.valueOf(userBalance));
			ammountField.setText(String.valueOf(userBalance));
			transactionLabel.setText("Transaction Successful");
			}
			
		}
		
		
	}
	
	
	

}