
import dominio.desafio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(4);
        
        System.out.println(curso1);
        System.out.println(curso2);
    }
}
