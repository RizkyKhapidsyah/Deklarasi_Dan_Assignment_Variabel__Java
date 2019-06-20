package deklarasidanassignment;

/**
 * @author RizkyKhapidsyah
 */
public class DeklarasiDanAssignment 
{
    public static void main(String[] args) 
    {
        int X;      // Ini adalah Deklarasi Variabel, X adalah Identifier/Pengenal
        int Y = 7;  // Ini adalah Assignment Variabel, Y adalah Identifier/Pengenal
        
        /*  isi variabel 'X' tidak dapat langsung dicetak ke layar
            karena belum diisi nilai. Sebaliknya, variabel 'Y' dapat
            dicetak ke layar karena sudah diisi nilai. Berikut Contohnya:
        */
        
        System.out.println("Isi Variabel Y = " + Y + " (Perintah Cetak: println)");
        System.out.printf("Isi Variabel Y = %d (Perintah Cetak: printf) \n\n", Y);
        
        /*  Untuk menampilkan isi variabel 'X', silahkan isi terlebih dahulu
            nilai dari variabel 'X' tersebut, karena jika tidak, maka akan terjadi
            error. Berikut contohnya:
        */
        
        X = 9; // Variabel Diisi
        
        System.out.println("Isi Variabel X = " + X + " (Perintah Cetak: println)");
        System.out.printf("Isi Variabel X = %d (Perintah Cetak: printf) \n", X);      
    }
}
