package CarProject.dao.repository.list;
/**
 * Exceção lançada quando uma operação tenta inserir elementos
 * em uma estrutura de dados que já está cheia.
 *
 * @author Arthur Mendes
 * @version 1.2
 * @since 2025-10-31
 */
public class OverflowException extends RuntimeException{

    /**
     * Construtor que cria uma exceção com a mensagem especificada.
     *
     * @param message a mensagem de erro
     */

    public OverflowException(String message) {
        super(message);
    }
}
