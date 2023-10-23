package criacionais.factorymethod.apple.firstmodel;

import criacionais.factorymethod.apple.firstmodel.factory.*;
import criacionais.factorymethod.apple.firstmodel.model.IPhone;

import java.util.Scanner;

public class Client {

	private static final Scanner entrada = new Scanner(System.in);
	private static String modelo;
	private static String tipo;

	public static void main(String[] args) {

		System.out.println("--------- SISTEMA APPLE ---------");
		System.out.println("Digite o modelo que deseja consultar: ");
		modelo = entrada.nextLine();
		System.out.println("Digite o Tipo de Iphone: ");
		tipo = entrada.nextLine();

		IPhoneFactory iPhoneFactory = null;

		switch (modelo){
			case "X" -> {
				switch (tipo){
					case "Standart" -> iPhoneFactory = new IPhoneXFactory();
					case "HighEnd" -> iPhoneFactory = new IPhoneXSMaxFactory();
				}
			}
			case "11" -> {
				switch (tipo){
					case "Standart" -> iPhoneFactory = new IPhone11Factory();
					case "HighEnd" -> iPhoneFactory = new IPhone11ProFactory();
				}
			}
			default -> System.out.println("Modelo não encontrado!");
		}

		IPhone iphone = iPhoneFactory.orderIphone();

		System.out.println(iphone);

	}
}
