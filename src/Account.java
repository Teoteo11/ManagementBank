public class Account {
    private String iban;
    private double credit;
    public String idBank;


    public Account(String iban, double credit) {
        this.iban=iban;
        this.credit=credit;
    }

    public String getIban() {
        return iban;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }


    public void sendMoney(double money){
        this.credit-=money;
    }

    public void receiveMoney(double money){
        this.credit+=money;
    }

    public String getIdBank() {
        return idBank;
    }
}














