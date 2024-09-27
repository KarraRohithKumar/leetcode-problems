package Super_constructor_keys;

public class Area_of_rombus extends Area_of_rectangle {
    int base;
    int hieght;
    int add;
    public int area_of_rombus(int base,int hieght){
        return base*hieght;
    }
    Area_of_rombus(){
        this.base=0;
        this.hieght=0;
        this.add=0;
    }
    /**
     * 
     */
    Area_of_rombus(int b ,int h , int hh){
        this.base=b;
        this.hieght=h;
        this.add=hh;
    }
    // Area_of_rombus(int a ,int b){
    //   super(a,b);
    // }

    
}
