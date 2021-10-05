package zd2;

public class Circle extends Shape {

    public Circle() {
        super();
    }

    @Override
    protected void DrawShape() {
        System.out.println("Drawing a " + Circle.class.getSimpleName());
    }

    @Override
    protected void playShapeSound() {
        System.out.println("Playing a sound specific for - " + Circle.class.getSimpleName());
    }

    @Override
    protected void eraseShape() {
        System.out.println("Erasing a " + Circle.class.getSimpleName());
    }

    @Override
    protected void translateShape() {
        System.out.println("Translating a : " + Circle.class.getSimpleName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
