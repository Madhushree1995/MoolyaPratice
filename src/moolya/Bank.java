package moolya;

public class Bank {

	int Cibilscore = 6;
	String BankName;

	public void BankInterest(int Cibilscore, String BankName) {
		if (BankName.equals("SBI") && Cibilscore > 5) {

			System.out.println("interest rate is 8.5%");
		}

		else if (BankName.equals("HDFC")) {
			if (Cibilscore > 5) {

				System.out.println("interest rate is 9");
			} else if (Cibilscore < 5) {
				System.out.println("interest rate is 9.5");
			}
		}

		else if (BankName.equals("ICICI") && (Cibilscore < 5) && (Cibilscore > 3)) {

			System.out.println("interest rate is 10%");
		}
	}

	public static void main(String args[]) {
		Bank bk = new Bank();
		bk.BankInterest(7, "SBI");

	}
}
