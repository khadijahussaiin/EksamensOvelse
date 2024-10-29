package IfElseSwitch;

public class SwitchDay {
    public static void main (String[] args){
        //2.Skriv et switch statement der printer navnet på en dag baseret på et tal fra 1 til 7.
        int choice = 5;

        switch(choice){
            case 1:
                System.out.println("Mandag");
                break;
            case 2:
                System.out.println("Tirsdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lørdag");
                break;
            case 7:
                System.out.println("Søndag");
                break;
            default:
                System.out.println("ingen matchende case ");
                break;
        }
    }
}

