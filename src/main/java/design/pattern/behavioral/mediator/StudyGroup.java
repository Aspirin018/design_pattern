package design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * 学习交流讨论群  中介者
 */
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " : [ " + user.getName() + " ] " + message);
    }
}
