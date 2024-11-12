package Figuras;

public class F1 {
    public void dibujarcuadrado(int size){
        for (int f = 1; f <= size ;f++) {
            for (int c = 1; c <= size; c++) {
                if((f==1 || f==size) || (c==1 || c == size)){
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
        
    }
}
}
