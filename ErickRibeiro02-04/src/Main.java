/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ras-E
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<Internacao> internacoes = new ArrayList<>();
      
      while(true){
          System.out.println("Menu- Selecione uma opção:");
          System.out.println("1-> Cadastrar internação");
          System.out.println("2-> Listar internações:");
          System.out.println("3-> Valor total das diaarias");
          System.out.println("4-> Sair");
          
          int opcao = scanner.nextInt();
          scanner.nextLine(); //limpa buffer do scanner
          
          if(opcao ==1){
                System.out.println("Informe o nome do paciente:");
                String nomePaciente = scanner.nextLine();
              
                System.out.println("Informe o cpf do paciente");
                String cpfPaciente = scanner.nextLine();

                System.out.println("Informe o nome do médico:");
                String nomeMedico = scanner.nextLine();

                System.out.println("Informe o CRM do médico:");
                String crmMedico = scanner.nextLine();

                System.out.println("Informe o nome do enfermeiro:");
                String nomeEnfermeiro = scanner.nextLine();

                System.out.println("Informe o COREN do enfermeiro:");
                String corenEnfermeiro = scanner.nextLine();

                System.out.println("Informe o motivo da internação:");
                String motivoInternacao = scanner.nextLine();

                System.out.println("Informe o valor da diária:");
                double valorDiaria = scanner.nextDouble();

                System.out.println("Informe a quantidade de dias de internação:");
                int diasInternacao = scanner.nextInt();
                Paciente paciente = new Paciente(nomePaciente, cpfPaciente);
                Medico medico = new Medico(nomeMedico, crmMedico);
                Enfermeiro enfermeiro = new Enfermeiro(nomeEnfermeiro, corenEnfermeiro);
                Internacao internacao = new Internacao(opcao,paciente, medico, enfermeiro, motivoInternacao, valorDiaria, diasInternacao);

            internacoes.add(internacao);
            System.out.println("Internação cadastrada com sucesso!");
        
              
          }//fim if
           else if (opcao == 2) {
    System.out.println("Lista de internações:");
    for (Internacao internacao : internacoes) {
        System.out.println("ID: " + internacao.getId());
        System.out.println("Paciente: " + internacao.getPaciente().getNomePaciente());
        System.out.println("Médico: " + internacao.getMedico());
        System.out.println("Enfermeiro: " + internacao.getEnfermeiro());
        System.out.println("Motivo: " + internacao.getMotivo());
        System.out.println("Valor da diária: " + internacao.getDiaria());
        System.out.println("Dias de internação: " + internacao.getDias());
        System.out.println("Valor total: " + internacao.getValorTotal());
        System.out.println("*****************************");
      } //fim for
    }  //fim else if 
    else if (opcao == 3) {
    double totalDiarias = 0;
    for (Internacao internacao : internacoes) {
        totalDiarias += internacao.getDiaria()* internacao.getDias();
    }//fim for
    System.out.println("O valor total das diárias é: " + totalDiarias);
}//fim else if
    else if (opcao == 4) {
            System.out.println("Encerrando o programa...");
            break;
        }
    else {
        
            System.out.println("Opção inválida, tente novamente.");
        }
      }//fim while
    }// fim main
    
    }

