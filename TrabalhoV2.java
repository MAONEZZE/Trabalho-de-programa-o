package com.mycompany.trabalhov2;

import java.util.Scanner;

public class TrabalhoV2 {

    static Scanner input = new Scanner(System.in);
    
    public static void ListarC(int i, String[] C, String[] N, String[] D){
        
        System.out.println("Lista de clientes");
        for(int k=0; k<i; k++){
            if(C[k].equals(" ")&&N[k].equals(" ")&&D[k].equals(" ")){   
            }
            else{
                System.out.println("");
                System.out.println("CPF: "+C[k]+" | Nome: "+N[k]+" | Data de nascimento: "+D[k]);
            }
        }
    }
    
    public static void AlterarC(String[] C, String[] N, String[] D){
        String CpfConsulta;
        boolean x = false;
        char decisao;
        String nome, data;

        System.out.println("");
        System.out.print("Digite seu CPF para Alterar: ");
        CpfConsulta = input.nextLine();
        
        for(int i=0; i<10; i++){
            if(CpfConsulta.equals(C[i])){
                System.out.println("");
                System.out.println("Dados do portador desse CPF");
                System.out.println("Nome: "+N[i]);
                System.out.println("Data de nascimento: "+D[i]);
                
                x = true;
                System.out.println("");
                System.out.println("Digite seus novos dados");
                System.out.print("Nome: ");
                nome = input.nextLine();
                System.out.print("Data de nascimento: ");
                data = input.nextLine();
                
                System.out.println("");
                System.out.println("Voce realmente deseja alterar esse usuario?");
                System.out.print("Digite sim ou nao: ");
                decisao = input.nextLine().charAt(0);
                
                switch(decisao){
                    case 's': N[i] = nome;
                              D[i] = data;
                              System.out.println("");
                              System.out.println("Exclusão feita com êxito");
                    break;
                    case 'S': N[i] = nome;
                              D[i] = data;
                              System.out.println("");
                              System.out.println("Exclusão feita com êxito");
                    break;
                    case 'n': System.out.println("");
                              System.out.println("Exclusão Cancelada");
                    break;
                    case 'N': System.out.println("");
                              System.out.println("Exclusão Cancelada");
                    break;
                } 
            }    
        }
        if(x == false){
            System.out.println("");
            System.out.println("Esse CPF nao foi encontrado!");
        }
    }
    
    public static void ExclusaoC(String[] C, String[] N, String[] D){
        String CpfConsulta;
        boolean x = false;
        char decisao;

        System.out.println("");
        System.out.print("Digite seu CPF para Excluir: ");
        CpfConsulta = input.nextLine();
        
        for(int i=0; i<10; i++){
            if(CpfConsulta.equals(C[i])){
                System.out.println("");
                System.out.println("Dados do portador desse CPF");
                System.out.println("Nome: "+N[i]);
                System.out.println("Data de nascimento: "+D[i]);
                
                x = true;
                
                System.out.println("");
                System.out.println("Voce realmente deseja excluir esse usuario?");
                System.out.print("Digite sim ou nao: ");
                decisao = input.nextLine().charAt(0);
                
                switch(decisao){
                    case 's': C[i] = " ";
                              N[i] = " ";
                              D[i] = " ";
                              System.out.println("");
                              System.out.println("Exclusão feita com êxito");
                    break;
                    case 'S': C[i] = " ";
                              N[i] = " ";
                              D[i] = " ";
                              System.out.println("");
                              System.out.println("Exclusão feita com êxito");
                    break;
                    case 'n': System.out.println("");
                              System.out.println("Exclusão Cancelada");
                    break;
                    case 'N': System.out.println("");
                              System.out.println("Exclusão Cancelada");
                    break;
                }
                
            }
        } 
        if(x == false){
            System.out.println("");
            System.out.println("Esse CPF nao foi encontrado!");
        }
    }
    
    public static void ConsultaC(String[] C, String[] N, String[] D){
        String CpfConsulta;
        boolean x = false;

        System.out.println("");
        System.out.print("Digite seu CPF para a consulta: ");
        CpfConsulta = input.nextLine();
        
        for(int i=0; i<10; i++){
            if(CpfConsulta.equals(C[i])){
                System.out.println("");
                System.out.println("Dados do portador desse CPF");
                System.out.println("Nome: "+N[i]);
                System.out.println("Data de nascimento: "+D[i]);
                
                x = true;
            }
        } 
        if(x == false){
            System.out.println("");
            System.out.println("Esse CPF nao foi encontrado!");
        }
    }
    
    public static String[] InclusaoData(int i, String[] data){
        System.out.print("Digite sua data de nascimento para a "
                + "inclusao (separando dia, mes e ano por espaço): ");
        data[i] = input.nextLine();
        System.out.println("");
        System.out.println("Parabens voce foi Incluido");
        
        return data;
    }
    
    public static String[] InclusaoNome(int i, String[] nome){
        System.out.print("Digite seu nome para a inclusao: ");
        nome[i] = input.nextLine();

        return nome;
    }
    
    public static String[] InclusaoCpf(int i, String[] cpf){         
        System.out.println("");
        System.out.print("Digite seu CPF para a inclusao: ");
        cpf[i] = input.nextLine();

        return cpf;
    }
    
    public static void main(String[] args) {
        char op;
        int i=0;
        
        String[] cpf = new String[10];
        String[] nome = new String[10];
        String[] data = new String[10];
        
        System.out.println("Escolha a opção desejada");
        System.out.println("I – Incluir Cliente ");
        System.out.println("C – Consultar Cliente ");
        System.out.println("E – Excluir Cliente ");
        System.out.println("A – Alterar Cliente");
        System.out.println("L – Listar Clientes");
        System.out.println("S – Sair");
        
        System.out.print("Opção: ");
        op = input.nextLine().charAt(0);
        
        while(op!='s'&&op!='S'){

            switch(op){
                case 'I': cpf = InclusaoCpf(i, cpf);
                          nome = InclusaoNome(i, nome);
                          data = InclusaoData(i, data);
                          i++;
                break;
                case 'i': cpf = InclusaoCpf(i, cpf);
                          nome = InclusaoNome(i, nome);
                          data = InclusaoData(i, data);
                          i++;
                break;

                case 'C': ConsultaC(cpf, nome, data);
                break;
                case 'c': ConsultaC(cpf, nome, data);
                break;

                case 'E': ExclusaoC(cpf, nome, data);
                break;
                case 'e': ExclusaoC(cpf, nome, data);
                break;

                case 'A': AlterarC(cpf, nome, data);
                break;
                case 'a': AlterarC(cpf, nome, data);
                break;

                case 'L': ListarC(i, cpf, nome, data);
                break;
                case 'l': ListarC(i, cpf, nome, data);
                break;   
            }
            System.out.println("");
            System.out.println("Escolha a opção desejada");
            System.out.println("I – Incluir Cliente ");
            System.out.println("C – Consultar Cliente ");
            System.out.println("E – Excluir Cliente ");
            System.out.println("A – Alterar Cliente");
            System.out.println("L – Listar Clientes");
            System.out.println("S – Sair");
            
            System.out.print("Opção: ");
            op = input.nextLine().charAt(0);
        }
        
        
    }
}

