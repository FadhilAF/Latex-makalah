import java.util.Scanner;

public class guntingBatuKertas {
	public static void main(String[] args) {
		
System.out.println("Program game gunting batu kertas\n");
        Scanner sc = new Scanner(System.in);
		String a = "default";
		String b = "default";

		System.out.println("_______GILIRAN PEMAIN 1 MEMILIH_______\n");
        boolean go = true;
        int count
		while (go) {
			System.out.print("Pilihan pemain 1 (gunting/batu/kertas): ");
			a = sc.nextLine();
			switch (a) {
			case "gunting":
				go = false;
				break;
			case "batu":
				go = false;
				break;
			case "kertas":
				go = false;
				break;
			default :
				System.out.println("\nMasukan pemain 1 salah, silahkan memasukkan pilihan lagi.");
			}
		}
		System.out.println("\n ______PEMAIN 1 MEMILIH "+a+" ______\n");

		System.out.println("\n_______GILIRAN PEMAIN 2 MEMILIH_______\n");
        go = true;
		while (go) {
			System.out.print("Pilihan pemain 2 (gunting/batu/kertas): ");
			b = sc.nextLine();
			switch (b) {
			case "gunting":
				go = false;
				break;
			case "batu":
				go = false;
				break;
			case "kertas":
				go = false;
				break;
			default :
				System.out.println("\nMasukan  pemain 2 salah, silahkan memasukkan pilihan lagi.");
			}
		}
		System.out.println("\n ______PEMAIN 2 MEMILIH "+b+" ______\n");

        System.out.println();
        
		System.out.println(a+" VS "+b);

		if (a.equals(b)) {
			System.out.println("pemain 1 dan pemain 2 seri");
		}
		else {
			switch (a) {
			case "gunting":
				
				switch (b) {
				case "batu":
					System.out.println("pemain 2 menang");
					break;
				case "kertas":
					System.out.println("pemain 1 menang");
					break;
				}
				break;
			case "batu":
				
				switch (b) {
				case "gunting":
					System.out.println("pemain 1 menang");
					break;
				case "kertas":
					System.out.println("pemain 2 menang");
					break;
				}
				break;
			case "kertas":
				
				switch (b) {
				case "gunting":
					System.out.println("pemain 2 menang");
					break;
				case "batu":
					System.out.println("pemain 1 menang");
					break;
				}
				break;     	
			}
		}
	}
}