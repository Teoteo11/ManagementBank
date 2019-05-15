import java.util.ArrayList;

public class Bank {
    public String id;
    private double credit;
    public ArrayList<Account> listAccount;

    public Bank(String id, double credit) {
        this.id = id;
        this.credit = credit;
        this.listAccount=new ArrayList<>();
    }

    public double getTotalCredit() {
        double total=0;
        for(int i=0;i<this.listAccount.size();i++) {
            total+=this.listAccount.get(i).getCredit();
        }
        return total;
    }

    public Account getAccountFromIban(String iban) {
        for(int i=0;i<this.listAccount.size();i++) {
            if(this.listAccount.get(i).getIban().equals(iban)) return this.listAccount.get(i);
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void addAccount(String iban,double credit) {
        Account account=new Account(iban,credit);
        this.listAccount.add(account);
    }

    public void addMoney(int money){
        this.credit += money;
    }
}