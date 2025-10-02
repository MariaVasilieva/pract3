package task2;

/**
 * Abstraction — represents a message that uses a Renderer for output.
 */
public abstract class Message {
    protected Renderer renderer;
    protected String title;
    protected String text;

    /**
     * Constructor for a Message.
     * @param renderer the rendering strategy
     * @param title the title of the message
     * @param text the body of the message
     */
    public Message(Renderer renderer, String title, String text) {
        this.renderer = renderer;
        this.title = title;
        this.text = text;
    }

    /**
     * Displays the message using the selected renderer.
     * @return the rendered message
     */
    public abstract String display();
}
