public class Owl implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("otpravka ot owi");
    }
    public String info(){
        return "OWI";
    }
}
