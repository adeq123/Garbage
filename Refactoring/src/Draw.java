

public class Draw {
    double paintNeeded(double spreadRate, int nCoats, Figure circle, int nCircles, Figure square, int nSquares){
        double areaC = circle.area();
        double areaS = square.area();
        return nCoats * (nCircles*areaC + (nSquares*areaS)) / spreadRate;
    }
}