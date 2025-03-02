package assignment2;
class Bank {
    String bankName;
    double depositAmount;
    static double totalAmount = 0;
    public void setBankName(String name) {
        this.bankName = name;
    }
    public void setAmount(double amount) {
        if (amount < 1000) {
            System.out.println("Minimum deposit amount is 1000.");
        } else {
            this.depositAmount = amount;
            totalAmount += amount;
        }
    }
    public void showData() {   	
        System.out.println(bankName+"\tRs"+depositAmount+"/-");
    }
    public static void displayMinimumDepositBank(Bank[] banks) {
        String minDepositBank = " ";  
        double minDepositAmount = Double.MAX_VALUE;    
        for (int i = 0; i < banks.length; i++) {
            if (banks[i].depositAmount < minDepositAmount) {
                minDepositAmount = banks[i].depositAmount;
                minDepositBank = banks[i].bankName;
            }
        }
        System.out.println();
        System.out.println("Bank with minimum deposit amount: " + minDepositBank);
    }
}
public class OodHWQ3 {
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];      
        for (int i = 0; i < 5; i++) {
            banks[i] = new Bank();
        }    
        banks[0].setBankName("SBI Bank");banks[0].setAmount(1500);     
        banks[1].setBankName("Bank of Baroda");banks[1].setAmount(2000);
        banks[2].setBankName("HDFC Bank");banks[2].setAmount(1000); 
        banks[3].setBankName("ICICI Bank");banks[3].setAmount(1200); 
        banks[4].setBankName("Central Bank");banks[4].setAmount(9000);     
        System.out.println("Bank Name\tDeposit Amount");
        for (int i = 0; i < banks.length; i++) {
            banks[i].showData();
        }
        System.out.println();
        System.out.println("Total amount deposited: Rs" + Bank.totalAmount+"/-");
        Bank.displayMinimumDepositBank(banks);
    }
}