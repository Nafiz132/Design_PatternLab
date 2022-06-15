package templatePattern;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game= new Cricket();
        game.play();
        System.out.println("\n");
        game=new Football();
        game.play();
    }
}
