package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import com.uisrael.pisip.dominio.entidades.Usuarios;
import com.uisrael.pisip.dominio.repositorio.IUsuariosRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.UsuariosEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IUsuariosJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IUsuariosJpaRepositorio;

@Component
public class UsuariosRepositorioImpl implements IUsuariosRepositorio {
	
	private final IUsuariosJpaRepositorio jpaRepositorio;
	private final IUsuariosJpaMapper entityMapper;
	
	public UsuariosRepositorioImpl(IUsuariosJpaRepositorio jpaRepositorio, IUsuariosJpaMapper entityMapper) {
		super();
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Usuarios guardar(Usuarios nuevousuarios) {
		UsuariosEntity entidad=entityMapper.toEntity(nuevousuarios);
		UsuariosEntity guardado=jpaRepositorio.save(entidad);
		return entityMapper.toDominio(guardado);
	}

	@Override
	public Optional<Usuarios> buscarPorId(int idUsuarios) {
		return jpaRepositorio.findById(idUsuarios).map(entityMapper::toDominio);
	}

	@Override
	public List<Usuarios> listarTodo() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDominio).toList();
	}

	@Override
	public void eliminar(int idUsuarios) {
		jpaRepositorio.deleteById(idUsuarios);
	}
	
	@Override
	public Usuarios iniciarSesion(int idUsuario) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.iniciarSesion();

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public Usuarios cerrarSesion(int idUsuario) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.cerrarSesion();

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public Usuarios actualizarPerfil(int idUsuario, Usuarios usuario) {

	    Usuarios usuarioActual = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuarioActual.actualizarPerfil(
	            usuario.getNombre(),
	            usuario.getApellido(),
	            usuario.getCorreoUsuario());

	    UsuariosEntity entidad = entityMapper.toEntity(usuarioActual);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public Usuarios cambiarContrasena(int idUsuario, String nuevaContrasena) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.cambiarContrasena(nuevaContrasena);

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public Usuarios asignarRol(int idUsuario, String rol) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.asignarRol(rol);

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public Usuarios asignarRegion(int idUsuario, String region) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.asignarRegion(region);

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public Usuarios activar(int idUsuario) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.activar();

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	    
	    
	}
	
	@Override
	public Usuarios desactivar(int idUsuario) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.desactivar();

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}
	
	@Override
	public Usuarios generarReporteVisitas(int idUsuario) {

	    Usuarios usuario = buscarPorId(idUsuario)
	            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

	    usuario.generarReporteVisitas();

	    UsuariosEntity entidad = entityMapper.toEntity(usuario);

	    UsuariosEntity guardado = jpaRepositorio.save(entidad);

	    return entityMapper.toDominio(guardado);
	}

}
