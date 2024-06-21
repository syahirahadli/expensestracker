import javax.swing.JLabel;

public class Cash implements Transactions {
	private JLabel balanceLabel;

    public Cash(JLabel balanceLabel) {
        this.balanceLabel = balanceLabel;
    }

    @Override
    public void updateAmount(double amount) {
        double currentBalance = Double.parseDouble(balanceLabel.getText());
        double updatedBalance = currentBalance + amount;
        balanceLabel.setText(String.format("%.2f", updatedBalance));
    }
}
