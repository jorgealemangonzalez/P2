/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.LinkedList;

/**
 *
 * @author drako9
 */
public class Country extends PolygonalRegion{
    private String name;
    private LinkedList<City> cities;
    private LinkedList<Country> neighbors;
    private City capital;
    
    Country(LinkedList<Point> I, City c){
        super(I);
        cities.add(c);        
    }
}
