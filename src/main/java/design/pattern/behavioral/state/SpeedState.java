package design.pattern.behavioral.state;

public class SpeedState extends CourseVideoState {
    @Override
    public void play() {
        this.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进视频");
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
