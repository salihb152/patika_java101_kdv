import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran=0.18, kdvTutar, kdvliTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ücret tutarını giriniz : ");
        tutar = scanner.nextDouble();

        if(tutar>1000){
            kdvOran=0.08;
        }

        kdvTutar = tutar*kdvOran;
        kdvliTutar= tutar+kdvTutar;

        System.out.println(" Kdv\2siz tutar : "+ tutar);
        System.out.println(" KDV oranı : "+  kdvOran);
        System.out.println(" KDV tutarı : "+  kdvTutar);
        System.out.println(" KDV\'li tutar : "+  kdvliTutar);
    }

}
