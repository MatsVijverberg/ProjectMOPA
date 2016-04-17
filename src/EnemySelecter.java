/**
 * Created by Pascal on 17-4-2016.
 */
public class EnemySelecter {

    String[] ArrEnemyGroup = {"null", "null", "null", "null", "null", "null", "null"};
    BattleSystem Battle = new BattleSystem();

    void EnemyInjector(int iEnemy1,int iEnemy2,int iEnemy3,int iEnemy4,int iEnemy5,int iEnemy6,int iEnemy7, int iEnemyAM){
        switch(iEnemy1){
            case 1: ArrEnemyGroup[0] = "Goblin";
                break;
            case 2: ArrEnemyGroup[0] = "Ork";
                break;
            case 3: ArrEnemyGroup[0] = "Wolf";
                break;
            default: ArrEnemyGroup[0] = "null";
                break;
        }
        switch(iEnemy2){
            case 1: ArrEnemyGroup[1] = "Goblin";
                break;
            case 2: ArrEnemyGroup[1] = "Ork";
                break;
            case 3: ArrEnemyGroup[1] = "Wolf";
                break;
            default: ArrEnemyGroup[1] = "null";
                break;
        }
        switch(iEnemy3){
            case 1: ArrEnemyGroup[2] = "Goblin";
                break;
            case 2: ArrEnemyGroup[2] = "Ork";
                break;
            case 3: ArrEnemyGroup[2] = "Wolf";
                break;
            default: ArrEnemyGroup[2] = "null";
                break;
        }
        switch(iEnemy4){
            case 1: ArrEnemyGroup[3] = "Goblin";
                break;
            case 2: ArrEnemyGroup[3] = "Ork";
                break;
            case 3: ArrEnemyGroup[3] = "Wolf";
                break;
            default: ArrEnemyGroup[3] = "null";
                break;
        }
        switch(iEnemy5){
            case 1: ArrEnemyGroup[4] = "Goblin";
                break;
            case 2: ArrEnemyGroup[4] = "Ork";
                break;
            case 3: ArrEnemyGroup[4] = "Wolf";
                break;
            default: ArrEnemyGroup[4] = "null";
                break;
        }
        switch(iEnemy6){
            case 1: ArrEnemyGroup[5] = "Goblin";
                break;
            case 2: ArrEnemyGroup[5] = "Ork";
                break;
            case 3: ArrEnemyGroup[5] = "Wolf";
                break;
            default: ArrEnemyGroup[5] = "null";
                break;
        }
        switch(iEnemy7){
            case 1: ArrEnemyGroup[6] = "Goblin";
                break;
            case 2: ArrEnemyGroup[6] = "Ork";
                break;
            case 3: ArrEnemyGroup[6] = "Wolf";
                break;
            default: ArrEnemyGroup[6] = "null";
                break;
        }
        Battle.Encounter(iEnemyAM, ArrEnemyGroup);
    }
}
