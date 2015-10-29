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
        super(I); // Forma del pais ( no son citys )
        capital = c;       
    }
    
    public void addCity(City c){
        
        cities.add(c);
    }
    
    public void addNeighbor(Country c){
        
        neighbors.add(c);
    }
    
    public void draw(java.awt.Graphics g){
        super.draw(g);
        for(int i = 0 ; i < cities.size() ; ++i)
        {
            cities.get(i).draw(g);
        }
    }
}
