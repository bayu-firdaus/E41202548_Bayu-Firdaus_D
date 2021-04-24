/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_7;

/**
 *
 * @author Bayu Firdaus
 */
public class Televisi {
   private String deskripsi;
     private int jumlahChannel;
     private String[] channels = null;
     private int channelAktif;
     private int volume;
     
     public Televisi(String deskripsi, int jumlahChannel) {
     this.deskripsi = deskripsi;
     this.jumlahChannel = jumlahChannel;
     }
     
     public String getDeskripsi() {
     return deskripsi;
     }
     
     public int getJumlahChannel() {
     return jumlahChannel;
     }
     public String[] getChannels() {
     if (channels == null) {
          System.out.println("Belum ada channel yang diset!");
     }
     return channels;
     }
     
     public void setChannels(String[] channels) {
     if (channels.length > jumlahChannel) {
          System.out.println("Maaf Tv ini hanya dapat menyimpan " +
                        jumlahChannel + " channel");
     }
     else {
          this.channels = channels;
          System.out.println("Informasi channel berhasil di update!");
     }
     }
     
     public int getChannelAktif() {
     return channelAktif;
     }
     
     public void setChannelAktif(int channelAktif) {
     if (channelAktif > channels.length) {
          System.out.println("Channel yang Anda inginkan belum diset!");
          return;
     }
     this.channelAktif = channelAktif;
     System.out.println("Pindah channel ke : " + channels[channelAktif]);
     }
     
     public int getVolume() {
     return volume;
     }
     
     public void setVolume(int volume) {
     this.volume = volume;
     System.out.println("intensitas volume sekarang : " + volume);
     }
}
        

