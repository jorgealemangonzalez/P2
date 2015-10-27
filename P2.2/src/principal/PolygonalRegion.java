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
public class PolygonalRegion {
    
    protected LinkedList<Point> points;
    
    PolygonalRegion( LinkedList<Point> I ){
       points=I;
    }
    
    public double getArea(){
        double p1 = 0.0 , p2 = 0.0 ;
        int n = points.size()-1;
        for(int i = 0 ; i <= n;++i)
        {
            if( i == n)
            {
                p1 += points.get(i).getX() * points.get(1).getY();
                p2 += points.get(i).getY() * points.get(1).getX();
            }else
            {
                p1 += points.get(i).getX() * points.get(i+1).getY();
                p2 += points.get(i).getY() * points.get(i+1).getX();
            }
        }
        return (double)(1/2 * p1-p2);
    }
    
    public void draw(java.awt.Graphics g)
    {
        for(int i = 0 ; i < points.size()-1 ; ++i)
        {
            g.drawLine((int)points.get(i).getX(),(int)points.get(i).getY(), (int)points.get(i+1).getX(), (int)points.get(i+1).getY());
        }
        g.drawLine((int)points.get(points.size()-1).getX(),(int)points.get(points.size()-1).getY(), (int)points.get(0).getX(), (int)points.get(0).getY());
    }
}


