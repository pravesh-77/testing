# Construct the Maven coordinates
$artifact = "com.example:mybar:latest"
$extension = "jar"

# Download the artifact using Maven
mvn -q dependency:get -Dartifact="$artifact:$extension" -DremoteRepositories=https://mvn.pkg.github.com/testing
