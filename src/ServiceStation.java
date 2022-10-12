import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    private void add(Transport transport){
        transportQueue.offer(transport);
    }
    public void addCar(CarLight carLight){
        add(carLight);
    }
    public void addCarCargo(CarCargo carCargo){
        add(carCargo);
    }
    public void service(){
        if(!transportQueue.isEmpty()){
            Transport transport = transportQueue.poll();
            transport.maintenance();
        }
    }
}
