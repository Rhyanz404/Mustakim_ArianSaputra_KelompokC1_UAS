import java.util.Scanner;
//Project UAS
//Nama : Arian Saputra
//NIM  : 1610530112
//Nama : Mustakim
//NIM  : 1610530108

public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        kalimat kalimat = new kalimat();
        index index = new index();        
        System.out.print(kalimat.intro);
        int pilih = input.nextInt();
        index.menu(pilih);
        System.out.println(kalimat.terimakasih);
    }
    public void menu(int x){
        menu menu = new menu();
        kalimat kalimat = new kalimat();
        switch(x){
            case (1):
                    menu.menu1();
                    break;
            case (2):
                    menu.menu2();
                    break;
            case (3):
                    menu.menu3();
                    break;
            case (4):
                    menu.menu4();
                    break;
            case (5):
                    System.exit(0);
                    break;
        }
//        if (x == 1) {
//            
//        }else if(x == 2){
//            menu.menu2();
//        }else if(x == 3){
//            menu.menu3();
//        }else if(x == 4){
//            menu.menu4();
//        }else if(x == 5){
//            System.exit(0);
//        }else{
//            System.out.println(kalimat.error);
//        }
    }
}