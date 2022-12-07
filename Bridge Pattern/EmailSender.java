 
public class EmailSender implements IMessageSender{

    @Override
    public void sendMesasge(String Subject, String Body) {
        System.out.println("\nEmail:\n"+Subject+"\n"+Body);
        
    }
    
}
