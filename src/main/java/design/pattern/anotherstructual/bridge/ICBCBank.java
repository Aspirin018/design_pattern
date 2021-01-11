package design.pattern.anotherstructual.bridge;


/**
 * 工行
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工行账户。");
        //不要忘记委托给account实现
        account.openAccount();
        return account;
    }

}
