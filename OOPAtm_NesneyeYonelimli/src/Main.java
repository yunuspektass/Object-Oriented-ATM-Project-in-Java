/*
Object Oriented(Nesne Yönelimli) ATM Programı

Login Class'ı Kullanıcı Girişini Kontrol Edecek

Hesap Class'ı Hesap İşlemlerini Yapacak

ATM ise ATMmizi çalıştaracak.
*/

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Yunus Pektaş","12345",2000);

        atm.calis(hesap);
        System.out.println("ATM'den Çıkılıyor...");
    }
}