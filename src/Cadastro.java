import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cadastro
{
    ArrayList<Usuario> cadastros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void cadastro()
    {
        System.out.println(" -- Digite seu nome:");

        String nome = sc.nextLine();

        System.out.println(" -- Digite seu cpf:");

        String cpf = sc.nextLine();

        Usuario usuario = new Usuario();

    }
}
