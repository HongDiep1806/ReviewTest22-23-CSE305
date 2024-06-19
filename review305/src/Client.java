
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Client {
    public static void main(String[] args) {
        Bicycle order = new ConcreteBicycleBuilder()
                .addFrameSize("20")
                .addWheelType("typeA")
                .addGearSystem("gear")
                .addAccessory(Arrays.asList("abc", "bdf"))
                .build();
        
        System.out.println(order.getFrameSize() +" "+ order.getGearSystem());
    }
}
