public class Pc {

    private Monitor monitor;
    private Motherboard motherboard;
    private Case theCase;

    public Pc(Monitor monitor, Motherboard motherboard, Case theCase) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
