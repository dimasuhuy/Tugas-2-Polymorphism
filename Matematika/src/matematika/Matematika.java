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
public class Matematika {
   
    public void pertambahan (int a, int b){
        int tambah = a + b;
        System.out.println("Hasil pertambahan : " + tambah);
    }
    public void pertambahan (double a, double b){
        double tambah = a + b;
        System.out.println("Hasil pertambahan ( double ) : " + tambah);
    }
    public void pertambahan(int a, int b, int c) {
        int tambah = a + b + c;
        System.out.println("Hasil pertambahan 3 angka ( double ) : " + tambah);
    }
    public void pertambahan(double a, double b, double c) {
        double tambah = a + b + c;
        System.out.println("Hasil pertambahan 3 angka ( double ) : " + tambah);
        System.out.println("");
    }
    
    public void perkurangan(int a, int b){
        int kurang = a - b;
        System.out.println("Hasil pengurangan : " + kurang);
    }
    public void perkurangan(double a, double b){
        double kurang = a - b;
        System.out.println("Hasil pengurangan ( double ) : " + kurang);
    }
    public void perkurangan(int a, int b, int c){
        int kurang = a - b;
        System.out.println("Hasil pengurangan 3 angka: " + kurang);
    }
    public void perkurangan(double a, double b, double c){
        double kurang = a - b;
        System.out.println("Hasil pengurangan 3 angka ( double ) : " + kurang);
        System.out.println("");
    }
    
    public void perkalian(int a, int b){
        int kali = a * b;
        System.out.println("Hasil perkalian : " + kali);
    }
    public void perkalian(double a, double b){
        double kali = a * b;
        System.out.println("Hasil perkalian ( double ) : " + kali);
    }
    public void perkalian(int a, int b, int c){
        int kali = a * b * c;
        System.out.println("Hasil perkalian 3 varibel : " + kali);
    }
    public void perkalian(double a, double b, double c){
        double kali = a * b * c;
        System.out.println("Hasil perkalian 3 variable ( double ) : " + kali);
        System.out.println("");
    }
    
    public void pembagian(int a, int b){
        int bagi = a / b;
        System.out.println("Hasil pembagian: " + bagi);
    }
    public void pembagian(double a, double b){
        double bagi = a / b;
        System.out.println("Hasil pembagian  ( double ) : " + bagi);
    }
    public void pembagian(int a, int b, int c){
        int bagi = a / b / c;
        System.out.println("Hasil pembagian 3 variabel: " + bagi);
    }
    public void pembagian(double a, double b, double c){
        double bagi = a / b / c;
        System.out.println("Hasil pembagian 3 variabel  ( double ) : " + bagi);
        System.out.println("");
    }
}
