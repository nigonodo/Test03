public class Email  implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("otpravka ot email");
    }
    public String info(){
        return "Email";
    }
}
