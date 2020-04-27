package percabangan;

public class Switch {
    public static void main(String[] args) {
        int ngabuburit = 3;

        switch (ngabuburit) {
            case 1:
                System.out.println("gawi tugas");
                break;

            case 2:
                System.out.println("nongkrong");
                break;

            case 3:
                System.out.println("bepatak di rumah");
                break;

            case 4:
                System.out.println("becari makan");
                break;

            default:
                System.out.println("nonton film");
                break;
        }
    }
}