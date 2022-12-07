public class UserMessage extends Message{
    public String UserComment;

    public UserMessage(String userComment) {
        UserComment = userComment;
    }

    public void setUserComment(String userComment) {
        UserComment = userComment;
    }

    @Override
    public void send() {
        String fullBody=String.format(Body+"\n User Comment : "+ UserComment, UserComment,Body);
        MessageSender.sendMesasge(Subject, fullBody);
        
    }
    
}
