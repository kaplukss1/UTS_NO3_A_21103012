/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikumpbo.mahasiswa;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class ProjectMahasiswa_3012 {

    public static void main(String[] args) {
        System.out.println("Input Data Asprak");
        Asprak_3012 A = new Asprak_3012("21121","dika","Sistem Informasi", 3, "PBO", 12);
        A.tampilDataMhs();
        System.out.println("Total : " + A.totalPendapatan_3012());
        System.out.println("");
        
        StudentStaff_3012 B = new StudentStaff_3012("121212", "andik", "Sistem Informasi", 4, 2, 8);
        B.tampilDataMhs();
        System.out.println("Total : " +B.totalPendapatan_3012());
        System.out.println("");
        
    }
}
