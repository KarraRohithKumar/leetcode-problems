package Super_constructor_keys;

public class Area_of_circle {
    int r;
    float pi=3.14f;
    public double area(int r){
        return pi*r*r;
    }
    public double area_of_circle(){
       return area(r);
    }
    Area_of_circle(){
        this.r=0;
    }
    Area_of_circle(int f){
        this.r=f;
    }
    
}
