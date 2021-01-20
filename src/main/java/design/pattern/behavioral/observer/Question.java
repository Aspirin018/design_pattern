package design.pattern.behavioral.observer;

public class Question {
    private String userName;
    private String questionContent;

    public Question(String userName, String questionContent) {
        this.userName = userName;
        this.questionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }


    public String getQuestionContent() {
        return questionContent;
    }

}
