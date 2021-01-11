package design.pattern.anotherstructual.bridge;

/**
 * 农行
 */
public class ABCBank extends Bank{

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开农行账户。");
        //不要忘记委托给account实现
        account.openAccount();
        return account;
    }
}
