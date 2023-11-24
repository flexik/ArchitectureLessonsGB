package Fabrics;

import Interfaces.iGameItem;
import Products.Topaz;

public class TopazGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Topaz();
    }
    
}

