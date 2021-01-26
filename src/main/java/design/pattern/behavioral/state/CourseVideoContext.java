package design.pattern.behavioral.state;

public class CourseVideoContext {
    private CourseVideoState courseVideoState;

    public static final PlayState PLAY_STATE = new PlayState();
    public static final SpeedState SPEED_STATE = new SpeedState();
    public static final PauseState PAUSE_STATE = new PauseState();
    public static final StopState STOP_STATE = new StopState();

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContext(this);
    }

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void play() {
        courseVideoState.play();
    }

    public void speed() {
        courseVideoState.speed();
    }

    public void pause() {
        courseVideoState.pause();
    }

    public void stop() {
        courseVideoState.stop();
    }
}
