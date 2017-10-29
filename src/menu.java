
import java.util.Scanner;

public class menu {

    Scanner input = new Scanner(System.in);

    public void menu1() {
        System.out.println("");
        kalimat kalimat = new kalimat();
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        index menu = new index();
        
        System.out.print(kalimat.transportasi);
        String x = input.next();
        if (x.equalsIgnoreCase("1")) {
            pilihan_transportasi.pesawat();
        } else if (x.equalsIgnoreCase("2")) {
            pilihan_transportasi.travel();
        } else if (x.equalsIgnoreCase("3")) {
            pilihan_transportasi.bus();
        } else if (x.equalsIgnoreCase("Y")) {
            System.out.println("");
            System.out.print(kalimat.intro);
            int pilih = input.nextInt();
            menu.menu(pilih);
        } else {
            System.out.println(kalimat.error);
        }
    }

    public void menu2() {
        System.out.println("");
        kalimat kalimat = new kalimat();
        index menu = new index();
        System.out.print(kalimat.jadwal);
        String pilih1 = input.next();
        if (pilih1.equalsIgnoreCase("y")) {
            System.out.println("");
            System.out.print(kalimat.intro);
            int pilih = input.nextInt();
            menu.menu(pilih);
        } else {
            System.out.println(kalimat.error);
        }
    }

    public void menu3() {
        System.out.println("");
        kalimat kalimat = new kalimat();
        index menu = new index();
        System.out.print(kalimat.About);
        String pilih1 = input.next();
        if (pilih1.equalsIgnoreCase("y")) {
            System.out.println("");
            System.out.print(kalimat.intro);
            int pilih = input.nextInt();
            menu.menu(pilih);
        } else {
            System.out.println(kalimat.error);
        }
    }

    public void menu4() {
        System.out.println("");
        kalimat kalimat = new kalimat();
        index menu = new index();
        System.out.print(kalimat.Help);
        String pilih1 = input.next();
        if (pilih1.equalsIgnoreCase("y")) {
            System.out.println("");
            System.out.print(kalimat.intro);
            int pilih = input.nextInt();
            menu.menu(pilih);
        } else {
            System.out.println(kalimat.error);
        }
    }
}