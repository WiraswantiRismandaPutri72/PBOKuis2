package Kuis2;

//NAMA  : WIRASWANTI RISMANDA PUTRI
//KELAS : SIB-2E
//NIM   : 2141762021

public class AnakPemburu extends Pemburu implements IMengambilTelur{
    @Override
    public void mengambilTelur(Dinosaurus dino) {
        System.out.println("Anak pemburu mengambil telur Oviraptor");
    }
}
