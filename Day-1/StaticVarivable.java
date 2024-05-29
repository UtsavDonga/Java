/**
 * statikvariable
 */
class Stikvariable {
    static int i = 1 ;
    int j = 1 ;

    public void metod(){
        System.out.println("value of i =" +i+ " & j "+ j);
        i++;
        ++j;
    }
}
public class StaticVarivable {
    public static void main(String[] args) {
        Stikvariable ss1 = new Stikvariable();
        Stikvariable ss2 = new Stikvariable();
        Stikvariable ss3 = new Stikvariable();

        ss1.metod();
        ss2.metod();
        ss3.metod();
    }
}
