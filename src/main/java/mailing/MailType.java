package mailing;

public class MailType {
    private String typeName;
    private java.lang.String text;

    public MailType(String typeName, java.lang.String text) {
        this.typeName = typeName;
        this.text = text;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public java.lang.String getText() {
        return text;
    }

    public void setText(java.lang.String text) {
        this.text = text;
    }

}
