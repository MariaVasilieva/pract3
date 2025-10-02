package task2;

/**
 * Renderer interface — defines how a message should be rendered.
 */
public interface Renderer {
    /**
     * Renders a message given a title and body.
     * @param title the title of the message
     * @param text the body of the message
     * @return a formatted message string
     */
    String render(String title, String text);
}
