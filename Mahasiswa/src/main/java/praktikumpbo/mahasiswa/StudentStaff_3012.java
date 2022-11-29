/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.mahasiswa;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class StudentStaff_3012 extends Mahasiswa_3012 implements iPendapatan_3012 {

    int unitKerja_3012;
    int jamKerja_3012;
    double totalPendapatan_3012;

    public StudentStaff_3012() {

    }

    public StudentStaff_3012(String nim, String nama, String Jurusan, int ipk,
            int unitKerja, int jamKerja) {
        super(nim, nama, Jurusan, ipk);
        this.unitKerja_3012 = unitKerja_3012;
        this.jamKerja_3012 = jamKerja_3012;
    }
    
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infostuden();
    }
    
    public void infostuden(){
        System.out.println("unitKerja : " + unitKerja_3012);
        System.out.println("jamKerja : " + jamKerja_3012);
    }

    @Override
    public double totalPendapatan_3012() {
        return totalPendapatan_3012 = (int) (jamKerja_3012 * 30000);
    }
}
