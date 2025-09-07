package com.matt.models;

import com.matt.models.abstracts.*;

public class PagamentoCartao  extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("pagando com cartão crédito");
    }
}
