package Fabrics;

import Interfaces.iGameItem;
import Products.Gold;

public class GoldGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gold();
    }
    
}
