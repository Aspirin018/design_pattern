package design.pattern.behavioral.memento;

/**
 * 笔记类
 */
public class Article {
    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public ArticleMemento saveToMemento(){
        ArticleMemento articleMemento = new ArticleMemento(title, content);
        return articleMemento;
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        title = articleMemento.getTitle();
        content = articleMemento.getContent();
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
