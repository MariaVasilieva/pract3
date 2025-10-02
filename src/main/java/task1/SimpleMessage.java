package task1;

/**
 * Concrete Component — a simple message without any additional processing.
 */
public class SimpleMessage implements Message {
    private String text;

    /**
     * Constructor for creating a simple message.
     * @param text the message content
     */
    public SimpleMessage(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }
}
