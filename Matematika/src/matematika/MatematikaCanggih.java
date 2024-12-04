/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author dimas
 */
public class MatematikaCanggih extends Matematika{
    private int modulus;
    private double modulusDouble;
    
    void setModulus (int a, int b){
        modulus = a % b;
    }
    void setModulus (double a, double b){
        modulusDouble = a % b;
    }
    void setModulus (int a, int b, int c){
        modulus = (a % b) % c;
    }
    void setModulus (double a, double b, double c){
        modulusDouble = (a % b) % c;
    }
    
    int getModulus(){
        return modulus;
    }
    double getModulusDouble(){
        return modulusDouble;
    }
}
