package Figuras;

public class F5 {
    public void DrawF5(int size){   
        System.out.println("Dibujando figura 5:");
        //primade invertida
        for (int f=1; f<=size; f++){
            for (int c=1; c<=size; c++){
                if ((f==1) || (f <= c && c<=(size+1)/2) || (f+c<=size+1 && c>=(size+1)/2)){
                    System.out.print("*");
            }else{
                System.out.print(" ");
            
            }
        }
        System.out.println("");
    }
}
}
