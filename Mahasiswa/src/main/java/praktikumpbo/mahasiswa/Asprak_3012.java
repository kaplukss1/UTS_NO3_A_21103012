/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.mahasiswa;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class Asprak_3012 extends Mahasiswa_3012 implements iPendapatan_3012{
    String MKasistensi_3012;
    int jmlhPertemuan_3012;
    double totalPendapatan_3012;

    public Asprak_3012(){
        
    }
    
    public Asprak_3012(String nim, String nama, String Jurusan, int ipk, 
            String MKasistensi, int jmlhPertemuan){
        super(nim,nama,Jurusan,ipk);
        this.MKasistensi_3012 = MKasistensi_3012;
        this.jmlhPertemuan_3012 = jmlhPertemuan_3012;
        
    }
    
    public void infoAsprak(){
        System.out.println("MKasistensi : " + MKasistensi_3012);
        System.out.println("jmlhPertemuan : " + jmlhPertemuan_3012);
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infoAsprak();
    }
    
    public double totalPendapatan_3012(){
        return totalPendapatan_3012 = (double) (jmlhPertemuan_3012 * 50000);
    }

    

}
