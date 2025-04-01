import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		setSize(500,500);
		setTitle("Bank Account");
		amountLabel = new JLabel ("Amount: ")
		accountLabel = new JLabel ("Account Balance: ");
		transactionLabel = new JLabel ();
		depositButton = new JButton ("Deposit");
		depositButton.addActionListener(this);
		withdrawButton = new JButton ("Withdraw");
		withdrawButton.addActionListener(this);
		setLayout();
		setVisible(true);
		
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
		
		if (event.getSource == withdrawButton) {
			moneyMoved = Double.parseDouble(ammountField.getText());
			if (moneyMoved > userBalance) {
				transactionLabel.setText("You do not have enough funds");
				ammountField.setText(String.valueOf(userBalance));
			}
			else {
				userBalance -= moneyMoved;
			}
			accountLabel.setText("Your Balance is: "+ String.valueOf(userBalance));
			ammountField.setText(String.valueOf(userBalance));
			transactionLabel.setText("Transaction Successful");
			
		}
		
		
	}
	
	
	

}
