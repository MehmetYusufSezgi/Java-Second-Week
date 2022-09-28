public class Main {
    public static void main(String[] args) {

        sayiBulmaca();

    }

    public static void sayiBulmaca (){

        int[] sayilar = {1, 3, 5, 7, 9};
        int aranan = 6;
        int puan = 0;
        int i;

        for(i=0;i<4;i++)
        {
            if(aranan==sayilar[i])
            {
                puan++;
            }
        }
        if(puan==1)
        {
            mesajVer(aranan);
        }
        else
        {
            System.out.println("Sayi dizide bulunmamaktadir.");
        }

    }

    public static void mesajVer (int aranan) {

        System.out.println("Sayi dizide bulunmaktadir." +aranan );

    }
}