import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
            int mat,fiz,kim,tur,muz;
            double ort;

        Scanner inp =new Scanner(System.in);

        System.out.print("Matematik notunu girin  :");
        mat=inp.nextInt();


        System.out.print("Fizik notunu girin  :");
        fiz=inp.nextInt();

        System.out.print("Kimya notunu girin  :");
        kim=inp.nextInt();

        System.out.print("Türkçe notunu girin  :");
        tur=inp.nextInt();

        System.out.print("Müzik notunu girin  :");
        muz=inp.nextInt();
        if(mat<0 ||mat>100||kim<0||kim>100||tur<0 ||tur>100||muz<0 ||muz>100){
            System.out.println("Geçersiz Not Girdiniz.");
            return;
        }

        ort=(mat+fiz+kim+tur+muz)/5;

       if(ort < 55){
           System.out.println("Sınıfta Kaldı..");
           System.out.println("Ortalamanız  :"+ort);

       }
       else{
           System.out.println("Sınıfı Geçti..");
           System.out.println("Ortalamanız  :"+ort);

       }



    }
}
