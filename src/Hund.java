/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-28 <br>
 * Time: 11:47 <br>
 * Project: IntelliJ IDEA <br>
 */
public class Hund extends Djur{

    Hund(String namn, int vikt) {
        super(namn, vikt);
    }

    String mat = MatEnum.hundfoder.toString();


    /**
     * Räknar ut hur mycket mat djuret skall ha.
     * @return sträng som är redo att skrivas ut.
     */
    @Override
    public String hurMycketMat() {
        int mängdMat = getVikt() / 100;
        String output = (getNamn() + " behöver " + mängdMat + " gram " + mat);
        return output;
    }
}
