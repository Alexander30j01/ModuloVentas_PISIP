package com.uisrael.pisip.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.uisrael.pisip.dominio.entidades.Region;
import com.uisrael.pisip.dominio.repositorio.IRegionRepositorio;
import com.uisrael.pisip.infraestructura.persistencia.jpa.RegionEntity;
import com.uisrael.pisip.infraestructura.persistencia.mapeadores.IRegionJpaMapper;
import com.uisrael.pisip.infraestructura.repositorios.IRegionJpaRepositorio;

@Service
public class RegionRepositorioImpl implements IRegionRepositorio {
	private final IRegionJpaRepositorio jpaRepositorio;
    private final IRegionJpaMapper entityMapper;

    public RegionRepositorioImpl(IRegionJpaRepositorio jpaRepositorio, IRegionJpaMapper entityMapper) {
        this.jpaRepositorio = jpaRepositorio;
        this.entityMapper = entityMapper;
    }

    @Override
    public Region registrar(Region region) {
        RegionEntity entity = entityMapper.toEntity(region);
        return entityMapper.toDominio(jpaRepositorio.save(entity));
    }

    @Override
    public Region actualizar(Region region) {
        RegionEntity entity = entityMapper.toEntity(region);
        return entityMapper.toDominio(jpaRepositorio.save(entity));
    }

    @Override
    public void cambiarRegion(int idRegion, boolean estado) {
        RegionEntity entity = jpaRepositorio.findById(idRegion)
                .orElseThrow(() -> new RuntimeException("Región no encontrada"));
        entity.setEstado(estado);
        jpaRepositorio.save(entity);
    }

    @Override
    public void asignarVendedor(int idRegion, int idVendedor) {
    }

    @Override
    public void removerVendedor(int idRegion, int idVendedor) {
    }

    @Override
    public Region buscarPorId(int idRegion) {
        return jpaRepositorio.findById(idRegion)
                .map(entityMapper::toDominio)
                .orElseThrow(() -> new RuntimeException("Región no encontrada"));
    }

    @Override
    public List<Region> listarTodos() {
        return jpaRepositorio.findAll().stream()
                .map(entityMapper::toDominio)
                .collect(Collectors.toList());
		
	}
}