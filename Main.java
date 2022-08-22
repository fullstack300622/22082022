
public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("a20", "Samsung", 32);
        Case theCase = new Case("ZS2000", "Razer", "h4000");
        Motherboard motherboard = new Motherboard("Z180GamingPro", "Asus", 8, 4, new Resolution(800, 1600));
        Pc pc = new Pc(monitor, motherboard, theCase);
        System.out.println(monitor.getModel());
        System.out.println(pc.getMonitor().getModel());


    }
}
