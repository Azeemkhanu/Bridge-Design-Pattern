public class SMSSender implements IMessageSender{

    @Override
    public void sendMesasge(String Subject, String Body) {
        System.out.println("\nSMS:\n"+Subject+"\n"+Body);
        
    }
    
}
