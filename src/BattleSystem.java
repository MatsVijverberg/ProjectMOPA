import java.lang.reflect.Array;

/**
 * Created by Pascal on 17-4-2016.
 */
public class BattleSystem {

    void Encounter(int iENAM, String[] ArrEnemyGroup){
        if (iENAM > 0) {
            System.out.println(ArrEnemyGroup[0] + " appeared!");
        }
        if (iENAM > 1) {
            System.out.println(ArrEnemyGroup[1] + " appeared!");
        }
        if (iENAM > 2) {
            System.out.println(ArrEnemyGroup[2] + " appeared!");
        }
        if (iENAM > 3) {
            System.out.println(ArrEnemyGroup[3] + " appeared!");
        }
        if (iENAM > 4) {
            System.out.println(ArrEnemyGroup[4] + " appeared!");
        }
        if (iENAM > 5) {
            System.out.println(ArrEnemyGroup[5] + " appeared!");
        }
        if (iENAM > 6) {
            System.out.println(ArrEnemyGroup[6] + " appeared!");
        }
    }
}
