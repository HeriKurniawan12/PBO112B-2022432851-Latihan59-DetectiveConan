
package pbo112b.pkg2022432851.latihan59.detectiveconan;

public class TokohUtama extends film {
    
    public TokohUtama(String nama,String tokoh) {
        super(nama,tokoh);
    }
    
    public void tampilTokohUtama(){
        
        TokohUtama hki = new TokohUtama("Shinichi Kudo","Utama");
        System.out.println("======Film Detective Conan======");
        System.out.println("Tokoh : "+hki.tokoh);
        System.out.println("1. "+hki.nama);
        System.out.println("2. Ran Mouri");
        System.out.println("3. Kogoro Mouri");
    }
    
}
