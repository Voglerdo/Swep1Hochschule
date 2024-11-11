package swep6a;

import uebungen3A.InputTools;

public class OsterRechner {
	public static void main(String args[]) {
	int j = InputTools.readInteger("geben sie das Jahr ab ");
	int a;
	int b;
	int m;
	int n;
	int q;
	int w; 
	int p;
	
	
	n = j-1900;
	a = n % 19;
	b = (7*a+1); // idiv 19
	m = (11*a+4-b) % 29;
	q= n; // idiv 4 
	w=(n+q+31+m)%7;
	p= 25-m-w;
	
	System.out.println(p);
	
}
}