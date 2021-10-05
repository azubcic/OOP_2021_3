package zd2;

public class Oval extends Shape {

    public Oval() {
        super();
    }

    @Override
    protected void DrawShape() {
        System.out.println("Drawing a " + Oval.class.getSimpleName());

    }

    @Override
    protected void playShapeSound() {
        System.out.println("Playing a sound specific for - " + Oval.class.getSimpleName());

    }

    @Override
    protected void eraseShape() {
        System.out.println("Erasing a " + Oval.class.getSimpleName());

    }

    @Override
    protected void translateShape() {
        System.out.println("Translating a : " + Oval.class.getSimpleName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
