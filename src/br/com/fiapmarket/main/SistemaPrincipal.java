package br.com.fiapmarket.main;
 
// Importa a classe Usuario para o sistema reconhecer
import br.com.fiapmarket.model.Usuario;
 
public class SistemaPrincipal {
 
    public static void main(String[] args) {
 
        // INSTANCIAÇÃO
        // O comando "new" aloca memória para um novo objeto.
 
        // Criando o primeiro usuário (Objeto 1)
        Usuario usuario1 = new Usuario();
        usuario1.nome = "Ana Silva";
        usuario1.idade = 25;
        usuario1.email = "ana@email.com";
 
        // Criando o segundo usuário (Objeto 2)
        Usuario usuario2 = new Usuario();
        usuario2.nome = "Carlos Souza";
        usuario2.idade = 32;
        usuario2.email = "carlos@email.com";
 
        // Exibindo os dados no console
        System.out.println("--- Sistema FiapMarket ---");
 
        System.out.println("Usuário: " + usuario1.nome + " | Idade: " + usuario1.idade + " | Email: " + usuario1.email);
 
        System.out.println("Usuário: " + usuario2.nome + " | Idade: " + usuario2.idade + " | Email: " + usuario2.email);
 
    }
}