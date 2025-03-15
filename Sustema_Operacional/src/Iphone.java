import java.util.Scanner;

public class Iphone implements Sistema_Operacional{
    private boolean tocar;
    private boolean pausar;
    private String telC;
    @SuppressWarnings("unused")
    private String nomeM;
    private int escolha;
    private int contAba = 0;
    public Iphone(){

    }
    Scanner sc = new Scanner(System.in);

    @Override
    public boolean tocar() {
       System.out.println("Sua musica favorita esta tocando.");
       return true;
    }

    @Override
    public boolean pausar() {
        if (tocar == true) {
            tocar = false;
            pausar = true;
            return pausar;
        }
        else
            System.out.println("Sua musica já esta pausada.");
                    return tocar;
    }

    @Override
    public void selecionarMusica(String nomeM) {
        System.out.println(nomeM.toUpperCase() + " esta tocando.");        
    }

    @Override
    public void ligarT(long tel) {
        telC = Long.toString(tel);
        if (telC.length() < 9) {
            System.out.println("Numero de telefone invalido. Precisa ser de 9 digitos ou mais.");
            return;
        }
        else
            System.out.println("Ligando para " + tel + ".");
    }

    @Override
    public void atender() {
        System.out.println("Ligação. 1 - Atender || 2 - Desligar");
        escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("Olá boa tarde, quem fala? ");
            
        }
        else if (escolha == 2) {
            System.out.println("Chamada não atendida. ");
        }

        if (escolha == 2) {
            System.out.println("Voce deseja iniciar um correio de voz?  1 - Sim || 2 - Não");
            escolha = sc.nextInt();
            sc.nextLine();
            if (escolha == 1) {
                iniciarCV();
            }
            else if (escolha == 2) {
                System.out.println("Desligando.");
            }
        }
    }

    @Override
    public void iniciarCV() {
            System.out.println("Digite seu correio de voz: ");
            String mensagCV = sc.nextLine();
            System.out.println("Sua mensagem: " +" '' " + mensagCV + " '' " +" Foi enviada com sucesso para " + telC);
    }

    @Override
    public void exibirP(String url) {
        System.out.println("Voce esta acessando uma pagina web. ");
        contAba++;
    }

    @Override
    public void addNA() {
        contAba++;
        System.out.println("Aba nova criada. Você tem " + contAba + " criadas.");
    }

    @Override
    public void atualizarP() {
        System.out.println("Pagina atualizada. ");
    }
}
