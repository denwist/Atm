package atm;

import bank.Card;
import exceptions.CardException;
import util.ConsoleInput;
import util.Mode3dSecure;

import java.math.BigDecimal;

/**
 * Интернет магазин
 * Denis
 * 10.03.2018
 */
public class InternetShop {
    private Card currentCard;
    private ConsoleInput consoleInput;

    public InternetShop(Card card) {
        currentCard = card;
        consoleInput = new ConsoleInput();
    }

    // Снятие денег с карты
    public void withdraw(BigDecimal amount) throws CardException {

        if(currentCard == null){
            throw new CardException("Карта не найдена");
        }

        if (passedValidation()) {
            Mode3dSecure mode3dSecure = new Mode3dSecure();
            if (mode3dSecure.check()) {
                currentCard.withdraw(amount); // try-catch in Main
            } else {
                throw new CardException("Валидация 3D-secure не пройдена");
            }
        } else {
            throw new CardException("Данные карты не верны");
        }

    }

    // Подтверждение CVV-кода и срока действия карты
    private boolean passedValidation() {
        if (currentCard != null) {
            System.out.println("Введите месяц окончания срока действия карты:");
            int month = consoleInput.enterNumber(1, 12);
            System.out.println("Введите год окончания срока действия карты:");
            int year = consoleInput.enterNumber(2018, 2030);
            System.out.println("Введите CVV-код карты:");
            int cvv = consoleInput.enterNumber(100, 999);

            return month == currentCard.getCardExpiryMonth() && year == currentCard.getCardExpiryYear() && cvv == currentCard.getCvv();
        }
        return false;
    }
}
