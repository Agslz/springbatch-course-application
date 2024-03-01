# Spring Batch con enfoque de chunks

## Este repositorio contiene un proyecto desarrollado utilizando Spring Batch con el enfoque de tasklets. A través de este repositorio, podrás construir una aplicación que procesa datos en lotes de manera eficiente.

### Esta es una serie de proyectos enfocados a Spring Batch, en este repositorio se muestra en enfoque en Tasklets pero tambien se encuentra disponible el enfoque en Chunks [aquí](https://github.com/Agslz/springbatch-chunks-app)

## Contenido del proyecto

- **Crear nuestro Entity**: Se crea la entidad necesaria para representar los datos que serán procesados.

- **Crear nuestra capa de persistencia**: Se implementa la capa de persistencia para interactuar con la base de datos.

- **Crear nuestra capa de servicio**: Se desarrolla la lógica de negocio necesaria para el procesamiento de los datos.

- **Crear configuración de conexión a la BD**: Se establece la conexión a la base de datos para la aplicación.

- **Iniciar con Spring Batch - Crear Steps**: Se inicia la configuración de Spring Batch creando los pasos necesarios para el procesamiento de datos.

- **Codificar el ItemReaderStep**: Se implementa el lector de items para leer los datos de entrada.

- **Entender el contexto de Spring Batch**: Se profundiza en el contexto de Spring Batch y su importancia en el proceso de procesamiento de datos.

- **Codificar el ItemProcessorStep**: Se desarrolla el procesador de items para aplicar transformaciones o validaciones a los datos.

- **Codificar el ItemWriterStep**: Se implementa el escritor de items para escribir los datos procesados en la base de datos.

- **Codificar el ItemDescompressStep**: Se crea un paso para descomprimir datos si es necesario.

- **Habilitar Spring Batch en nuestra aplicación**: Se configura Spring Batch en la aplicación para que pueda orquestar el proceso de procesamiento de datos en lotes.

- **Configurar nuestros Step y nuestro Job**: Se configuran los pasos y el trabajo necesario para el procesamiento de datos.

- **Crear nuestro Controller**: Se implementa un controlador para exponer los puntos finales de la aplicación.
