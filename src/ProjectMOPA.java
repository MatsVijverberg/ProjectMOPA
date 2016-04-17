/**
 * Created by Mats on 13-12-2015.
 */
import java.util.Random;

public class ProjectMOPA {

    public static void main(String[] args){

        Random RNG = new Random();
        //Code wordt later in een map system gestopt, maar omdat dat er nog niet is wordt nu de main class gebruikt.
        EnemySelecter Injector = new EnemySelecter();
        Injector.EnemyInjector((RNG.nextInt(3) + 1), (RNG.nextInt(3) + 1), (RNG.nextInt(3) + 1), (RNG.nextInt(3) + 1), (RNG.nextInt(3) + 1), (RNG.nextInt(3) + 1), (RNG.nextInt(3) + 1), (RNG.nextInt(7) + 1));
    }

}
