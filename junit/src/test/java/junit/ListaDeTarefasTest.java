package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ListaDeTarefasTest {

    private ListaDeTarefas listaDeTarefas;

    @BeforeEach
    public void setUp() {
        listaDeTarefas = new ListaDeTarefas();
    }

    @Test
    public void testAdicionarTarefa() {
        listaDeTarefas.adicionarTarefa("Estudar para a prova");
        assertEquals(1, listaDeTarefas.contarTarefas(), "Deveria haver uma tarefa na lista");
    }

    @Test
    public void testRemoverTarefa() {
        listaDeTarefas.adicionarTarefa("Ler um livro");
        listaDeTarefas.removerTarefa("Ler um livro");
        assertEquals(0, listaDeTarefas.contarTarefas(), "A lista deveria estar vazia após remover a tarefa");
    }

    @Test
    public void testListarTarefas() {
        listaDeTarefas.adicionarTarefa("Caminhar no parque");
        listaDeTarefas.adicionarTarefa("Comprar mantimentos");
        assertEquals(2, listaDeTarefas.listarTarefas().size(), "A lista deveria conter duas tarefas");
        assertTrue(listaDeTarefas.listarTarefas().contains("Caminhar no parque"), "A lista deveria conter 'Caminhar no parque'");
    }

    @Test
    public void testAdicionarTarefaVazia() {
        assertThrows(IllegalArgumentException.class, () -> listaDeTarefas.adicionarTarefa(""), "Deveria lançar exceção ao adicionar tarefa vazia");
    }

    @Test
    public void testRemoverTarefaInexistente() {
        assertThrows(IllegalArgumentException.class, () -> listaDeTarefas.removerTarefa("Dormir cedo"), "Deveria lançar exceção ao tentar remover uma tarefa que não existe");
    }

}