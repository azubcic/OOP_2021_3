package zd2;

public class Square extends Shape{

    public Square() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void DrawShape() {
        System.out.println("Drawing a " + Square.class.getSimpleName());
    }

    @Override
    protected void playShapeSound() {
        System.out.println("Playing a sound specific for - " + Square.class.getSimpleName());

    }

    @Override
    protected void eraseShape() {
        System.out.println("Playing a sound specific for - " + Square.class.getSimpleName());

    }

    @Override
    protected void translateShape() {
        System.out.println("Erasing a " + Square.class.getSimpleName());

    }
}
