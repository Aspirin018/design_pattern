package design.pattern.behavioral.templatemethod;

public abstract class ACourse {
    //final 模板方法   不让子类覆盖
    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }
        packageCourse();
    }

    //固定行为 不让子类覆盖
    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    //钩子方法 是否需要编写手记
    protected boolean needWriteArticle() {
        return false;
    }

    //包装课程
    abstract void packageCourse();
}
