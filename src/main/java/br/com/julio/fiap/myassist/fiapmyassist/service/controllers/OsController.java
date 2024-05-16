package br.com.julio.fiap.myassist.fiapmyassist.service.controllers;

import br.com.julio.fiap.myassist.fiapmyassist.data.entitys.OsEntity;
import br.com.julio.fiap.myassist.fiapmyassist.data.repositorys.OsRepository;
import br.com.julio.fiap.myassist.fiapmyassist.service.dto.OsDTO;
import br.com.julio.fiap.myassist.fiapmyassist.service.dto.OsUpdateDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/os")
public class OsController {

    @Autowired
    OsRepository osRepository;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<OsEntity>> consutaTodosOs() {
        List<OsEntity> listaOS = osRepository.findAll();

        if(listaOS.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.ok().body(listaOS);
        }
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<OsEntity> consultaOs(@PathVariable Long id) {
        Optional<OsEntity> os = osRepository.findById(id);

        if(os.isPresent()) {
            return ResponseEntity.ok().body(os.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<OsEntity> cadastrarOs(@Valid @RequestBody OsDTO dto) {
        OsEntity os = new OsEntity();

        os.setProprietario(dto.getProprietario());
        os.setTipoEquipamento(dto.getTipoEquipamento());
        os.setEntradaLab(dto.getEntradaLab());
        os.setDefeito(dto.getDefeito());
        os.setPrevisaoEntrega(dto.getPrevisaoEntrega());
        os.setObservacoes(os.getObservacoes());

        return ResponseEntity.status(201).body(osRepository.save(os));
    }

    @PatchMapping("/{id}")
    @ResponseBody
    public ResponseEntity<OsEntity> atualizarOS(
            @PathVariable Long id,
            @Valid @RequestBody OsUpdateDTO dto
    ) {
        Optional<OsEntity> entidade = osRepository.findById(id);

        if (entidade.isEmpty()) {
            return ResponseEntity.unprocessableEntity().build();
        } else {
            entidade.get().setPrevisaoEntrega(dto.getPrevisaoEntrega());
            entidade.get().setStatusConcerto(dto.getStatusConcerto());
            entidade.get().setObservacoes(dto.getObservacoes());

            return ResponseEntity.status(202).body(osRepository.save(entidade.get()));
        }
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
