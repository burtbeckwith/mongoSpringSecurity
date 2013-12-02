import auth.Role
import auth.User

class BootStrap {

	def init = { servletContext ->
		def role = new Role(authority: 'ROLE_USER').save()
		new User(username: 'admin', password: 'password',
		         email: 'example@email.com', authorities: [role]).save(flush:true)
	}
}
