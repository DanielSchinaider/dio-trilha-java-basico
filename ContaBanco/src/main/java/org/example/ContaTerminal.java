package org.example;

import com.sun.deploy.util.StringUtils;

import java.util.Objects;
import java.util.Scanner;

public class ContaTerminal {
    private static final ContaTerminal contaTerminal = new ContaTerminal();

    public static ContaTerminal getInstance() {
        return contaTerminal;
    }

    public void execute() {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();
        conta.setAgencia("");
        System.out.println("Por favor, digite o número da Agência!");
        while (Objects.equals(conta.getAgencia(), "")) {
            conta.setAgencia(scanner.nextLine());
        }
        conta.setNomeCliente("");
        System.out.println("Por favor, digite o seu nome!");
        while (Objects.equals(conta.getNomeCliente(), "")) {
            conta.setNomeCliente(scanner.nextLine());
        }
        System.out.println("Por favor, digite o seu Saldo!");
        conta.setSaldo(scanner.nextFloat());


        String msg = "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque!";
        System.out.println(msg.replace("[Nome Cliente]", conta.getNomeCliente()).replace("[Agencia]", conta.getAgencia()).replace("[Numero]", String.valueOf(conta.getNumero())).replace("[Saldo]", String.valueOf(conta.getSaldo())));
    }
}
