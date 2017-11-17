package mailing;

import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos;
    private MailSender mailSender;

    public MailBox() {
        this.infos = new ArrayList<MailInfo>();
        this.mailSender = new MailSender();
    }

    public void addMailInfo(MailInfo mailInfo){
        this.infos.add(mailInfo);
    }

    public void sendAll(){
        for (MailInfo info : this.infos){
            mailSender.sendMail(info);
        }
    }
}
