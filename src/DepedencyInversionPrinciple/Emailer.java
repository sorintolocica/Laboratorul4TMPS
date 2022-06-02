package DepedencyInversionPrinciple;

public class Emailer implements MessengerInterface {
    @Override
    public void sendMessage(PersonInterface person, String message) {
        System.out.println("Se trimite mesaj pe mail: " + message + " to: " + person.getEmailAddress() + ".");
    }
}