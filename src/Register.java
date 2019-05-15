import java.util.ArrayList;

public class Register {
    private ArrayList<Bank> register = new ArrayList<>();

    public Register(ArrayList<Bank> register) {
        this.register = register;
    }

    public void addBank(Bank bank) {
        this.register.add(bank);
    }

    public Bank getBankById(String id) {
        for (int i = 0; i < this.register.size(); i++) {
            if (this.register.get(i).getId().equals(id)) return this.register.get(i);
        }
        return null;
    }

    public Account getAccountByIban(String iban) {
        for (int i = 0; i < this.register.size(); i++)
            for (int j = 0; j < this.register.get(i).listAccount.size(); j++)
                if (this.register.get(i).listAccount.get(j).getIban().equals(iban))
                    return this.register.get(i).listAccount.get(j);
        return null;
    }

    public void transferMoney(String iban1, String iban2, double money) {
        String idBank="";
        Account account1 = getAccountByIban(iban1);
        Account account2 = getAccountByIban(iban2);
        if (account1.getIdBank() != account2.getIdBank()) {
            idBank = account1.getIdBank();
            getBankById(idBank).addMoney(1);
        }
        account1.sendMoney(money + 1);
        account2.receiveMoney(money);
    }





}