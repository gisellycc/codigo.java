package primeiroprograma;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        float nota = 3.5f;
        String nome = "Gustavo";
        System.out.printf("Sua nota de %s e %.2f", nome, nota);
    }
}


package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno");
        float nota = teclado.nextFloat();
       
        System.out.printf("Sua nota de %s e %.2f", nome, nota);
    }
}

TRANSFORMANDO INT PARA STRING
  
public class PrimeiroPrograma {
    public static void main(String[]args) {
        
        int idade = 30;
        String valor = Integer.toString(idade);
        
       
        System.out.print(valor);
    }
}


public class PrimeiroPrograma {
    public static void main(String[]args) {
        
        int n1= 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        
        
       
        System.out.println("A media é" + m);
    }
}




int numero = 5;
        int valor = 5 + numero ++;
        System.out.println(valor);

package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor");
        int num = teclado.nextInt();
        
        int rd = (num % 2);
        double cub = Math.pow(num,3);
        double quad = Math.sqrt(num);
        double rcub = Math.cbrt(num);
        int va = Math.abs(num);
        
        
       
        System.out.println(num);
        System.out.println(rd);
        System.out.println(cub);
        System.out.println(quad);
        System.out.println(rcub);
        System.out.println(va);
        
    }
}

package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade");
        int num = teclado.nextInt();
        int idade = 2025 - num;
        
        String res = (idade >= 18)? "Maior":"menor";
        System.out.println(res);
        
        
    }
}
 Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade");
        int num = teclado.nextInt();
        int idade = 2025 - num;
        
        String res = (idade>=16 && idade<18 || idade >70)? "Opcional":"Obrigatorio";
        System.out.println(res);
        
        
    }
}

package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero entre 1 e 5");
        int num = teclado.nextInt();
        
        
        int resp = (int) (1 + Math.random() * 5);
        
        String r = (num == resp)? "VOCE ACERTOU": "TENTE NOVAMENTE";
        
        System.out.printf("%s o numero e %d", r, resp);
        
    }
}
package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        
        
        System.out.print(num);
    
        
        if(num < 16){
            System.out.print("nao vota");
        }else if ((16 >= num && num < 18) || num>70){
            System.out.print("opcional");
            
        }else {
            System.out.print("obrigatorio");
        }
        
        
    }
}
package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a,b,c");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        
        double delta = Math.pow(b, 2) - (4 * a * c);
        
        if(delta >= 0){
            System.out.printf("raiz real = %f", delta);
        }else {
            System.out.printf("nao %f", delta);
        }
        
        
    }
}

public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a,b,c");
        int perna = teclado.nextInt();
        String tipo;
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bi";
                break;
            case 3:
                tipo = "Tri";
                break;
            case 4:
                tipo = "quad";
                break;
            default:
                tipo = "et";
            
        }
        
        System.out.print(tipo);
        
    }
}

ATIVIDADE JULIAN
    package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a");
        int a = teclado.nextInt();
        System.out.print("Digite b");
        int b = teclado.nextInt();
        System.out.print("Digite c");
        int c = teclado.nextInt();
        
        if (a + b > c && a + c > b && b + c > a){
            System.out.print("E um triangulo");

            if (a == b && b == c){
                System.out.print("equilatero");
            }else if (a == b || a == c || b == c){
                System.out.print("isoceles");
            }else{
                System.out.print("escaleno");
            }
        
        }else{
            System.out.print("nao e um triangulo");
        }
    }
}





package primeiroprograma;
import java.util.Scanner;
public class PrimeiroPrograma {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite num");
        int num = teclado.nextInt();
        
        int fat = 1;
        int contador = num;
        
        
        while (contador>0){
            fat *= contador;
            contador --;
        
        }   
        System.out.print(fat);
    }
}

public class PrimeiroPrograma {
    public static void main(String[]args) {
        
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
         do{
             System.out.print("Digite num");
             n = teclado.nextInt();
             s += n;
             System.out.print("Quer continuar");
             resp = teclado.next();
        }while (resp.equals("S"));
        System.out.print("a soma de todos os valores é"+ s);

    }
    
}
public class PrimeiroPrograma {
    public static void main(String[] args) {
        
        int n;
        int cc = 0;
        int cp = 0, ci = 0;
        int ac = 0;
        int s = 0;
        double media;
        
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite um valor (0 para parar): ");
            n = teclado.nextInt();

            if (n != 0) { // evita contar o zero
                cc++;
                s += n;

                if (n % 2 == 0) {
                    cp++;
                } else {
                    ci++;
                }

                if (n > 100) {
                    ac++;
                }
            }

        } while (n != 0);

        media = (cc > 0) ? (double) s / cc : 0; // evita divisão por zero

        System.out.println("Você digitou " + cc + " números.");
        System.out.println("Total de pares: " + cp);
        System.out.println("Total de ímpares: " + ci);
        System.out.println("Maiores que 100: " + ac);
        System.out.printf("Média dos valores: %.2f\n", media);
    }
}
ATIVIDADE JULIAN
package primeiro;
import java.util.Scanner;

public class PrimeiroPrograma{
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um numero binario");
    int binario = teclado.nextInt();
    int original = binario;
    
    int decimal= 0;
    int base =1;
    
    boolean valido = true;
    
    while (binario > 0){
        int digito = binario % 10;
        
        if (digito != 0 && digito != 1){
        valido = false;
        break;
        }
     
    
    decimal += digito * base;
    base *= 2;
    binario /= 10;
    }
    
    if (valido){
        System.out.println(decimal);
    }else{
        System.out.print("numeros diferentes");
    }
    
        
    }    
}




