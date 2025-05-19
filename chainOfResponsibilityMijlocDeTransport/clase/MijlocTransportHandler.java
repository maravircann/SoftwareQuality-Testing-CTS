package clase;

public abstract class MijlocTransportHandler {
    protected MijlocTransportHandler next;

    public MijlocTransportHandler getNext() {
        return next;
    }

    public void setNext(MijlocTransportHandler next) {
        this.next = next;
    }

    public abstract void recomanda(int distanta);
}
