package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo () {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 10, "Начальная мощность.");
        Error error2 = new Error(true, 45, "Средняя мощность.");
        Error error3 = new Error(false, 0, "Тест не пройден.");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }

}
