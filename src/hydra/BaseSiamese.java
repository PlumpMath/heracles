package hydra;

/**
 * Created by txangel on 5/14/14.
 */
public abstract class BaseSiamese {
    public enum ViscusState {
        DEAD,
        ALIVE,
        FILE_NOT_FOUND
    }

    public abstract void setHeart(double heart);

    public abstract void setBrain(String brain);

    public abstract void setLiver(Siamese.ViscusState liver);

    public abstract void setName(String name);
}
