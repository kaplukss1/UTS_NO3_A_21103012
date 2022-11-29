/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.mahasiswa;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class Mahasiswa_3012 {
    String nim_3012;
    String nama_3012;
    String Jurusan_3012;
    int ipk_3012;
    
    public Mahasiswa_3012(){
        
    }
    
    public Mahasiswa_3012(String nim_3012, String nama_3012, String Jurusan_3012, int ipk_3012){
        this.nim_3012 = nim_3012;
        this.nama_3012 = nama_3012;
        this.Jurusan_3012 = Jurusan_3012;
        this.ipk_3012 = ipk_3012;
    }
    
    public void tampilDataMhs(){
        System.out.println("nim : " + nim_3012);
        System.out.println("nama: " + nama_3012);
        System.out.println("Jurusan : " + Jurusan_3012);
        System.out.println("ipk : " + ipk_3012);
    }
}
