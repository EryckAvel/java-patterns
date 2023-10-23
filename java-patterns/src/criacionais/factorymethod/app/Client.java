package criacionais.factorymethod.app;

import criacionais.factorymethod.app.factory.DBFactory;
import criacionais.factorymethod.app.factory.OracleFactory;
import criacionais.factorymethod.app.factory.PostgresFactory;

import java.util.Scanner;

public class Client {

	private static Scanner entrada = new Scanner(System.in);


	public static void main(String[] args) {
		String db, query, update;

		System.out.println("--------- BANCO DE DADOS ---------");
		System.out.print("Digite o banco de Dados que deseja consultar: ");
		db = entrada.nextLine();
		System.out.print("Digite a query que sera realizada: ");
		query = entrada.nextLine();
		System.out.print("Digite o update que sera realizado: ");
		update = entrada.nextLine();

		DBFactory factory = null;

		switch (db){
			case "Oracle" -> factory = new OracleFactory();
			case "Postgres" -> factory = new PostgresFactory();
		}

		factory.getDatabase().query(query);
		factory.getDatabase().update(update);

	}

}
