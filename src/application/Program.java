package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Lesson> lesson = new ArrayList<Lesson>();
		System.out.print("Quantas aulas tem o curso? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Dados da " + (i + 1) + "a aula:");
			System.out.print("Conte�do ou tarefa (c/t)");
			Character x = scan.next().charAt(0);

			if (x == 'c') {
				System.out.print("T�tulo: ");
				String titles = scan.nextLine();
				scan.nextLine();
				System.out.print("URL do v�deo: ");
				String url = scan.nextLine();
				System.out.print("Dura��o em segundos: ");
				int seconds = scan.nextInt();

				lesson.add(new Video(titles, url, seconds));

			} else {
				System.out.print("T�tulo: ");
				String titles = scan.nextLine();
				scan.nextLine();
				System.out.print("Descri��o: ");
				String description = scan.nextLine();
				System.out.print("Quantidade de quest�es: ");
				int questionCount = scan.nextInt();

				lesson.add(new Task(titles, description, questionCount));
			}

		}

		Lesson les = new Task();
		Lesson les1 = new Video();
		Task task = (Task) les;
		Video vid = (Video) les1;
		
		int sum = 0;
		for (int i = 0; i < n; i++) {

			sum += lesson.get(i).duration();

			
		}
		System.out.print("DURA��O TOTAL DO CURSO = " + sum + " segundos");
		
		scan.close();

	}

}
