package operator;

public class OperatorUnary {
    public static void main(String[] args) {
    int i = 0;
    i++;                      // i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);   // betulkan i nilainya 1
    i++;                    // karena i tadinya sudah bernilai 1 maka sekarang ditambahkan lagi 1 menjadi 2 dong
        System.out.println(i);   // betul lagikan i nilainya 2
    i=i+1;                  // karena nilai i sebelumnya 2, maka i = 2 + 1 = 3 , atau sama saja dengan i++ = i=i+1,
        System.out.println(i); // nilai i jadi 3

    // berlaku juga untuk penambahan angka lain dan operator aritmatika lain
    /// ini kita melanjut nilai variabel i yg sebelumnya 3.
        System.out.println("==========================");
    i+=3; // berarti i = i + 3, i = 3 + 3
        System.out.println(i);

    i+=3;
        System.out.println(i);

    i*=3; // alias i = i * 3
        System.out.println(i);

    i*=3;
        System.out.println(i);

    }
}