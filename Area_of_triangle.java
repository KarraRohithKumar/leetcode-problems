package Super_constructor_keys;

public class Area_of_triangle extends Area_of_rombus {
    int height;
    int base;
    int add1;
    int add2;
    public int area_of_triangle(int height, int base) {
        return (height * base) / 2;
    }
    Area_of_triangle() {
        this.height = 0;
        this.base = 0;
        this.add1 = 0;
        this.add2 = 0;
    }
    Area_of_triangle(int h, int b, int k, int j) {
        this.height = h;
        this.base = b;
        this.add1 = k;
        this.add2 = j;
    }
    // Area_of_triangle(int h, int b, int k) {
    //     super(h, b, k);
    // }
}
