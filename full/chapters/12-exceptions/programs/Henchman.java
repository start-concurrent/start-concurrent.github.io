public class Henchman {
    public void burgle(Bank bank) { //<.>
        try {
            bank.disableAlarm(); //<.>
            bank.breakIn();
            Vault vault = bank.findVault();

            vault.open();
            Loot loot = vault.getLoot();
            loot.carryAway();
            
            System.out.println("We got " + loot + "!"); //<.>
        }
        catch(BurglarAlarmException e) { //<.>
            System.out.println("I set off the burglar because " + e.getMessage());
            System.out.println("I had to run away.");
        }
        catch(WatchmanException e) {     //<.>
            System.out.println("A watchman caught me because " + e.getMessage());
            System.out.println("Please bail me out of jail.");
        }
        catch(LockPickFailException e) { //<.>
            System.out.println("I couldn't pick the vault lock.");
            System.out.println("No loot for us.");
        }
        catch(LootTooHeavyException e) { //<.>
            System.out.println("The loot was too heavy to carry.");
            System.out.println("No loot for us.");
        }
        catch(NullPointerException e) {  //<.>
            System.out.println("The vault was hidden or empty.");
            System.out.println("No loot for us.");
        }
    }
}