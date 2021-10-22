/*
Objective --
Create a class to represent 3D Box
class Box ---tight encapsulation(achieved by making all non static data members:instance vars private)
state -- width,height , depth --- double : private 
paramterized constr --3 arg constr.
Instance Methods(=non static methods)
1. To return Box details in String form (dimensions of Box)

method declaration --- access specifier(private/default/protected/public) , ret type , name , args
method definition --body

2. To return computed volume of the box.
*/

class Box {
    // DATA : State --instance variables(attributes/properties)
    // tight encapsulation
    private double width, depth, height;

    // parameterized constr to init complete state of the Box
    Box(double width, double d, double height) {
        // this => current object ref. used to un hide instance var from method local
        // var.
        this.width = width;// this : mandatory
        this.depth = d;// this : optional
        this.height = height;// this : mandatory
    }

    // Business logic : behaviour --methods --non static(instance) methods
    // 1. To return Box details in String form (dimensions of Box
    String getBoxDimensions() {
        return "Box Dims " + this.width + " " + depth + " " + this.height;
    }

    // Add a method to return computed volume of the box.
    double getBoxVolume() {
        return width * depth * height;
    }
}
