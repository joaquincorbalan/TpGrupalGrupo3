package ar.edu.unrn.seminario.api;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unrn.seminario.accesos.RolDAOJDBC;
import ar.edu.unrn.seminario.accesos.RolDao;
import ar.edu.unrn.seminario.accesos.UsuarioDAOJDBC;
import ar.edu.unrn.seminario.accesos.UsuarioDao;
import ar.edu.unrn.seminario.dto.RolDTO;
import ar.edu.unrn.seminario.dto.UsuarioDTO;
import ar.edu.unrn.seminario.modelo.Rol;
import ar.edu.unrn.seminario.modelo.Usuario;

public class PersistenceApi implements IApi {

	private RolDao rolDao;
	private UsuarioDao usuarioDao;

	public PersistenceApi() {
		rolDao = new RolDAOJDBC();
		usuarioDao = new UsuarioDAOJDBC();
	}

	@Override
	public void registrarUsuario(String username, String password, String email, String nombre, Integer codigoRol) {
		Rol rol = rolDao.find(codigoRol);
		Usuario usuario = new Usuario(username, password, nombre, email, rol);
		this.usuarioDao.create(usuario);
	}

	@Override
	public List<UsuarioDTO> obtenerUsuarios() {
		List<UsuarioDTO> dtos = new ArrayList<>();
		List<Usuario> usuarios = usuarioDao.findAll();
		for (Usuario u : usuarios) {
			dtos.add(new UsuarioDTO(u.getUsuario(), u.getContrasena(), u.getNombre(), u.getEmail(),
					u.getRol().getNombre(), u.isActivo(), u.obtenerEstado()));
		}
		return dtos;
	}

	@Override
	public UsuarioDTO obtenerUsuario(String username) {
		Usuario usuario = usuarioDao.findByUsername(username);
		if(usuario==null){
			return null; 
		} else {
			UsuarioDTO usuariodto = new UsuarioDTO();
			usuariodto.setUsuario(usuario.getUsuario());
			usuariodto.setContrasena(usuario.getContrasena());
			usuariodto.setNombre(usuario.getNombre());
			usuariodto.setEmail(usuario.getEmail());
			usuariodto.setRol(usuario.getRol().getNombre());
			usuariodto.setActivo(usuario.isActivo());
			usuariodto.setEstado(usuario.obtenerEstado());
			return usuariodto; 	
		}
		return null;
	}

	@Override
	public void eliminarUsuario(String username) {
		usuarioDao.delete(username); 
	}

	@Override
	public List<RolDTO> obtenerRoles() {
		List<Rol> roles = rolDao.findAll();
		List<RolDTO> rolesDTO = new ArrayList<>(0);
		for (Rol rol : roles) {
			rolesDTO.add(new RolDTO(rol.getCodigo(), rol.getNombre(), rol.isActivo()));
		}
		return rolesDTO;
	}

	@Override
	public List<RolDTO> obtenerRolesActivos() {
		List<Rol> roles = rolDao.findAllActive(); //busca todos los roles activos en la base de datos
		List<RolDTO> rolesDTO= new ArrayList<>(0);//crea una lista vacia de rolesDTO 
		for(Rol rol:roles){
			rolesDTO.add(new RolDTO(rol.getCodigo(), rol.getNombre(), rol.isActivo()));//agrega a la lista de rolesDTO los roles activos en la bd 
		}
		return rolesDTO;
	}

	@Override
	public void guardarRol(Integer codigo, String descripcion, boolean estado) {
		Rol rol=new Rol (codigo, descripcion, estado);//crea un nuevo rol con los datos recibidos 
		rolDao.create(rol); //guarda el rol en la base de datos 
	}

	@Override
	public RolDTO obtenerRolPorCodigo(Integer codigo) {
		Rol rol = rolDao.find(codigo);//busca el codigo del rol en la base de datos 
		RolDTO rolDTO = new RolDTO(rol.getCodigo(), rol.getNombre(), rol.isActivo());//crea el rolDTO con los datos obtenidos de la bd 
		return rolDTO;
	}

	@Override
	public void activarRol(Integer codigo) {
		Rol rol = rolDao.find(codigo);//busca el codigo en la base de datos 
		rol.setActivo(true);//cambia el estado del rol a activo 
		rolDao.update(rol);//actualiza el rol en la base de datos 

	}

	@Override
	public void desactivarRol(Integer codigo) {
		Rol rol=rolDao.find(codigo); 
		rol.setActivo(false); 
		rolDao.update(rol);

	}

	@Override
	public void activarUsuario(String username) {
		Usuario usuario =usuarioDao.findByUsername(username);
		usuario.setActivo(true);
		usuarioDao.update(usuario); 
	}

	@Override
	public void desactivarUsuario(String username) {
		Usuario usuario =usuarioDao.findByUsername(username);
		usuario.setActivo(false);
		usuarioDao.update(usuario);
	}

}
