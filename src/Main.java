import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print ( "Ürün tutarını giriniz: " );
        double tutar = scanner.nextDouble() ;
        CheckKdv(tutar);


    }

    static void CheckKdv(double tutar){
        final double Kdv18 = 0.18;
        final double Kdv8 = 0.8;

        if(tutar > 1000){

         KdvFiyat(tutar ,Kdv8);}
        else{KdvFiyat(tutar , Kdv18);}


    }
    static  void KdvFiyat(double tutar , double kdvTutar){

        System.out.println("KDV Oranı :" + kdvTutar);
        double yeni_fiyat = tutar + (tutar * kdvTutar);
        System.out.println("KDV'li Tutar : " + yeni_fiyat);



    }


}