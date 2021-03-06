package readers;

import bank.Card;

/**
 * Чтение магнитной полосы карты
 * Denis
 * 24.03.2018
 */
public class MagneticStripeReader implements IReader {

    private final Card card;

    public MagneticStripeReader(Card card) {
        this.card = card;
    }

    @Override
    public void read() {
        System.out.println("Чтение магнитной полосы " + card);
    }
}
