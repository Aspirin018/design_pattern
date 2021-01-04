package design.pattern.creational.simplefactory.v2;

import design.pattern.creational.simplefactory.v1.Video;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("Java");
        if (video == null) {
            return;
        }
        video.produce();
    }
}
