package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {


        TrafficLight trafficLight = new TrafficLight();
        trafficLight.changeColor("red");
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("black");
        trafficLight2.showColor();

    }
}
