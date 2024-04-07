package com.webShop.back.controladores;

import com.webShop.back.modelo.DTO.*;
import com.webShop.back.services.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/user")
@CrossOrigin(origins = "*")
public class UserController {
    
    @Autowired
    private UserService userService;

    @Operation(summary = "Obtener sesión de usuario", 
    description = "Endpoint para obtener la sesión de usuario con el token de autenticación", tags = {"User"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sesión de usuario obtenida con éxito",
                    content = @Content(schema = @Schema(implementation = AthAnswerDTO.class)))
    })
    @GetMapping("/userSession")
    public ResponseEntity<?> userSession(HttpServletRequest request) {
        
        AthAnswerDTO answer = userService.getUserSession(request);
        return ResponseEntity.ok(answer);
        
    }

    @Operation(summary = "Registrar usuario", description = "Endpoint para registrar un nuevo usuario", tags = {"User"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Usuario registrado correctamente",
                    content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "409", description = "Conflicto - Este correo electrónico ya está registrado",
                    content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "501", description = "Error al procesar la solicitud",
                    content = @Content(schema = @Schema(implementation = String.class)))
    })
    @PostMapping("/registro")
    public ResponseEntity<String> record(@RequestBody RegisterDTO dtoRegistrer) {
        try {
             if (userService.existsEmail(dtoRegistrer.getEmail())) {
                return new ResponseEntity<>("Este correo electrónico ya está registrado.", HttpStatus.CONFLICT);
            }

             userService.createUser(dtoRegistrer);

            return ResponseEntity.status(HttpStatus.CREATED).body("Usuario registrado correctamente!");
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(ex.getMessage());
        }
    }

    @Operation(summary = "Iniciar sesión", description = "Endpoint para autenticar y obtener un token de acceso", tags = {"User"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Autenticación exitosa",
                    content = @Content(schema = @Schema(implementation = AthAnswerDTO.class))),
            @ApiResponse(responseCode = "401", description = "No autorizado - Error al autenticar",
                    content = @Content(schema = @Schema(implementation = AthAnswerDTO.class)))
    })
    @PostMapping("/login")
    public ResponseEntity<AthAnswerDTO> login(@RequestBody LoginDTO LoginDto) {
        try {
            AthAnswerDTO answer = userService.authenticate(LoginDto);
            return new ResponseEntity<>(answer, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(new AthAnswerDTO("Error al autenticar"), HttpStatus.UNAUTHORIZED);
        }
    }


}

