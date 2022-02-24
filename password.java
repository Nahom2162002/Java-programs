import java.util.*;
import java.io.*;

public class password {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a password: ");
        String s = in.next();
        String new_password = "";
        System.out.println("Would you like to encrypt this password?");
        String encrypted_choice = in.next();
        if (encrypted_choice.equals("No")) {
            System.out.println("Ok");
        }
        else if (encrypted_choice.equals("Yes")) {
            password_encrypt user_encrypt = new password_encrypt(s);
            user_encrypt.encrypt();
            System.out.println(user_encrypt.getPassword());
            new_password = user_encrypt.getPassword();
        }
        System.out.println("Would you like to decrypt your password?");
        String decrypted_choice = in.next();
        if (decrypted_choice.equals("No")) {
            System.out.println("Ok");
        }
        else if (decrypted_choice.equals("Yes")) {
            if (new_password != "") {
                System.out.println("Would you like to decrypt the original password or the new one?");
                String choice = in.next();
                if (choice.equals("Original")) {
                    password_decrypt user_decrypt = new password_decrypt(s);
                    user_decrypt.decrypt();
                    System.out.println(user_decrypt.getPassword());
                }
                else if (choice.equals("New")) {
                    password_decrypt user_decrypt = new password_decrypt(new_password);
                    user_decrypt.decrypt();
                    System.out.println(user_decrypt.getPassword());
                }
            }
            else {
               password_decrypt user_decrypt = new password_decrypt(s);
               user_decrypt.decrypt();
               System.out.println(user_decrypt.getPassword());
            }
        }
    }    
}