
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogramlamaodev;
import java.util.Scanner;
/**
 *
 * @author akinc
 */
public class JavaProgramlamaOdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ad, soyad ve adet olarak değişkenleri tanımlıyoruz...
        String ad, soyad;
        int adet;
        //Ekrana girilen değeri alabilmek için scanner değişkeni tanımlıyoruz
        Scanner giris = new Scanner(System.in);
        //Ekranda kullanıcının adını girmesi için yazı yazdırıp cevabını alarak ad değişkenine atıyoruz.
        System.out.print("Adınız : ");
        ad = giris.next();
        //Ekranda kullanıcının soyadını girmesi için yazı yazdırıp cevabını alarak soyad değişkenine atıyoruz.
        System.out.print("Soyadınız : ");
        soyad = giris.next();
        //Ekranda kullanıcının adını ve soyadını ekranda kaç kez yazılmasını istediğini sorup girilen değeri adet değişkenine atıyoruz.
        System.out.print("Kaç kez yazılsız :");
        adet = giris.nextInt();
        //Kullanıcının girdiği adet kadar ekrana alt alta adını ve soyadını yazdırıyoruz.
        while(adet>0)
        {
            System.out.println(ad+" "+soyad);
            adet--;
        }
    }
    
}
