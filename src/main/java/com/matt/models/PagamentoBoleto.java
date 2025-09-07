package com.matt.models;

import com.matt.models.abstracts.Pagamento;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("pagando boleto ");
    }

}
