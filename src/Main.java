import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MailDeliveryService[] mailDeliveryServices={
                new DHL(),
                new Email(),
                new Owl(),
        };
        for (MailDeliveryService x: mailDeliveryServices){
            x.sendMail();
        }
        System.out.println("vibirite sposab");
        for (int i = 0; i < mailDeliveryServices.length; i++) {
            System.out.println((i+1)+". "+mailDeliveryServices[i].info());

        }
        int select=scanner.nextInt();
        MailDeliveryService selected=mailDeliveryServices[select-1];

        System.out.println(selected.info());




    }
}
