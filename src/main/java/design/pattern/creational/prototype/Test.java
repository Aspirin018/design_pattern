package design.pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Mail originalMail = new Mail();
//        originalMail.setContent("初始化的模板。");
//        for (int i = 0; i < 3; i++) {
//            originalMail.setName("姓名"+i);
//            originalMail.setEmailAddress("地址"+i);
//            originalMail.setContent("内容"+i);
//            MailUtil.sendMail(originalMail);
//        }
//        MailUtil.saveOriginalContent(originalMail);

        Mail originalMail = new Mail();
        originalMail.setContent("初始化的模板。");
        System.out.println(originalMail);
        for (int i = 0; i < 3; i++) {
            Mail clonedMail = (Mail) originalMail.clone();
            clonedMail.setName("姓名" + i);
            clonedMail.setEmailAddress("地址" + i);
            clonedMail.setContent("内容" + i);
            System.out.println(clonedMail);
            MailUtil.sendMail(clonedMail);
        }
        MailUtil.saveOriginalContent(originalMail);
    }
}
