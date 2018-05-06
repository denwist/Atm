package bank;


/**
 * Банковская карта MasterCard
 * Denis
 * 10.02.2018
 */
public class MasterCard extends Card {
    public MasterCard() {
        name = "MasterCard";
        paymentSystem = "MasterCard";
        typeProtection = "Microchip";
        cvv = randomNumber(100, 999);
        pin = randomNumber(1000, 9999);
        setCardExpiryDate(3, 0);
    }

    @Override
    public String toString() {
        return name + ", cvv " + cvv + ", pin " + pin + ", срок действия до " + cardExpiryMonth + "/" + cardExpiryYear;
    }

}
