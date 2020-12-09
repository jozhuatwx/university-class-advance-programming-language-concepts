package lab3_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {
  private static final String DATAFILE = "lab3_2\\account.txt";

  private int id;
  private String firstName, lastName, dob, username, password;

  public Account(int id, String firstName, String lastName, String dob, String username, String password) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.username = username;
    this.password = password;
  }

  @Override
  public String toString() {
    return "Account{id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password=" + password + ", dob=" + dob + "}";
  }

  // getters
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  // get all accounts
  public static List<Account> getAll() {
    ArrayList<Account> lst = new ArrayList<>();

    try {
      List<String> lines = Files.readAllLines(Paths.get(DATAFILE));

      for (int i = 1; i < lines.size(); i++) {
        String[] split = lines.get(i).split("\\,");
        lst.add(new Account(Integer.parseInt(split[0]), split[1], split[2], split[3], split[4], split[5]));
      }
    } catch (IOException e) {
      Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, e);
    }

    return lst;
  }
}
