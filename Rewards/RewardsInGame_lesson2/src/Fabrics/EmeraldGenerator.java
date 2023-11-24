package Fabrics;

import Interfaces.iGameItem;
import Products.Emerald;

public class EmeraldGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Emerald();
    }

}
