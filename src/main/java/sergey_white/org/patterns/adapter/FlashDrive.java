package sergey_white.org.patterns.adapter;

public class FlashDrive implements PortUsb{

    @Override
    public void read() {
        System.out.println("Reading from flash drive usb");
    }
}
