package array;

/**
 *
 * @author riskyy
 */
import java.util.Scanner;
import java.util.stream.*;

public class KasirArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String belanja[] = new String[5];
        int harga[] = new int[5];
        int jumlah[] = new int[5];
        int total[] = new int[5];
        int sum = IntStream.of(total).sum();
        int pilih=0,jum=0;
        int item=0;
    
        do{
            System.out.println("Kasir Toko Kita");
            System.out.println("!.Tas\n2.Sepatu\n3.Sandal\n4.Baju\n5.Jaket\n6.Selesai");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch(pilih){
                
                case 1: 
                    if (item<belanja.length){
                        belanja[item]="Tas";
                        harga[item]=100000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                    }
                    else System.out.println("Keranjang Penuh");
                    break;
                case 2:
                    if (item<belanja.length){
                        belanja[item]="Sepatu";
                        harga[item]=150000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                        
                    }
                    else System.out.println("Keranjang Penuh");
                    break;
                case 3:
                    if (item<belanja.length){
                        belanja[item]="Sandal";
                        harga[item]=20000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                        
                    }
                    else System.out.println("Keranjang Penuh");
                    break;
                case 4:
                    if (item<belanja.length){
                        belanja[item]="Baju";
                        harga[item]=50000;
                        System.out.print("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                        
                    }
                    else System.out.println("Keranjang Penuh");
                    
                    break;
                case 5:
                    if (item<belanja.length){
                        belanja[item]="Jaket";
                        harga[item]=200000;
                        System.out.println("Jumlah : ");
                        jum=sc.nextInt();
                        jumlah[item]=jum;
                        total[item] = harga[item]*jumlah[item];
                    }
                    else System.out.println("Keranjang Penuh");
                    
                    break;
                case 6:
                    System.out.println("Daftar Belanja");
                    for (int i = 0; i < item ; i++) {
                        sum += total[i];
                        System.out.println((i+1) + "." + belanja[i] + "\t [Rp" + harga[i] + "]\t[" + jumlah[i] + "]\t[Rp" + total[i] + "]");
                    }
                    System.out.println("Grand Total : Rp" + sum);
                    break;
                    
            }
        item++;
        if (item>5)
            item=5;
            System.out.println("Jumlah Item : "+item);
        }while(pilih!=6);

        
    }
    
}
