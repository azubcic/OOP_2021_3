package zd2;

public class Rectangle extends Shape{
    public Rectangle() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void DrawShape() {
        System.out.println("Drawing a "  + Rectangle.class.getSimpleName());

    }

    @Override
    protected void playShapeSound() {
        System.out.println("Playing a sound specific for - " + Rectangle.class.getSimpleName());

    }

    @Override
    protected void eraseShape() {
        System.out.println("Erasing a " + Rectangle.class.getSimpleName());

    }

    @Override
    protected void translateShape() {
        System.out.println("Translating a : " + Rectangle.class.getSimpleName());

    }
}
