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
public class PolygonalRegion extends Region {
    protected LinkedList<Point> points;
    
    public void PolygonalRegion( LinkedList<Point> I ){
       points=I;
    }
    
}


