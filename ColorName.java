/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class ColorName {
    public String colorName;
    public float red;
    public float green;
    public float blue;
    public ColorName(String name, float r, float g, float b) {
        colorName = name;
        red = r;
        green = g;
        blue = b;
    }
    
    public String getName() {
        return colorName;
    }
    public float getRed() {
        return red;
    }
    public float getGreen() {
        return green;
    }
    public float getBlue() {
        return blue;
    }
    
}
