package design.pattern.creational.simplefactory.v2;

import design.pattern.creational.simplefactory.v1.JavaVideo;
import design.pattern.creational.simplefactory.v1.PythonVideo;
import design.pattern.creational.simplefactory.v1.Video;

public class VideoFactory {
    public Video getVideo(String type) {
        if("Java".equals(type)){
            return new JavaVideo();
        } else if("Python".equals(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
