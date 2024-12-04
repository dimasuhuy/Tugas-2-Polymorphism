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
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih run = new MatematikaCanggih();
        
        run.pertambahan(23, 34);
        run.pertambahan(12, 28, 14);
        run.pertambahan(3.4,4.9);
        run.pertambahan(12.5, 28.7, 14.2);
        
        run.perkurangan(23, 34);     
        run.perkurangan(12, 28, 14);     
        run.perkurangan(3.4,4.9);     
        run.perkurangan(12.5, 28.7, 14.2);
        
        run.perkalian(23, 34);    
        run.perkalian(12, 28, 14);    
        run.perkalian(3.4,4.9);    
        run.perkalian(12.5, 28.7, 14.2);
        
        run.pembagian(23, 34);
        run.pembagian(12, 28, 14);
        run.pembagian(3.4,4.9);
        run.pembagian(12.5, 28.7, 14.2);
        
        run.setModulus(23, 34);
        System.out.println("Hasil sisa bagi : " + run.getModulus());
        run.setModulus(12, 28, 14);
        System.out.println("Hasil sisa bagi 3 variabel : " + run.getModulus());
        run.setModulus(3.4,4.9);
        System.out.println("Hasil sisa bagi ( double ) : " + run.getModulusDouble());
        run.setModulus(12.5, 28.7, 14.2);
        System.out.println("Hasil sisa bagi 3 variabel ( double ) : " + run.getModulusDouble());
    }
}
