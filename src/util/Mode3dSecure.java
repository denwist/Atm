package util;

/**
 * Режим 3d-secure
 * Denis
 * 10.03.2018
 */
public class Mode3dSecure {
    private ConsoleInput consoleInput;

    public Mode3dSecure() {
        consoleInput = new ConsoleInput();
    }

    // Генерация случайного кода от min до max
    private int generateCode(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public boolean check() {
        int generateCode = generateCode(1000, 9999);
        System.out.println("Вам была отправлена СМС с кодом подтверждения (" + generateCode + "). Введите его:");
        int inputCode = consoleInput.enterNumber(1000, 9999);
        return inputCode == generateCode;
    }
}
