package hydra;

/**
 * Created by txangel on 5/14/14.
 */
public class Siamese extends BaseSiamese {

    private static double heart;
    private static String brain;
    private static ViscusState liver;

    private String name;

    public Siamese() {
        this.name = "No name";
        Siamese.heart = 0;
        Siamese.brain = "Zombie";
        Siamese.liver = ViscusState.DEAD;
    }

    @Override
    public String toString(){
        return "Siamese=> Name: " + this.name
                + " Heart: " + heart
                + " Brain: " + brain
                + " Liver: " + liver;
    }


    @Override
    public void setHeart(double heart) {
        Siamese.heart = heart;
    }

    @Override
    public void setBrain(String brain) {
        Siamese.brain = brain;
    }

    @Override
    public void setLiver(ViscusState liver) {
        Siamese.liver = liver;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
