package Ex2;

import Ex2.Exceptions.WrongLoginException;
import Ex2.Exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class Authorization {
    public static boolean login(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() > 19 || login.contains(" ")) {
            throw new WrongLoginException("Логин не должен содержать пробелов и должен быть короче 20 символов");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        Pattern containsDigitsPattern = Pattern.compile("(.*\\d.*)");
        if (password.length() > 19 || password.contains(" ") || !password.equals(confirmPassword) || !containsDigitsPattern.matcher(password).find()) {
            throw new WrongPasswordException("Пароль не должен содержать пробелов, должен быть короче 20 символов, содержать хотя бы одну цифру и совпадать с подтвержденным паролем");
        }
    }
}
