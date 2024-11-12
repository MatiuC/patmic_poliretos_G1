package Figuras;

public class F6 {
    public void DrawF6(int n){
        System.out.println("Dibujando figura 6:");
        //Dibujar piramide tamaño n

        for (int f = 1; f <= n; f++) {
            for (int c = 1; c <= n; c++) {
                if((f==(n+1)/2) || (f+c>=(n+3)/2 &&  c<=(n+1)/2 && f<=(n+1)/2) || (c-f<=(n-1)/2 && c>=(n+1)/2 && f<=(n+1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
        }
        System.out.println("");
    }
}
}
