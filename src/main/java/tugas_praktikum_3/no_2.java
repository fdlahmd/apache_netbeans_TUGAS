package tugas_praktikum_3;

import java.util.Scanner;

public class no_2 {
  public static void main(String[] args) {
        int cari ;
        int Data[]= {2,4,6,8,10,12,14,16,18,20};
        int batasAwal = 0;
        int batasAkhir = Data.length -1;
        int ketemu = 0;
        int point = 0;
        for (int i = 0; i < Data.length; i++) {
            System.out.print(Data[i]+" ");
            
        }
        System.out.println();
        Scanner key = new Scanner (System.in);
        System.out.println("Masukkan Angka yang mau anda cari : ");
        cari = key.nextInt();
        while((batasAwal<= batasAkhir)&&(ketemu == 0)){
           point = (batasAwal + batasAkhir)/2;
            System.out.println("Pointer berada di index ke-"+point);
            if(Data[point]== cari){
                ketemu = 1;
            }
            else{
                if(cari < Data[point]){
                    System.out.println("Cari di kiri");
                    batasAkhir = point -1;
                }else{
                    System.out.println("Cari di kanan");
                    batasAwal = point +1;
                }
            }
        }
        if(ketemu==1){
            System.out.println("Data "+cari+" ditemukan pada index ke "
            +(point + " dan baris ke "+(point +1)));
        }else{
            System.out.println("Data "+cari+" tidak ditemukan ");
        }
        System.out.println("\n");
        System.out.println("Fadhil Ahmad Hidayat");  
}
}