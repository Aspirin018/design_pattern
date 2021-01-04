package design.pattern.creational.simplefactory.v3;

import design.pattern.creational.simplefactory.v1.JavaVideo;
import design.pattern.creational.simplefactory.v1.Video;

public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
