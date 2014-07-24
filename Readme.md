##Prerequisite
- sudo apt-get remove maven2
- sudo apt-get install maven
##maven 3 Project structure
- src/
	- main/ 
		- java/ (Application/Library sources)
		- resources/ 	(Application/Library resources)
		- config/	(Configuration files)
		- scripts/ 	(Application/Library scripts)
	- test/
		- java/	(Test sources)
		- resources/ 	(Test resources)
	- it/ 	(Integration Tests (primarily for plugins)
	- assembly/ 	(Assembly descriptors)
- pom.xml
- LICENSE.txt 	(Project's license)
- NOTICE.txt 	
- README.md 	Project's readme
-
##Dependecies
- [] xtext
- [] henshin
- [] Eclipse modeling framework
- [] Sidif