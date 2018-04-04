
package praktek03;

public class bapakaksi {
    public static void main(String[] args) {
        bapak b = new bapak();
        
        b.setNama("Rizky wahyu saputra");
        b.setHobi("Membaca Koran Banjarmasin Post");
        b.setMakananfavorit("Bakso,Pecel,Ayam Geprek");
        
        b.cetakinfo();
        
        System.out.println("Nama Sidin adalah \t:  ");
        System.out.println(b.getNama());
        System.out.println("Hobi Sidin sekalinya \t: ");
        System.out.println(b.getHobi());
        System.out.println("makanan kesukaan sidin adalah \t:  ");
        System.out.println(b.getMakananfavorit());
        
        anaksidin as = new anaksidin();
            
        as.setNama("Fitriani");
        as.setHobi("Membca Novel");
        as.setMakananfavorit("Piza");
        as.setNama_anak(nama_anak);
            as.cetakinfo();
    }

}
