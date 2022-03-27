/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author manojreddy
 */
public enum PickUp {
    
    Home,FoodBank;
    
    public static List<String> getPickUpList(){
       
        return Stream.of(PickUp.values()).map(PickUp::name).collect(Collectors.toList());
    }
    
    public static String[] getPickUpArray() {
        
        return Arrays.stream(PickUp.values()).map(PickUp::name).toArray(String[]::new);
    } 
    
}
