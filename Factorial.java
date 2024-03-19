package org.example.HomeworkJava7;

public class Factorial {
    public static void main(String[] args) {
        //2 Покрыть тестами используя библиотеку JUnit метод поиска факториала или фибоначи

        int n = 31;
        System.out.println("Факториал числа: "+n+" = "+ factorial(n));
    }
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
