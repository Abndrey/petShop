import java.util.Scanner;

public class pet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

    do{   
        System.out.println("Menu pet");
        System.out.println("1. Cadastro" );
        System.out.println("2. Perfil");
        System.out.println("3. Localização");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

       opcao = sc.nextInt();
       sc.nextLine();

       switch (opcao) {
            case 1:
                System.out.println("Opção Novo Cadastro Selecionado");
                System.out.println("Digite seu nome:"); 
                String nome =  sc.nextLine();
                break;
        }
        }while (opcao != 0 );
     System.out.println("Terminou");
    } 
}


