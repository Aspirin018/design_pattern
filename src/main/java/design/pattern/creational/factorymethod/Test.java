package design.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        videoFactory = new PythonVideoFactory();
        video = videoFactory.getVideo();
        video.produce();
    }
}
