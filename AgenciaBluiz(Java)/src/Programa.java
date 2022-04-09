import java.util.Scanner;

import services.AgenciaService;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Boolean repetir = true;
		do {
		System.out.println("Digite uma das opçoes abaixo");
		System.out.println("0 sair");
		System.out.println("1 Cadastrar");
		System.out.println("2 Atualizar Cadastro");
		 int opcao = sc.nextInt();		 
AgenciaService agenciaService = new AgenciaService();
switch(opcao) {
case 0:
	repetir = false;
	break;
case 1:
	agenciaService.save();
	break;
case 2:
	agenciaService.update();
	break;
	default:
		System.out.println("Opção invalida");
		break;
}

	}while(repetir);
		
		
	}
}




