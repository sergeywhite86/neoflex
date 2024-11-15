package sergey_white.org.patterns.adapter;

public class CardReaderAdapter implements PortUsb{

    MemoryCard memoryCard;
    public CardReaderAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void read() {
        memoryCard.read();
    }
}
