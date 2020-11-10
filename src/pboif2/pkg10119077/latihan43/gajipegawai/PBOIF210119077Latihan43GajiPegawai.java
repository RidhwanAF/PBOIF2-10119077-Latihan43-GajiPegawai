/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan43.gajipegawai;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Menampilkan Gaji Pegawai
 */
public class PBOIF210119077Latihan43GajiPegawai {

    public static void main(String[] args) {
        GajiPegawai objGajiPegawai = new GajiPegawai();
        
        objGajiPegawai.setNama("Rizki Adam Kurniawan");
        
        objGajiPegawai.setAlamat("Jalan Semar dlm 4 No72/66");
        
        objGajiPegawai.setUangTransport(250000);
        
        objGajiPegawai.setUangTunjangan(300000);
        
        objGajiPegawai.setGajiPokok(4500000);
        
        objGajiPegawai.tampilData(objGajiPegawai.getNama(), objGajiPegawai.getAlamat(),
                                  objGajiPegawai.getUangTunjangan(), objGajiPegawai.getUangTransport(),
                                  objGajiPegawai.getGajiPokok(), objGajiPegawai.totalGaji(objGajiPegawai.getUangTunjangan(),
                                  objGajiPegawai.getUangTransport(), objGajiPegawai.getGajiPokok()));
    }
    
}
