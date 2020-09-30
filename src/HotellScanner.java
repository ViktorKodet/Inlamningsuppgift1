import java.util.List;

/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-28 <br>
 * Time: 13:28 <br>
 * Project: IntelliJ IDEA <br>
 */
public class HotellScanner {

    /**
     * Scannar hotellet efter ett djur som har samma namn som det som matats in.
     * @param list lista, i detta fall hotellet
     * @param namn namnet som matats in.
     * @return djurets plats i listan, hittas det inte returneras -1
     */
    public int hittaDjuret(List list, String namn){
        Djur tempDjur;
        for (int i = 0; i < list.size(); i++){
            tempDjur = (Djur) list.get(i);
            String s = tempDjur.getNamn();
            if (s.equalsIgnoreCase(namn) )
                return i;
        }
        return -1;
    }

}
