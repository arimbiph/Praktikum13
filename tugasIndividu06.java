import java.util.Scanner;

public class tugasIndividu06 {
    static Scanner sc = new Scanner(System.in);
    static int[][] nilai = new int[5][3];
    static String[] nama = { "Intan", "Arum", "Indah", "Dewi", "Firda" };

    public static void main(String[] args){
        inputnilai();
        System.out.print("****************");
        tampilnilai();
        System.out.println("****************");
        hari();
        System.out.println("****************");
        mahasiswa();
    }

    public static void inputnilai() {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan nilai " + nama[i] + " minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilnilai() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + " : "); 
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]);
                if (j < nilai[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
public static void hari() {
    int maxValue = nilaitertinggi(nilai);
    for (int i = 0; i < nilai.length; i++) {
        for (int j = 0; j < nilai[0].length; j++) {
            if (nilai[i][j] == maxValue) {
                System.out.println("Nilai tertinggi ada pada minggu ke-" + (j + 1));
            }
        }
    }
}
public static void mahasiswa() {
    int maxValue = nilaitertinggi(nilai);
    for (int i = 0; i < nilai.length; i++) {
        for (int j = 0; j < nilai[0].length; j++) {
            if (nilai[i][j] == maxValue) {
                System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[i] + " dengan nilai " + maxValue);
            }
        }
    }
}

static int nilaitertinggi(int[][] array ) {
    int maxValue = 0;

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j] > maxValue) {
                maxValue = array[i][j];
            }
        }
    }
    returtn maxValue;
  }
}
