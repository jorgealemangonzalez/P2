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
public class Continent {
    protected LinkedList<Country> countries;
    
    Continent(){}
    
    public void addCountry(Country c)
    {
        countries.add(c);
    }
    public double getTotalArea(){
        double n = 0 ;
        for(int i = 0 ; i < countries.size();++i)
        {
            n += countries.get(i).getArea();
        }
        return n;
    }
    public void draw(java.awt.Graphics g){
        
        for(int i = 0 ; i < countries.size(); ++i)
        {
            countries.get(i).draw(g);
        }
    }
}
