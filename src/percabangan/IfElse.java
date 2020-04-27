package percabangan;

public class IfElse {
    public static void main(String [] args) {
        double totalbulanja = 55000;
        double beisiduit    = 65000;

        if (beisiduit < totalbulanja) {
            System.out.println("duitnya kada mayu, kada boleh bahutang lah");
        }else if(beisiduit > totalbulanja) {
            double angsul = beisiduit - totalbulanja;
            System.out.println("ihh hadang, ini ada angsulnya : "+angsul);
        }else{
            System.out.println("duitnya pas, kadada angsul");
        }
    }
}