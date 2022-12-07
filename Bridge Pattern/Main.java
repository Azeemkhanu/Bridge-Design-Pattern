
public class Main {
    public static void main(String[] args) {

        IMessageSender email=new EmailSender();
        IMessageSender sms=new SMSSender();
       

        Message usermessage=new UserMessage("this is user comment");
        usermessage.Body="This is body";
        usermessage.Subject="This is subject";

        usermessage.MessageSender=email;
        usermessage.send();

        usermessage.MessageSender=sms;
        usermessage.send();

        
    }
}
