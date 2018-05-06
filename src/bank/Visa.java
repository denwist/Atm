package bank;

/**
 * Банковская карта Visa
 * Denis
 * 10.02.2018
 */
public class Visa extends Card {
    public Visa() {
        name = "Visa";
        paymentSystem = "Visa";
        typeProtection = "MagneticStripe";
        cvv = randomNumber(100, 999);
        pin = randomNumber(1000, 9999);
        setCardExpiryDate(2, 0);
    }

    @Override
    public String toString() {
        return name + ", cvv " + cvv + ", pin " + pin + ", срок действия до " + cardExpiryMonth + "/" + cardExpiryYear;
    }

}
