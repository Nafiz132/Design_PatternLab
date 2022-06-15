package templatePattern;

public abstract class Game {
    abstract void start();
    abstract void initialize();
    abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}
