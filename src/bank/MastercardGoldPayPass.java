package bank;

/**
 * Банковская карта Mastercard Gold PayPass
 * Denis
 * 24.03.2018
 */
public class MastercardGoldPayPass extends Card {
    public MastercardGoldPayPass() {
        name = "MastercardGoldPayPass";
        paymentSystem = "MasterCard";
        cvv = randomNumber(100, 999);
        pin = randomNumber(1000, 9999);
        setCardExpiryDate(3, 0);
    }

    @Override
    public String toString() {
        return name + ", cvv " + cvv + ", pin " + pin + ", срок действия до " + cardExpiryMonth + "/" + cardExpiryYear;
    }
}
