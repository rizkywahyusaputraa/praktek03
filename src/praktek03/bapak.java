
package praktek03;

public class bapak {
  private  String nama;
  private  String hobi;
  private  String makananfavorit;
    
    void cetakinfo(){
            System.out.println("nama \t: "+nama+"\n"+
                    "hobi \t: "+hobi+"\n"+
                    "makananfavorit \t:"+makananfavorit);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getMakananfavorit() {
        return makananfavorit;
    }

    public void setMakananfavorit(String makananfavorit) {
        this.makananfavorit = makananfavorit;
    }
    
    
}
