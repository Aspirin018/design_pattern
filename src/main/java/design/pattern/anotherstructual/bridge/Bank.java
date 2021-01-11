package design.pattern.anotherstructual.bridge;

/**
 * 银行类
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

     abstract Account openAccount();
}
