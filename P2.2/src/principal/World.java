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
public class World {
    private  LinkedList<Continent> cons;
    
    World(){}
    
    public void addContinent(Continent c)
    {
        cons.add(c);
    }
    
    public void draw(java.awt.Graphics g)
    {
        for ( int i = 0 ; i < cons.size(); ++i)
        {
            cons.get(i).draw(g);
        }
    }
}
