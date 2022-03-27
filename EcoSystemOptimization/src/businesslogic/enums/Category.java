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
public enum Category {
    
    Food,Books,Electronics,Pets,Clothes,Medicines,Furniture;
    
    public static List<String> getCategoriesList(){
       
        return Stream.of(Category.values()).map(Category::name).collect(Collectors.toList());
    }
    
    public static String[] getCategoriesArray() {
        
        return Arrays.stream(Category.values()).map(Category::name).toArray(String[]::new);
    }    
    
}
