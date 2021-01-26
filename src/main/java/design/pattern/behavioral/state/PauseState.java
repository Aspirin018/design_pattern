package design.pattern.behavioral.state;

public class PauseState extends CourseVideoState {
    @Override
    public void play() {
        this.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        this.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停视频");
    }

    @Override
    public void stop() {
        this.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
