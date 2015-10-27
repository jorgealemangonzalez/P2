/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author drako9
 */
public class GeoPoint extends Point{
    protected String name;
    
    GeoPoint(float xi , float yi , String n)
    {
        super(xi,yi);
        name = n;
    }
    
    public void draw(java.awt.Graphics g){
        g.fillOval((int)x, (int)y, 5, 5);
        g.drawString(name, (int)x, (int)y);
    }
}
