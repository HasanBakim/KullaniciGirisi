import java.util.Scanner;
public class SwitchCaseKullanici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int choice;
        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();
        System.out.print("Şifreniz");
        password = input.nextLine();
        switch(userName){
            case "Patika":
                switch(password){
                    case "Java123":
                        System.out.print("Başarıyla Giriş Yaptınız.");
                        break;
                    default:
                        System.out.print("Hatalı Giriş Yaptınız.");
                        System.out.print("Yeni Bir Şifre Oluşturmak için 1, çıkış için 2 giriniz");
                        choice = input.nextInt();
                        switch(choice){
                            case 1:
                                Scanner inp = new Scanner(System.in);
                                System.out.print("Yeni Şifrenizi Giriniz:");
                                password = inp.nextLine();
                                switch(password){
                                    case "Java123":
                                        System.out.println("Şifreniz Aynı Olamaz! Yeni bir Şifre Giriniz:");
                                        System.out.print("Yeni Şifrenizi Giriniz:");
                                        password = inp.nextLine();
                                        System.out.println("Şifreniz Oluşturuldu.");
                                        break;
                                    default:
                                        System.out.print("Şifreniz Başarıyla Oluşturuldu.");
                                        
                                }
                                break;
                        }
                }


        }
        
    }
    
}
