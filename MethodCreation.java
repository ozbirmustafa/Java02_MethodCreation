package day02methodcreation;

public class MethodCreation {

    // void yeni bir data üretmez
    // örnek olarak bir tuşa tıklama methodu, ekrana bir şey yazdırma vs

    // main method içinde kullanacağınız her şey static olmalıdır.

    public static void main(String[] args) {

        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
        //Ekrana bir sey yazdirmak icin iki tane kod var i)System.out.println() ==> Satirbasi yapar      ii)System.out.print() ==> Satirbasi yapmaz

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(ucSayiyiCarp(2,1.5,6));

        System.out.println(ilkIkiToplaUcuncuyleCarp(3,4.5,2));


    }

    //Ex1: Toplama işlemi yapan bir method oluşturunuz.
    public static double toplamaYap (double a, double b){
        return a+b;
    }

    public static double ucSayiyiCarp(double a, double b, double c){

        return a*b*c;
    }

    public static double ilkIkiToplaUcuncuyleCarp(double a, double b, double c){

        return (a+b)*c;
    }

    //mehodların ismi aksiyon belirtmeli




}
