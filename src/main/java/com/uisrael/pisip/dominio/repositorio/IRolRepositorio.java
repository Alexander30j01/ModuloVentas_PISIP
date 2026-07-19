package com.uisrael.pisip.dominio.repositorio;

import com.uisrael.pisip.dominio.entidades.Rol;
import java.util.List;
import java.util.Optional;

public interface IRolRepositorio {
    
    // Sirve tanto para registrar (INSERT) como para actualizar (UPDATE)
    Rol guardar(Rol rol);
    
    // Usamos Optional para que tu UseCase pueda hacer el .orElseThrow() de forma limpia
    Optional<Rol> buscarPorId(int id);
    
    // Lista todos los roles activos/inactivos
    List<Rol> listarTodos();
    
    // Elimina físicamente un rol de la base de datos (si la regla de negocio lo permite)
    void eliminar(int id);
}