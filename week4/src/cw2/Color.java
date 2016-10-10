package cw2;

public abstract class Color {
    private String name;
    
    public Color(String name) {
        this.name = name;
    }
   
    public String toString() {
        return "Color " + name;
    }
    
    public abstract GrayscaleColor toGrayscale();
}
