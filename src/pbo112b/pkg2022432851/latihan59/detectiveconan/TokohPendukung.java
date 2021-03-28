
package pbo112b.pkg2022432851.latihan59.detectiveconan;


public class TokohPendukung extends film {
    
    public TokohPendukung(String nama,String tokoh) {
        super(nama,tokoh);
    }
    
    public void tampilTokohPendukung(){
        
        TokohPendukung hki1 = new TokohPendukung("Kazuha Toyama","Pendukung");
        System.out.println("tokoh : "+hki1.tokoh);
        System.out.println("1. "+hki1.nama);
        System.out.println("2. Heiji Hatori");
        System.out.println("3. Sonoko Suzuki");
        System.out.println("4. Eri Kisaki");
        
    }
    
}
