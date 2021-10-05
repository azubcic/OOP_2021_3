package zd2;

public class Triangle extends Shape {
    public Triangle() {
        super();
    }

    @Override
    protected void DrawShape() {
        System.out.println("Drawing a " + Triangle.class.getSimpleName());
    }

    @Override
    protected void playShapeSound() {
        System.out.println("Playing a sound specific for - " + Triangle.class.getSimpleName());
    }

    @Override
    protected void eraseShape() {
        System.out.println("Erasing a " + Triangle.class.getSimpleName());
    }

    @Override
    protected void translateShape() {
        System.out.println("Translating a : " + Triangle.class.getSimpleName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
