package Section_02.Ex_25.Word;

/**
 * Created by julian on 22.01.15.
 */
public class Oak extends Plant {

    public Oak(){

        //Won't work type is private
        //type = "tree";

        //This works --- size is protected, Oak is subclass of plant.
        this.size = "large";

        //No access specifier; works becuse Oak and Plant in the same Package
        this.height = 10;
    }
}
