package design.pattern.behavioral.memento;

/**
 * 笔记快照类
 * 注意这个类不需要set方法 只能从Article类中构造而来，不能改变细节
 */
public class ArticleMemento {
    private String title;
    private String content;

    public ArticleMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
