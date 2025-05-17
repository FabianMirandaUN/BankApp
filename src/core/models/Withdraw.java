/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

/**
 *
 * @author juanp
 */
public class Withdraw extends Transaction  {
    
    public Withdraw(TransactionType type, Account sourceAccount, Account destinationAccount, double amount) {
        super(type, sourceAccount, destinationAccount, amount);
    }

    @Override
    public void doTransaction(Account account, double amount) {
        account.setBalance(account.getBalance()-amount);
    }
    
}
