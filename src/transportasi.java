
import java.util.Arrays;
import java.util.Scanner;

public class transportasi {

    Scanner input = new Scanner(System.in);

    void garuda(String kendaraan, String pilihan) {
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi();
        kalimat kalimat = new kalimat();

        double harga[] = new double[50];
        String age;

        String y = "Y", zz, pilih[] = new String[50], asal[] = new String[50], tujuan[] = new String[50], nama[] = new String[50], bulan[] = new String[50];
        int bangku[] = new int[50], nobangku[] = new int[50], nohp[] = new int[50], tanggal[] = new int[50];
        int tt = 1;

        do {
            System.out.print(kalimat.tiket);
            pilih[tt] = input.next();
            if (pilih[tt].equals("1")) {
                harga[tt] = 200;
                age = "Dewasa";
            } else if (pilih[tt].equals("2")) {
                harga[tt] = 100;
                age = "Anak-anak";
            } else if (pilih[tt].equals("y")) {
                pilihan_transportasi.pesan_pesawat();
            } else {
                System.out.println(kalimat.error);
                System.exit(0);
            }

            if (tt - 1 == 0) {
                System.out.print(kalimat.asal);
                asal[tt] = input.next();
                System.out.print(kalimat.tujuan);
                tujuan[tt] = input.next();

                if (asal[tt].equals("1") && tujuan[tt].equals("2")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Mataram";
                } else if (asal[tt].equals("1") && tujuan[tt].equals("3")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Sumbawa";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("2") && tujuan[tt].equals("1")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Bali";
                } else if (asal[tt].equals("2") && tujuan[tt].equals("3")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Sumbawa";
                } else if (asal[tt].equals("3") && tujuan[tt].equals("1")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Bali";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("3") && tujuan[tt].equals("2")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Mataram";
                } else {
                    System.out.println(kalimat.tujuan_salah);
                    System.exit(0);
                }

            }else{
            asal[tt] = asal[tt-1];
            tujuan[tt] = tujuan[tt-1];
            }
            System.out.print(kalimat.bangku);
            nobangku[tt] = input.nextInt();
            if (bangku[nobangku[tt]] == 0) {
                bangku[nobangku[tt]] = 1;
            } else if (bangku[nobangku[tt]] == 1) {
                System.out.println(kalimat.salah_bangku);
                transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);
                System.exit(0);
            }
            //masukkan nama
            System.out.print(kalimat.nama);
            nama[tt] = input.next();
            //masukkan no hp
            System.out.print(kalimat.nohp);
            nohp[tt] = input.nextInt();
            //masukkan tanggal
            System.out.print(kalimat.tanggal);
            //cek tanggal
            tanggal[tt] = input.nextInt();
            if (tanggal[tt] > 31) {
                System.out.println(kalimat.salah_tanggal);
                System.exit(0);
            } else if (tanggal[tt] == 17 || tanggal[tt] == 8) {
                System.out.println(kalimat.salah_waktu);
                System.exit(0);
            }
            //masukkan bulan
            System.out.print(kalimat.bulan);
            bulan[tt] = input.next();
            bulan[tt] = transportasi.bulan(bulan[tt]);
            System.out.print("Beli Tiket Lagi [Y] : ");
            zz = input.next();
            tt++;
        } while (y.equalsIgnoreCase(zz));

        transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);

    }
    void airlion(String kendaraan, String pilihan) {
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi();
        kalimat kalimat = new kalimat();

        double harga[] = new double[50];
        String age;

        String y = "Y", zz, pilih[] = new String[50], asal[] = new String[50], tujuan[] = new String[50], nama[] = new String[50], bulan[] = new String[50];
        int bangku[] = new int[50], nobangku[] = new int[50], nohp[] = new int[50], tanggal[] = new int[50];
        int tt = 1;

        do {
            System.out.print(kalimat.tiket);
            pilih[tt] = input.next();
            if (pilih[tt].equals("1")) {
                harga[tt] = 170;
                age = "Dewasa";
            } else if (pilih[tt].equals("2")) {
                harga[tt] = 80;
                age = "Anak-anak";
            } else if (pilih[tt].equals("y")) {
                pilihan_transportasi.pesan_pesawat();
            } else {
                System.out.println(kalimat.error);
                System.exit(0);
            }

            if (tt - 1 == 0) {
                System.out.print(kalimat.asal);
                asal[tt] = input.next();
                System.out.print(kalimat.tujuan);
                tujuan[tt] = input.next();

                if (asal[tt].equals("1") && tujuan[tt].equals("2")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Mataram";
                } else if (asal[tt].equals("1") && tujuan[tt].equals("3")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Sumbawa";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("2") && tujuan[tt].equals("1")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Bali";
                } else if (asal[tt].equals("2") && tujuan[tt].equals("3")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Sumbawa";
                } else if (asal[tt].equals("3") && tujuan[tt].equals("1")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Bali";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("3") && tujuan[tt].equals("2")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Mataram";
                } else {
                    System.out.println(kalimat.tujuan_salah);
                    System.exit(0);
                }

            }else{
            asal[tt] = asal[tt-1];
            tujuan[tt] = tujuan[tt-1];
            }
            System.out.print(kalimat.bangku);
            nobangku[tt] = input.nextInt();
            if (bangku[nobangku[tt]] == 0) {
                bangku[nobangku[tt]] = 1;
            } else if (bangku[nobangku[tt]] == 1) {
                System.out.println(kalimat.salah_bangku);
                transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);
                System.exit(0);
            }
            //masukkan nama
            System.out.print(kalimat.nama);
            nama[tt] = input.next();
            //masukkan no hp
            System.out.print(kalimat.nohp);
            nohp[tt] = input.nextInt();
            //masukkan tanggal
            System.out.print(kalimat.tanggal);
            //cek tanggal
            tanggal[tt] = input.nextInt();
            if (tanggal[tt] > 31) {
                System.out.println(kalimat.salah_tanggal);
                System.exit(0);
            } else if (tanggal[tt] == 18 || tanggal[tt] == 8|| tanggal[tt] == 9) {
                System.out.println(kalimat.salah_waktu);
                System.exit(0);
            }
            //masukkan bulan
            System.out.print(kalimat.bulan);
            bulan[tt] = input.next();
            bulan[tt] = transportasi.bulan(bulan[tt]);
            System.out.print("Beli Tiket Lagi [Y] : ");
            zz = input.next();
            tt++;
        } while (y.equalsIgnoreCase(zz));

        transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);

    }
    void travela(String kendaraan, String pilihan) {
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi();
        kalimat kalimat = new kalimat();

        double harga[] = new double[50];
        String age;

        String y = "Y", zz, pilih[] = new String[50], asal[] = new String[50], tujuan[] = new String[50], nama[] = new String[50], bulan[] = new String[50];
        int bangku[] = new int[50], nobangku[] = new int[50], nohp[] = new int[50], tanggal[] = new int[50];
        int tt = 1;

        do {
            System.out.print(kalimat.tiket);
            pilih[tt] = input.next();
            if (pilih[tt].equals("1")) {
                harga[tt] = 70;
                age = "Dewasa";
            } else if (pilih[tt].equals("2")) {
                harga[tt] = 50;
                age = "Anak-anak";
            } else if (pilih[tt].equals("y")) {
                pilihan_transportasi.pesan_pesawat();
            } else {
                System.out.println(kalimat.error);
                System.exit(0);
            }

            if (tt - 1 == 0) {
                System.out.print(kalimat.asal);
                asal[tt] = input.next();
                System.out.print(kalimat.tujuan);
                tujuan[tt] = input.next();

                if (asal[tt].equals("1") && tujuan[tt].equals("2")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Mataram";
                } else if (asal[tt].equals("1") && tujuan[tt].equals("3")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Sumbawa";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("2") && tujuan[tt].equals("1")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Bali";
                } else if (asal[tt].equals("2") && tujuan[tt].equals("3")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Sumbawa";
                } else if (asal[tt].equals("3") && tujuan[tt].equals("1")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Bali";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("3") && tujuan[tt].equals("2")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Mataram";
                } else {
                    System.out.println(kalimat.tujuan_salah);
                    System.exit(0);
                }

            }else{
            asal[tt] = asal[tt-1];
            tujuan[tt] = tujuan[tt-1];
            }
            System.out.print(kalimat.bangku);
            nobangku[tt] = input.nextInt();
            if (bangku[nobangku[tt]] == 0) {
                bangku[nobangku[tt]] = 1;
            } else if (bangku[nobangku[tt]] == 1) {
                System.out.println(kalimat.salah_bangku);
                transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);
                System.exit(0);
            }
            //masukkan nama
            System.out.print(kalimat.nama);
            nama[tt] = input.next();
            //masukkan no hp
            System.out.print(kalimat.nohp);
            nohp[tt] = input.nextInt();
            //masukkan tanggal
            System.out.print(kalimat.tanggal);
            //cek tanggal
            tanggal[tt] = input.nextInt();
            if (tanggal[tt] > 31) {
                System.out.println(kalimat.salah_tanggal);
                System.exit(0);
            } else if (tanggal[tt] == 6 || tanggal[tt] == 21) {
                System.out.println(kalimat.salah_waktu);
                System.exit(0);
            }
            //masukkan bulan
            System.out.print(kalimat.bulan);
            bulan[tt] = input.next();
            bulan[tt] = transportasi.bulan(bulan[tt]);
            System.out.print("Beli Tiket Lagi [Y] : ");
            zz = input.next();
            tt++;
        } while (y.equalsIgnoreCase(zz));

        transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);

    }
    void travelb(String kendaraan, String pilihan) {
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi();
        kalimat kalimat = new kalimat();

        double harga[] = new double[50];
        String age;

        String y = "Y", zz, pilih[] = new String[50], asal[] = new String[50], tujuan[] = new String[50], nama[] = new String[50], bulan[] = new String[50];
        int bangku[] = new int[50], nobangku[] = new int[50], nohp[] = new int[50], tanggal[] = new int[50];
        int tt = 1;

        do {
            System.out.print(kalimat.tiket);
            pilih[tt] = input.next();
            if (pilih[tt].equals("1")) {
                harga[tt] = 170;
                age = "Dewasa";
            } else if (pilih[tt].equals("2")) {
                harga[tt] = 80;
                age = "Anak-anak";
            } else if (pilih[tt].equals("y")) {
                pilihan_transportasi.pesan_pesawat();
            } else {
                System.out.println(kalimat.error);
                System.exit(0);
            }

            if (tt - 1 == 0) {
                System.out.print(kalimat.asal);
                asal[tt] = input.next();
                System.out.print(kalimat.tujuan);
                tujuan[tt] = input.next();

                if (asal[tt].equals("1") && tujuan[tt].equals("2")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Mataram";
                } else if (asal[tt].equals("1") && tujuan[tt].equals("3")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Sumbawa";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("2") && tujuan[tt].equals("1")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Bali";
                } else if (asal[tt].equals("2") && tujuan[tt].equals("3")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Sumbawa";
                } else if (asal[tt].equals("3") && tujuan[tt].equals("1")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Bali";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("3") && tujuan[tt].equals("2")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Mataram";
                } else {
                    System.out.println(kalimat.tujuan_salah);
                    System.exit(0);
                }

            }else{
            asal[tt] = asal[tt-1];
            tujuan[tt] = tujuan[tt-1];
            }
            System.out.print(kalimat.bangku);
            nobangku[tt] = input.nextInt();
            if (bangku[nobangku[tt]] == 0) {
                bangku[nobangku[tt]] = 1;
            } else if (bangku[nobangku[tt]] == 1) {
                System.out.println(kalimat.salah_bangku);
                transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);
                System.exit(0);
            }
            //masukkan nama
            System.out.print(kalimat.nama);
            nama[tt] = input.next();
            //masukkan no hp
            System.out.print(kalimat.nohp);
            nohp[tt] = input.nextInt();
            //masukkan tanggal
            System.out.print(kalimat.tanggal);
            //cek tanggal
            tanggal[tt] = input.nextInt();
            if (tanggal[tt] > 31) {
                System.out.println(kalimat.salah_tanggal);
                System.exit(0);
            } else if (tanggal[tt] == 3 || tanggal[tt] == 8) {
                System.out.println(kalimat.salah_waktu);
                System.exit(0);
            }
            //masukkan bulan
            System.out.print(kalimat.bulan);
            bulan[tt] = input.next();
            bulan[tt] = transportasi.bulan(bulan[tt]);
            System.out.print("Beli Tiket Lagi [Y] : ");
            zz = input.next();
            tt++;
        } while (y.equalsIgnoreCase(zz));

        transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);

    }
    void busa(String kendaraan, String pilihan) {
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi();
        kalimat kalimat = new kalimat();

        double harga[] = new double[50];
        String age;

        String y = "Y", zz, pilih[] = new String[50], asal[] = new String[50], tujuan[] = new String[50], nama[] = new String[50], bulan[] = new String[50];
        int bangku[] = new int[50], nobangku[] = new int[50], nohp[] = new int[50], tanggal[] = new int[50];
        int tt = 1;

        do {
            System.out.print(kalimat.tiket);
            pilih[tt] = input.next();
            if (pilih[tt].equals("1")) {
                harga[tt] = 170;
                age = "Dewasa";
            } else if (pilih[tt].equals("2")) {
                harga[tt] = 80;
                age = "Anak-anak";
            } else if (pilih[tt].equals("y")) {
                pilihan_transportasi.pesan_pesawat();
            } else {
                System.out.println(kalimat.error);
                System.exit(0);
            }

            if (tt - 1 == 0) {
                System.out.print(kalimat.asal);
                asal[tt] = input.next();
                System.out.print(kalimat.tujuan);
                tujuan[tt] = input.next();

                if (asal[tt].equals("1") && tujuan[tt].equals("2")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Mataram";
                } else if (asal[tt].equals("1") && tujuan[tt].equals("3")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Sumbawa";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("2") && tujuan[tt].equals("1")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Bali";
                } else if (asal[tt].equals("2") && tujuan[tt].equals("3")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Sumbawa";
                } else if (asal[tt].equals("3") && tujuan[tt].equals("1")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Bali";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("3") && tujuan[tt].equals("2")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Mataram";
                } else {
                    System.out.println(kalimat.tujuan_salah);
                    System.exit(0);
                }

            }else{
            asal[tt] = asal[tt-1];
            tujuan[tt] = tujuan[tt-1];
            }
            System.out.print(kalimat.bangku);
            nobangku[tt] = input.nextInt();
            if (bangku[nobangku[tt]] == 0) {
                bangku[nobangku[tt]] = 1;
            } else if (bangku[nobangku[tt]] == 1) {
                System.out.println(kalimat.salah_bangku);
                transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);
                System.exit(0);
            }
            //masukkan nama
            System.out.print(kalimat.nama);
            nama[tt] = input.next();
            //masukkan no hp
            System.out.print(kalimat.nohp);
            nohp[tt] = input.nextInt();
            //masukkan tanggal
            System.out.print(kalimat.tanggal);
            //cek tanggal
            tanggal[tt] = input.nextInt();
            if (tanggal[tt] > 31) {
                System.out.println(kalimat.salah_tanggal);
                System.exit(0);
            } else if (tanggal[tt] == 8) {
                System.out.println(kalimat.salah_waktu);
                System.exit(0);
            }
            //masukkan bulan
            System.out.print(kalimat.bulan);
            bulan[tt] = input.next();
            bulan[tt] = transportasi.bulan(bulan[tt]);
            System.out.print("Beli Tiket Lagi [Y] : ");
            zz = input.next();
            tt++;
        } while (y.equalsIgnoreCase(zz));

        transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);

    }
    void busb(String kendaraan, String pilihan) {
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        transportasi transportasi = new transportasi();
        kalimat kalimat = new kalimat();

        double harga[] = new double[50];
        String age;

        String y = "Y", zz, pilih[] = new String[50], asal[] = new String[50], tujuan[] = new String[50], nama[] = new String[50], bulan[] = new String[50];
        int bangku[] = new int[50], nobangku[] = new int[50], nohp[] = new int[50], tanggal[] = new int[50];
        int tt = 1;

        do {
            System.out.print(kalimat.tiket);
            pilih[tt] = input.next();
            if (pilih[tt].equals("1")) {
                harga[tt] = 170;
                age = "Dewasa";
            } else if (pilih[tt].equals("2")) {
                harga[tt] = 80;
                age = "Anak-anak";
            } else if (pilih[tt].equals("y")) {
                pilihan_transportasi.pesan_pesawat();
            } else {
                System.out.println(kalimat.error);
                System.exit(0);
            }

            if (tt - 1 == 0) {
                System.out.print(kalimat.asal);
                asal[tt] = input.next();
                System.out.print(kalimat.tujuan);
                tujuan[tt] = input.next();

                if (asal[tt].equals("1") && tujuan[tt].equals("2")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Mataram";
                } else if (asal[tt].equals("1") && tujuan[tt].equals("3")) {
                    asal[tt] = "Bali";
                    tujuan[tt] = "Sumbawa";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("2") && tujuan[tt].equals("1")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Bali";
                } else if (asal[tt].equals("2") && tujuan[tt].equals("3")) {
                    asal[tt] = "Mataram";
                    tujuan[tt] = "Sumbawa";
                } else if (asal[tt].equals("3") && tujuan[tt].equals("1")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Bali";
                    harga[tt] = harga[tt] * 2;
                } else if (asal[tt].equals("3") && tujuan[tt].equals("2")) {
                    asal[tt] = "Sumbawa";
                    tujuan[tt] = "Mataram";
                } else {
                    System.out.println(kalimat.tujuan_salah);
                    System.exit(0);
                }

            }else{
            asal[tt] = asal[tt-1];
            tujuan[tt] = tujuan[tt-1];
            }
            System.out.print(kalimat.bangku);
            nobangku[tt] = input.nextInt();
            if (bangku[nobangku[tt]] == 0) {
                bangku[nobangku[tt]] = 1;
            } else if (bangku[nobangku[tt]] == 1) {
                System.out.println(kalimat.salah_bangku);
                transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);
                System.exit(0);
            }
            //masukkan nama
            System.out.print(kalimat.nama);
            nama[tt] = input.next();
            //masukkan no hp
            System.out.print(kalimat.nohp);
            nohp[tt] = input.nextInt();
            //masukkan tanggal
            System.out.print(kalimat.tanggal);
            //cek tanggal
            tanggal[tt] = input.nextInt();
            if (tanggal[tt] > 31) {
                System.out.println(kalimat.salah_tanggal);
                System.exit(0);
            } else if (tanggal[tt] == 7 || tanggal[tt] == 8 || tanggal[tt] == 25) {
                System.out.println(kalimat.salah_waktu);
                System.exit(0);
            }
            //masukkan bulan
            System.out.print(kalimat.bulan);
            bulan[tt] = input.next();
            bulan[tt] = transportasi.bulan(bulan[tt]);
            System.out.print("Beli Tiket Lagi [Y] : ");
            zz = input.next();
            tt++;
        } while (y.equalsIgnoreCase(zz));

        transportasi.sout(kendaraan, pilihan, nama, nohp, tanggal, bulan, asal, tujuan, harga, nobangku, tt);

    }
    
    void sout(String kendaraan, String pilihan, String nama[], int nohp[], int tanggal[], String bulan[], String asal[], String tujuan[], double harga[], int nobangku[], int tt) {

        for (int i = 0; i < tt; i++) {
            if (harga[i] > 0) {
                System.out.println("");
                System.out.println("******************************************");
                System.out.println("Pembayaran Anda sejumlah ");
                System.out.println("******************************************");
                System.out.println("Transportasi  \t\t: " + kendaraan + " (" + pilihan + ")");
                System.out.println("Nama \t\t\t: " + nama[i]);
                System.out.println("No HP \t\t\t: " + nohp[i]);
                System.out.println("Nomor Bangku \t\t: " + nobangku[i]);
                System.out.println("Tanggal Berangkat \t: " + tanggal[i] + " / " + bulan[i] + " / " + "2017");
                System.out.println("Rute \t\t\t: " + "Dari " + asal[i] + " Ke " + tujuan[i]);
                System.out.println("Biaya \t\t\t: " + harga[i]);
                System.out.println("******************************************");
            }
        }
    }

    String bulan(String bulan) {
        pilihan_transportasi pilihan_transportasi = new pilihan_transportasi();
        String bulannya = "";
        switch (bulan) {
            case "1":
                bulannya = "Januari";
                break;
            case "2":
                bulannya = "Februari";
                break;
            case "3":
                bulannya = "Maret";
                break;
            case "4":
                bulannya = "April";
                break;
            case "5":
                bulannya = "Mei";
                break;
            case "6":
                bulannya = "Juni";
                break;
            case "7":
                bulannya = "Juli";
                break;
            case "8":
                bulannya = "Agustus";
                break;
            case "9":
                bulannya = "September";
                break;
            case "10":
                bulannya = "Oktober";
                break;
            case "11":
                bulannya = "November";
                break;
            case "12":
                bulannya = "Desember";
                break;
            default:
                System.out.println("\n[ERROR]----Salah bulan masukkan ulang");
                System.exit(0);
                break;

        }
        return bulannya;
    }
}