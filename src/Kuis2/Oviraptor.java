package Kuis2;

//NAMA  : WIRASWANTI RISMANDA PUTRI
//KELAS : SIB-2E
//NIM   : 2141762021

public class Oviraptor extends Dinosaurus implements IBertelur{
    @Override
    public void makan(){
        System.out.println("Oviraptor makan tumbuhan dan daging");
    }

    @Override
    public void berjalan(){
        System.out.println("Oviraptor berjalan dengan 2 kaki");
    }

    public void bertelur(){
        System.out.println("Oviraptor berkambang biak dengan bertelur");
    }
}