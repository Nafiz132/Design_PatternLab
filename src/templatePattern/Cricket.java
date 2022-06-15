package templatePattern;

public class Cricket extends Game{

    @Override
    void start() {
        System.out.println("The game of Cricket Started");
    }

    @Override
    void initialize() {
        System.out.println("The match is about to begin");
    }

    @Override
    void end() {
        System.out.println("The match is finished!");
    }
}
