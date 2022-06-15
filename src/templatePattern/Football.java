package templatePattern;

public class Football extends Game{
    @Override
    void start() {
        System.out.println("The Football match is kicked off!");
    }

    @Override
    void initialize() {
        System.out.println("The match will begin soon");
    }

    @Override
    void end() {
        System.out.println("Match drawn :'\n'  ");
    }
}
