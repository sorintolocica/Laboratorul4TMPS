package DepedencyInversionPrinciple;

public class SMSer implements MessengerInterface {
    @Override
    public void sendMessage(PersonInterface person, String message) {
        System.out.println("S-a transmis mesaj SMS: " + message + " to: " + person.getPhoneNumber() + ".");
    }
}
