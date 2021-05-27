package Practice1;
            class Circle{
                final double PI = 3.14;
                double radius;

                public Circle(){
                    radius = 1;
                }
                public Circle(double radius){
                    this.radius = radius;
                }

                double getArea() {
                    double result = PI * Math.pow(radius, 2);
                    return result;
                }
                double getCircuference(){
                    double result = 2*PI*radius;
                    return result;
                }

                void setRadius(double radius) {
                    this.radius = radius;
                }

                void print(){
                    System.out.println("The radius"+ radius+ ", " +
                            "area of the circle "+ getArea()+ ", circumstance of the circle "+ getCircuference());
                }
            }


