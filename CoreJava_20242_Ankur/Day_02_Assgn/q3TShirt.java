package com.sonata;

public class TShirt {
	private String color;
	private String material;
	private String design;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getDesign() {
		return design;
	}


	public void setDesign(String design) {
		this.design = design;
	}
	

	@Override
	public String toString() {
		return "TShirt [color=" + color + ", material=" + material + ", design=" + design + "]";
	}


	public static void main(String[] args) {
		TShirt t1 = new TShirt ();
		t1.setColor("Blue");
		t1.setMaterial("Cotton");
		t1.setDesign("Small");
		System.out.println(t1);
		TShirt t2 = new TShirt();
		t2.setColor("Red");
		t2.setMaterial("Nylon");
		t2.setDesign("Large");
		System.out.println(t2);
		TShirt t3 = new TShirt();
		t3.setColor("Red");
		t3.setMaterial("Nylon");
		t3.setDesign("Extra-Large");
		System.out.println(t3);
		
		

	}

}
