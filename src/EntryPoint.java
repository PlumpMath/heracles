import heracles.Iolaus;
import hydra.BaseSiamese;
import hydra.Siamese;
import hydra.SiameseBox;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by txangel on 5/14/14.
 */

public class EntryPoint {

    private static void SetAttributes(BaseSiamese siamese, String name, double heart, String brain, BaseSiamese.ViscusState liver) {
        System.out.println("[Before] "+ name + ": " + siamese);
        siamese.setName(name);
        siamese.setHeart(heart);
        siamese.setBrain(brain);
        siamese.setLiver(liver);
        System.out.println("[After] "+ name + ": " + siamese);
    }

    public static void main(String[] args) {
        {
        System.out.println("Creating 2 Cojoined Twins...");
            BaseSiamese chang = new Siamese();
            SetAttributes(chang, "Chang", 5.1, "Happy", BaseSiamese.ViscusState.ALIVE);


            BaseSiamese eng = new Siamese();
            SetAttributes(eng, "Eng", 42, "Sad", BaseSiamese.ViscusState.FILE_NOT_FOUND);

            System.out.println("CASE 1: \n Chang: " + chang + "\n Eng: " + eng);
        }
        {
            System.out.println("Recreating 2 Cojoined Twins...");

            Iolaus loader1 = new Iolaus();
            Iolaus loader2 = new Iolaus();
            try {
                System.out.println("AND SPLITTING THEM");
                Class Siamese1 = loader1.loadClass("hydra.Siamese");
                Class Siamese2 = loader2.loadClass("hydra.Siamese");

                BaseSiamese chang = (BaseSiamese) Siamese1.newInstance();
                SetAttributes(chang, "Chang", 5.1, "Happy", BaseSiamese.ViscusState.ALIVE);


                BaseSiamese eng = (BaseSiamese) Siamese2.newInstance();
                SetAttributes(eng, "Eng", 42, "Sad", BaseSiamese.ViscusState.FILE_NOT_FOUND);

                System.out.println("CASE 2: \n Chang: " + chang + "\n Eng: " + eng);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        {
            System.out.println("Creating 2 Cojoined Twins...");
            BaseSiamese chang = new SiameseBox();
            SetAttributes(chang, "Chang", 5.1, "Happy", BaseSiamese.ViscusState.ALIVE);


            BaseSiamese eng = new SiameseBox();
            SetAttributes(eng, "Eng", 42, "Sad", BaseSiamese.ViscusState.FILE_NOT_FOUND);

            System.out.println("CASE 3: \n Chang: " + chang + "\n Eng: " + eng);
        }
        {
            System.out.println("Recreating 2 Cojoined Twins...");

            Iolaus loader1 = new Iolaus();
            Iolaus loader2 = new Iolaus();
            try {
                System.out.println("AND SPLITTING THEM");
                Class Siamese1 = loader1.loadClass("hydra.SiameseBox");
                Class Siamese2 = loader2.loadClass("hydra.SiameseBox");

                BaseSiamese chang = (BaseSiamese) Siamese1.newInstance();
                SetAttributes(chang, "Chang", 5.1, "Happy", BaseSiamese.ViscusState.ALIVE);


                BaseSiamese eng = (BaseSiamese) Siamese2.newInstance();
                SetAttributes(eng, "Eng", 42, "Sad", BaseSiamese.ViscusState.FILE_NOT_FOUND);

                System.out.println("CASE 4: \n Chang: " + chang + "\n Eng: " + eng);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }
}
