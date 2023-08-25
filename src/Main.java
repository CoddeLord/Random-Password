import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Random Şifre oluşturma sistemine hoşgeldiniz \n \n Kaç karakterlik şifre oluşturmak istiyorsunuz");
        length= scanner.nextInt();

        String password = generatePassword(length);
        System.out.println("Şifreniz : " + password);


    }
    public static String generatePassword(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@-.?':#$&%/{[]}()";
        Random random = new Random();
        StringBuilder password  = new StringBuilder();


        for (int i = 0; i<length; i++){
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            password.append(randomChar);
        }
        return password.toString();
    }
}