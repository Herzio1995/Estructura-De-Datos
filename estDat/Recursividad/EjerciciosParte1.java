package Recursividad;
public class EjerciciosParte1
{
    private int aux=1;
    //Ecuentra un método que permita definir la potencia de un numero
    public int Ejercicio1(int a, int b){
        if(b==1){
            return a;
        }
        else if(b==0){
            return 1;
        }
        return a*Ejercicio1(a,b-1);
    }   
    
    // Escribe un proceso recursivo que permita decidir si un número natural n es primo
    // c debe ser 2 siempre
    public boolean Ejercicio2(int n, int c){
        if(c>n/2){
            return true;
        }
        else{
            if(n%c==0){
                return false;
            }
            else{
                return Ejercicio2(n,c+1);
            }
        }
    }
    
    //Escribe un proceso recursivo que permita contar los digitos de un numero positivo n
    //aux=1;
    public int Ejercicio3(int n){
        if(n<10){
            int aux1=aux;
            aux=1;
            return aux1;
        }
        else{
            aux++;
            return Ejercicio3(n/10);
        }
    }
    
    //Esribe un metodo que permita saber si todos los dígitos de un número n son pares
    public boolean Ejercicio14(int n){
        if(n<10 && n%2==0){
            return true;
        }
        else{
            if((n%10)%2==0){
                return Ejercicio14(n/10);
            }
            else
                return false;
        }        
    }
    
    //Escribe un proceso recursivo que permita decidir un numero natural n es divisible entre 11
    public boolean Ejercicio15(int n, int par, int impar){
        if(n<10){
            if(n%2==0){
                par=par+n;
                if((par-impar)%11==0){
                    return true;
                }
                else
                    return false;
            }
            else{
                impar=impar+n;
                if((par-impar)%11==0){
                    return true;
                }
                else
                    return false;
            }
        }
        else{
            if((n%10)%2==0){
                return Ejercicio14(n/10);
            }
            else
                return false;
        }  
    }
}

