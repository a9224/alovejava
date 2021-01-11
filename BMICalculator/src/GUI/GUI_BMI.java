package GUI;
public class GUI_BMI {
	private double height;
	private double weight;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height/100; 
		// to convert the height from cm to m
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
