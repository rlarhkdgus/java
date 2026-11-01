import java.util.Scanner;

public class Homework5 {
    static void main() {
        Monitor monitor = new Monitor();
        monitor.setColor("Black");
        monitor.setMonitorSize("24 inch");
        monitor.setPower("45W");

        Computer computer = new Computer();
        computer.setColor("White");
        computer.setCpu("Core i7");
        computer.setHd("2TB");
        computer.setMemory("16GB");
        computer.setPower("500W");

        PersonalComputer personalComputer = new PersonalComputer();
        personalComputer.setComputer(computer);
        personalComputer.setMonitor(monitor);

        personalComputer.turnOn();
        personalComputer.printInfo();

    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public void setMonitorSize(String monitorSize) {
        this.monitorSize = monitorSize;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPower(String power) {
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}
class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public void setHd(String hd) {
        this.hd = hd;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPower(String power) {
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}
class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}