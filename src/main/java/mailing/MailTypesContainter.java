package mailing;

import java.util.ArrayList;

public class MailTypesContainter {
    private ArrayList<MailType> mailTypes;

    public MailTypesContainter() {
        mailTypes = new ArrayList<MailType>();
    }

    public MailTypesContainter(ArrayList<MailType> mailTypes) {
        this.mailTypes = mailTypes;
    }

    public ArrayList<MailType> getMailTypes() {
        return mailTypes;
    }

    public void addType(String type, java.lang.String text){
        MailType newMailType = new MailType(type, text);
        mailTypes.add(newMailType);
    }

    public void removeType(String type){
        for(MailType currentType: this.getMailTypes()){
            if (currentType.getTypeName().equals(type)){
                this.mailTypes.remove(currentType);
                break;
            }
        }
    }
}
