package Fabrics;

import Interfaces.iGameItem;
import Products.Gem;

public class GemGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gem();
    }
    
}
