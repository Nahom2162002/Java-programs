import java.util.*;
import java.io.*;

public class password_encrypt {
    private String password;

    public password_encrypt(String password) {
        this.password = password;
    }

    public void encrypt() throws FileNotFoundException {
        Scanner file = new Scanner(new File("ascii.txt"));
        ArrayList<String> ascii = new ArrayList<String>();
        while (file.hasNext()) {
            String s = file.nextLine();
            ascii.add(s);
        }
        String [] split_s = password.split("");
        for (int i = 1; i < split_s.length; i++) {
            for (int j = 0; j < ascii.size(); j++) {
                if (split_s[i].equals(ascii.get(j))) {
                    if (j == ascii.size() - 1) {
                        split_s[i] = ascii.get(0 + i);
                        break;
                    }
                    else {
                        split_s[i] = ascii.get(j + i);
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
        return "Your encrypted password is: " + this.password;
    }
}