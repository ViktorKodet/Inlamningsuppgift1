/**
 * Created by Viktor Kodet <br>
 * Date: 2020-09-29 <br>
 * Time: 10:45 <br>
 * Project: IntelliJ IDEA <br>
 */
public enum MatEnum {
        kattfoder(Katt.class.getSimpleName()), hundfoder(Hund.class.getSimpleName()), ormpellets(Orm.class.getSimpleName());
        public final String djurTyp;

        MatEnum(String djurTyp){
            this.djurTyp = djurTyp;
        }

}
