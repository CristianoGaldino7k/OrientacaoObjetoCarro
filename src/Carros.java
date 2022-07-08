import java.util.Scanner;
public class Carros {
    String condicao;
    String nome;
    String marca;
    String modelo;
    String cor;
    String tipoDeCombustivel;
    String portas;
    String direcao;
    String arCondicionado;
    String estado;
    int ano;
    int valor;

    String detalhesEscolhidos;

    Scanner leitor = new Scanner(System.in);

    public void condicao() {
        System.out.println("escolha 1 Novo e 2 Usado");
        this.condicao = leitor.nextLine();
    }

    public void nome() {
        System.out.println("Dig. Seu nome");
        this.nome = leitor.nextLine();
    }

    public void marca() {
        System.out.println("Dig. Marca do veiculo");
        this.marca = leitor.nextLine();
    }

    public void cor() {
        System.out.println("Dig. A cor");
        this.cor = leitor.nextLine();
    }
    public void tipoDeCombustivel() {
        System.out.println("Escolha o  combustivel. 1 Gasolina, 2 Alcool,  3 Flex ");
        this.tipoDeCombustivel = leitor.nextLine();
    }
    public void portas() {
        System.out.println("Escolha Numero de portas  2 ou 4");
        this.portas = leitor.nextLine();
    }
    public void direcao() {
        System.out.println("Escolha  1 Automatico, 2 Manual");
        this.direcao = leitor.nextLine();

    }
    public void arCondicionado() {
        System.out.println("Com Ar dig. 1, Sem Ar dig. 2");
        this.arCondicionado = leitor.nextLine();
    }
    public void estado() {
        System.out.println("Dig.Um estado");
        this.estado = leitor.nextLine();

    }
    public void ano() {
        System.out.println("Qual Ano Do Veiculo");
        this.ano = leitor.nextInt();
    }
    public void valor() {
        System.out.println("Qual o valor Do Veiculo");
        this.valor = leitor.nextInt();
    }
    public String detalhesEscolhidos() {
        if(this.condicao.equals("1")) {
            System.out.println(" Escolhido NOVO ");
        }else{
            System.out.println("Escolhido Usado");
        }
        System.out.println("O Nome Escolhido "+this.nome);
        System.out.println("A Marca Escolhida "+this.marca);
        System.out.println("A Cor Escolhida "+this.cor);
        if(this.tipoDeCombustivel.equals("1")){
            System.out.println("Tipo de Combustivel Escolhido GASOLINA");
        }else if(this.tipoDeCombustivel.equals("2")){
            System.out.println("tipo de combustivel Escolhido ALCOOL");
        }else {
            System.out.println("Flex");
        }
        if(this.portas.equals("2")){
            System.out.println("Porta Escolhida 2");
        }else{
            System.out.println("Porta Escolhida 4");
        }
        if(this.direcao.equals("1")){
            System.out.println("Direcao Escolhida AUTOMATICO");
        }else{
            System.out.println("Direcao Escolhida MANUAL");
        }
        if(this.arCondicionado.equals("1")){
            System.out.println("Possui ArCondicionado");
        }else{
            System.out.println("Sem ArCondicionado");
        }
        System.out.println("O Estado Escolhido "+this.estado);
        System.out.println("O Ano Escolhido "+this.ano);
        System.out.println("O Valor Escolhido "+this.valor);
        return this.detalhesEscolhidos;
    }
}