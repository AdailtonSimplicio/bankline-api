package com.dio.santander.banklineapi.controller;


import com.dio.santander.banklineapi.dto.NovoCorrentista;
import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import com.dio.santander.banklineapi.service.CorrentistaService;
import com.dio.santander.banklineapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaService correntistaService;
    @Autowired
    private CorrentistaRepository correntistaRepository;

    @GetMapping
    public List<Correntista> findAll(){

        return correntistaRepository.findAll();
    }
    @PostMapping
    public void save(@RequestBody NovoCorrentista novoCorrentista){
        correntistaService.save(novoCorrentista);

    }
}
