package desafio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    BigDecimal saldo;
    boolean ativo = true;

    BigDecimal consultarSaldo() {
        return saldo;
    }

    List<?> consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
        return new ArrayList<>();
    }

    void cancelar(String justificativa) {
        // algoritimo ira manipular o atributo
        // ativo para que se torne false
    }

    void transferir(ContaCorrente contaDestino, BigDecimal valorTransferido) {

    }

    void sacar(BigDecimal valorSolicitado) {
        // nao solicitei logica
    }

}