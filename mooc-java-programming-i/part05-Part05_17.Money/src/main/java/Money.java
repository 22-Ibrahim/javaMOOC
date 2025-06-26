
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.cents < compared.cents && this.euros <= compared.euros) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int decreasedEuros = this.euros - decreaser.euros;
        int decreasedCents = this.cents - decreaser.cents;
        if (decreasedCents < 0) {
            decreasedCents = 100 + decreasedCents;
            decreasedEuros--;
        }
        Money newMoney = new Money(decreasedEuros, decreasedCents);
        
        if (decreasedEuros < 0) {
            newMoney = new Money(0,0);
        }
        return newMoney;
    }
}
