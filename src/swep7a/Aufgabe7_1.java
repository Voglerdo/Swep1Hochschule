package swep7a;

import uebungen3A.InputTools;

public class Aufgabe7_1 {
	public static void main(String[] args) {
		
	boolean a,b,c,ergebnis;
	int[] array = new int[3];// array = liste wenn 1 dimension typisierbar, laenge festlegen, fixe größe wenn definiert mit zahl

	for(int i=0  ; i<array.length; i++) {
		int input = InputTools.readInteger("Geben Sie eine Zahl ein");
		array[i] = input;
	}
	
	if(array[0]!=0){a=true;} else {a=false;}
	if(array[1]!=0){b=true;} else {b=false;}
	if(array[2]!=0){c=true;} else {c=false;}
	
	
	if((a == true && b == true && c == true)|| (a == true && b == false && c == false)||(a == false && b!=c)){
		ergebnis=true;
		System.out.println(ergebnis);
	}
	else {
		ergebnis=false;
		System.out.println(ergebnis);
	}
	}}