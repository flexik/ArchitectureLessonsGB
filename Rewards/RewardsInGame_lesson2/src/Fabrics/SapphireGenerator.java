package Fabrics;

import Interfaces.iGameItem;
import Products.Sapphire;

public class SapphireGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Sapphire();
    }
    
}

