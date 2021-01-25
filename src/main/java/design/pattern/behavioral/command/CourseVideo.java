package design.pattern.behavioral.command;

public class CourseVideo {
    private String name;

    public void open() {
        System.out.println(name + "课程视频开放");
    }

    public void close() {
        System.out.println(name + "课程视频关闭");
    }

    public CourseVideo(String name) {
        this.name = name;
    }
}
