package task2;

/**
 * Concrete Renderer — renders messages to the console.
 */
public class ConsoleRenderer implements Renderer {
    @Override
    public String render(String title, String text) {
        return "[Console Output]\n" + title + ": " + text;
    }
}