grails.servlet.version = '3.0'
grails.project.work.dir = 'target'
grails.project.target.level = 1.6
grails.project.source.level = 1.6

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {
	inherits 'global'
	log 'warn'
	checksums true
	legacyResolve false

	repositories {
		inherits true

		grailsPlugins()
		grailsHome()
		mavenLocal()
		grailsCentral()
		mavenCentral()
		mavenRepo 'http://repo.spring.io/milestone'
	}

	dependencies {
	}

	plugins {
		build ':tomcat:7.0.47'
		compile ':scaffolding:2.0.1'
		runtime ":jquery:1.10.2"
		runtime ":resources:1.2.1"

		runtime ":mongodb:1.3.1"
		compile ':spring-security-core:2.0-RC2'
	}
}
