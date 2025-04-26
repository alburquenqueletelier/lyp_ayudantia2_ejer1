package Account;

public class Account {

    protected String name;
    protected String account;
    private Integer money;

    public Account(
            String name,
            String account,
            Integer money) {
        this.name = name;
        this.account = account;
        this.money = money;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getAccount() {
        return this.account;
    }

    public Integer getMoney() {
        return this.money;
    }

    // setter
    public void addMoney(Integer money) {
        this.money += money;
    }

    public void retriveMoney(Integer money) {
        if (this.money - money < 0) {
            System.out.println("No tienes saldo suficiente. Saldo: " + this.money);
        } else {

            this.money -= money;
        }
    }
}