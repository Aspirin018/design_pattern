package design.pattern.behavioral.memento;


import org.springframework.binding.message.MessageContext;

public class Test {
    public static void main(String[] args) {
        ArticleMementoManager manager = new ArticleMementoManager();
        Article article = new Article("titleA", "contentA");
        ArticleMemento memento = article.saveToMemento();
        manager.addMemento(memento);

        article.setTitle("titleB");
        article.setContent("contentB");
        ArticleMemento mementoB = article.saveToMemento();
        manager.addMemento(mementoB);

        ArticleMemento mementoOut = manager.getMemento();
        article.undoFromMemento(mementoOut);
        System.out.println(article.toString());

        ArticleMemento mementoOut2 = manager.getMemento();
        article.undoFromMemento(mementoOut2);
        System.out.println(article.toString());

//        MessageContext
    }
}
