import javax.swing.JLabel;

public class Expenses implements Transactions {
	private JLabel amountLabel;

    public Expenses(JLabel amountLabel) {
        this.amountLabel = amountLabel;
    }

    @Override
    public void updateAmount(double amount) {
        double currentAmount = Double.parseDouble(amountLabel.getText());
        double updatedAmount = currentAmount + amount;
        amountLabel.setText(String.format("%.2f", updatedAmount));
    }
}
