
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class ConcreteBicycleBuilder implements BicycleBuilder {
    
    private String frameSize;
    private String wheelType;
    private String gearSystem;
    private List<String> accessories;
    
    @Override
    public ConcreteBicycleBuilder addFrameSize(String size) {
        this.frameSize = (size);
        return this;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public ConcreteBicycleBuilder addWheelType(String type) {
        this.wheelType = (type);
        return this;
        
    }
    
    @Override
    public ConcreteBicycleBuilder addGearSystem(String gearSystem) {
        this.gearSystem = (gearSystem);
        return this;
        
    }
    
    @Override
    public ConcreteBicycleBuilder addAccessory(List<String> accessory) {
        this.accessories = (accessory);
        return this;
        
    }
    
    @Override
    public Bicycle build() {
        return new Bicycle(frameSize, wheelType, gearSystem, accessories);
    }
    
}
