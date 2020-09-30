/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-28 <br>
 * Time: 11:46 <br>
 * Project: IntelliJ IDEA <br>
 */
public abstract class Djur implements Matbar {

    private String namn;                      //Inkapsling
    private int vikt;      //I gram


    Djur(String namn, int vikt) {
        setNamn(namn);
        setVikt(vikt);
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }
}
