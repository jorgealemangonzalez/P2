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
public class City extends GeoPoint{
    
    private int numhab;
    
    City(float xi , float yi , String n , int hab)
    {
        super(xi,yi,n);
        numhab = hab;
    }
}
