package basico;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dataHora {

	public static void main(String[] args) {

		//----------------------------------------------
				// DATA-HORA LOCAL E GLOBAL
				// - Instanciação

				//  data local
				LocalDate diaLocal = LocalDate.now();
				//  data-hora local
				LocalDateTime diaHoraLocal = LocalDateTime.now();
				//  data-hora global (Londres)
				Instant diaHoraGlobal = Instant.now();
				
				//  data local
				LocalDate diaLocal2 = LocalDate.parse("2022-07-20");
				//  data-hora local
				LocalDateTime diaHoraLocal2 = LocalDateTime.parse("2024-07-20T01:30:26");
				//  data-hora global (Londres)
				Instant diaHoraGlobal2 = Instant.parse("2024-07-20T01:30:26z");
				//  data-hora global (São Paulo -> -03:00)
				Instant diaHoraGlobalSP = Instant.parse("2024-07-20T01:30:26-03:00");
				
				//  data local
				LocalDate diaLocal3 = LocalDate.parse("07/10/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				//  data-hora local
				DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //instanciando o objeto de formatação de data-hora
				LocalDateTime diaHoraLocal3 = LocalDateTime.parse("07/10/2024 19:14", formato2); //segundo argumento: como o texto será interpretado
				
				//  data local
				LocalDate diaLocal4 = LocalDate.of(2024, 10, 07); // yyyy, MM, dd
				// data-hora local
				LocalDateTime diaHoraLocal4 = LocalDateTime.of(2024, 10, 07, 1, 23); // yyyy, MM, dd, HH, mm)

				
				// - Formatação
				
				//  data-local
				LocalDate diaLocal5 = LocalDate.parse("2024-10-09");
				DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //instanciando o objeto de formatação de data-hora
				//System.out.println(diaLocal5.format(formato3)+" ou "+formato3.format(diaLocal5)+" ou "+diaLocal5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));  //Saída: 09/10/2024 ou 09/10/2024 ou 09/10/2024
				//  data-hora local
				LocalDateTime diaHoraLocal5 = LocalDateTime.parse("2024-07-20T01:30:26");
				DateTimeFormatter formato4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  //formato data-hora
				//System.out.println(diaHoraLocal5.format(formato4));  //Saída: 20/07/2024 01:30
				//  data-hora global
				Instant diaHoraGlobal3 = Instant.parse("2024-07-20T01:30:26z"); //horario de Londres
				DateTimeFormatter formato5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());  //formato seguindo o fuso horario da máquina do usuario
				//System.out.println(formato5.format(diaHoraGlobal3));
				
				
				// - Converter (global para local)
				
				// global
				Instant diaHoraGlobal4 = Instant.parse("2024-07-20T01:30:26z"); 
				// data local
				LocalDate resultado1 = LocalDate.ofInstant(diaHoraGlobal4, ZoneId.systemDefault());  //seguindo o fuso horario da máquina
				LocalDate resultado2 = LocalDate.ofInstant(diaHoraGlobal4, ZoneId.of("Portugal"));  //fuso horario de portugal
				
				//data-hora local
				LocalDateTime resultado3 = LocalDateTime.ofInstant(diaHoraGlobal4, ZoneId.systemDefault());
				LocalDateTime resultado4 = LocalDateTime.ofInstant(diaHoraGlobal4, ZoneId.of("Asia/Aden"));
				
				
				// - Obter dados
				
				// data-hora local
				/**
				System.out.println("Dia = "+ diaHoraLocal5.getDayOfMonth());  //Saída: Dia = 20
				System.out.println("Mês = "+ diaHoraLocal5.getMonthValue());  //Saída: Mês = 7
				System.out.println("Ano = "+ diaHoraLocal5.getYear());  //Saída: Ano = 2024
				System.out.println("Hora = "+ diaHoraLocal5.getHour());
				System.out.println("Minuto = "+ diaHoraLocal5.getMinute());
				**/
				
				
				// - Cálculo somando/subtraindo
				
				// data local
				//LocalDate diaLocal5 = LocalDate.parse("2024-10-09");
				LocalDate diaLocalDias = diaLocal5.minusDays(7); //menos 7 dias
				//System.out.println(diaLocalDias);  // Saída: 2024-10-02  (09 - 07 = 02)
				
				// data-hora local
				// LocalDateTime diaHoraLocal5 = LocalDateTime.parse("2024-07-20T01:30:26");
				LocalDateTime diaHoraLocalMes = diaHoraLocal5.plusMonths(3);  //mais 3 meses
				//System.out.println(diaHoraLocalMes);  //Saída: 2024-10-20T01:30:26 (07 + 03 = 10)
				
				//data-hora global
				//Instant diaHoraGlobal3 = Instant.parse("2024-07-20T01:30:26z");
				Instant diaHoraGlobalMinutos = diaHoraGlobal3.plus(5, ChronoUnit.MINUTES);  //mais 5 minutos
				//System.out.println(diaHoraGlobalMinutos);  //Saída: 2024-07-20T01:35:26Z  (30 + 05 = 35)
				
				
				// - Calculo duração
				
				// data local
				Duration duracaoLocal = Duration.between(diaLocalDias.atStartOfDay(), diaLocal5.atStartOfDay()); // entre quais datas irá comparar a duração. .atStartOfDay(): 00H00m. Primeiro a data menor e depois a data maior
				System.out.println("Por dias: "+duracaoLocal.toDays());
				
				//data-hora local
				Duration duracaoLocal2 = Duration.between(diaHoraLocal5, diaHoraLocalMes);
				System.out.println("Por dias (3 meses): "+duracaoLocal2.toDays());
				
				// data-hora global
				Duration duracaoGlobal3 = Duration.between(diaHoraGlobal3, diaHoraGlobalMinutos);
				System.out.println("Por minutos: "+duracaoGlobal3.toMinutes());

	}

}
