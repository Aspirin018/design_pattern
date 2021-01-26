package design.pattern.behavioral.state;

public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("播放视频");
    }

    @Override
    public void speed() {
        this.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        this.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        this.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
