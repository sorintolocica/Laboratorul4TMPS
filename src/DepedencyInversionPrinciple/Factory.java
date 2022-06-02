package DepedencyInversionPrinciple;

public class Factory {
    public static PersonInterface createPerson(){

        return new Person();
    }

    public static TaskInterface createTask(){

        return new Task(createLogger(), createMessager());
    }

    public static LoggerInterface createLogger(){
        return new Logger();
    }

    public static MessengerInterface createMessager(){

        return new SMSer();
    }

}
