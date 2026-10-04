package PZ2;
class Vector {
    private final int x;
    private final int y;
    private final int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getZ() { return z; }

    public int ScalarMultiply(Vector v) {
        return (this.x * v.getX() + this.y * v.getY() + this.z * v.getZ());
    }

    public Vector VectorMultiply(Vector v) {
        int c1 = (this.y * v.getZ()) - (this.z * v.getY());
        int c2 = (this.z * v.getX()) - (this.x * v.getZ());
        int c3 = (this.x * v.getY()) - (this.y * v.getX());

        return new Vector(c1, c2, c3);
    }

    public void GetVector() {
        System.out.println("(" + this.x + "," + this.y + "," + this.z + ")");
    }

        public static void main(String[] args) {
        Vector a = new Vector(0, 5, 9);
        Vector b = new Vector(0, 1, 2);

        int ScalarResult = a.ScalarMultiply(b);
        Vector c = a.VectorMultiply(b);
        
        a.GetVector();
        b.GetVector();

        System.out.println(ScalarResult);
        c.GetVector();
    }
}