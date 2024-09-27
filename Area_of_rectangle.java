package Super_constructor_keys;

/**
 * Area_of_rectangle
 */
public class Area_of_rectangle extends Area_of_circle {
   int length;
   int width;
   public int area_of_rectangle(int length,int width){
            return length*width;
   }
   Area_of_rectangle(){
      this.length=0;
      this.width=0;
   }
   Area_of_rectangle(int a,int b){
      this.length=a;
      this.width=b;
   }
   // Area_of_rectangle(int f){
   //    super(f);
   // }



   
}