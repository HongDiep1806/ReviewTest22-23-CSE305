
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public interface BicycleBuilder {
ConcreteBicycleBuilder addFrameSize(String size);
ConcreteBicycleBuilder addWheelType(String type);
ConcreteBicycleBuilder addGearSystem(String gearSystem);
ConcreteBicycleBuilder addAccessory(List<String> accessory);
Bicycle build();
}
