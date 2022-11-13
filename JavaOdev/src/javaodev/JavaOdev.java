/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaodev;

/**
 *
 * @author akinc
 */
public class JavaOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ad ve soyad olarak iki değişken tanımlıyoruz...
        String ad, soyad;
        ad="AKIN";
        soyad="CENGİZ";
        //Döngünün dönüş adedini belirlemek üzere int türünden değişken atıyoruz..
        int adet=5;
        while(adet>0)
        {
            System.out.println(ad+" "+soyad);
            adet--;
        }
    }
    
}
