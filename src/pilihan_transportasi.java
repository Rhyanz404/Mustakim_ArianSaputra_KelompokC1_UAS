import java.util.Scanner;
public class pilihan_transportasi {
    Scanner input = new Scanner(System.in);
    String nilai_transportasi,pilihan;
    // untuk menampung method menu transportasi 
    // tiga method di bawah akan memanggil method 6 yang di bawahnya
    public void pesawat(){
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        kalimat kalimat = new kalimat();
        menu menu = new menu();
        System.out.println("");
        System.out.print(kalimat.pesawat); //menampilkan kalimat menu pesawat
        String p = input.next();
        if (p.equalsIgnoreCase("1")) { //memilih daftar pesawat
            pilihan_transportasi.daftar_pesawat();     
        }else if(p.equalsIgnoreCase("2")){ //memilih pesan tiket pesawat
            pilihan_transportasi.pesan_pesawat();
        }else if(p.equalsIgnoreCase("y")){
            menu.menu1();
        }else{
            System.out.println(kalimat.error);
        }    
    }
    public void travel(){
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        kalimat kalimat = new kalimat();
        menu menu = new menu();
        System.out.println("");
        System.out.print(kalimat.travel); //menampilkan kalimat menu travel
        String p = input.next();
        if (p.equalsIgnoreCase("1")) {
            pilihan_transportasi.daftar_travel();
        }else if(p.equalsIgnoreCase("2")){
            pilihan_transportasi.pesan_travel();
        }else if(p.equalsIgnoreCase("y")){
            menu.menu1();
        }else{
            System.out.println(kalimat.error);
        }   
    } 
    public void bus(){
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        kalimat kalimat = new kalimat();
        menu menu = new menu();
        System.out.println("");
        System.out.print(kalimat.bus); //menampilkan kalimat menu bus
        String p = input.next();
        if (p.equalsIgnoreCase("1")) {
            pilihan_transportasi.daftar_bus();
        }else if(p.equalsIgnoreCase("2")){
            pilihan_transportasi.pesan_bus();
        }else if(p.equalsIgnoreCase("y")){
            menu.menu1();
        }else{
            System.out.println(kalimat.error);
        }   
    }
    //------------------------------//
    
    public void daftar_pesawat(){
            pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
            kalimat kalimat = new kalimat();
            System.out.print(kalimat.daftarpesawat);
            String pilih = input.next();
            if (pilih.equalsIgnoreCase("y")) {
                pilihan_transportasi.pesawat();
            }else{
                System.out.println(kalimat.error);
            }
    }
    public void daftar_travel(){
            pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
            kalimat kalimat = new kalimat();
            System.out.print(kalimat.daftartravel); //memilih daftar travel
            String pilih = input.next();
            if (pilih.equalsIgnoreCase("y")) {
                pilihan_transportasi.travel();
            }else{
                System.out.println(kalimat.error);
            }
    }
    public void daftar_bus(){
            pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
            kalimat kalimat = new kalimat();
            System.out.print(kalimat.daftarbus); //pilih daftar bus
            String pilih = input.next();
            if (pilih.equalsIgnoreCase("y")) {
                pilihan_transportasi.bus();
            }else{
                System.out.println(kalimat.error);
            }
    }
    //------------------------------//
    
    public void pesan_pesawat(){
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi(); 
        kalimat kalimat = new kalimat();
        nilai_transportasi = "Pesawat";
        System.out.print(kalimat.pesanpesawat);
        String pilih = input.next();
            if (pilih.equalsIgnoreCase("y")) {
                pilihan_transportasi.pesawat();
            }else if(pilih.equalsIgnoreCase("1")){
                pilihan = "Garuda";
                transportasi.garuda(nilai_transportasi,pilihan);
            }else if(pilih.equalsIgnoreCase("2")){
                pilihan = "Airlion";
                transportasi.airlion(nilai_transportasi,pilihan);
            }else{
                System.out.println(kalimat.error);
            }
    } 
    public void pesan_travel(){
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi(); 
        kalimat kalimat = new kalimat();
        nilai_transportasi = "Travel";
        System.out.print(kalimat.pesantravel); //memilih pemesanan tiket
        String pilih = input.next();
            if (pilih.equalsIgnoreCase("y")) {
                pilihan_transportasi.travel();
            }else if(pilih.equalsIgnoreCase("1")){
                pilihan = "Kelas A";
                transportasi.travela(nilai_transportasi,pilihan);
            }else if(pilih.equalsIgnoreCase("2")){
                pilihan = "Kelas B";
                transportasi.travelb(nilai_transportasi,pilihan);
            }else{
                System.out.println(kalimat.error);
            }
    } 
    public void pesan_bus(){
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi(); 
        kalimat kalimat = new kalimat();
        nilai_transportasi = "Bus";
        System.out.print(kalimat.pesanbus); //pilih pemesanan bus
        String pilih = input.next();
            if (pilih.equalsIgnoreCase("y")) {
                pilihan_transportasi.bus();
            }else if(pilih.equalsIgnoreCase("1")){
                pilihan = "Kelas A";
                transportasi.busa(nilai_transportasi,pilihan);
            }else if(pilih.equalsIgnoreCase("2")){
                pilihan = "Kelas B";
                transportasi.busb(nilai_transportasi,pilihan);
            }else{
                System.out.println(kalimat.error);
            }
    } 
}