package exercicios.three;

public class Quarto {
    // Atributos
    private String name;
    private String email;
    private int room;

    //Construtor
    public Quarto(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    // Métodos
    public String getName(){return name;}
    public String getEmail(){return email;}
    public int getRoom(){return room;}

    @Override
    public String toString() {
        return room+": "+name+", "+email;
    }
}
