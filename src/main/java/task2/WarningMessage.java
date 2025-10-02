package task2;

/**
 * Refined Abstraction — represents a warning message.
 */
public class WarningMessage extends Message {
    public WarningMessage(Renderer renderer, String title, String text) {
        super(renderer, title, text);
    }

    @Override
    public String display() {
        return renderer.render("WARNING: " + title, text);
    }
}