public class Factory {
    public Shape getShape(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("sphere")){
            return new Sphere();

        } else if(type.equalsIgnoreCase("cube")){
            return new Cube();

        } else if(type.equalsIgnoreCase("cone")){
            return new Cone();
        } else if (type.equalsIgnoreCase("cylinder")){
            return new Cylinder();
        } else if (type.equalsIgnoreCase("star")) {
            return new Star();
        }
        return null;
    }
}
