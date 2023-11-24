package Fabrics;

import Interfaces.iGameItem;
import Products.Silver;

public class SilverGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Silver();
    }
    
}

