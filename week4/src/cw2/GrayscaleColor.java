package cw2;

public class GrayscaleColor extends Color {
    private double luminance;
    
    public GrayscaleColor(double luminance, String name) {
        super(name);
        this.luminance = luminance;
    }
   
    public GrayscaleColor(double luminance) {
        this(luminance, "");
    }
    
    public String toString() {
        return super.toString() + " <luminance " + luminance + ">";
    }
    
    public GrayscaleColor toGrayscale() {
        return new GrayscaleColor(luminance);
    }
}
