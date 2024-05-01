Primer razón:

La clase WorkReport se debería de encargar solamente de agregar o eliminar nuevos reportes de trabajo. 
El feature de guardar estos reportes de trabajo en un archivo de texto o en la nube, debería ser trabajo de otra clase.
Inclusive se podría crear una interfaz para luego implementar el trabajo de guardar en un archivo y guardar en la nube
en clases distintas.

Segunda razón

La clase WorkReport no deberia de encargarse de sobrecargar la función toString() para formatear el texto de los reportes de trabajo en un solo string.

