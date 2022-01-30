
import dominio.desafio.Bootcamp;
import dominio.desafio.Curso;
import dominio.desafio.Dev;
import dominio.desafio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso Java");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devThiago.getConteudoInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("Conteúdos inscritos" + devThiago.getConteudoInscritos());
        System.out.println("Conteúdos concluídos" + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXp());
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devJoao.getConteudoInscritos());
        devJoao.progredir();
         System.out.println("Conteúdos inscritos" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        
    }
}
