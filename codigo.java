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
