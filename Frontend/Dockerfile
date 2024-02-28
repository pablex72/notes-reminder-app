# Dockerfile para el frontend
FROM nginx:alpine

# Eliminar los archivos predeterminados de nginx
RUN rm -rf /usr/share/nginx/html/*

# Copiar los archivos estáticos de React (desde el directorio build) al directorio de nginx
COPY build/ /usr/share/nginx/html

# Configuración opcional de nginx si es necesaria
# ...

# Puerto expuesto por nginx (puerto predeterminado 80)
EXPOSE 80

# Comando para iniciar nginx cuando se inicie el contenedor
CMD ["nginx", "-g", "daemon off;"]
