package sergey_white.org.patterns.adapter;

public class MemoryCard implements PortCardReader{

    @Override
    public void read() {
        System.out.println("Reading from memory card");
    }
}
