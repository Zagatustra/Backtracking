public class Carcel {
    /*
    Implementar un algoritmo usando backtracking que permita solucionar el siguiente problema:
Una cárcel de una ciudad se puede representar en forma de matriz carcel[i][j], tener en cuenta:
a. carcel[i][j]=P significa que hay un preso
b. carcel[i][j]= “X” significa que no hay preso
c. carcel[i][j]= “”(vacío) significa que es un pasillo
d. Desarrolle una aplicación que permita obtener si faltan presos en una cárcel, para esto el
guarda de seguridad debe recorrer toda la cárcel contando cuántos presos encontró.
e. Dejar una marca en la posición[i][j] por donde va pasando el guarda.
f. En total deben de haber 26 presos. Al final del recorrido por toda la cárcel. Debe indicar si se
escaparon presos y cuántos. En caso contrario solo indicar que no se ha escapado ningún
preso.
g. El guarda debe arrancar en la posición (0, 0) y terminar en un punto de control en la posición
G (5, 7) definidas por parámetro. El patrón de movimiento a utilizar es:, derecha, abajo,
arriba, izquierda. Debe tener en cuenta que no se puede salir de la cárcel. Lo azul son los
índices filas y columnas no son valores de la matriz
     */
    public static int presos;
    public static char[][] car = {
            {' ', 'p', 'x', ' ', 'p', 'p', ' ', 'p'},
            {' ', 'p', 'p', ' ', 'p', 'p', ' ', 'p'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'p', ' ', 'p', 'p', ' ', 'p', 'p', ' '},
            {'p', ' ', 'x', 'p', ' ', 'p', 'p', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'p', 'x', 'p', ' ', 'p', 'p', ' ', 'p'}
    };

    public void main(String[] args) {
        Carcel carcel =new Carcel();
        carcel.car[5][7]='C';
        carcel.car[0][0]='S';
        carcel.resolver(0,0);
        carcel.verificarPresos(26);
    }
    public void resolver(int i,int j){
        if(ronda(i,j)){
            car[i][j]='C';
        }
    }

    public  boolean ronda(int i,int j){
        System.out.println(i+" "+j);
        if(j> car[0].length-1||j<0){
            return false;
        }else if(i> car.length-1||i<0){
            return false;
        }
        if(car[i][j]== 'C'){
            return false;
        }
        if(car[i][j]=='x'){
            car[i][j]='R';
            presos +=1;
            return false;
        }else if(car[i][j]== '*' || car[i][j]=='p' || car[i][j]=='R'){
            return false;
        }
        car[i][j]='*';

        boolean resultado;
        resultado =ronda(i,j+1);
        if(resultado){
            return true;
        }
        resultado =ronda(i+1,j);
        if(resultado){
            return true;
        }
        resultado =ronda(i-1,j);
        if(resultado){
            return true;
        }

        resultado =ronda(i,j-1);

        return resultado;

    }

    public  void imprimirCarcel(char[][] carcel) {
        for (int i = 0; i < carcel.length; i++) {
            for (int j = 0; j <= carcel.length; j++) {
                System.out.print("[" + carcel[i][j] + "]");
            }
            System.out.println();
        }
    }

    public  void verificarPresos(int presosExistentes){
        if(presosExistentes-presos==presosExistentes){
            System.out.println("Los presos estan completos");
        }else{
            System.out.println("Faltan: "+presos+" presos.");
        }

    }
}