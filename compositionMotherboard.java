public class Motherboard {
    private String model;

    private String manufacturer;

    private int ramSlots;

    private int cardSlots;

    Resolution resolution;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, Resolution resolution) {
        this.resolution=resolution;
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }
}
