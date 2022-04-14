import java.util.Scanner;

public class sessao0912 {

    static void sair(String msg) {
        System.out.println(msg + "(numeros negativos para sair)");
    }

    static void mensagemExe1(String m, int x) {
        System.out.println("O numero " + x + " e " + m);
    }

    static int chamaNumero(Scanner scanner) {
        int x;
        x = scanner.nextInt();
        return x;
    }

    static String chamaString(Scanner scanner) {
        String s = scanner.next();
        return s;
    }

    static void exercicio1(Scanner scanner) {    

        int x;
        String parImpar;

        while (true) {          
            sair("Insira um numero qualquer");
            x = chamaNumero(scanner);
            if (x >= 0) {
                int resultado = x % 2;
                if(resultado == 0) 
                    parImpar = "par";
                else 
                    parImpar = "impar";
                mensagemExe1(parImpar, x);
            }
            else
                break;
        }
    }

    static void exercicio2(Scanner scanner) {

        float media = 0;

        for (int y=0; y<3; y++) {
            sair("Insira o " + (y+1) + "º numero");
            int num = chamaNumero(scanner);
            if (num < 0)
                break;
            else 
                media = media + num;
                if (y == 2)
                System.out.println("A media dos 3 numeros inseridos e: " + (media/3));
        }        
    }

    static void exercicio3(Scanner scanner) {

        sair("Insira um numero para calculo do seu respectivo antecessor e sucessor");
        int num = chamaNumero(scanner);
        if (num >= 0) {
            System.out.println("Numero inserido: " + num);
            System.out.println("Antecessor: " + (num-1));
            System.out.println("Sucessor: " + (num+1));
        }
    }

    static void exercicio4(Scanner scanner) {

        sair("Insira a medida do raio");
        int num = chamaNumero(scanner);
        System.out.println("Media da area: " + (float) Math.round(Math.PI*(num*num)*100)/100);
        System.out.println("Media da circunferencia: " + (float) Math.round(Math.PI*num*2*100)/100);
    }

    static void exercicio5(Scanner scanner) {

        sair("Insira a temperatura <Cº>");
        int num = chamaNumero(scanner);
        System.out.println("Tempratura em Fahrenheit: " + (float) Math.round(((num*9/5)+32)*100)/100);
    }

    static void exercicio6(Scanner scanner) {

        int a = 0;
        int b = 1;
        int fibo = 0;

        System.out.println("Sequencia Fibonacci ate o numero 200");
        while (fibo <= 200) {
            fibo = a + b;
            System.out.println(fibo);
            a = b;
            b = fibo;
        }
    }

    static void exercicio7(Scanner scanner) {

        sair("Insira o ano para verificar se e bissexto");
        int ano = chamaNumero(scanner);
        if(ano >= 0) {
            if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0)
                System.out.println("Este ano e bissexto");
            else
                System.out.println("Este ano nao e bissexto");
        }
    }

    static void exercicio8a(Scanner scanner) {

        sair("Insira o primeiro numero");
        int num1 = chamaNumero(scanner);
        if(num1 >= 0) {
            sair("Insira o segundo numero");
            int num2 = chamaNumero(scanner);
            if(num2 >= 0) {
                String op;
                do {
                    System.out.println("Insira a operacao desejada <+-/*>(carregue 0 para sair)");
                    op = chamaString(scanner);
                } while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !(Integer.parseInt(op) == 0));
                
                float result = 0;
                if (op.equals("+")) {
                    result = num1 + num2;
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                }
                else if (op.equals("-")) {
                    result = num1 - num2;
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                }
                else if (op.equals("*")) {
                    result = num1 * num2;
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                }
                else if (op.equals("/")) {
                    result = num1 / num2;
                    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                }                
            }
        }
    }

    static void exercicio8b(Scanner scanner) {

        sair("Insira o primeiro numero");
        int num1 = chamaNumero(scanner);
        if(num1 >= 0) {
            sair("Insira o segundo numero");
            int num2 = chamaNumero(scanner);
            if(num2 >= 0) {
                String op;
                do {
                    System.out.println("Insira a operacao desejada <+-/*>(carregue 0 para sair)");
                    op = chamaString(scanner);
                } while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !(Integer.parseInt(op) == 0));
                
                float result = 0;
                switch (op) {
                    case "+":
                        result = num1 + num2;
                        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                        break;
                    case "/":
                        result = num1 / num2;
                        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
                        break;  
                }
            }
        }
    }

    static void exercicio9(Scanner scanner) {

        int val = 0;
        int soma = 0;

        while (val >= 0) {
            
            sair("Insira um numero multiplo de 3, 5 ou 7");
            val = scanner.nextInt();

            if (val%3==0 || val%5==0 || val%7==0) {
                soma = soma + val;
            }
            else if (val >=0) {
                System.out.println("O numero " + val + " nao e multiplo de 3, 5 ou 7");
            }
            System.out.println("A soma dos numeros inseridos e: " + soma);
            System.out.println("");
        }
    }

    static void exercicio10(Scanner scanner) {
        sair("Insira um numero para calculo do fatorial: ");
        int fat = scanner.nextInt();
        int resultado = fat;
        
        if(fat >= 0) {
            System.out.print(fat + "! = " + fat);
            for(fat--; fat>0; fat--) {
                resultado = resultado * fat;
                System.out.print(" x " + fat);
            }
            System.out.print(" = " + resultado);
            System.out.println("");
        }
    }

    static void exercicio11(Scanner scanner) {
        
        int num = 0;
        int resultado = 0;
        for(int x=1; x<5; x++) {
            sair("Insira o " + x + "º numero:");
            num = scanner.nextInt();

            if(num >= 0) {
                if(num > resultado)
                    resultado = num;
                    if (x == 4)
                        System.out.println("O maior numero inserido foi: " + resultado);
            } else         
                break;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int exec = 0;

        System.out.println("Exercicios aula assincrona(sessao 9-12)");
        while (true) {
            sair("Escolha um exercicio para executar 1 - 12");
            exec = input.nextInt();
            
            if (exec > 0) {
                switch(exec) {
                    case 1:
                        exercicio1(input);
                        break;
                    case 2:
                        exercicio2(input);
                        break;
                    case 3:
                        exercicio3(input);
                        break;
                    case 4:
                        exercicio4(input);
                        break;
                    case 5:
                        exercicio5(input);
                        break;
                    case 6:
                        exercicio6(input);
                        break;
                    case 7:
                        exercicio7(input);
                        break;
                    case 8:
                        exercicio8a(input);
                        break;
                    case 9:
                        exercicio8b(input);
                        break;
                    case 10:
                        exercicio9(input);
                        break;
                    case 11:
                        exercicio10(input);
                        break;
                    case 12:
                        exercicio11(input);
                        break;
                    default:
                        System.out.println("Opcao invalida");
                }
            } else 
                break;
        }
        input.close();
    }
}
