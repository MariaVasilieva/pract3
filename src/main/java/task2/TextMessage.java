package task2;

/**
 * Refined Abstraction — represents a simple text message.
 */
public class TextMessage extends Message {
    public TextMessage(Renderer renderer, String title, String text) {
        super(renderer, title, text);
    }

    @Override
    public String display() {
        return renderer.render(title, text);
    }
}