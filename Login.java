package tubes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
   private HashMap<String, String> userDatabase = new HashMap<>();
   private User nasabah = new User();
   private boolean admin;
   private boolean user;

    public Login() {
        loadUsers();
    }

    private void loadUsers() {
        try {
            File file = new File("C:\\Users\\Haida\\eclipse-workspace\\pemrogramanBerorientasiObjek\\users.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] userData = scanner.nextLine().split(":");
                if (userData.length == 2) {
                    userDatabase.put(userData[0], userData[1]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan.");
        }
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        System.out.println();
        
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            System.out.println("Login berhasil!");
            System.out.println();
            nasabah.setUsername(username);
            user = true;
            admin = false;
        }
        else if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
        	System.out.println("Login admin berhasil!\n");
        	admin = true;
        	user = false;
        }
        else {
    		System.out.println("Login gagal. Username atau password salah.");
            System.out.println();
            admin = false;
            user = false;
        }
      }
    public boolean user() {
    	return user;
    }
    
    public boolean admin() {
    	return admin;
    }
}
