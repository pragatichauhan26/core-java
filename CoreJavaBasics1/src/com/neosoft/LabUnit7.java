package com.neosoft;

import java.awt.Color;

public class LabUnit7 {
	public static void main(String args[]) {
		}
}

class ColorChecking

{
 public void main(String arg [ ])
 {
 Color rgb, hsb;
 rgb = new Color (193,255,183);
 int red, green, blue;
 red = rgb.getRed ( );
 green = rgb.getGreen ( );
 blue = rgb.getBlue ( );
 float x [] = {0.0f,0.0f,0.0f};
 rgb.RGBtoHSB(red, green, blue, x);
System.out.println ("RGB Combination would be: ");
System.out.println ("Red : "+red+"Green: "+green+"Blue : "+blue);
System.out.println ("Hue : "+x[0]+ "Saturation: "+x[1] +"Brightness: "+x[2]);
int r = rgb.HSBtoRGB (0.80f,0.35f,0.25f);
 System.out.println ("HSB Combination would be: ");
 System.out.println(" Red, Blue and Green Combination : "+ r);
 }
}
