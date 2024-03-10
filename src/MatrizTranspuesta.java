public class MatrizTranspuesta {
    public static int[][] matriz={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    public static int[][] matrizT=new int[matriz[0].length][matriz.length];
    public static void main(String[] arg){
        matrizTranspuesta(matriz,0,0,matrizT);
        print(matriz,0,0);
        System.out.println("-----------------------------------");
        print(matrizT,0,0);
    }
    public static void print(int[][] matriz,int i,int j){
        if(i==matriz.length){
            return;
        }
        System.out.print(" "+ matriz[i][j]+" ");
        if(j==matriz[i].length-1){
            System.out.println();
            print(matriz,i+1,0);
        }else{
            print(matriz,i,j+1);
        }
    }
    public static int[][] matrizTranspuesta(int[][] matrizOriginal,int i,int j,int[][] matrizT){
        if(i==matrizOriginal.length){
            return matrizT;
        }
        matrizT[j][i]=matrizOriginal[i][j];
        if(j==matrizOriginal[i].length-1){
          return matrizTranspuesta(matrizOriginal,i+1,0,matrizT);
        }
        return matrizTranspuesta(matrizOriginal,i,j+1,matrizT);
    }

}
