package auth

import org.bson.types.ObjectId

class Role {

	static mapWith = 'mongo'

	ObjectId id
	String authority

	static constraints = {
		authority blank: false, unique: true
	}
}
