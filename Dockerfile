FROM openjdk:20-jdk

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado en el directorio target al contenedor
COPY target/InhautBackendFinal-0.0.1-SNAPSHOT.jar /app/InhautBackendFinal.jar

# Especifica el comando para ejecutar la aplicación
CMD ["java", "-jar", "InhautBackendFinal.jar"]