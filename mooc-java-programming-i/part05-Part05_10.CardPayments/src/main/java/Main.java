
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard card = new PaymentCard(100);
        System.out.println("money " + card.balance());
        boolean wasSuccessful = card.takeMoney(80);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + card.balance());
        wasSuccessful = card.takeMoney(40);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + card.balance());
        
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
        
    }
}

