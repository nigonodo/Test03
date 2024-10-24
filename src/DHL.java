public class DHL implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("otpravka ot DHL");
    }
    public String info(){
        return "DHL";
    }
}
