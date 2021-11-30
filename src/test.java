import pl.imiajd.truchan.Adres;
import pl.imiajd.truchan.Nauczyciel;
import pl.imiajd.truchan.Student;
import pl.imiajd.truchan.BetterRectangle;
public class test {

    public static void main(String[] args)
    {
        Adres adres1= new Adres("Klonowa","15","22","Katowice","14-545");
        adres1.pokaz();
        Student student1=new Student("Warszawiak","2000","Informatyka Ogolna");
        Nauczyciel Nauczyciel1=new Nauczyciel("Koscielny","1983","4500");
        System.out.print(student1.toString());
        System.out.print(Nauczyciel1.toString());
        BetterRectangle rect=new BetterRectangle(0,0,12,4);
        System.out.print(rect.getArea()+"\n");
        System.out.print(rect.getPerimeter()+"\n");
    }
}
