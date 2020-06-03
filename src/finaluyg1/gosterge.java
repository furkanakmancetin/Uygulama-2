
package finaluyg1;

public class gosterge  extends Karakter
{
    public static void main(String[] args)
    {
        Karakter durum=new Karakter();
        System.out.println("Karakterin Durumu");
        System.out.println("-----------------");
        System.out.print("Sağlık Durumu..:");
        durum.saglik();
        System.out.print("Para Durumu..:");
        durum.banka();
    }
}

