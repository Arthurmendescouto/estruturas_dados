package CarProject.dao.repository.list;

public class UnderflowException extends RuntimeException{
    /**
     * Exceção lançada quando uma operação tenta inserir elementos
     * em uma estrutura de dados que já está cheia.
     *
     * @author Arthur Mendes
     * @version 1.2
     * @since 2025-10-31
     */

        /**
         * Construtor que cria uma exceção com a mensagem especificada.
         *
         * @param message a mensagem de erro
         */

        public UnderflowException(String message) {
            super(message);
        }


}
