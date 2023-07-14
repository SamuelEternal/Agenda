import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> agenda = new ArrayList<>();
        boolean condition = true;


//menu
        Contato contato;
        while (condition) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Exibir contatos");
            System.out.println("3 - Atualizar contato");
            System.out.println("4 - Apagar contato");
            System.out.println("5 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    
                    System.out.println("Digite seu nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite seu número:");
                    String number = scanner.nextLine();
                    System.out.println("Digite sua idade:");
                    String age = scanner.nextLine();
                    System.out.println("Digite seu endereço:");
                    String index = scanner.nextLine();

                    Contato contact = new Contato(nome, number, age, index);
                    agenda.add(contact);
                    System.out.println("Contato adicionado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("Lista de contatos:\n");
                    for (Contato i : agenda) {
                        System.out.println("Nome: " + i.getName());
                        System.out.println("Número: " + i.getNumber());
                        System.out.println("Idade: " + i.getAge());
                        System.out.println("Endereço: " + i.getIndex());
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    System.out.println("Digite o índice do contato desejado: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();

                    if(indice >= 0 && indice < agenda.size()) {
                        Contato contatoAtualizado = agenda.get(indice);
                        System.out.println("Digite o novo nome do contato: ");D
                        String novoNome = scanner.nextLine();
                        System.out.println("Digite o novo número do contato: ");
                        String novoNumero = scanner.nextLine();
                        System.out.println("Digite a Idade atualizada: ");
                        String novaIdade = scanner.nextLine();
                        System.out.println("Digite o novo endereço: ");
                        String novoEndereco = scanner.nextLine();

                        contatoAtualizado.setInfo(novoNome, novoNumero, novaIdade, novoEndereco);
                        System.out.println("Contato atualizado com sucesso! ");



                    }
                    else{
                        System.out.println("Indice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o índice do contato a ser removido: ");
                    int indiceRemover = scanner.nextInt();

                    if(indiceRemover >= 0 && indiceRemover < agenda.size()){
                        agenda.remove(indiceRemover);
                        System.out.println("Contato removido com sucesso!");
                    }
                    else{
                        System.out.println("Indice inválido.");

                    }
                    break;



                case 5:
                    condition = false;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente ");
                    break;    


            }


        }
    }
}






class Contato {
        private String name;
        private String number;
        private String age;
        private String index;
        

        public Contato(String name, String number, String age, String index){
                this.name = name;
                this.number = number;
                this.age = age;
                this.index = index;
                }

            public String getName(){
                return name;
            }
            public String getNumber(){
                return number;
            }
            public String getAge () {
                return age;
            }
            public String getIndex () {
                return index;
            }
            public void setInfo(String name, String number, String age, String index){
                this.name = name;
                this.number = number;
                this.age = age;
                this.index = index;
            }
            
}   