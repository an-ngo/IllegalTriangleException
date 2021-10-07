public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException{
        if(a<=0|b<=0|c<=0){
            throw new IllegalTriangleException("some side <0");
        }
        if(a+b<=c || b+c<=a || a+c <= b){
            throw new IllegalTriangleException("this is not triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }


    
}
