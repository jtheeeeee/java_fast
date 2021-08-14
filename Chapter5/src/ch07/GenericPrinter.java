package ch07;

public class GenericPrinter<T extends Material>{
    private T material;

    @Override
    public String toString() {
        return material.toString();
    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
