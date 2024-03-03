import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoş Geldiniz...");
        System.out.println("***********************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("***********************************");

        int giris_hakki = 3;

        while (true){

            if(login.login(hesap)){
                System.out.println("Giriş Başarılıdır...");
                break;
            }
            else {
                System.out.println("Giriş Başarısızdır...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkınız:" + giris_hakki);
            }
            if (giris_hakki == 0){
                System.out.println("Giriş Hakkınız Bitmiştir...");
                return; //break yaparsan sadece döngü sonlanır.
                //return yaparsan eğer metod sonlanır.
            }
        }
        System.out.println("***********************************");
        String islemler = "1. Bakiye Görüntüle\n"
                         +"2. Para Yatırma\n"
                         +"3. Para Çekme\n"
                         +"Çıkış İçin q'ya Basınız.";
        System.out.println(islemler);
        System.out.println("***********************************");

        while (true){

            System.out.print("İşlem Seçebilirsiniz:");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                break;
                //if-else yapısıyla ilk olarak if'te çıkışı kontrol etmemiz gerekir.
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz:" + hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.print("Yatırmak İstediğiniz Tutar:");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.print("Çekmek İstediğiniz Tutarı Giriniz:");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Seçtiğiniz İşlem Geçersizdir.");
            }
        }
    }
}
