package day02methodcreation;

public class Car {


    public String brand = "Honda";
    public int price = 20000;

    //genelde main method variableslardan sonra gelir

    public static void main(String[] args) {

        //obje nasıl oluşturulur. --> obje isim koyma kuralları variable ile aynıdır.
        // ilk adımda class ismi yazilir  2)Objeye isim veriniz.    3)assigment operator "=" koy  4)new keyword unu kullan 5)class ismi parantezle beraber yaz (constructor)
                Car                            myHonda                        =                           new                     Car();
        System.out.println(myHonda.price);
        System.out.println(myHonda.brand);
        myHonda.hareketEt();
        myHonda.dur();

        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));
        System.out.println(obj.ucSayiyiCarp(3,5,6));

    }


    public void hareketEt(){

        System.out.println("Honda güzel hareket eder");
    }

    public void dur(){
        System.out.println("Honda güvenli bir şekilde durur");
    }


}
