import java.util.Scanner;

public class projectKelompok06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = {"ADMIN", "DOSEN", "MAHASISWA"};
        String[] passwords = {"123", "456", "789"};
        int login, menu;
        String nama, pin;
        boolean loginDosen = false, loginAdmin = false, loginMahasiswa = false;

        System.out.println("SISTEM AKADEMIK");
        System.out.println("----------------");

        System.out.println("LOGIN SEBAGAI: ");
        System.out.println("1. ADMIN");
        System.out.println("2. DOSEN");
        System.out.println("3. MAHASISWA");
        System.out.println("");
        System.out.print("pilihan (1/2/3): ");
        login = sc.nextInt();
        sc.nextLine();

        if (login == 1) {
            loginAdmin = login("ADMIN", "123", sc);
            if (loginAdmin) {
                adminMenu(sc);
            }
        } else if (login == 2) {
            loginDosen = login("DOSEN", "456", sc);
            if (loginDosen) {
                dosenMenu(sc);
            }
        } else if (login == 3) {
            loginMahasiswa = login("MAHASISWA", "789", sc);
            if (loginMahasiswa) {
                mahasiswaMenu(sc);
            }
        } else {
            System.out.println("Invalid choice. Exiting...");
        }

        sc.close();
    }

    private static boolean login(String userType, String password, Scanner sc) {
        while (true) {
            System.out.println("Masukkan Nama: ");
            String nama = sc.next();
            System.out.println("Masukkan Password: ");
            String pin = sc.next();

            if (nama.equals(userType) && pin.equals(password)) {
                System.out.println("Login Berhasil");
                return true;
            }

            System.out.println("Username atau password invalid silahkan coba lagi");
        }
    }

    private static void adminMenu(Scanner sc) {
        int menu;
        while (true) {
            System.out.println("MENU ADMIN");
            System.out.println("-------------");
            System.out.println("1. INPUT DATA MAHASISWA");
            System.out.println("2. INPUT DATA MATA KULIAH");
            System.out.println("3. UPDATE DATA MAHASISWA");
            System.out.println("4. INPUT NILAI");
            System.out.println("5. CETAK KHS");
            System.out.println("6. REKAP NILAI SEMUA MAHASISWA");
            System.out.println("7. PENCARIAN");
            System.out.println("8. LOGOUT");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    inputDataMahasiswa(sc);
                    break;
                case 2:
                    inputDataMataKuliah(sc);
                    break;
                // Add other cases for different menu options
                case 8:
                    return; // Logout
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void inputDataMahasiswa(Scanner sc) {
        // Implement the logic for inputting data mahasiswa here
    }

    private static void inputDataMataKuliah(Scanner sc) {
        // Implement the logic for inputting data mata kuliah here
    }

    private static void dosenMenu(Scanner sc) {
        // Implement the logic for the dosen menu here
    }

    private static void mahasiswaMenu(Scanner sc) {
        // Implement the logic for the mahasiswa menu here
    }
}

