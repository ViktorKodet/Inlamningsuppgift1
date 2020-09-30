/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-28 <br>
 * Time: 11:46 <br>
 * Project: IntelliJ IDEA <br>
 */
public class Orm extends Djur{

    Orm(String namn, int vikt) {
        super(namn, vikt);
    }
    String mat = MatEnum.ormpellets.toString();


    @Override
    public String hurMycketMat() {
        int mängdMat = 20;
        String output = (getNamn() + " behöver " + mängdMat + " gram " + mat);
        return output;
    }
}
