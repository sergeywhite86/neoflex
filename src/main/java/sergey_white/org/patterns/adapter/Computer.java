package sergey_white.org.patterns.adapter;

public class Computer {

    public void connect(PortUsb usb) {
        usb.read();
    }
}
