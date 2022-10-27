package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public void showInfo() {
        System.out.println("Активно " + this.active);
        System.out.println("Статус " + this.status);
        System.out.println("Сообщение " + this.message);
    }

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error err = new Error();
        err.showInfo();
        Error err1 = new Error(false, 1, "Ошибка компиляции");
        err1.showInfo();
        Error err2 = new Error(false, 3, "Ошибка HDD");
        err2.showInfo();
        Error err3 = new Error(true, 1, "Ошибка RAM");
        err3.showInfo();
    }
}