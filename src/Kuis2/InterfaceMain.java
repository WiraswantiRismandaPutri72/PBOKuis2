package Kuis2;

//NAMA  : WIRASWANTI RISMANDA PUTRI
//KELAS : SIB-2E
//NIM   : 2141762021

public class InterfaceMain {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops trice = new Triceratops();
        Oviraptor ovira = new Oviraptor();
        AnakPemburu aPemburu = new AnakPemburu();
        Pemburu pemburu = new Pemburu();
        
        trex.makan();
        trex.berjalan();
        System.out.println("---------------------------------------------");
        trice.makan();
        trice.berjalan();
        System.out.println("---------------------------------------------");
        ovira.makan();
        ovira.berjalan();
        ovira.bertelur();
        System.out.println("---------------------------------------------");
        pemburu.berburu(trex);
        aPemburu.mengambilTelur(ovira);
    }
}
