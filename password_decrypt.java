import java.util.*;
import java.io.*;

public class password_decrypt {
    private String password;

    public password_decrypt(String password) {
        this.password = password;
    }

    public void decrypt() throws FileNotFoundException {
        Scanner file = new Scanner(new File("ascii.txt"));
        ArrayList<String> ascii = new ArrayList<String>();
        while (file.hasNext()) {
            String s = file.nextLine();
            ascii.add(s);
        }
        ArrayList<String> ascii_reversed = new ArrayList<String>();
        for (int i = ascii.size() - 1; i >= 0; i--) {
            ascii_reversed.add(ascii.get(i));
        }
        String [] split_s = password.split("");
        for (int i = 1; i < split_s.length; i++) {
            for (int j = 0; j < ascii_reversed.size(); j++) {
                if (split_s[i].equals(ascii_reversed.get(j))) {
                    if (j == ascii_reversed.size() - 1) {
                        split_s[i] = ascii_reversed.get(0 + i);
                        break;
                    }
                    else {
                        split_s[i] = ascii_reversed.get(j + i);
                        break;
                    }
                }
            }
        }
        String new_password = "";
        for (int i = 0; i < split_s.length; i++) {
            new_password += split_s[i];
        }
        this.password = new_password;
    }

    public String getPassword() {
        return this.password;
    }

    public String toString() {
        return "Your decrypted password is: " + this.password;
    }
}