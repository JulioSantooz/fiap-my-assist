package br.com.julio.fiap.myassist.fiapmyassist.login;

import br.com.julio.fiap.myassist.fiapmyassist.login.model.Login;
import br.com.julio.fiap.myassist.fiapmyassist.login.model.UsuarioEntity;
import br.com.julio.fiap.myassist.fiapmyassist.login.model.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class service {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrarUsuario(@Valid @RequestBody Login login) {
        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setLogin(login.getLogin());
        usuario.setSenha(login.getSenha());

        return ResponseEntity.status(201).body(usuarioRepository.save(usuario));
    }

    @GetMapping("/{login}/{senha}")
    public ResponseEntity<UsuarioEntity> getLogin(@PathVariable String login,
                                                  @PathVariable String senha) {
        return ResponseEntity.ok().body(usuarioRepository.findByLoginAndSenha(login, senha));
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
