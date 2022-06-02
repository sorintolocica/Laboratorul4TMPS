package DepedencyInversionPrinciple;

public class Task implements TaskInterface {
    private String taskDescription;
    private PersonInterface owner;
    private double hoursWorked;
    private boolean isComplete = false;


    private LoggerInterface logger;
    private MessengerInterface messenger;


    public Task(LoggerInterface logger, MessengerInterface messenger) {
        this.logger = logger;
        this.messenger = messenger;
    }

    @Override
    public void performedWork(double hours) {
        hoursWorked += hours;
        // now just use logger, no need to create a new one
        logger.log("Lucrari efectuate \"" + taskDescription + "\" pentru: " + hours + " ore. Timp de munca: " + hoursWorked + " ore.");
    }

    @Override
    public void completeTask() {
        isComplete = true;

        logger.log("Lucrare finalizata \"" + taskDescription + "\". Timpul total: " + hoursWorked + " ore.");


        messenger.sendMessage(owner, "Task \"" + taskDescription + "\" finisat!");
    }

    @Override
    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public PersonInterface getOwner() {
        return owner;
    }

    @Override
    public void setOwner(PersonInterface owner) {
        this.owner = owner;
    }

    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public boolean isComplete() {
        return isComplete;
    }
}
