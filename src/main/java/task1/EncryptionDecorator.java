package task1;

/**
 * Concrete Decorator — applies "encryption" to a message,
 * in this case simply reversing the text.
 */
public class EncryptionDecorator extends MessageDecorator {
    /**
     * Constructor for the encryption decorator.
     * @param message the message to be encrypted
     */
    public EncryptionDecorator(Message message) {
        super(message);
    }

    @Override
    public String getContent() {
        return encrypt(super.getContent());
    }

    /**
     * Private helper method to "encrypt" text (by reversing the string).
     * @param text the original text
     * @return the reversed string
     */
    private String encrypt(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
