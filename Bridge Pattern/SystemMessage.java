public class SystemMessage extends Message{

    @Override
    public void send() {
        MessageSender.sendMesasge(Subject, Body);
        
    }
    
}
