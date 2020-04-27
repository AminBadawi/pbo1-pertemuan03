package percabangan;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai = 'B';

        switch (nilai) {
            case 'A':
                System.out.println("Mahasiswa : \"Terima kasih Pak, semoga sehat selalu\"");
                System.out.println("Dosen     : \"Iya, sama-sama.\"");
                break;

            case 'B':
                System.out.println("Mahasiswa : \"Nama ulun awalannya A pak kenapa nilai ulun B?\"");
                System.out.println("Dosen     : \"tapikan ada jua B nya, Badawi\"");
                System.out.println("Mahasiswa : \"hehe\"");
                break;

            case 'C':
                System.out.println("Mahasiswa : \"Kenapa nilai ulun dapat C, Pak? Padahal tugas pian kada pernah tetinggal\"");
                System.out.println("Dosen     : \"Jawabannya sama tarus lawan kawan\"");
                System.out.println("Mahasiswa : \"eeee anuuuuu\"");
                break;

            default:
                System.out.println("Mahasiswa : \"............\"");
                System.out.println("Mahasiswa : \"dahlah terminal aja\"");
                break;
        }
    }
}

