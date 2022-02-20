package javatests.communicator;

public class MessengerPigeon implements Communicator {
    private final String name;

    public MessengerPigeon(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String sendMessage(String message) {
        return null;
    }
}
