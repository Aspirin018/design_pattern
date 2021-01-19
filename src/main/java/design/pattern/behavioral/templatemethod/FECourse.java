package design.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供前端代码");
        System.out.println("提供图片等素材");
    }
}
