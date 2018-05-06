package readers;

import bank.Card;

/**
 * Чтение чипа карты
 * Denis
 * 24.03.2018
 */
public class MicrochipReader implements IReader {

    private final Card card;

    public MicrochipReader(Card card) {
        this.card = card;
    }
    
    @Override
    public void read() {
        System.out.println("Чтение чипа " + card);
    }
}
