package org.example.HomeworkJava7;

public class BankAccount {
    public static void main(String[] args) {
//        1 уровень сложности: 1. Проверка номера банковского счета
//        Создайте метод isValidAccountNumber(String accountNumber),который возвращает true в случае успешной проверки.
//        БС может содержать только 14 цифр
//        Все 14 цифр не могут быть нулями
//        Номер счета не может быть null или пустым.
//        Проверьте с помощью метода main()
//        Напишите тесты используя библиотеку JUnit
//
//


            String accountNumber = "12345678901234";
            if (isValidAccountNumber(accountNumber)){
                System.out.println("Номер счёта корректный");
            } else {
                System.out.println("Номер счёта не корректный");
            }

    }

    public static boolean isValidAccountNumber(String accountNumber) {
        if (accountNumber == null) {
            return false;
        }
        if (accountNumber.length() != 14) {
            return false;
        }
        for (int i = 0; i <accountNumber.length(); i++) {
            if (!Character.isDigit(accountNumber.charAt(i))){
                return false;
            }
        }
        if (accountNumber.equals("00000000000000") ){
            return false;
        }
        return true;
    }
}
