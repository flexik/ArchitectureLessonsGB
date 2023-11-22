package ModelElements;

import java.util.List;

import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<PoligonalModel> models, List<Camera> cameras){
        this.id = id;
        this.flashes = flashes;
        if (models.size() > 0) {
            this.models = models;
        }
        else throw new RuntimeException("Список пустой, должна быть хотя бы 1 модель");
        if (cameras.size() > 0) {
            this.cameras = cameras;
        }
        else throw new RuntimeException("Список пустой, должна быть хотя бы 1 камера");
    }

    public Type method1(Type type){
        return null;
    }
     
    public Type method2(Type type1, Type type2){
        return null;
    }
}
