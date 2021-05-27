

package Practice5;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public double calculateBMI(){
        return (weight/ height * height);
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public void getBMIStatus(double weight, double height){
        if (calculateBMI()<18)
            System.out.println("Underweight");
        else if (18.5<=calculateBMI() && calculateBMI()<25.0)
            System.out.println("Normal");
        else if (25.0<=calculateBMI() && calculateBMI()<30.0)
            System.out.println("Overweight");
        else if (30<=calculateBMI())
            System.out.println("Obese");
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
