package criacionais.factorymethod.apple.simplemodel;

import criacionais.factorymethod.apple.simplemodel.factory.*;
import criacionais.factorymethod.apple.simplemodel.model.IPhone;

import java.util.Scanner;

public class Client {

	private static final Scanner entrada = new Scanner(System.in);
	private static String modelo;
	private static String tipo;

	public static void main(String[] args) {

		System.out.println("--------- SISTEMA APPLE SIMPLIFICADO ---------");
		System.out.println("Digite o modelo que deseja consultar: ");
		modelo = entrada.nextLine();
		System.out.println("Digite o Tipo de Iphone: ");
		tipo = entrada.nextLine();

		IPhone iPhone = IPhoneFactory.orderIphone(modelo, tipo);

		System.out.println(iPhone);

	}
}
