package br.com.mariojp.solid.lspaccounts;

public class BankService {
    public void processCheckingWithdrawal(CheckingAccount acc, double amount){
        acc.withdraw(amount);
    }

    public void processSavingsWithdrawal(SavingsAccount acc, double amount){
        System.out.println ("Saque não permitido. Poupança não deve ter saldo reduzido em operação de saque.");
    }
}