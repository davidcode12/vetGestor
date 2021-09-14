public class PrintMessages {

    private String yourMessage;

    public PrintMessages(String yourMessage) {
        this.yourMessage = yourMessage;
    }

    public void printMessageInConsole (){
        this.yourMessage = yourMessage;
        System.out.println(yourMessage);
    }

    public String getYourMessage() {
        return yourMessage;
    }

    public void setYourMessage(String yourMessage) {
        this.yourMessage = yourMessage;
    }
}
