public class Package {
    private double mass;
    private Address origin;
    private Address destination;
    private int length;
    private int width;
    private int height;

    public Package(Address origin, Address destination, double mass, int length, int width, int height)
    {
        this.origin = origin;
        this.destination = destination;
        this.mass = mass;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Address getDestination() {
        return destination;
    }

    public Address getOrigin() {
        return origin;
    }

    public double getMass() {
        return mass;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
