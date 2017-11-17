package mailing;

public class MailInfo {
    private Client client;
    private int mailCode;
    private MailType choosenType;

    public MailInfo(Client client, int mailCode, MailTypesContainter mailTypes) {
        this.client = client;
        this.mailCode = mailCode;
        this.choosenType = mailTypes.getType(mailCode);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMailCode() {
        return mailCode;
    }

    public void setMailCode(int mailCode) {
        this.mailCode = mailCode;
    }

    public String generateMessage(){
        return String.format("Dear %s  %s %s", client.getSex().toString(), client.getName(), choosenType.getText());
    }
}
