
import java.util.*;

class Vehicle{
    public int getWheelCount(){ 
        return 2;
    }
}

class Bike extends Vehicle{
}

class EngineVehicle extends Vehicle{

    public boolean hasEngine(){
        return true;
    }
}

class MotorVehicle extends EngineVehicle{
    
}

class CarVehcile extends EngineVehicle{
}





public class TestLSP {
    public static void main(String[] args) {
        List<Vehicle> list=new ArrayList<>();
        list.add(new MotorVehicle());
        list.add(new CarVehcile());
        list.add(new Bike());
        for(Vehicle v:list){
            System.out.println(v.getWheelCount());
        }

        List<EngineVehicle> list2=new ArrayList<>();
        list2.add(new MotorVehicle());
        list2.add(new CarVehcile());
        //list2.add(new Bike());
        for(EngineVehicle v:list2){
            System.out.println(v.hasEngine());
        }

    }

}
