package cryptoutils;

public class EncryptedMessage {
    byte[] message;
    byte[] salt;

    public EncryptedMessage() {
        this.message=null;
        this.salt=null;
    }
    public EncryptedMessage(byte[] encryptedText, byte[] salt) {
        this.message=encryptedText;
        this.salt=salt;
    }

    public byte[] getMessage() {
        return message;
    }

    public void setMessage(byte[] message) {
        this.message = message;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }
}
