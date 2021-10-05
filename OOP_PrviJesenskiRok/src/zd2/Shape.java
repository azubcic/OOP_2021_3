package zd2;

public abstract class Shape {
    private static int cntShp = 10;
    private int id;

    public Shape() {
        id = cntShp;
        cntShp++;
    }

    protected abstract void DrawShape();
    protected abstract void playShapeSound();
    protected abstract void eraseShape();
    protected abstract void translateShape();

    @Override
    public String toString() {
        String cls = getClass().getSimpleName();
        return cls + " - " + "Shape{" +
                "id=" + id +
                '}';
    }
}
