package InMemoryModel;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import ModelElements.*;



public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) { // конструктор
        this.changeObservers = changeObservers;   // агрегация

        this.models = new ArrayList<>();    // композиция
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }

    
}
