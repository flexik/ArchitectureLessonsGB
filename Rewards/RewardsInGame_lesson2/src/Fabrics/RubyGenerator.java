package Fabrics;

import Interfaces.iGameItem;
import Products.Ruby;

public class RubyGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Ruby();
    }
    
}
