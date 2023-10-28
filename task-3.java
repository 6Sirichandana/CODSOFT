import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ATMINTERFACE1{
 private JFrame frame;
 private JTextField BalanceField;
 private JTextField AmountField;

 private double AccountBalance=1000.0;
 public ATMINTERFACE1() {
	frame = new JFrame(" ATM Machine");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800,400);
	frame.setLayout(new GridLayout(3,3));

	BalanceField=new JTextField("Account Balance: $"+AccountBalance);//create a label to display the balance
	BalanceField.setEditable(false);

	JLabel resultLabel=new JLabel("");//create a label to display transaction result
	
	JPanel TransactionPanel=new JPanel();// Create a panel for deposit and withdrawal
	TransactionPanel.setLayout(new FlowLayout());

	JLabel amountLabel=new JLabel("Amount:$");// Create a label and text field for entering the transaction amount
	AmountField=new JTextField(10);
	

	JButton DepositButton =new JButton("Deposit");
	JButton WithdrawButton=new JButton("Withdraw");

	DepositButton.addActionListener(new ActionListener() {
	   @Override
		public void actionPerformed(ActionEvent e)  {

			try{
				double amount = Double.parseDouble(AmountField.getText());
				if (amount > 0) {
					AccountBalance +=amount;
					resultLabel.setText("Deposit successful. New balance:$" +AccountBalance);
					BalanceField.setText("Account Balance:$"+AccountBalance);
				}
				else{
					resultLabel.setText("Invalid deposit amount.");
				}
			}
			catch(NumberFormatException ex)
			{
				resultLabel.setText("Invalid input. Enter a valid amount.");
			}
		}
	});
	
	WithdrawButton.addActionListener(new ActionListener() {
	    @Override
		public void actionPerformed(ActionEvent e)  {
			try{
				double amount = Double.parseDouble(AmountField.getText());
				if (amount > 0 && amount <= AccountBalance) {
					AccountBalance -=amount;
					resultLabel.setText("Withdrawal successful. New Balance: $"+ AccountBalance);
					BalanceField.setText("Account Balance: $"+AccountBalance);
				}
				else if(amount > AccountBalance) {
						resultLabel.setText("Insfficient Balance.");
				}
				else
				{
					resultLabel.setText("Invalid withdrawal amount.");
				}
			}
			catch(NumberFormatException ex)
			{
				resultLabel.setText("Invalid input. Enter a valid amount.");
			}
		}
	});
	
	TransactionPanel.add(amountLabel);
	TransactionPanel.add(AmountField);
	TransactionPanel.add(DepositButton);
	TransactionPanel.add(WithdrawButton);

	frame.add(BalanceField);
	frame.add(TransactionPanel);
	frame.add(resultLabel);

	frame.setVisible(true);
     }
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ATMINTERFACE1();
			}
		});
	}
}
				