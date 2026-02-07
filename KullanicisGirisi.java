import java.util.Scanner;
public class KullanicisGirisi {
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
            System.out.println("Hatalı Giriş Yaptınız.");
            System.out.print("Şifre Oluşturmak için 1, Çıkış için 2 Giriniz:");
            choice = input.nextInt();
            if(choice == 1){
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni Şifrenizi Giriniz:");
                password = inp.nextLine();
                if(password.equals("Java123")){
                    System.out.println("Lütfen Farklı Bir Şifre Giriniz!");
                    System.out.print("Yeni Şifrenizi Giriniz:");
                    password = inp.nextLine();
                    System.out.print("Yeni Şifreniz Oluşturuldu.");
                
                } else {
                    System.out.print("Yeni Şifreniz Oluşturuldu.");
                }
                
                
            } else {
                System.out.print("Çıkış Yapılıyor.");
            }
        }
        
    }
    
}
