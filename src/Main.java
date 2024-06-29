import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso java");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devSabrina = new Dev();
        devSabrina.setNome("Sabrina");
        devSabrina.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Sabrina" + devSabrina.getConteudosInscritos());
        devSabrina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Sabrina" + devSabrina.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sabrina" + devSabrina.getConteudosInscritos());
        System.out.println("XP:" + devSabrina.calcularTotalXp());

        System.out.println("----------");

        Dev devEva = new Dev();
        devEva.setNome("Eva");
        devEva.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Eva" + devEva.getConteudosInscritos());
        devEva.progredir();
        devEva.progredir();
        devEva.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Eva" + devEva.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Eva" + devEva.getConteudosInscritos());
        System.out.println("XP:" + devEva.calcularTotalXp());












    }
}