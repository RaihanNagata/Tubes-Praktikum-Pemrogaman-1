package tubes;

import java.util.Scanner;

public class ListTransaksi {
	public static void main(String[] args) {
		Login login = new Login();
		User user = new User();
		user.setStack(new StrukturStack(5));
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			login.login();
		    if(login.user()){
			      boolean display = true;
			
			      while (display) {
				        System.out.println("\nMenu:");
				        System.out.println("1. Tambah Transaksi Baru");
				        System.out.println("2. Lihat Transaksi Terakhir");
				        System.out.println("3. Keluar");
				        System.out.print("Masukkan pilihan Anda: ");
				        int pilihan = sc.nextInt();
				
				        switch (pilihan) {
					          case 1:
						            // Menambahkan transaksi baru
						            System.out.print("Masukkan kode transaksi: ");
						            String kode = sc.next();
						            System.out.print("Masukkan tanggal hari ini (dd-MM-yyyy): ");
						            String tanggal = sc.next();
						            System.out.print("Masukkan jam sekarang (HH:mm): ");
						            String jam = sc.next();
						            System.out.print("Masukkan jumlah debit: ");
						            int debit = sc.nextInt();
						            user.getStack().push(new Transaksi(kode, tanggal, jam, debit));
						            System.out.println("Transaksi berhasil ditambahkan.");
						            break;
					          case 2:
					            // Menampilkan transaksi terakhir
									System.out.println("Transaksi terakhir :");
									user.getStack().display();
					          case 3:
						            // Keluar dari program
						            display = false;
						            System.out.println("Keluar dari program.");
						            break;
					          default:
						            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
						            break;
				        }
			      }
		    }
		    else if (login.admin()){
		    	boolean display = true;
				
		    	while (display) {
			    	  String username;
				    	
				    	System.out.println("\nMenu:");
				        System.out.println("1. Lihat Transaksi Terakhir");
				        System.out.println("2. Hapus Transaksi Terakhir");
				        System.out.println("3. Keluar");
				        System.out.print("Masukkan pilihan Anda: ");
				        int pilihan = sc.nextInt();
				        
				        switch(pilihan) {
				        	case 1:
				        		System.out.println("Masukkan username yang ingin dilihat transaksinya: ");
				        		username = sc.next();
				        		System.out.println("Transaksi terakhir milik: " + username + "\n");
				        		user.getStack().display();
				        		break;
				        	case 2:
				        		System.out.println("Masukkan username yang ingin dihapus transaksinya: ");
				        		username = sc.next();
				        		user.getStack().pop();
				        		System.out.println("Anda telah menghapus transaksi terakhir milik " + username + "\n");
				        		break;
				        	case 3:
					            // Keluar dari program
					            display = false;
					            System.out.println("Keluar dari program.");
					            break;
				        	default:
					            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
					            break;
				        }
		    		}
		    }
		}
	}
}

