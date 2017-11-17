package mailing;

public class MailSender {
    public static void sendMail(MailInfo mailInfo){
        System.out.println(String.format("Your message is %s", mailInfo.generateMessage()));
        System.out.println(String.format("Mail sent successfully!"));
    }
}
