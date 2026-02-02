import java.util.Scanner;

public class Inicio
{
    static Scanner sc = new Scanner(System.in);

    public static void MenuPricipal()
    {
        int opcao = 0;

        while (opcao != 3)
        {
            System.out.printf(" === MENU PRICIPAL ===");
            System.out.printf(" 1 - Cadastro");
            System.out.printf(" 2 - Login ");
            System.out.println(" 3 - Sair");

            try {
                opcao = sc.nextInt();

                switch (opcao)
                {
                    case 1:
                        Cadastro.cadastro();
                    break;

                    case 2:
                        Login.login();
                    break;

                    case 3:
                        System.out.println(" saindo do banco Marquinhos Maia");
                    return;

                    default:
                        System.out.println(" voce digitou uma opcao errado, tente novamente");
                    break;

                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

        }
    }

}