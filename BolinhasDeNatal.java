import java.util.Scanner;

public class BolinhasDeNatal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer bolinhas = 0;
        Integer galhos = 0;
        Integer bolinhasFaltantes = 0;

        do {
            System.out.println("Digite a quantidade de bolinhas que Amélia possui (entre 1 e 1000): ");
            bolinhas = sc.nextInt();
        } while (bolinhas < 1 || bolinhas > 1000);

        do {
            System.out.println("Digite a quantidade de galhos da nova árvore de natal (entre 100 e 1000): ");
            galhos = sc.nextInt();
        } while (galhos < 100 || galhos > 1000);

        bolinhasFaltantes = (galhos / 2);

        if (bolinhas >= bolinhasFaltantes){
            System.out.println("Amelia tem todas bolinhas!");
        } else{
            bolinhasFaltantes = (galhos / 2) - bolinhas;
            System.out.println("Faltam " + bolinhasFaltantes + " bolinha(s)");
        }

    }

}
