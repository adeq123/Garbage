package cw2;

public class RgbColor extends Color {
    private double red;
    private double green;
    private double blue;
    
    public RgbColor(double red, double green, double blue, String name) {
        super(name);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public RgbColor(double red, double green, double blue) {
        this(red, green, blue, "");
    }
    
    public String toString() {
        return super.toString() + " <RGB " + red + ", " + green + ", " + blue + ">";
    }

    public GrayscaleColor toGrayscale() {
        return new GrayscaleColor(0.299 * red + 0.587 * green + 0.114 * blue);
    }
}