package com.pagamentos.controllers;

import com.pagamentos.dtos.TransactionDTO;
import com.pagamentos.entities.Transaction;
import com.pagamentos.services.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.NoTransactionException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Operation(summary = "Cria uma nova transação", description = "Cria uma nova transação com os dados fornecidos e retorna a transação criada")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Transação criada com sucesso", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Transaction.class))
            }),
            @ApiResponse(responseCode = "400", description = "Dados da transação inválidos", content = @Content),
            @ApiResponse(responseCode = "500", description = "Erro no servidor", content = @Content)
    })
    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transaction) throws Exception {
        Transaction newTransaction = this.transactionService.createTransaction(transaction);
        return new ResponseEntity<>(newTransaction, HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() throws Exception {
        List<Transaction> transactions = this.transactionService.getAllTransactions();
        if (transactions.isEmpty()){
            throw new RuntimeException("Nenhuma transação cadastrada");
        }
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }
}