public abstract class Message{
    public IMessageSender MessageSender;
    public String Subject;
    public String Body;

    public abstract void send();

}