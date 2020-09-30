import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DjurMatare {


    public String getMat(Djur d) {
        for (MatEnum m : MatEnum.values()) {
            if (m.djurTyp.equals(d.getClass().getSimpleName())) {
                return m.toString();
            }
        }
        return null;
    }

    public void mata(List<Djur> list) {
        HotellScanner hotellScanner = new HotellScanner();
        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        int djurPlats = hotellScanner.hittaDjuret(list, input);
        if (djurPlats >= 0) {
            Djur tempDjur = list.get(djurPlats);
            JOptionPane.showMessageDialog(null, tempDjur.hurMycketMat());       //Polymorfism
        } else {
            JOptionPane.showMessageDialog(null, "Felaktig inmatning");
        }
    }

    public static void main(String[] args) {

        DjurMatare djurMatare = new DjurMatare();
        List<Djur> hotell = new ArrayList<>();

        hotell.add(new Hund("Sixten", 5000));
        hotell.add(new Hund("Dogge", 10000));
        hotell.add(new Katt("Venus", 5000));
        hotell.add(new Katt("Ove", 3000));
        hotell.add(new Orm("Hypno", 1000));

        System.out.println(djurMatare.getMat(hotell.get(0)));
        System.out.println(hotell.get(0).getClass().getSimpleName());

        djurMatare.mata(hotell);
    }
}
