package exercicios.four.application;

import exercicios.four.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> funcionarios //tipo de lista, Employee
                = new ArrayList<>();

        //LENDO OS DADOS
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("Employee #%d: \n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();

            while(temId(funcionarios, id)){
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary); //instanciando objeto funcionario
            funcionarios.add(emp); //adicionando na lista
        }

        System.out.print("Enter the employww id that will have salary increase: ");
        int idSalary = sc.nextInt();
        //verificando se o id existe
        Employee result = funcionarios.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (result == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            result.aumentoSalarial(percentage);
        }

        System.out.println("\nList of employees: ");
        for(Employee emp : funcionarios){
            System.out.println(emp);
        }



        System.out.print(result);

        sc.close();
    }

    public static boolean temId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); //vai filtrar se for igual
        //se não for igual, ou seja, não achou, retorna null
        return emp != null; //emp é diferente de null -> sim, true. não, false


    }
}
