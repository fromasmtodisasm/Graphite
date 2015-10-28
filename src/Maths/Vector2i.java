package Maths;

/**
 * Created by steppers on 28/10/15.
 */
public class Vector2i {

    public int x, y;

    public Vector2i(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Vector2i add(int x, int y)
    {
        this.x += x;
        this.y += x;
        return this;
    }

    public Vector2i add(Vector2i v)
    {
        this.x += v.x;
        this.y += v.y;
        return this;
    }

    public Vector2i sub(int x, int y)
    {
        this.x -= x;
        this.y -= x;
        return this;
    }

    public Vector2i sub(Vector2i v)
    {
        this.x -= v.x;
        this.y -= v.y;
        return this;
    }

    public Vector2i mul(int m)
    {
        this.x *= m;
        this.y *= m;
        return this;
    }

}