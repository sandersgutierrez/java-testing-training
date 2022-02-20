package javatests.communicator;

public class CommunicatorFactory {
    public static Communicator create(NameClass nameClass) {
        if (nameClass.equals(NameClass.MESSENGER_PIGEON)) {
            return new MessengerPigeon("Pigeon");
        }

        if (nameClass.equals(NameClass.TELEGRAPH)) {
            return new Telegraph();
        }

        if (nameClass.equals(NameClass.MOBILE_PHONE)) {
            return new MobilePhone();
        }

        return null;
    }
}
