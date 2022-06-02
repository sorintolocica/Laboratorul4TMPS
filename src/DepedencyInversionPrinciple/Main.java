package DepedencyInversionPrinciple;

public class Main {

    public static void main(String[] args) {
        PersonInterface owner = Factory.createPerson();
        owner.setFirstName("Sorin");
        owner.setLastName("Tolocica");
        owner.setEmailAddress("str.studentilor 7/1");
        owner.setPhoneNumber("67221424");

        TaskInterface task = Factory.createTask();
        task.setTaskDescription("Partea de back-end pentru un site Ecommerce.");
        task.setOwner(owner);

        task.performedWork(1);
        task.performedWork(0.5);
        task.completeTask();
    }
}
