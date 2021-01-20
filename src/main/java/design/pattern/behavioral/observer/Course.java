package design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 被观察者
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提出了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
