package design.pattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail) {
        String output = "向{0}同学，邮件地址:{1}, 内容：{2}发送邮件";
        System.out.println(MessageFormat.format(
                output, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginalContent(Mail mail) {
        System.out.println("存储原始邮件内容：" + mail.getContent());
    }
}
