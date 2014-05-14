package hydra;

/**
 * Created by txangel on 5/14/14.
 */
public class SiameseBox extends BaseSiamese{
    private Siamese element;

    public SiameseBox() {
        element = new Siamese();
    }

    @Override
    public void setHeart(double heart) {
        element.setHeart(heart);
    }

    @Override
    public void setBrain(String brain) {
        element.setBrain(brain);
    }

    @Override
    public void setLiver(ViscusState liver) {
        element.setLiver(liver);
    }

    @Override
    public void setName(String name) {
        element.setName(name);
    }

    @Override
    public String toString() {
        return "SiameseBox{" +
                "element=" + element +
                '}';
    }
}
