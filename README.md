# transfer_file

### The utility package contains the file transfer code

### Notice or copy the following things in pom
<properties>
		<testFailureIgnore>true</testFailureIgnore>
	</properties>
	
#### Mail Safe Plugin

<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-failsafe-plugin</artifactId>
				<version>2.18.1</version>
				<executions>
					<execution>
						<id>failsafe-mail</id>
						<!--  The install phase will run only file which ends with IT , so to copy results we
						created a file FiletransferIT which will do my work-->
						<phase>install</phase>
						<goals>
							<goal>integration-test</goal>
						</goals>
						<configuration>
							<encoding>${project.build.sourceEncoding}</encoding>
						</configuration>
					</execution>
				</executions>
			</plugin>

##### Name of the test file should end with IT if you want to rename it


### When will the file transfer run

run --  mvn install

### change the String targetDirectoryPath = System.getProperty("user.dir"); in class accordingly