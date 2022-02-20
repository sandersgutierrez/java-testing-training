package javatests.communicator;

public enum NameClass {
    MESSENGER_PIGEON("Paloma Mensajera"),
    MOBILE_PHONE("Teléfono Celular"),
    TELEGRAPH("Telégrafo");

    private final String verboseName;

    NameClass(final String verboseName) {
        this.verboseName = verboseName;
    }

    public String getVerboseName() {
        return verboseName;
    }
}
