import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int choice;

        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();
        System.out.print("Şifreniz:");
        password = input.nextLine();

        if(userName.equals("Patika") && password.equals("Java123")){
            System.out.print("Başarıyla Giriş Yaptınız.");
        } else {
            System.out.print("Bilgileriniz Hatalıdır! Yeni Şifre Oluşturmak için 1, çıkış yapmak için 2 giriniz.");
            choice = input.nextInt();
            if(choice == 1){
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni Şifrenizi Giriniz:");
                password = inp.nextLine();
                if(password.equals("Java123")){
                    System.out.print("Şifreniz Aynı Olamaz. Yeni Bir Şifre Giriniz:");
                    password = inp.nextLine();
                    System.out.print("Şifreniz Oluşturuldu.");
                } else {
                    System.out.print("Şifreniz Oluşturuldu.");
                }

            } else {
                System.out.print("Çıkış Yapılıyor.");
            }
        }
        
    }
    
}
