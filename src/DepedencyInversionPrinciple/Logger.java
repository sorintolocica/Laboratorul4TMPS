package DepedencyInversionPrinciple;

public class Logger implements LoggerInterface {
    @Override
    public void log(String message) {
        System.out.println("Notificare: " + message);
    }
}